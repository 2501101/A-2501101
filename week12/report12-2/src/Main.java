public class Main {
    public static void main(String[] args) {
        int year, studentID;

        studentID = Input.readStudentID("학번 입력 : ");
        year = Input.readYear("연도 입력 : ");

        if (studentID % 2 == 0) {
            boolean leap = Compute.leapYearBool(year);
            Output.display(year, studentID, leap);
        } else {
            int leap = Compute.leapYearInt(year);
            Output.display(year, studentID, leap);
        }
    }
}
