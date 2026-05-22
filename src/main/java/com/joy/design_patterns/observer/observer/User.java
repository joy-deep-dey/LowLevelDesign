package com.joy.design_patterns.observer.observer;

import com.joy.design_patterns.observer.observable.Channel;

public interface User {
    void update(Channel channel);
    String getName();
}
