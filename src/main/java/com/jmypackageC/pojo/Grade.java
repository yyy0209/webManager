package com.jmypackageC.pojo;

public class Grade {    //等级
    private int grade_id;   //等级id
    private char jurisdiction;   //权限
    /*构造方法*/
    public Grade() {
    }

    public Grade(int grade_id, char jurisdiction) {
        this.grade_id = grade_id;
        this.jurisdiction = jurisdiction;
    }
    /*get和set*/
    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public char getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(char jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
    /*toString*/
    @Override
    public String toString() {
        return "Grade{" +
                "grade_id=" + grade_id +
                ", jurisdiction=" + jurisdiction +
                '}';
    }
}
