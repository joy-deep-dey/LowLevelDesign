package com.joy.design_patterns.proxy.service;

public class VideoProxy implements VideoService{
    private RealVideoService realVideoService;

    private boolean premiumUser;

    public VideoProxy(boolean premiumUser) {

        this.premiumUser = premiumUser;

        this.realVideoService =
                new RealVideoService();
    }
    @Override
    public void playVideo(String movie) {
        if (!premiumUser) {

            System.out.println(
                    "Access denied. Premium subscription required."
            );

            return;
        }

        realVideoService.playVideo(movie);
    }
}
