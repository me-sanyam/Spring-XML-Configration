package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.firstsession.beans.Student;

public class Main {
    public static void main(String[] args){

        String config_location = "firstsession/resources/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config_location);

        Student studentObject = (Student)context.getBean("student1");
        System.out.println(studentObject.getName());
        System.out.println(studentObject.getRoll_no());
        System.out.println(studentObject.getEmail());
        System.out.println("---------------------------------------------------------");
        Student studentObject2 = (Student)context.getBean("student2");
        System.out.println(studentObject2.getName());
        System.out.println(studentObject2.getRoll_no());
        System.out.println(studentObject2.getEmail());
    }
}
