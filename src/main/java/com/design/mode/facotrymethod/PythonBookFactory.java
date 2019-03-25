package com.design.mode.facotrymethod;

public class PythonBookFactory extends BookFactory{

    public Book crateBook() {
        return new PythonBook();
    }
}
