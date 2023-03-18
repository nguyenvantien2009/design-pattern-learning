package com.despat.creational.abstract_factory.window;

import com.despat.creational.abstract_factory.Button;

public class WindowButton implements Button {
    @Override
    public void draw() {
        System.out.println("Draw button in window.");
    }
}
