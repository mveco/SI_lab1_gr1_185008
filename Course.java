import java.util.ArrayList;
import java.util.List;

class Course {
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student st) {
        students.add(st);
    }

    public void removeStudent(String index) {
        for (int i = 0; i < students.size(); i++)
            if (students.get(i).getIndex().equals(index)) {
                students.remove(i);
                break;
            }
    }

    public Student getStudent(String index) {
        for (int i = 0; i < students.size(); i++)
            if (students.get(i).getIndex().equals(index)) {
                return students.get(i);
            }
        return null;
    }

    public int getAverageLabPoints() {
        int points = 0;

        for (int i = 0; i < students.size(); i++)
            points += students.get(i).getAverage();

        points %= students.size();
        return points;
    }

    public int numberOfSignatures() {
        int signatures = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).hasSignature())
                signatures++;
        }

        return signatures;
    }

    public Course(ArrayList<Student> students) {
        this.students = students;
    }
}