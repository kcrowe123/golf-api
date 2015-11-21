package com.golf.dao.tournament;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.golf.domain.tournament.Tournament;

@Repository
@Transactional
public class TournamentDao {
	
	  @Autowired
	  private SessionFactory _sessionFactory;
	  
	  private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }
	  
	  public void save(Tournament tournament) {
		    getSession().save(tournament);
		    return;
	  }
		  
	  public void delete(Tournament tournament) {
		    getSession().delete(tournament);
		    return;
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<Tournament> getAll() {
	    return getSession().createQuery("from Tournament").list();
	  }
	  

	  public Tournament getById(long id) {
	    return (Tournament) getSession().load(Tournament.class, id);
	  }

	  public void update(Tournament tournament) {
	    getSession().update(tournament);
	    return;
	  }


}
