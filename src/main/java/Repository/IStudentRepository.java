/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

/**
 *
 * @author tuanh
 */
import java.util.ArrayList;
import Model.Student;

public interface IStudentRepository {
    
    void addStudent(ArrayList<Student> students);
    
    void print(ArrayList<Student> students);
    
    void display(); 
}
