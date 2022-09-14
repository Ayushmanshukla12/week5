package week5;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    float percentage;

    public Employee(int id, String name, float percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
