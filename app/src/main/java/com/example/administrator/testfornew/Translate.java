package com.example.administrator.testfornew;

/**
 * Created by Administrator on 2018/4/5.
 */

public class Translate {
    private int status;
    private Content content;
    private static class Content{
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;
    }
    public void Show(){
        System.out.println(status);

        System.out.println(content.from);
        System.out.println(content.to);
        System.out.println(content.vendor);
        System.out.println(content.out);
        System.out.println(content.errNo);
    }


}
