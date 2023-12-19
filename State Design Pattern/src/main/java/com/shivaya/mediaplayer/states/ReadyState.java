package com.shivaya.mediaplayer.states;

import com.shivaya.mediaplayer.Player;

public class ReadyState implements State{
    Player player;

    public ReadyState(Player player) {
        this.player = player;

    }

    public String onStop() {
        player.changeState(new StoppingState(player));
        return  "Locked";
    }

    public String onPlay() {
       String action =  player.startPlayback();
       player.changeState(new PlayingState(player));
        return action;
    }

    public String onNext() {
        return "Locked...";
    }

    public String onPrev() {
        return "Locked...";
    }
}
