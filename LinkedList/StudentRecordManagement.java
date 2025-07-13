package LinkedList;


class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;
 
    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}


class StudentList {
    private Student head;

    
    public void addAtBeginning(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    
    public void addAtEnd(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    
    public void addAtPosition(int position, int roll, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        Student newStudent = new Student(roll, name, age, grade);
        Student temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bound");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    
    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Deleted successfully");
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted successfully");
        }
    }

    
    public void searchByRollNumber(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student Found: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

   
    public void display() {
        if (head == null) {
            System.out.println("No student records");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    
    public void updateGrade(int roll, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }
}


public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentList list = new StudentList();

        list.addAtEnd(1, "Rohit", 16, 'A');
        list.addAtBeginning(2, "Ram", 18, 'B');
        list.addAtPosition(2, 3, "Ravi", 17, 'C');
        list.display();

        list.searchByRollNumber(3);
        list.updateGrade(3, 'B');
        list.display();

        list.deleteByRollNumber(2);
        list.display();
    }
}

