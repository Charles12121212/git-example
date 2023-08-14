package com.chen.jiekou2;

public class PingPongCoach extends Coach implements StudyEnglish{

    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age, String coachLesence) {
        super(name, age, coachLesence);
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }

    @Override
    public void studyEnglish() {
        System.out.println("要学英语去国外交流");
    }
}
