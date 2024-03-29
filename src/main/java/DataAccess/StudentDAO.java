/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Common.Library;
import Model.Student;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tuanh
 */
public class StudentDAO {
    private static StudentDAO instance = null;
    Library library = new Library();
    
    public static StudentDAO Instance() {
        if (instance == null){
            synchronized (StudentDAO.class) {
                if (instance == null){
                    instance = new StudentDAO();
                }
            }
        }
        return instance;
    }
    
    public void addStudent(ArrayList<Student> lt) {
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = library.inputString();
        System.out.print("Classes: ");
        String classes = library.inputString();
        System.out.print("Mark: ");
        float mark = library.checkInputFloat();
        lt.add(new Student(name, mark, classes));
    }

    public void print(ArrayList<Student> lt) {
        if (lt.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            System.out.println("--------Student " + i + 1 + "--------");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Classes: " + lt.get(i).getClasses());
            System.out.println("Mark: " + lt.get(i).getMark());
        }
    }

    public void display() {
        ArrayList<Student> lt = new ArrayList<>();
        addStudent(lt);
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (library.checkInputYN()) {
                addStudent(lt);
            } else {
                break;
            }
        }
        print(lt);
    } 
}
