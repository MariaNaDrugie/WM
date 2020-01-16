/*
 * Projekt końcowy realizowany w ramach studiów podyplomowych Nowoczesne aplikacje biznesowe Java EE edycja 8
 */
package pl.lodz.p.it.spjava.wm.web;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import pl.lodz.p.it.spjava.wm.dto.ProductDTO;
import pl.lodz.p.it.spjava.wm.exception.AppBaseException;
import pl.lodz.p.it.spjava.wm.web.utils.ContextUtils;

@Named(value = "deleteProductPageBean")
@RequestScoped
public class DeleteProductPageBean {

    @Inject
    private ProductControllerBean productControllerBean;

    private ProductDTO productDTO;

    public DeleteProductPageBean() {
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    @PostConstruct
    public void init() {
        productDTO = productControllerBean.getSelectedProductDTO();
    }

    public String deleteProductAction() {
        try {
            productControllerBean.deleteProduct(productDTO);
        } catch (AppBaseException ex) {
            Logger.getLogger(DeleteProductPageBean.class.getName()).log(Level.SEVERE, null, ex);
            ContextUtils.emitI18NMessage(null, ex.getMessage());
            return null;
        }
        return "listProducts";
    }

}
