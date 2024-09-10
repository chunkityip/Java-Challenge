package OOP.Medium;

public class Medium {

    /**
     * Design a Person class with common attributes like name, age, and address.
     * Then, create two subclasses: Student and Employee, each with specific attributes
     * (e.g., Student has grade and Employee has salary). Override the toString()
     * method to display the information in a readable format.
     */



    //----- of -----//
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

        public Rectangle(double width , double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }
}
