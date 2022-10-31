package main;

import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {

    Clip clip;
    URL soundUrl[] = new URL[30];

    public Sound (){
        soundUrl[0] = getClass().getResource("/sound/BlueBoyAdventure.wav");
        soundUrl[1] = getClass().getResource("/sound/coin.wav");
        soundUrl[2] = getClass().getResource("/sound/powerup.wav");
        soundUrl[3] = getClass().getResource("/sound/unlock.wav");
        soundUrl[4] = getClass().getResource("/sound/fanfare.wav");
    }
}
