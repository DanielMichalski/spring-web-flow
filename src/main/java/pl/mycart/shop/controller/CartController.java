package pl.mycart.shop.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import pl.mycart.shop.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {

    @Autowired
    private ICartService cartService;

    @RequestMapping("/home.do")
    public ModelMap doHome() {
        ModelMap model = new ModelMap();
        model.addAttribute("shoppingCart", cartService.getShoppingCart());
        model.addAttribute("products", cartService.getProducts());
        return model;
    }
}
