package com.recordstudent;

public class Main {
    public static void main(String[] args) {
        //objects of the class referencing the class studentRecords
        StudentRecords studentRecordsFirstEntry;  //Referencing to class StudentRecords
        studentRecordsFirstEntry = new StudentRecords(); // Allocating memory to the StudentsRecords
        StudentRecords studentRecordsSecondEntry = new StudentRecords();

        //Assigning values to studentRecordsFirstEntry
        studentRecordsFirstEntry.id  =1;
        studentRecordsFirstEntry.name ="John Doe";
        studentRecordsFirstEntry.age = 18;
        studentRecordsFirstEntry.gender = 'M';


        //Assigning values to studentRecordsSecondEntry
        studentRecordsSecondEntry.id  =1;
        studentRecordsSecondEntry.name ="Maria Doe";
        studentRecordsSecondEntry.age = 17;
        studentRecordsSecondEntry.gender = 'F';
        studentRecordsSecondEntry.printStudentRecords();
        System.out.println("\n====================");






    }

}
