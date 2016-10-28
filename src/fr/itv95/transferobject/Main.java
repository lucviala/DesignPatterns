package fr.itv95.transferobject;

/**
 * Created by Luc on 17/10/2016.
 */
public class Main {

    public static void main(String[] args){
        StudentBO studentBusinessObject = new StudentBO();

        for(StudentVO student : studentBusinessObject.getAllStudents()){
            System.out.println("Student: [RollNo: "+student.getRollNo()+", Name: "+student.getName()+"]");
        }

        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        student = studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo: "+student.getRollNo()+", Name: "+student.getName()+"]");
    }

}
