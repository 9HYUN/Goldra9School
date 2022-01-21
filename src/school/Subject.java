package school;

import code.GradeTypeCode;

import java.util.ArrayList;


public class Subject
{
    private String subjectName;
    private int subjectId;
    private int gradeType;
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectId, int gradeType)
    {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = GradeTypeCode.ab_ev; //기본 절대평가
    }
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectId=" + subjectId +
                ", gradeType=" + gradeType +
                '}';
    }

    public void register(Student student) {
        studentList.add(student);

    }
}
