package org.sparta.spring240622.assign1;

public class Subject {
    private String subjectName;
    private int subjectScore;

    public Subject (String subejctName, int subjectScore) {
        this.subjectName = subejctName;
        this.subjectScore = subjectScore;
    }

    public String getSubjectName () {
        return this.subjectName;
    }

    public int getSubjectScore () {
        return this.subjectScore;
    }

}
