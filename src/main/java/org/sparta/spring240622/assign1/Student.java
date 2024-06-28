package org.sparta.spring240622.assign1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private int studentNum;
    private List<Subject> subjectList = new ArrayList<>();

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.studentName = name;
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject subject = new Subject(subjectName, subjectScore);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int sumScore = 0;
        for (Subject subject : subjectList) {
            System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() + " 과목 성적은 " + subject.getSubjectScore() + "입니다.");
            sumScore += subject.getSubjectScore();
        }
        System.out.println("학생 " + studentName + "의 총점은 " + sumScore + " 입니다.");

    }

}
