package com.design.mode.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Mail mail = new Mail();
        for (int i=0;i<10;i++){
            Mail email = (Mail) mail.clone();
            email.setName("饶先龙");
            email.setContent("是猪");
            email.setMailAddress("2cd@qq.com");
            MailUtil.sendMail(email);
        }

    }

}
