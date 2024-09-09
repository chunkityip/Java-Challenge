package OOP.Hard;

public class HardAnswer {

    /**
     * Design an abstract class Appliance with properties such as brand, power, and methods
     * like turnOn() and turnOff(). Create concrete subclasses like
     * WashingMachine and Refrigerator, and implement the abstract methods with specific behavior.
     */

    abstract class Appliance {
        private String brand;
        private Boolean power;

        public boolean turnOn() {
            if (!power) {
                power = true;
            }
            return power;
        }

        public boolean turnOff() {
            if (power) {
                power = false;
            }
            return power;
        }
    }

    class WashingMachine extends Appliance {
        private int dish;

        @Override
        public boolean turnOn() {
            if (!power && )
        }
    }


}
