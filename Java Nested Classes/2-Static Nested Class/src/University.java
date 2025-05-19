/*
Write a Java program to create an outer class called University with a static nested class Department.
The Department class should have a method "displayInfo()" that prints the department name and the
number of faculty members. Instantiate the Department class from the main method and call
the "displayInfo()" method.
*/



public class University {

    public static class Department{

        private String name;
        private int facultyMembersNumber;


        public Department(String name, int facultyMembersNumber){
            this.name = name;
            this.facultyMembersNumber = facultyMembersNumber;
        }

        public void displayInfo(){
            System.out.printf("Department name: %s%nFaculty Members Number: %d%n%n", name, facultyMembersNumber);

        }

    }

}
