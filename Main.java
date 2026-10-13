class Person {
    protected String name;
    protected String id;

    public void setDetails(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String describe() {
        return name + " (" + id + ")";
    }
}

class Student extends Person {
    protected double gpa;

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    public String studentCard() {
        return "Student " + describe() + ", GPA " + gpa;
    }
}

class Lecturer extends Person {
    private String faculty;

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String staffCard() {
        return "Lecturer " + name + " (" + id + "), " + faculty;
    }
}

class PostgraduateStudent extends Student {
    private String thesisTitle;

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String postgradCard() {
        return studentCard() + ", thesis: \"" + thesisTitle + "\"";
    }
}
public class Main{
    public static void main(String[] args) {
        Student s = new Student();
        s.setDetails("Ali", "ST101");
        s.setGpa(3.5);
        System.out.println(s.studentCard());

        Lecturer l = new Lecturer();
        l.setDetails("Ahmed", "LE201");
        l.setFaculty("Computer Science");
        System.out.println(l.staffCard());

        PostgraduateStudent p = new PostgraduateStudent();
        p.setDetails("Amina", "PG301");
        p.setGpa(3.8);
        p.setThesisTitle("Artificial Intelligence");
        System.out.println(p.postgradCard());
    }
}