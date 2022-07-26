package com.challenge.SpringBootChallenge.Dao;

import com.challenge.SpringBootChallenge.Entity.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameDao extends JpaRepository<VideoGame, Integer>
{
}
