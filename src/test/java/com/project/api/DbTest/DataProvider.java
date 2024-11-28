package com.project.api.DbTest;

import com.project.api.Model.*;

import java.util.List;

public class DataProvider {

    //region Address
    public static List<Address> getAllAddress(){
        System.out.println("Mock");
        return List.of(
                new Address(),
                new Address(),
                new Address(),
                new Address(),
                new Address(),
                new Address()
                );
    }
    public static Address getByIdAddress(){
        return new Address();
    }
    //endregion

    //region City
    public static List<City> allCities(){
        return List.of(
                new City(),
                new City(),
                new City(),
                new City(),
                new City(),
                new City()
        );
    }
    public static City getByIdCity(){
        return new City();
    }
    //endregion

    //region Country
    public static List<Country> allCountry(){
        return List.of(
                new Country(),
                new Country(),
                new Country(),
                new Country(),
                new Country(),
                new Country()
        );
    }

    public static Country getByIdCountry(){
     return new Country();
    }
    //endregion

    //region OrderProduct
    public static List<OrderProduct> allOrderProducts(){
        return List.of(
                new OrderProduct(),
                new OrderProduct(),
                new OrderProduct(),
                new OrderProduct(),
                new OrderProduct(),
                new OrderProduct()
        );
    }

    public static OrderProduct getByIdOrderProduct(){
        return new OrderProduct();
    }
    //endregion

    //region Order
    public static List<Order> allOrders(){
        return List.of(
                new Order(),
                new Order(),
                new Order(),
                new Order(),
                new Order(),
                new Order()
        );
    }

    public static Order getByIdOrder(){
        return new Order();
    }
    //endregion

    //region ProductMedia
    public static List<ProductMedia> allProductMedia(){
        return List.of(
                new ProductMedia(),
                new ProductMedia(),
                new ProductMedia(),
                new ProductMedia(),
                new ProductMedia(),
                new ProductMedia()
        );
    }

    public static ProductMedia getByIdProductMedia(){
        return new ProductMedia();
    }
    //endregion

    //region Product
    public static List<Product> allProducts(){
        return List.of(
                new Product(),
                new Product(),
                new Product(),
                new Product(),
                new Product(),
                new Product()
        );
    }

    public static Product getByIdProduct(){
        return new Product();
    }
    //endregion

    //region Role
    public static List<Role> allRoles(){
        return List.of(
                new Role(),
                new Role(),
                new Role(),
                new Role(),
                new Role(),
                new Role()
        );
    }

    public static Role getByIdRole(){
        return new Role();
    }
    //endregion

    //region State
    public static List<State> allStates(){
        return List.of(
                new State(),
                new State(),
                new State(),
                new State(),
                new State(),
                new State()
        );
    }

    public static State getByIdState(){
        return new State();
    }
    //endregion

    //region Status
    public static List<Status> allStatus(){
        return List.of(
                new Status(),
                new Status(),
                new Status(),
                new Status(),
                new Status(),
                new Status()
        );
    }

    public static Status getByIdStatus(){
        return new Status();
    }
    //endregion

    //region User
    public static List<User> allUsers(){
        return List.of(
                new User(),
                new User(),
                new User(),
                new User(),
                new User(),
                new User()
        );
    }

    public static User getByIdUser(){
        return new User();
    }
    //endregion

    //region WarehouseInventory
    public static List<WarehouseInventory> allWarehousesInventories(){
        return List.of(
                new WarehouseInventory(),
                new WarehouseInventory(),
                new WarehouseInventory(),
                new WarehouseInventory(),
                new WarehouseInventory(),
                new WarehouseInventory()
        );
    }

    public static WarehouseInventory getByIdWarehouseInventory(){
        return new WarehouseInventory();
    }
    //endregion

    //region Warehouse
    public static List<Warehouse> allWarehouses(){
        return List.of(
                new Warehouse(),
                new Warehouse(),
                new Warehouse(),
                new Warehouse(),
                new Warehouse(),
                new Warehouse()
        );
    }

    public static Warehouse getByIdWarehouse(){
        return new Warehouse();
    }
    //endregion












}

