package com.javatechie.pagination;

import com.javatechie.pagination.entity.Product;
import com.javatechie.pagination.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class SpringDataJpaPaginationApplication {

	/*@Autowired
	private ProductRepository productRepository;

	@PostConstruct
	public void initDB() {
		List<Product> products = IntStream.rangeClosed(1, 200)
				.mapToObj(i -> new Product("Product" + i, new Random().nextInt(100), new Random().nextInt(50000)))
				.collect(Collectors.toList());
		productRepository.saveAll(products);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPaginationApplication.class, args);
	}

}
