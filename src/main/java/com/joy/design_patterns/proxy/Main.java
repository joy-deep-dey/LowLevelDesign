package com.joy.design_patterns.proxy;

import com.joy.design_patterns.proxy.service.VideoProxy;
import com.joy.design_patterns.proxy.service.VideoService;

public class Main {
    public static void main(String[] args) {
        VideoService freeUser =
                new VideoProxy(false);

        freeUser.playVideo("Avengers");

        System.out.println();

        VideoService premiumUser =
                new VideoProxy(true);

        premiumUser.playVideo("Avengers");
    }
}
