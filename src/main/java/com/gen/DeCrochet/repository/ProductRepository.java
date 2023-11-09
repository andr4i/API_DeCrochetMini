package com.gen.DeCrochet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.DeCrochet.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
