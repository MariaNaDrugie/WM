package pl.lodz.p.it.spjava.wm.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.lodz.p.it.spjava.wm.model.LocationType;
import pl.lodz.p.it.spjava.wm.model.Stock;
import pl.lodz.p.it.spjava.wm.model.WarehouseAccount;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-15T11:15:14")
@StaticMetamodel(Location.class)
public class Location_ extends AbstractEntity_ {

    public static volatile SingularAttribute<Location, WarehouseAccount> modificatedBy;
    public static volatile SingularAttribute<Location, WarehouseAccount> createdBy;
    public static volatile SingularAttribute<Location, LocationType> locationType;
    public static volatile SingularAttribute<Location, Long> id;
    public static volatile SingularAttribute<Location, Integer> maxWeight;
    public static volatile SingularAttribute<Location, Stock> stock;
    public static volatile SingularAttribute<Location, Boolean> emptyLocation;
    public static volatile SingularAttribute<Location, String> locationSymbol;

}