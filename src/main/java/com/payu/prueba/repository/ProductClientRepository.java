package com.payu.prueba.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.payu.prueba.model.*;
import java.util.List;
import com.payu.prueba.model.ProductClient;

public interface ProductClientRepository extends JpaRepository<ProductClient,Integer>{
	
	List<ProductClient> findByClient(Client client);
	
}
