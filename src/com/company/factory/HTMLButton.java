package com.company.factory;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("HTMLButton rendered");
    }

    @Override
    public void onClick() {
        System.out.println("HTMLButton clicked");
    }
}
