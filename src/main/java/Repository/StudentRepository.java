/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.StudentDAO;
import Model.Student;
import java.util.ArrayList;

/**
 *
 * @author tuanh
 */
public class StudentRepository implements IStudentRepository{
    private ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(ArrayList<Student> students) {
        StudentDAO.Instance().addStudent(students);
    }

    @Override
    public void print(ArrayList<Student> students) {
        StudentDAO.Instance().print(students);
    }

    @Override
    public void display() {
        StudentDAO.Instance().display();
    }   
}
