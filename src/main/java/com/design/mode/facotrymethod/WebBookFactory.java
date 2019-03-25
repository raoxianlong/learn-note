package com.design.mode.facotrymethod;

public class WebBookFactory extends BookFactory{

    public Book crateBook() {
        return new WebBook();
    }
}
