package OOP.Hard;

import java.util.ArrayList;
import java.util.List;

public class HardAnswer {
    /**
     * Design an abstract class Appliance with properties such as brand, power, and methods
     * like turnOn() and turnOff(). Create concrete subclasses like
     * WashingMachine and Refrigerator, and implement the abstract methods with specific behavior.
     */

    abstract class Appliance {
        private String brand;
        private boolean power;

        public Appliance(String brand, boolean power) {
            this.brand = brand;
            this.power = power;
        }


        public void turnOn() {
            if (!power) {
                power = true;
                System.out.println(brand + " is now ON.");
            } else {
                System.out.println(brand + " is already ON.");
            }
        }

        public void turnOff() {
            if (power) {
                power = false;
                System.out.println(brand + " is now OFF.");
            } else {
                System.out.println(brand + " is already OFF.");
            }
        }

    }

    class WashingMachine extends Appliance {
        private int loadCapacity;

        public WashingMachine(String brand, boolean power, int loadCapacity) {
            super(brand, power);
            this.loadCapacity = loadCapacity;
        }

        @Override
        public void turnOn() {
            super.turnOn();
            System.out.println("Washing machine is ready to wash with load capacity: " + loadCapacity + " kg.");
        }

        @Override
        public void turnOff() {
            super.turnOff();
            System.out.println("Washing machine is now off.");
        }
    }


    /**
     * Create a Library class that contains a list of Book objects (composition).
     * Each Book should have attributes such as title, author, and ISBN.
     * Write methods to add and remove books from the library and display
     * all books.
     */
    class Book {
        private String title;
        private String author;
        private String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", isbn='" + isbn + '\'' +
                    '}';
        }
    }

    class Library {
        private List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
            System.out.println("Added: " + book.getTitle());
        }

        public void removeBook(String isbn) {
            boolean removed = false;
            for (Book book : books) {
                // Making sure we do have the book isbn
                if (book.getIsbn().equals(isbn)) {
                    books.remove(book);
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("Book with ISBN: " + isbn + " not found.");
            }
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No such as BOOK");
            } else {
                System.out.println("Book in the library");
                for (Book book : books) {
                    System.out.println(book);
                }
            }
        }
    }

    /**
     * Create a class Animal with a method sound(). Then, create two
     * subclasses Dog and Cat that override the sound() method to
     * provide their specific sounds.
     * <p>
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

        class SuperHero implements Mobale, Flyable {
            @Override
            public void move() {
                System.out.println("He is walking");
            }

            @Override
            public void fly() {
                System.out.println("He is flying");
            }
        }

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

