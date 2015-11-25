package com.golf.dao.tournament;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.golf.domain.tournament.Tournament;

// TODO: Auto-generated Javadoc
/**
 * The Class TournamentDao.
 */
@Repository
@Transactional
public class TournamentDao {
	
	  /** The _session factory. */
  	@Autowired
	  private SessionFactory _sessionFactory;
	  
	  /**
  	 * Gets the session.
  	 *
  	 * @return the session
  	 */
  	private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }
	  
	  /**
  	 * Save.
  	 *
  	 * @param tournament the tournament
  	 */
  	public void save(Tournament tournament) {
		    getSession().save(tournament);
		    return;
	  }
		  
	  /**
  	 * Delete.
  	 *
  	 * @param tournament the tournament
  	 */
  	public void delete(Tournament tournament) {
		    getSession().delete(tournament);
		    return;
	  }
	  
	  /**
  	 * Gets the all.
  	 *
  	 * @return the all
  	 */
  	@SuppressWarnings("unchecked")
	  public List<Tournament> getAll() {
	    return getSession().createQuery("from Tournament").list();
	  }
	  

	  /**
  	 * Gets the by id.
  	 *
  	 * @param id the id
  	 * @return the by id
  	 */
  	public Tournament getById(long id) {
	    return (Tournament) getSession().load(Tournament.class, id);
	  }

	  /**
  	 * Update.
  	 *
  	 * @param tournament the tournament
  	 */
  	public void update(Tournament tournament) {
	    getSession().update(tournament);
	    return;
	  }


}
