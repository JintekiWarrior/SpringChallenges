package com.challenge.SpringBootChallenge.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tb2_videoGames")
public class VideoGame
{
    @Id
    @Column(name = "g_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gameId;

    private String title;
    private String genre;
    private String publisher;

    public VideoGame(String title, String genre, String publisher) {
        this.title = title;
        this.genre = genre;
        this.publisher = publisher;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
