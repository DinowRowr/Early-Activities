public class Student extends Teacher {
    
    int studentNum = 12345;
    String studentName = "Mark";

    public void studentInformation() {
        System.out.println("Student No.: " + studentNum);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Subject: " + subjectTaught);
        System.out.println("=======================");
    }
}
