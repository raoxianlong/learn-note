package com.design.mode.facotrymethod;

public class JavaBookFactory extends BookFactory{

    public Book crateBook() {
        return new JavaBook();
    }
}
