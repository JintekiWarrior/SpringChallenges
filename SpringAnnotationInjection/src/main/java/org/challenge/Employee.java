package org.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Employee
{
    @Value("123")
    private int id;
    @Value("Moe Yassine")
    private String name;
    private List<Phone> ph;
    @Autowired
    private Address add;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }

    public void findEmployee()
    {
        System.out.println("I am an employee: " + toString());
    }
}
