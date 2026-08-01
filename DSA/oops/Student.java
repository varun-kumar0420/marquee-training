import java.util.*;

class Student_Report {
  String name;
  String classStdudy;
  float avg_marks;
  char grade;
  Map<String, Integer> subj_marks = new HashMap<>();

  Student_Report(String name, String classStdudy, Map<String, Integer> subj_marks) {
    this.name = name;
    this.classStdudy = classStdudy;
    this.subj_marks = subj_marks;
  }

  public void calculateGradeAndAvg_marks() {
    int total_marks = 0;
    for (int marks : subj_marks.values()) {
      total_marks += marks;
    }
    avg_marks = total_marks / subj_marks.size();

    if (avg_marks >= 90)
      grade = 'A';
    else if (avg_marks >= 75)
      grade = 'B';
    else
      grade = 'C';

  }

  public void displayReport() {
    System.out.println("Name : " + name);
    System.out.println("Class " + classStdudy);
    System.out.println("subject & marks " + subj_marks);
    System.out.println("Average Marks: " + avg_marks);
    System.out.println("Grade: " + grade);
  }

}

public class Student {
  public static void main(String args[]) {
    Map<String, Integer> marks = new HashMap<>();
    marks.put("MAth", 95);
    marks.put("Science", 88);
    marks.put("English", 76);

    Student_Report s1 = new Student_Report("Varun", "BTech 3rd Sem", marks);
    s1.displayReport();
  }
}