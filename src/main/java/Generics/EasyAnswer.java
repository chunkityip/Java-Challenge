package Generics;

public class EasyAnswer {
    /**
     * Create a generic class call pair
     * This class will have two values , first and second with same type
     * and implement getter and setter methods to each element.
     */
    public class Pair<T> {
        private T first;
        private T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public T getSecond() {
            return second;
        }

        public void setSecond(T second) {
            this.second = second;
        }
    }

    /**
     * Create a generic class call Triplet
     * This class will have two values , first , second and third with different type
     * and implement getter and setter methods to each element.
     */
    public class Triplet<T, S> {
        private T first;
        private S second;

        public Triplet(T first, S second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public void setFirst() {
            this.first = first;
        }

        public S getSecond() {
            return second;
        }

        public void setSecond() {
            this.second = second;
        }

        /**
         * Write a generic method call printArray that
         * takes an array of any type and prints all its elements.
         */
        public static <T> void printArray(T[] array) {
            for (T a : array) {
                System.out.println(a);
            }
        }

        /**
         * Generic Method call to swapElements Swap Elements from an array of any type
         * and also have two pointer as integer call i and j
         */
        public static <T> void swapElements(T[] array , int i , int j) {
            for (T a : array) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        /**
         * Write a generic method that accepts two collections
         * and returns true if the two collections contain exactly the
         * same elements, regardless of order.
         *
         * Use wildcards in the method signature.
         */
        public static <T extends Comparable<T>> T findMax(T a, T b) {
            return (a.compareTo(b) > 0) ? a : b;
        }
    }

}
