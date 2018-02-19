package com.webservicedemo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.webservicedemo.model.Card;

public class CardDAOImpl implements CardDAO {

	public Card validateAndProcess(int processAmt, int cardno, String pin) {
		Card card = new Card();
		Session session = DbUtility.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria cr = session.createCriteria(Card.class);
		cr.add(Restrictions.eq("cardNo", cardno));
		cr.add(Restrictions.eq("pin", pin));
		List<Card> clist = cr.list();
		if (clist.isEmpty()) {	
			card = null;
		} else {
			// get method return null if matching not found you can modify the
			// code
			card = clist.get(0);
			if (processAmt <= card.getAmount()) {
				card.setAmount(card.getAmount() - processAmt);
				session.update(card);
				System.out.println("Transaction sucessful..!!");
				card = session.get(Card.class, cardno);
			} else {
				System.out.println("Transaction unsucessful..!!");
			}
			
		}
		session.getTransaction().commit();
		session.close();
		return card;
	}
}
