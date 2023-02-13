package com.slokam.HibernateProduct.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.HibernateProduct.Entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
