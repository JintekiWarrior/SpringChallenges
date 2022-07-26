package org.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Employee
{
    @Value("123")
    private int id;
    @Value("Moe Yassine")
    private String name;
    @Autowired
    @Value("#{T(org.challenge.Employee).phoneList()}")
    private List<Phone> ph;
    @Autowired
    private Address add;

    private List<Phone> phoneList = phoneList();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }

    public static List<Phone> phoneList()
    {
        List<Phone> result = new ArrayList<>();
        result.add(new Phone("313456789"));
        result.add(new Phone("717456982"));
        result.add(new Phone("123456789"));
        return result;
    }

    public void findEmployee()
    {
        System.out.println("I am an employee: " + toString());
    }
}
