package com.yaskarasantangelo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yaskarasantangelo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
