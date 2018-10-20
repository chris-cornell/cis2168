/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author corne
 */
public class MyClass {

}

class Parent {

    public String printName() {
        System.out.println("Parent");
        return "Parent";
    }
}

class Child extends Parent {

    public String printName() {
        System.out.println("Child");
        return "Child";
    }

    public String parentName() {
        return super.printName();
    }
}
