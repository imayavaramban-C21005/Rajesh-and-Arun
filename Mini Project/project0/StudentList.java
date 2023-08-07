package project0;

import java.util.Scanner;

public class StudentList {

    Scanner scan = new Scanner(System.in);
    Student [] list = new Student[3];
    Student student = new Student();
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
        for (Student item : list ){
            System.out.println(item.getName() + " - ");
            System.out.println(item.getCutoff() + " - ");
            System.out.println(item.getRegisterNumber());
        }
//        Arrays.stream(list)
//                .map(Student::getName)
//                .forEach(System.out::println);

    }

}
