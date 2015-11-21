package com.golf.business.accessor;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golf.dao.player.PlayerDao;
import com.golf.domain.player.Player;

@Transactional
@Service("playerService")
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	PlayerDao playerDao;

	@Override
	public List<Player> getAllPlayers() throws Exception {

		return playerDao.getAll();
	}

}
