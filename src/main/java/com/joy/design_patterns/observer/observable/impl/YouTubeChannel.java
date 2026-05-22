package com.joy.design_patterns.observer.observable.impl;

import com.joy.design_patterns.observer.observable.Channel;

public class YouTubeChannel extends Channel {

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void uploadVideo(String title) {
        this.latestVideo = title;
        this.totalVideos++;
        System.out.println("\n[YouTube - " + channelName
                + "] Uploaded: \"" + title + "\"");
        notifyUsers();
    }
}
