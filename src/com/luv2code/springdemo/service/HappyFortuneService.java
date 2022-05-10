package com.luv2code.springdemo.service;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "this is from fortune service ...";
    }
}
