package com.design.mode.prototype;

import java.text.MessageFormat;

public class MailUtil {

    public static void sendMail(Mail mail){
        String content = "姓名：{0},内容：{1},地址:{2}";
        System.out.println(MessageFormat.format(content, mail.getName(), mail.getContent(), mail.getMailAddress()));
    }

}
