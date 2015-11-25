package com.golf.business.accessor.player;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golf.business.Accessor;
import com.golf.business.Filter;
import com.golf.dao.player.PlayerDao;
import com.golf.domain.player.Player;

/**
 * @author Keith  PlayerAccessor class.
 */
@Transactional
@Service("playerAccessor")
public class PlayerAccessor implements Accessor<Player> {
    
    @Autowired
    private PlayerDao playerDao;

    @Override
    public List<Player> find(Filter<Player> filter) {
        return playerDao.getAll();
    }
    @Override
    public Player load(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * @return <code>PlayerDao</code>
     */
    public PlayerDao getPlayerDao() {
        return playerDao;
    }
    
    /**
     * @param playerDao   <code>PlayerDao</code>
     */
    public void setPlayerDao(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }
    
    

}
