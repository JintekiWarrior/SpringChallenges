package com.challenge.SpringBootChallenge.Controller;

import com.challenge.SpringBootChallenge.Entity.VideoGame;
import com.challenge.SpringBootChallenge.Service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VideoGameController
{
    @Autowired
    private VideoGameService videoGameService;

    @GetMapping("/")
    public String home()
    {
        return "Home Sweet Home";
    }

    @GetMapping("/games")
    public List<VideoGame> getVideoGames()
    {
        return this.videoGameService.getAllVideoGames();
    }

    @GetMapping("/games/{gameId}")
    public VideoGame getVideoGame(@PathVariable String gameId)
    {
        return this.videoGameService.getVideoGameById(Integer.parseInt(gameId));
    }

    @PostMapping("/games")
    public VideoGame addVideoGame(@RequestBody VideoGame videoGame)
    {
        return this.videoGameService.addVideoGame(videoGame);
    }

    @PutMapping("/games")
    public VideoGame updateVideoGame(@RequestBody VideoGame videoGame)
    {
        return this.videoGameService.updateVideoGame(videoGame);
    }

    @DeleteMapping("/games/{gameId}")
    public String deleteVideoGame(@PathVariable String gameId)
    {
        return this.videoGameService.deleteVideoGameById(Integer.parseInt(gameId));
    }
}
