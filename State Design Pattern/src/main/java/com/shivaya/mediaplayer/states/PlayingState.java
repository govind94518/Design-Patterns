package com.shivaya.mediaplayer.states;

import com.shivaya.mediaplayer.Player;

public class PlayingState implements State{
    Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    public String onStop() {
        player.changeState(new StoppingState(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Paused...";
    }

    public String onNext() {
        return player.nextTrack();
    }

    public String onPrev() {
        return player.previousTrack();
    }
}
