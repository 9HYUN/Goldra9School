package school;

import java.util.ArrayList;

public class School
{
    private static School school = new School();
    private static String schoolName = "Gold9School";
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<Subject> subjectList = new ArrayList<Subject>();

    private School(){}


    public static School getSchool() {
        if(school == null)
        {
            school = new School();
        }
        return school;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void addStudent(Student student)
    {
        studentList.add(student);
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
