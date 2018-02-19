package com.webservicedemo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import com.webservicedemo.model.Card;

public interface CardDAO {
	
	public Card validateAndProcess(int processAmt, int cardno, String pin);
	
}