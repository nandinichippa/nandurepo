package com.slokam.HibernateProduct.Controller;

import java.io.File;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.slokam.HibernateProduct.Entity.Product;
import com.slokam.HibernateProduct.Repo.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	private ProductRepo productrepo;
//helo
	@PostMapping("SaveProduct")
	public ResponseEntity<Product> saveproduct(@Valid @RequestBody Product product)
	{
	System.out.println(product);
	productrepo.save(product);
	return ResponseEntity.ok(product);
	}
	@PostMapping("saveFile")
	public void saveFile(MultipartFile multipartFile) throws Exception
	{
	System.out.println(multipartFile.getOriginalFilename());
	System.out.println(multipartFile.getSize());
	System.out.println(multipartFile.getContentType());
//hiii
	File file = new File("D:\\"+multipartFile.getOriginalFilename());
	multipartFile.transferTo(file);
	}
	}

