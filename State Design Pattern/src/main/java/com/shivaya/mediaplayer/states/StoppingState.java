package com.shivaya.mediaplayer.states;

import com.shivaya.mediaplayer.Player;

public class StoppingState implements State {
    Player player;

    public StoppingState(Player player) {
        this.player = player;
        player.setPlaying(false);
    }

    public String onStop() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    public String onNext() {
        return "Locked...";
    }

    public String onPrev() {
        return "Locked...";
    }
}
