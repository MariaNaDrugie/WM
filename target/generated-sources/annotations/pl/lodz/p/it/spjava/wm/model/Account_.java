package pl.lodz.p.it.spjava.wm.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.lodz.p.it.spjava.wm.model.AdministrationAccount;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T11:15:14")
@StaticMetamodel(Account.class)
public class Account_ extends AbstractEntity_ {

    public static volatile SingularAttribute<Account, String> password;
    public static volatile SingularAttribute<Account, String> question;
    public static volatile SingularAttribute<Account, String> answer;
    public static volatile SingularAttribute<Account, AdministrationAccount> authorizedBy;
    public static volatile SingularAttribute<Account, AdministrationAccount> modificatedBy;
    public static volatile SingularAttribute<Account, String> surname;
    public static volatile SingularAttribute<Account, String> name;
    public static volatile SingularAttribute<Account, Boolean> active;
    public static volatile SingularAttribute<Account, Long> id;
    public static volatile SingularAttribute<Account, String> login;
    public static volatile SingularAttribute<Account, String> email;

}