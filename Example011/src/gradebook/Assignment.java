package gradebook;

public class Assignment {
    private String name;
    private String dueDate;
    private double maxScore;
    private double studentScore;

    public Assignment(String name, String dueDate, double maxScore, double studentScore) {
        if (name.length() > 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must be atleast 2 characters");
        }
        this.dueDate = dueDate;
        this.maxScore = maxScore;
        this.studentScore = studentScore;

    }

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public void setStudentScore(double studentScore) {
        this.studentScore = studentScore;
    }

    public double getGrade() {
        return studentScore / maxScore;
    }
}
