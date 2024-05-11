package org.gfg.springCore;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DIDemo {
    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("projectBean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource); // bucket // applicationcontext // bean factory

       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("projectBean.xml");

       Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student");
        Student student2 = new Student();
//       Address address =(Address) context.getBean("addressRef");
//       System.out.println(address);
       System.out.println(student);
       System.out.println(student1);
       System.out.println(student2);
       context.close();

    }
}
// above version 6, XmlBeanFactory is not present
// singleton class, singleton beans
