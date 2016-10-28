package fr.itv95.dataaccessobject;

/**
 * Created by Luc on 17/10/2016.
 */
public class Main {

    public static void main(String[] args){
        StudentDao studentDao = new StudentDaoImpl();

        for(Student student : studentDao.getAllStudent()){
            System.out.println("Student: [RollNo: "+student.getRollNo()+", Name: "+student.getName()+"]");
        }

        Student student = studentDao.getAllStudent().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student: [RollNo: "+student.getRollNo()+", Name: "+student.getName()+"]");
    }

}
