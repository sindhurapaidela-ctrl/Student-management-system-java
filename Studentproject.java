import java.util.*;
class StudentProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> s = new ArrayList<>();

        while (true) {

            System.out.println("\nStudent Management System");
            System.out.println("1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Search Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                s.add(new Student(id, name, marks));
                System.out.println("Student Added Successfully");

            } else if (choice == 2) {

                if (s.isEmpty())
                    System.out.println("No Students Found");
                else {
                    for (Student student : s) {
                        System.out.println("ID: " + student.id +
                                " Name: " + student.name +
                                " Marks: " + student.marks);
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter ID to Search: ");
                int search = sc.nextInt();

                boolean found = false;

                for (Student students : s) {
                    if (students.id == search) {
                        System.out.println("ID: " + students.id);
                        System.out.println("Name: " + students.name);
                        System.out.println("Marks: " + students.marks);
                        found = true;
                    }
                }

                if (found == false)
                    System.out.println("Student Not Found");

            } else if (choice == 4) {

                System.out.print("Enter ID to Delete: ");
                int deleteId = sc.nextInt();

                boolean removed = false;

                for (int i = 0; i < s.size(); i++) {
                    if (s.get(i).id == deleteId) {
                        s.remove(i);
                        removed = true;
                        System.out.println("Student Deleted Successfully");
                        break;
                    }
                }

                if (removed == false)
                    System.out.println("Student Not Found");

            } else if (choice == 5) {

                System.out.println("Thank You");
                break;

            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}
class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}