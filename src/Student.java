
class Student {
     int studentId;
     String name;
     int[] marks = new int[3];

    public Student(int studentId, String name, int m1, int m2, int m3) {
        this.studentId = studentId;
        this.name = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    public int calculateTotal() {
        return marks[0] + marks[1] + marks[2];
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public String calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 40) return "D";
        else return "F";
    }

    public void displayReport() {
        System.out.println("----- Student Report -----");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("--------------------------");
    }
}
