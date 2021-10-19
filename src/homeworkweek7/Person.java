/*

14. Person
Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods (instance methods):
*Method named getFirstName without any parameters, it needs to return the value of the firstName
field.
*Method named getLastName without any parameters, it needs to return the value of the lastName
field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the
firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the
lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is
greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
 *In case both firstName and lastName fields are empty, Strings return an empty String.
 *In case firstName is an empty String, return firstName.
 *In case lastName is an empty String, return lastName.
To check if s String is empty, use the method isEmpty from the String class. For example,
firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
contain any characters.
TEST EXAMPLE
TEST CODE: (Write below code in to main method then check out put)
Person person = new Person();
person.setFirstName(""); // firstName is set to empty string
person.setLastName(""); // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John"); // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith"); // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());
OUTPUT
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods
 */

package homeworkweek7;

public class Person {

    String firstname;
    String lastname;
    int age;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstname.isEmpty() || lastname.isEmpty()) return "";
        else return firstname + lastname;

    }

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(""); //firstname is set to empty string
        person.setLastname(""); //lastname is set to empty string
        person.setAge(10);
        System.out.println("fullName =" +person.getFullName());
        System.out.println("teen ="+person.isTeen());
        person.setFirstName("John"); //first name is set as John
        person.setAge(18);
        System.out.println("fullName = "+person.getFullName());
        System.out.println("teen ="+person.isTeen());
        person.setLastname("Smith");  //last name is set as Smith
        System.out.println("fullName ="+person.getFullName());
    }

    }

