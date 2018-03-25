package com.prowo.jdk.clone;

/**
 * @author prowo
 * @date 2018/1/28
 */
public class CloneTest {

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;

        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);
        System.out.println(c == d);
    }

//    public static void main(String[] args) throws CloneNotSupportedException {
//        Person person1 = new Person(18, "tony");
//        Person person2 = (Person) person1.clone();
//        System.out.println(person1.getName() == person2.getName()
//                ? "clone是浅拷贝的" : "clone是深拷贝的");
//
//
//        System.out.println(person1);
//        System.out.println(person2);
//    }
}
