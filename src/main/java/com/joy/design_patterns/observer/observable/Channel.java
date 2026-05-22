package com.joy.design_patterns.observer.observable;

import com.joy.design_patterns.observer.observer.User;

import java.util.ArrayList;
import java.util.List;

public abstract class Channel {

    protected String channelName;
    protected String latestVideo;
    protected int    totalVideos;

    private List<User> users = new ArrayList<>();

    public void subscribe(User user) {
        users.add(user);
        System.out.println(user.getName() + " subscribed to " + channelName);
    }

    public void unsubscribe(User user) {
        users.remove(user);
        System.out.println(user.getName() + " unsubscribed from " + channelName);
    }

    protected void notifyUsers() {
        System.out.println("Notifying " + users.size() + " subscribers...");
        for (User user : users) {
            user.update(this);
        }
    }

    public abstract void uploadVideo(String title);

    public String getChannelName() { return channelName; }
    public String getLatestVideo() { return latestVideo; }
    public int    getTotalVideos() { return totalVideos; }
}
