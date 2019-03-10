package pl.sda.jsonstudent;

import java.util.StringJoiner;

/**
 * @author Juliusz Mueller
 */
public class Student {
    public String name;
    public String lastname;
    public Integer index;

    public Student(String name, String lastname, Integer index) {
        this.name = name;
        this.lastname = lastname;
        this.index = index;


    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]").add("name='" + name + "'").add("lastname='" + lastname + "'").add("index=" + index).toString();
    }
}
