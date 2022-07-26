package com.challenge.SpringBootChallenge.Service;

import com.challenge.SpringBootChallenge.Entity.VideoGame;

import java.util.List;

public interface VideoGameService
{
    List<VideoGame> getAllVideoGames();
    VideoGame getVideoGameById(int gameId);
    VideoGame addVideoGame(VideoGame videoGame);
    VideoGame updateVideoGame(VideoGame videoGame);
    String deleteVideoGameById(int gameId);
}
