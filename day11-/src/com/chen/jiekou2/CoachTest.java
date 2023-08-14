package com.chen.jiekou2;

public class CoachTest {
    public static void main(String[] args) {
/*        new PingPongCoach().teach();
        new PingPongCoach().studyEnglish();
        new PingPongCoach().work();
        new PingPongCoach().work1();
        */

        PingPongCoach p = new PingPongCoach("刘国梁",50,"国家证书号码:666");
        p.work1();
        p.work();
        p.teach();
        p.studyEnglish();

    }



}
