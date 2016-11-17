package Entitys;

import java.util.*;

import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.inject.Singleton;

@Startup
@Singleton
public class TestData {

	private List<Product> products;
	private List<Customer> customers;

	@PostConstruct
	private void setupData() {

		products = new ArrayList<>();
		customers = new ArrayList<>();
	}

}
