package org.gfg.springCore;

public class Client {
    public static void main(String[] args) {
        Address address = new Address("hisar", 125001);
        Student student = new Student("john", address);
        System.out.println(student);

        // student class is dependent upon address
        // injecting the dependency into student object ?
        // dependency injection ?

        // who is injecting the dependency ?
        // coder

        // spring
        // i will help in injecting the dependencies
        // more accurately
        // inversion of control


    }
}
