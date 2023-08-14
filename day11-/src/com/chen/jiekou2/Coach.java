package com.chen.jiekou2;

public abstract class Coach extends Employee{
    @Override
    public void work() {
        System.out.println("教学生打球");
    }

    //属性
    private String coachLesence;

    public Coach() {
    }

    public Coach(String name, int age, String coachLesence) {
        super(name, age);
        this.coachLesence = coachLesence;
    }

    public String getCoachLesence() {
        return coachLesence;
    }

    public void setCoachLesence(String coachLesence) {
        this.coachLesence = coachLesence;
    }

    //教练行为
    public abstract void teach();
}
