package test;

import grade.AbsoluteEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;

import java.util.ArrayList;

public class SchoolTest
{
    public static void main(String[] args) {

        Student student = new Student(123, "규규");
        Student student2 = new Student(1111, "구구");
        Student student3 = new Student(7777, "쿠쿠");
        ArrayList<Student> studentList = new ArrayList<Student>();
        School school = School.getSchool();
        school.setStudentList(studentList);
        school.addStudent(student);
        school.addStudent(student2);
        school.addStudent(student3);
        Subject subject1 =new Subject("Korean",123,0);
        Subject subject2 =new Subject("math",1111,0);
        Subject subject3 =new Subject("english",7777,0);
        ArrayList<Subject> subjectList = new ArrayList<>();
        school.setSubjectList(subjectList);
        school.addSubject(subject1);
        school.addSubject(subject2);
        school.addSubject(subject3);



        Score score =new Score(123,subjectList.get(1),90);


        AbsoluteEvaluation absoluteEvaluation =new AbsoluteEvaluation();
        System.out.println(absoluteEvaluation.getGrade(score.getPoint()));

        for(int i=0; i< studentList.size(); i++)
        {
            studentList.get(i).showInfo();
        }

        for(int i=0; i< subjectList.size(); i++)
        {
            System.out.println(subjectList.get(i).toString());
        }
        System.out.println(studentList.size());
        System.out.println(studentList.get(1).getStudentId() == 1111);
        System.out.println(studentList.get(1).getStudentId() == 1111);



    }

}
