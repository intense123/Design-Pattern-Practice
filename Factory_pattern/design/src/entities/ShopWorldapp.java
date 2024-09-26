
package entities;

import java.util.ArrayList; // Import ArrayList class
import java.util.List;

import dal.userdb;
import entities.Order.OrderBuilder;

public class ShopWorldapp {
    public static void main(String[] args) {

        userdb Userdb = userdb.getInstance();
        ProductFactory productFactory = new ProductFactory();

        // Use productFactory to create instances of products
        Product electronicpod = productFactory.createProduct("electronics");
        electronicpod.displayInfo();

        Product clothingpod = productFactory.createProduct("clothing");
        clothingpod.displayInfo();

        // Use UserAccountBuilder to create UserAccount
        UserAccount.UserAccountBuilder userBuilder = new UserAccount.UserAccountBuilder("username", "password");
        UserAccount userAccount = userBuilder.build();

        System.out.println(userAccount);

        // Initialize products list
        List<Product> products = new ArrayList<>();

        // Use OrderBuilder to create Order
        Order.OrderBuilder orderBuilder = new Order.OrderBuilder("orderId", products);
        Order order = orderBuilder.build();

    }
}
