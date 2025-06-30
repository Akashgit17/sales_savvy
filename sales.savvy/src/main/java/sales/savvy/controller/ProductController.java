package sales.savvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sales.savvy.entity.Product;
import sales.savvy.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product prod) {
		service.addProduct(prod);
		return "success";
	}
}
