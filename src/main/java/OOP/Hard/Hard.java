package OOP.Hard;

import java.util.ArrayList;
import java.util.List;

public class Hard {
    /**
     * Design an abstract class Appliance with properties such as brand, power, and methods
     * like turnOn() and turnOff(). Create concrete subclasses like
     * WashingMachine , and implement the abstract methods with specific behavior.
     */

    /**
     * Create a Library class that contains a list of Book objects (composition).
     * Each Book should have attributes such as title, author, and ISBN.
     * Write methods to add and remove books from the library and display
     * all books.
     */

    // ---- ok ---- //
    /**
     * Create a class Animal with a method sound(). Then, create two
     * subclasses Dog and Cat that override the sound() method to
     * provide their specific sounds.
     *
     * Use the super keyword to demonstrate the calling of a superclass method.
     */

    class Animal {

        public void sound() {
            System.out.println("This is animal sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void sound() {
            super.sound();
            System.out.println("The dog barks");
        }
    }

    class Cat extends Animal {
        @Override
        public void sound() {
            super.sound();
            System.out.println("The cat meows");
        }
    }

    // ---- ok ---- //
    /**
     * Create two interfaces Movable (with method move()) and
     * Flyable (with method fly()). Then, create a class SuperHero that implements
     * both interfaces and provides specific implementations of the methods.
     */

    interface Mobale {
        void move();

    }

    interface Flyable {
        void fly();
    }

    class SuperHero implements Mobale , Flyable {
        @Override
        public void move() {
            System.out.println("He is walking");
        }

        @Override
        public void fly() {
            System.out.println("He is flying");
        }
    }
    // ---- ok ---- //
    /**
     * Implement a University class with an inner class Department. The University
     * class should have fields like name and location, while the
     * Department class should have fields like deptName and hodName.
     *
     * Demonstrate how to create an object of the inner class
     * and access its members.
     */

    class University {
        private String name;
        private String location;

        public University(String name , String location) {
            this.name = name;
            this.location = location;
        }

        class Departement {
            private String deptName;
            private String nodName;

            public Departement(String deptName , String nodName) {
                this.deptName = deptName;
                this.nodName = nodName;
            }


            public String getDeptName() {
                return deptName;
            }

            public void setDeptName(String deptName) {
                this.deptName = deptName;
            }

            public String getNodName() {
                return nodName;
            }

            public void setNodName(String nodName) {
                this.nodName = nodName;
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }

}




