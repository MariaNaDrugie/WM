/*
 * Projekt końcowy realizowany w ramach studiów podyplomowych Nowoczesne aplikacje biznesowe Java EE edycja 8
 */
package pl.lodz.p.it.spjava.wm.web;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import pl.lodz.p.it.spjava.wm.web.utils.ContextUtils;

@Named(value = "mainApplicationPageBean")
@ApplicationScoped
public class MainApplicationBean {

    public MainApplicationBean() {
    }

    public String signOutAction() {
        ContextUtils.invalidateSession();
        return "cancelAction";
    }

    public String getMyLogin() {
        return ContextUtils.getUserName();
    }
}
