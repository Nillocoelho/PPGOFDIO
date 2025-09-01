package com.dio.design.adapter;
public class VlcPlayer implements AdvancedPlayer {
    public void playVlc(String file) { System.out.println("Playing vlc: " + file); }
    public void playMp4(String file) {}
}
