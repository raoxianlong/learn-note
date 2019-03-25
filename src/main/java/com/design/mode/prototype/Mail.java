package com.design.mode.prototype;

public class Mail implements Cloneable{

    private String name;
    private String content;
    private String mailAddress;

    public Mail() {
        System.out.println("调用构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
