package com.joy.design_patterns.observer;

// ─── Main.java ───────────────────────────────────────────────

import com.joy.design_patterns.observer.observable.Channel;
import com.joy.design_patterns.observer.observable.impl.YouTubeChannel;
import com.joy.design_patterns.observer.observer.User;
import com.joy.design_patterns.observer.observer.impl.Subscriber;

public class Main {
    public static void main(String[] args) {

        Channel channel = new YouTubeChannel("TechWithTim");   // abstract base

        User alice = new Subscriber("Alice");   // interface base
        User bob   = new Subscriber("Bob");
        User carol = new Subscriber("Carol");

        System.out.println("=== Subscribing ===");
        channel.subscribe(alice);
        channel.subscribe(bob);
        channel.subscribe(carol);

        channel.uploadVideo("Spring Boot in 1 Hour");
        channel.uploadVideo("Microservices Full Course");

        System.out.println();
        channel.unsubscribe(bob);

        channel.uploadVideo("Observer Pattern Explained");
    }
}
