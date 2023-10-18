package com.test;

import twitter4j.Twitter;
import twitter4j.v1.Status;

import java.util.List;

public class Application {
    public static void main (String[] args) throws Exception{
        System.out.println("Hello world");
        System.out.println("Avatar ");
        Twitter twitter = Twitter.getInstance();
        List<Status> statuses = twitter.v1().timelines().getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" +
                    status.getText());
        }
    }
}
