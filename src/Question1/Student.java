package Question1;

class Student extends Person {
    private double markAvg;

    // Constructor không tham số
    public Student() {
    }

    // Constructor có tham số
    public Student(String personID, String personName, int dateOfBirth, double markAvg) {
        super(personID, personName, dateOfBirth);
        this.markAvg = markAvg;
    }

    // Getter và Setter cho markAvg
    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "; Average Mark: " + markAvg;
    }
}