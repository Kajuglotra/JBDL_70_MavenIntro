package org.gfg.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiDemo2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.gfg.springCore");
        Student student  = (Student) context.getBean("student");
        System.out.println(student);
    }
}
