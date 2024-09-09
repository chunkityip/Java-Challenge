package OOP;

public class EasyAnswer {
    /**
     * Create a Car class with properties like make, model, and year.
     * Write a method to display these details.
     * Then, create a few Car objects and display their information.
     */

    class Car {
        private String make;
        private String model;
        private int year;

        public Car(String make , String model , int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    '}';
        }

        public void main(String[] args) {
            Car BMW = new Car("London" , "XM4", 2015);
            Car Toyota = new Car("Japan" , "Carry" , 2021);

            // Print details of each car
            System.out.println(BMW);
            System.out.println(Toyota);
        }
    }

    /**
     * Implement a BankAccount class with private fields for accountNumber, balance, and accountHolderName.
     * Provide public methods for depositing, withdrawing, and checking the balance
     * while ensuring the balance can't go negative.
     */
    interface BankAccount {
        void depositing(double amount);
        void withdrawing(double amount);
        double checkingBalance();

    }

    public class CheckingAccount implements BankAccount {
        private long accountNumber;
        private double balance;
        private String accountHolderName;

        public CheckingAccount(long accountNumber, double balance , String accountHolderName) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.accountHolderName = accountHolderName;
        }

        @Override
        public void depositing(double amount) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        }

        @Override
        public void withdrawing(double amount) {
            if (amount > 0 && balance > amount) {
                balance -= amount;
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        @Override
        public double checkingBalance() {
            System.out.println("Current balance: " + balance);
            return balance;
        }

        public  void main (String[] args) {
            CheckingAccount myAccount = new CheckingAccount(123L , 100.00 , "CK Yip");
            myAccount.depositing(100);
            myAccount.withdrawing(100);
            myAccount.checkingBalance();
        }
    }

    class Book {
        private String title;
        private String author;
        private double price;

        public Book() {}

        public Book(String title , String author , double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void display() {
            System.out.println("title = " + title +
                    "author = " + author +
                    "price = " + price);
        }

        public void main (String[] args) {
            Book newBook = new Book("Hello World" , "Java" , 10.52);
            newBook.display();
        }

    }



}
