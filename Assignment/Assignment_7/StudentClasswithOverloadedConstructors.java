class Student {
    int rollNumber;
    String name;
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = "Unknown";
    }
    public void display() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        Student s2 = new Student(102);
        s1.display();
        s2.display();
    }
}