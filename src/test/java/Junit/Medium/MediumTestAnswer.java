package Junit.Medium;

//import jdk.jfr.Enabled;
//import junit.framework.TestCase;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class MediumTestAnswer {
//
//    @Test
//    public void testSortList() {
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Friends");
//        al.add("Dear");
//        al.add("Is");
//
//        List<String> expected = Arrays.asList("Dear" , "Friends" , "Is");
//
//        assertEquals(expected, Medium.sortList(al));
//    }
//
//    @Test
//    public void testFactorial() {
//        int intPut = 5;
//        assertEquals(120 , Medium.factorial(intPut));
//    }
//
//    @Test
//    public void testFactorialForNegative() {
//        int intPut = -5;
//        assertThrows(IllegalArgumentException.class , () -> Medium.factorial(intPut));
//    }
//
//    @Test
//    public void testIsPalindrome() {
//        String input = "AnnA";
//        assertTrue(Medium.isPalindrome(input));
//    }
//
//    @Test
//    public void testDivide() {
//        int a = 15;
//        int b = 5;
//
//        assertEquals(3 ,Medium.divide(a,b));
//    }
//
//    @Test
//    public void testDivideForZero() {
//        int a = 15;
//        int b = 0;
//
//        assertThrows(IllegalArgumentException.class, () -> Medium.divide(a , b));
//    }
//
//    @Test
//    public void testFindMax() {
//        int[] nums = new int[]{10 , 5 , 25 , 102 , 555};
//        assertEquals(555 , Medium.findMax(nums));
//    }
//
//    @Test
//    @DisplayName("This test is for testing empty array")
//    public void testFindMaxForEmptyArray() {
//        int[] nums = null;
//        assertThrows(IllegalArgumentException.class, () -> Medium.findMax(nums));
//    }
//}