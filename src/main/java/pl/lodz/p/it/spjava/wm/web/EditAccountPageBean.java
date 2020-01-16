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
import pl.lodz.p.it.spjava.wm.dto.AccountDTO;
import pl.lodz.p.it.spjava.wm.exception.AppBaseException;
import pl.lodz.p.it.spjava.wm.web.utils.ContextUtils;

@Named(value = "editAccountPageBean")
@RequestScoped
public class EditAccountPageBean {

    @Inject
    private AccountControllerBean accountControllerBean;

    private AccountDTO accountDTO;

    public EditAccountPageBean() {
    }

    public AccountDTO getAccountDTO() {
        return accountDTO;
    }

    public void setAccountDTO(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }

    @PostConstruct
    public void init() {
        accountDTO = accountControllerBean.getSelectedAccountDTO();
    }

    public String saveEditAccountAction() {
        try {
            accountControllerBean.editAccount(accountDTO);
        } catch (AppBaseException ex) {
            Logger.getLogger(EditAccountPageBean.class.getName()).log(Level.SEVERE, null, ex);
            ContextUtils.emitI18NMessage(null, ex.getMessage());
            return null;
        }
        return "listAuthorizedAccounts";
    }

}
