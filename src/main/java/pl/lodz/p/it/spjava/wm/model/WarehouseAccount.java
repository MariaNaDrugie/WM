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
@DiscriminatorValue(AccessLevel.AccessLevelKeys.WAREHOUSE_KEY)
@NamedQueries({
    @NamedQuery(name = "WarehouseAccount.findAll", query = "SELECT w FROM WarehouseAccount w")
    ,
    @NamedQuery(name = "WarehouseAccount.findByLogin", query = "SELECT w FROM WarehouseAccount w WHERE w.login = :lg")
})
public class WarehouseAccount extends Account implements Serializable {

    public WarehouseAccount() {
    }

    public WarehouseAccount(Account account) {
        super(account.getId(), account.getName(), account.getSurname(), account.getEmail(), account.getQuestion(), account.getAnswer(), account.getLogin(), account.getPassword());
    }
}
