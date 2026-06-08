package com.joy.design_patterns.proxy.service;

public class RealVideoService implements VideoService{
    @Override
    public void playVideo(String movie) {
        System.out.println(
                "Playing movie: " + movie
        );
    }
}
