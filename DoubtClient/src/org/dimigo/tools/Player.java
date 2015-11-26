package org.dimigo.tools;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private Session m_session = null;
	
	private List<Integer> m_listCards = new ArrayList<Integer>();
	private String m_strName;
	
	
	public Player(Session session, String name){
		m_session = session;
		m_strName = name;
	}
	
	public void addCards(List<Integer> cards){
		m_listCards.addAll(cards);
	}
	
	public void addCards(int[] cards){
		for(int card : cards){
			m_listCards.add(card);
		}
	}
	
	public void addCard(int card){
		m_listCards.add(card);
	}
}
