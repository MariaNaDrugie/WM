/*
 * Projekt końcowy realizowany w ramach studiów podyplomowych Nowoczesne aplikacje biznesowe Java EE edycja 8
 */
package pl.lodz.p.it.spjava.wm.web;

import java.io.Serializable;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.view.ViewScoped;
import pl.lodz.p.it.spjava.wm.dto.IssueDTO;
import pl.lodz.p.it.spjava.wm.ejb.endpoint.IssueEndpoint;
import pl.lodz.p.it.spjava.wm.exception.AppBaseException;
import pl.lodz.p.it.spjava.wm.web.utils.ContextUtils;

@Named(value = "listIssuesForProductPageBean")
@ViewScoped
public class ListIssuesForProductPageBean implements Serializable {

    @EJB
    private IssueEndpoint issueEndpoint;

    private List<IssueDTO> listIssues;
    private DataModel<IssueDTO> dataModelIssues;

    private List<String> products;
    private DataModel<String> dataModelProducts;

    private IssueDTO issueDTO;
    private TimeZone timeZone;

    public ListIssuesForProductPageBean() {
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public List<IssueDTO> getListIssues() {
        return listIssues;
    }

    public void setListIssues(List<IssueDTO> listIssues) {
        this.listIssues = listIssues;
    }

    public IssueDTO getIssueDTO() {
        return issueDTO;
    }

    public void setIssueDTO(IssueDTO issueDTO) {
        this.issueDTO = issueDTO;
    }

    public TimeZone getTimeZone() {
        timeZone = TimeZone.getDefault();
        return timeZone;
    }

    @PostConstruct
    public void initListIssues() {
        try {
            products = issueEndpoint.listProducts();
        } catch (AppBaseException ex) {
            Logger.getLogger(ListIssuesForProductPageBean.class.getName()).log(Level.SEVERE, null, ex);
            ContextUtils.emitI18NMessage(null, ex.getMessage());
        }
        dataModelProducts = new ListDataModel<>(products);
        issueDTO = new IssueDTO();
    }

    public String showListAction() {
        try {
            listIssues = issueEndpoint.listIssuesForProduct(issueDTO.getProductSymbol());
            dataModelIssues = new ListDataModel<>(listIssues);
        } catch (AppBaseException ex) {
            Logger.getLogger(ListIssuesForProductPageBean.class.getName()).log(Level.SEVERE, null, ex);
            ContextUtils.emitI18NMessage(null, ex.getMessage());
        }
        return null;
    }

}
