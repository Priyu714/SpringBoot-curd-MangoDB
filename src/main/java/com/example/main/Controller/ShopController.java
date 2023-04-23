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

    @GetMapping("AllShop")
    public List<Shop> getAllShop()
    {
        return shopRepository.findAll();
    }
    @GetMapping("shopbyid/id")
    public Shop getAllShopById(@PathVariable String id)
    {
        return shopRepository.findById(id).get();
    }


    @PostMapping("/saveshop")
    public Shop saveStore(@RequestBody Shop shop) {
        shopRepository.save(shop);
        return shop;
    }


}
