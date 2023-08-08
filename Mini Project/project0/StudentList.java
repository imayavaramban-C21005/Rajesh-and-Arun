package project0;

import java.util.Scanner;

public class StudentList {

    Scanner scan = new Scanner(System.in);
    static Student [] list = new Student[3];
    int count = 0;
    public void regiteringStudent(){
        Student student = new Student();
        for (int i = 0;i < 3;i++){
            count += 1;
            if (count >= 4){
                System.out.println("Registeration Over");

            }
            else {
                System.out.println("student "+ (i+1));
                System.out.println("Enter Your Name : ");
                student.setName(scan.next());
                System.out.println("Enter Your cutoff : ");
                student.setCutoff(Integer.parseInt(scan.next()));
                System.out.println("Enter Your RegisterNumber : ");
                student.setRegisterNumber(Integer.parseInt(scan.next()));
                list[i] = new Student(student.getName(), student.getCutoff(), student.getRegisterNumber());
            }
        }


        }


    }


