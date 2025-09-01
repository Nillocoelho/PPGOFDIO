package com.dio.design.adapter;
public class Mp4Player implements AdvancedPlayer {
    public void playVlc(String file) {}
    public void playMp4(String file) { System.out.println("Playing mp4: " + file); }
}
