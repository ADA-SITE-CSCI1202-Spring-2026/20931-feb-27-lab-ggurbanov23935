public class Person {

    String firstName;
    String lastName;
    String gender;


    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }


    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGender(String gender) { this.gender = gender; }


    public String toString() {
        return firstName + " " + lastName + ", Gender: " + gender;
    }


    public boolean equals(Person p) {
        return p != null &&
               firstName.equals(p.firstName) &&
               lastName.equals(p.lastName) &&
               gender.equals(p.gender);
    }
}
// this class defines a person with basic attributes and methods.