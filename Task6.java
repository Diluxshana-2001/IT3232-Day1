class Student {
    String name;
    String regno;
    double[] marks = new double[5];

    public Student(String name, String regno, double[] marks) {
        this.name = name;
        this.regno = regno;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public void printDetails() {
        System.out.println("name " + name);
        System.out.println("regno " + regno);
        System.out.println("average " + calculateAverage());
    }
}

public class Task6 {
    public static void main(String[] args) {
        double[] m1 = { 90, 85, 78, 68, 90 };
        double[] m2 = { 92, 85, 78, 69, 80 };
        double[] m3 = { 90, 55, 68, 68, 70 };
        double[] m4 = { 80, 85, 98, 58, 90 };
        double[] m5 = { 90, 95, 75, 68, 100 };

        Student s1 = new Student("John", "A001", m1);
        Student s2 = new Student("Josh", "A002", m2);
        Student s3 = new Student("Alice", "A003", m3);
        Student s4 = new Student("Peter", "A004", m4);
        Student s5 = new Student("Mark", "A005", m5);

        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (Student student : students) {
            student.printDetails();
            System.out.println();
        }
    }
}

// java Task6      
// name John
// regno A001
// average 82.2

// name Josh
// regno A002
// average 80.8

// name Alice
// regno A003
// average 70.2

// name Peter
// regno A004
// average 82.2

// name Mark
// regno A005
// average 85.6