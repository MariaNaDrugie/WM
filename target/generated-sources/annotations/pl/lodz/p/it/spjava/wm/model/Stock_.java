package pl.lodz.p.it.spjava.wm.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.lodz.p.it.spjava.wm.model.Contractor;
import pl.lodz.p.it.spjava.wm.model.Location;
import pl.lodz.p.it.spjava.wm.model.Product;
import pl.lodz.p.it.spjava.wm.model.WarehouseAccount;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T11:15:14")
@StaticMetamodel(Stock.class)
public class Stock_ extends AbstractEntity_ {

    public static volatile SingularAttribute<Stock, Contractor> contractor;
    public static volatile SingularAttribute<Stock, Product> product;
    public static volatile SingularAttribute<Stock, Integer> quantity;
    public static volatile SingularAttribute<Stock, WarehouseAccount> modificatedBy;
    public static volatile SingularAttribute<Stock, WarehouseAccount> createdBy;
    public static volatile SingularAttribute<Stock, Location> location;
    public static volatile SingularAttribute<Stock, Long> id;

}