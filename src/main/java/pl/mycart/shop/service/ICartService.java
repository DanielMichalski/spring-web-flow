package pl.mycart.shop.service;

import pl.mycart.shop.model.Product;
import pl.mycart.shop.model.ShoppingCart;

import java.util.List;

public interface ICartService {

    ShoppingCart getShoppingCart();

    List<Product> getProducts();

    List<Product> getRecommendations();

    Product getProduct(long productId);

    List<String> getShippingOptions();

    void submitOrderForPayment();
}
