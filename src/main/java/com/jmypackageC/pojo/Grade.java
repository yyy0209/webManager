package com.jmypackageC.pojo;

public class Grade {    //等级
    private int grade_id;   //等级id
    private String jurisdiction;   //权限
    /*构造方法*/
    public Grade() {
    }

    public Grade(int grade_id, String jurisdiction) {
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

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
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
