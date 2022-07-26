package com.challenge.SpringBootChallenge.Service;

import com.challenge.SpringBootChallenge.Dao.VideoGameDao;
import com.challenge.SpringBootChallenge.Entity.VideoGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoGameServiceImpl implements VideoGameService
{
    @Autowired
    private VideoGameDao videoGameDao;

    @Override
    public List<VideoGame> getAllVideoGames() {
        return this.videoGameDao.findAll();
    }

    @Override
    public VideoGame getVideoGameById(int gameId) {
        Optional <VideoGame> g = this.videoGameDao.findById(gameId);
        VideoGame game = null;
        if (g.isPresent())
        {
            game = g.get();
        } else
        {
            throw new RuntimeException("Game not found for id :: " + gameId);
        }
        return game;
    }

    @Override
    public VideoGame addVideoGame(VideoGame videoGame) {
        return this.videoGameDao.save(videoGame);
    }

    @Override
    public VideoGame updateVideoGame(VideoGame videoGame) {
        return this.videoGameDao.save(videoGame);
    }

    @Override
    public String deleteVideoGameById(int gameId) {
        this.videoGameDao.deleteById(gameId);
        return "Deleted Successfully";
    }
}
