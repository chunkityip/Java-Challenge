package OOP.Medium;

/**
 * Design a Person class with common attributes like name, age, and address.
 * Then, create two subclasses: Student and Employee, each with specific attributes
 * (e.g., Student has grade and Employee has salary). Override the toString()
 * method to display the information in a readable format.
 */

public class MediumAnswer {
    abstract class Person {
        private String name;
        private int age;
        private String address;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", addess='" + address + '\'' +
                    '}';
        }
    }

    class Student extends Person {
        private int grade;

        public Student(String name , int age , String address , int grade) {
            super(name , age , address);
        }

        @Override
        public String toString() {
            return super.toString() +
                    " , grade='" + grade + '\'' +
                    '}';
        }
    }

    class Employee extends Person {
        private double salary;

        public Employee(String name, int age, String address) {
            super(name, age, address);
        }

        @Override
        public String toString() {
            return super.toString() +
                    " , salary='" + salary + '\'' +
                    '}';
        }
    }

    /**
     * Create an interface Shape with a method calculateArea().
     * Implement two classes Circle and Rectangle that implement the Shape interface.
     * Write a program to calculate and display the area of both shapes by creating their objects.
     */

    interface Shape {
        double calculateArea();
    }

    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }
}
