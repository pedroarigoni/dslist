package com.pedroarigoni.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroarigoni.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
