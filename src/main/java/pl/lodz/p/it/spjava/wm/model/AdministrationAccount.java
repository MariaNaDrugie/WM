/*
 * Projekt końcowy realizowany w ramach studiów podyplomowych Nowoczesne aplikacje biznesowe Java EE edycja 8
 */
package pl.lodz.p.it.spjava.wm.model;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue(AccessLevel.AccessLevelKeys.ADMINISTRATION_KEY)
@NamedQueries({
    @NamedQuery(name = "AdministrationAccount.findAll", query = "SELECT a FROM AdministrationAccount a")
    ,
    @NamedQuery(name = "AdministrationAccount.findByLogin", query = "SELECT a FROM AdministrationAccount a WHERE a.login = :lg")
})
public class AdministrationAccount extends Account implements Serializable {

    public AdministrationAccount() {
    }

    public AdministrationAccount(Account account) {
        super(account.getId(), account.getName(), account.getSurname(), account.getEmail(), account.getQuestion(), account.getAnswer(), account.getLogin(), account.getPassword());
    }
}
