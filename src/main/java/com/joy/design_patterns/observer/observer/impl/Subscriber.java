package com.joy.design_patterns.observer.observer.impl;

import com.joy.design_patterns.observer.observable.Channel;
import com.joy.design_patterns.observer.observer.User;

public class Subscriber implements User {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(Channel channel) {
        System.out.println("  🔔 " + name
                + " → new video : \"" + channel.getLatestVideo() + "\""
                + " | total : "        + channel.getTotalVideos()
                + " | channel : "      + channel.getChannelName());
    }
}
