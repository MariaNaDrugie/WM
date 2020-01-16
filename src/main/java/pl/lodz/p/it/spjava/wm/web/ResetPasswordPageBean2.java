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

@Named(value = "resetPasswordPageBean2")
@RequestScoped
public class ResetPasswordPageBean2 {

    @Inject
    private AccountControllerBean accountControllerBean;

    private AccountDTO accountDTO;

    private String newPasswordRepeat;

    public ResetPasswordPageBean2() {
    }

    public AccountDTO getAccountDTO() {
        return accountDTO;
    }

    public void setAccountDTO(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }

    public String getNewPasswordRepeat() {
        return newPasswordRepeat;
    }

    public void setNewPasswordRepeat(String newPasswordRepeat) {
        this.newPasswordRepeat = newPasswordRepeat;
    }

    @PostConstruct
    public void init() {
        accountDTO = accountControllerBean.getSelectedAccountDTO();
    }

    public String resetPasswordAction() {

        if (newPasswordRepeat.equals(accountDTO.getPassword())) {
            try {
                accountControllerBean.resetPassword(accountDTO);
            } catch (AppBaseException ex) {
                Logger.getLogger(ResetPasswordPageBean2.class.getName()).log(Level.SEVERE, null, ex);
                ContextUtils.emitI18NMessage(null, ex.getMessage());
                return null;
            }
        } else {
            ContextUtils.emitI18NMessage("ResetPasswordForm:passwordRepeat", "error.passwords.not.matching");
            return null;
        }
        return "main";
    }
}
