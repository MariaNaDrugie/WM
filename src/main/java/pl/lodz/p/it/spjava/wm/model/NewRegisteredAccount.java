/*
 * Projekt końcowy realizowany w ramach studiów podyplomowych Nowoczesne aplikacje biznesowe Java EE edycja 8
 */
package pl.lodz.p.it.spjava.wm.model;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(AccessLevel.AccessLevelKeys.NEWREGISTERED_KEY)
public class NewRegisteredAccount extends Account implements Serializable {

    public NewRegisteredAccount() {
    }

}
