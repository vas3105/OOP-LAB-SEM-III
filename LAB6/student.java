import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int reg_no;
    String name;
    int age;

    // Default constructor
    void init() {
        this.name = "";
        this.reg_no = 0;
        this.age = 0;
    }

    // Parameterized constructor
    void init(String name, int age, int reg_no) {
        this.name = name;
        this.reg_no = reg_no;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Registration No: " + this.reg_no + ", Age: " + this.age);
    }
}

class UG extends Student {
    int sem;
    double fees;

    UG(String name, int age, int reg_no, int sem, double fees) {
        this.init(name, age, reg_no);
        this.sem = sem;
        this.fees = fees;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Semester: " + this.sem + ", Fees: " + this.fees);
    }
}

class PG extends Student {
    int sem;
    double fees;

    PG(String name, int age, int reg_no, int sem, double fees) {
        this.init(name, age, reg_no);
        this.sem = sem;
        this.fees = fees;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Semester: " + this.sem + ", Fees: " + this.fees);
    }
}

public class students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<UG> ugStudents = new ArrayList<>();
        ArrayList<PG> pgStudents = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline character

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter 1 for UG or 2 for PG:");
            int ch = sc.nextInt();
            sc.nextLine();  // Consume newline character

            System.out.println("Enter the name:");
            String name = sc.nextLine();

            System.out.println("Enter the reg number:");
            int reg_no = sc.nextInt();

            System.out.println("Enter the age:");
            int age = sc.nextInt();

            System.out.println("Enter the semester:");
            int sem = sc.nextInt();

            System.out.println("Enter the fees:");
            double fees = sc.nextDouble();
            sc.nextLine();  // Consume newline character

            if (ch == 1) {
                UG ugStudent = new UG(name, age, reg_no, sem, fees);
                ugStudents.add(ugStudent);
            } else if (ch == 2) {
                PG pgStudent = new PG(name, age, reg_no, sem, fees);
                pgStudents.add(pgStudent);
            } else {
                System.out.println("Invalid input, please enter 1 or 2.");
                i--;  // Retry this iteration
            }
        }

        // Display UG students
        System.out.println("\nUG Students:");
        if (ugStudents.isEmpty()) {
            System.out.println("No UG students registered.");
        } else {
            for (UG ugStudent : ugStudents) {
                ugStudent.display();
            }
        }

        // Display PG students
        System.out.println("\nPG Students:");
        if (pgStudents.isEmpty()) {
            System.out.println("No PG students registered.");
        } else {
            for (PG pgStudent : pgStudents) {
                pgStudent.display();
            }
        }

        // Display total admissions
        System.out.println("\nTotal UG Admissions: " + ugStudents.size());
        System.out.println("Total PG Admissions: " + pgStudents.size());

        sc.close();
    }
}
