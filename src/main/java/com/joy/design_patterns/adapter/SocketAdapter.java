package com.joy.design_patterns.adapter;

public class SocketAdapter implements IndianSocketTarget{
    EuropeanSocketAdaptee europeanSocketAdaptee;

    public SocketAdapter(EuropeanSocketAdaptee europeanSocketAdaptee){
        this.europeanSocketAdaptee=europeanSocketAdaptee;
    }
    @Override
    public void provide230V() {
        europeanSocketAdaptee.provide220V();
        System.out.println("Converting 220V -> 230V");
    }
}
