package com.webservicedemo.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.webservicedemo.dao.CardDAO;
import com.webservicedemo.dao.CardDAOImpl;
import com.webservicedemo.model.Card;

@Path("/CardService")
public class CardService {
	
	CardDAO cardDAO = new CardDAOImpl();// TODO: use bean here
	
	@GET
	@Path("/card/{amount}/{cardno}/{pin}")
	@Produces(MediaType.APPLICATION_XML)
	public Card validateAndProcess(@PathParam("amount") int amount,@PathParam("cardno") int no, @PathParam("pin") String pin) {
		Card c = new Card();
		c = cardDAO.validateAndProcess(amount, no, pin); 
		if( c != null)
		{
			System.out.println("Card validated sucessfully...!!");
			return c;
		}else{
		System.out.println("Card is not validate");
			return c;
		}
	}
	
}
