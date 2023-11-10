public class Classroom extends Campus {

    String building = "DIT";
    String room = "CCL 9";
    String subjectTaught = "Algorithm";

    public void classroomInformation() {
        System.out.println("Building: " + building);
        System.out.println("Room: " + room);
        System.out.println("Subject Taught: " + subjectTaught);
        System.out.println("=======================");
    }
}
