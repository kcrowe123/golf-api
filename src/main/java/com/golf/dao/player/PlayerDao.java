package com.golf.dao.player;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.golf.domain.player.Player;

@Repository
@Transactional
public class PlayerDao {
	
	
	  @Autowired
	  private SessionFactory _sessionFactory;
	  
	  private Session getSession() {
	    return _sessionFactory.getCurrentSession();
	  }
	  
	  public void save(Player player) {
		    getSession().save(player);
		    return;
	  }
		  
	  public void delete(Player player) {
		    getSession().delete(player);
		    return;
	  }
	  
	  @SuppressWarnings("unchecked")
	  public List<Player> getAll() {
	    return getSession().createQuery("from Player").list();
	  }
	  

	  public Player getById(long id) {
	    return (Player) getSession().load(Player.class, id);
	  }

	  public void update(Player player) {
	    getSession().update(player);
	    return;
	  }

}
