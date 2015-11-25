package com.golf.dao.player;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.golf.domain.player.Player;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerDao.
 */
@Repository
@Transactional
public class PlayerDao {
	
	
	  /** The _session factory. */
  	@Autowired
	  private SessionFactory sessionFactory;
	  
	  /**
  	 * Gets the session.
  	 *
  	 * @return the session
  	 */
  	private Session getSession() {
	    return sessionFactory.getCurrentSession();
	  }
	  
	  /**
  	 * Save.
  	 *
  	 * @param player the player
  	 */
  	public void save(Player player) {
		    getSession().save(player);
		    return;
	  }
		  
	  /**
  	 * Delete.
  	 *
  	 * @param player the player
  	 */
  	public void delete(Player player) {
		    getSession().delete(player);
		    return;
	  }
	  
	  /**
  	 * Gets the all.
  	 *
  	 * @return the all
  	 */
  	@SuppressWarnings("unchecked")
	  public List<Player> getAll() {
	    return getSession().createQuery("from Player").list();
	  }
	  

	  /**
  	 * Gets the by id.
  	 *
  	 * @param id the id
  	 * @return the by id
  	 */
  	public Player getById(long id) {
	    return (Player) getSession().load(Player.class, id);
	  }

	  /**
  	 * Update.
  	 *
  	 * @param player the player
  	 */
  	public void update(Player player) {
	    getSession().update(player);
	    return;
	  }

}
