package school;

import java.util.ArrayList;

public class Student
{
    private int studentId;
    private String studentName;
    private Subject majorSubject;
    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public Student(int studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public void showInfo()
    {
        System.out.println(studentId + "," + studentName);
    }
}
