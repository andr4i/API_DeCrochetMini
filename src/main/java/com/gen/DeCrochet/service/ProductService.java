package com.gen.DeCrochet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gen.DeCrochet.model.Product;
import com.gen.DeCrochet.repository.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	// GET
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductById(long id) {
		return productRepository.findById(id).orElse(null);
	}
	
	// POST
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	// PUT 
	
	public Product updateProduct(Long id,Product ProductDetails) {
		Product product = productRepository.findById(id).orElse(null);
		product.setNameModel(ProductDetails.getNameModel());
		product.setDescription(ProductDetails.getDescription());
		product.setImage(ProductDetails.getImage());
		product.setStock(ProductDetails.getStock());
		product.setCategory(ProductDetails.getCategory());
		return productRepository.save(product);
	}
	
	// DELETE
	
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
	
	
}
