package com.pragim.SpringBootWithRestAPIS.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pragim.SpringBootWithRestAPIS.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
