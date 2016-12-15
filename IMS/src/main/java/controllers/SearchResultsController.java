package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;

import Entitys.Product;

@SessionScoped
public class SearchResultsController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -978474692960218416L;

	public void setResults(List<Product> results) {
		// TODO Auto-generated method stub
		
	}

}
