package com.hyz.pojo;

public class PrivateClassTable {
    private Integer classId;
    private String className;
    private String classTime;
    private String coach;

    @Override
    public String toString() {
        return "PrivateClassTable{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", classTime='" + classTime + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }


}
