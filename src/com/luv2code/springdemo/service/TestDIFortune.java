package com.luv2code.springdemo.service;

public class TestDIFortune implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "this for DI fortune service ...";
    }
}
