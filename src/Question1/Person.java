package Question1;

// Lớp Question1.Person
class Person {
    private String personID;
    private String personName;
    private int dateOfBirth;

    // Constructor không tham số
    public Person() {
    }

    // Constructor có tham số
    public Person(String personID, String personName, int dateOfBirth) {
        this.personID = personID;
        this.personName = personName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters và Setters
    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // toString
    @Override
    public String toString() {
        return "ID: " + personID + "; Name: " + personName + "; Date of Birth: " + dateOfBirth;
    }
}