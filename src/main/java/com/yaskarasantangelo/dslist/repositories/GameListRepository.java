package com.yaskarasantangelo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yaskarasantangelo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
