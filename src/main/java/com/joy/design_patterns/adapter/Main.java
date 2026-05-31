package com.joy.design_patterns.adapter;

public class Main {
    public static void main(String[] args) {
        EuropeanSocketAdaptee europeanSocket =
                new EuropeanSocketAdaptee();

        IndianSocketTarget socket =
                new SocketAdapter(europeanSocket);

        socket.provide230V();
    }
}
