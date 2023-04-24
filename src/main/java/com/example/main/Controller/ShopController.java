package com.example.main.Controller;

import com.example.main.model.Shop;
import com.example.main.respository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shop")
public class ShopController {

    @Autowired
    ShopRepository shopRepository;

    //localhost:9090/shop/AllShop
    @GetMapping("AllShop")
    public List<Shop> getAllShop()
    {
        return shopRepository.findAll();
    }

    //localhost:9090/shop/shopbyid/12
    @GetMapping("shopbyid/id")
    public Shop getAllShopById(@PathVariable String id)
    {
        return shopRepository.findById(id).get();
    }


    //localhost:9090/shop/saveshop
    @PostMapping("/saveshop")
    public Shop saveStore(@RequestBody Shop shop) {
        shopRepository.save(shop);
        return shop;
    }

    //localhost:9090/shop/updateShop/12
    @PutMapping("updateShop/{id}")
    public Shop updateShopById(@RequestBody Shop shop,@PathVariable String id )
    {
        return shopRepository.save(shop);
    }

    //localhost:9090/shop/deleteshopid/24
    @DeleteMapping("deleteshopid/{id}")
    public String deleteShopById(@PathVariable String id)
    {
        shopRepository.deleteById(id);
        return "Shop Id is successfully deleted.";
    }

}
