package org.challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Represent Spring IOC container
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        //
        Student obj = (Student) context.getBean("Student");
        obj.findStudent();
    }
}
