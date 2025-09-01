package com.dio.design.adapter;
public class AudioPlayer implements MediaPlayer {
    public void play(String type, String file) {
        if (type.equalsIgnoreCase("mp3")) System.out.println("Playing mp3: " + file);
        else if (type.equalsIgnoreCase("mp4")) {
            AdvancedPlayer player = new Mp4Player();
            player.playMp4(file);
        } else System.out.println("Format not supported: " + type);
    }
}
