import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectOneTest {

    private ProjectOne project;

    @Before
    public void init() {
        project = new ProjectOne();
    }

    @Test
    public void total_test1() {
        // GIVEN
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        // WHEN
        int actual = project.total(a1);
        int expected = 10;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void total_test2() {
        // GIVEN
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(100);
        a1.add(4);

        // WHEN
        int actual = project.total(a1);
        int expected = 134;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void total_test3() {
        // GIVEN
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(0);
        a1.add(00);
        a1.add(0_0);
        a1.add(0);

        //WHEN
        int actual = project.total(a1);
        int expected = 0;

        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChars_test1() {
        // GIVEN
        String str = "I love Java";

        // WHEN
        char[] actual = project.getChars(str);
        char[] expected = str.toCharArray();

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getChars_test2() {
        // GIVEN
        String str = "I love Selenium";

        // WHEN
        char[] actual = project.getChars(str);
        char[] expected = str.toCharArray();

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getChars_test3() {
        // GIVEN
        String str = "TechnoStudy";

        // WHEN
        char[] actual = project.getChars(str);
        char[] expected = str.toCharArray();

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getWords_test1() {
        // GIVEN
        String str = "I love Java";

        // WHEN
        String[] actual = project.getWords(str);
        String[] expected = str.split(" ");

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getWords_test2() {
        // GIVEN
        String str = "My name is Josh Long";

        // WHEN
        String[] actual = project.getWords(str);
        String[] expected = str.split(" ");

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getWords_test3() {
        // GIVEN
        String str = "1 2 3 4 5 6 7 8 9";

        // WHEN
        String[] actual = project.getWords(str);
        String[] expected = str.split(" ");

        // THEN
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void evenTotal_test1() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(31);
        list.add(45);

        // WHEN
        int actual = project.evenTotal(list);
        int expected = 100;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evenTotal_test2() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(50);
        list.add(90);
        list.add(100);
        list.add(1);
        list.add(3);

        // WHEN
        int actual = project.evenTotal(list);
        int expected = 280;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evenTotal_test3() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(3);

        // WHEN
        int actual = project.evenTotal(list);
        int expected = 6;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oddTotal_test1() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(3);

        // WHEN
        int actual = project.oddTotal(list);
        int expected = 8;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oddTotal_test2() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(31);
        list.add(15);
        list.add(12);
        list.add(30);

        // WHEN
        int actual = project.oddTotal(list);
        int expected = 46;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oddTotal_test3() {
        // GIVEN
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(15);
        list.add(15);
        list.add(12);
        list.add(30);

        // WHEN
        int actual = project.oddTotal(list);
        int expected = 54;

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUpperCase_test1() {
        // GIVEN
        String str = "United States of America";

        // WHEN
        String actual = project.getUpperCase(str);
        String expected = str.toUpperCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUpperCase_test2() {
        // GIVEN
        String str = "I am in the world";

        // WHEN
        String actual = project.getUpperCase(str);
        String expected = str.toUpperCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUpperCase_test3() {
        // GIVEN
        String str = "I love java";

        // WHEN
        String actual = project.getUpperCase(str);
        String expected = str.toUpperCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLowerCase_test1() {
        // GIVEN
        String str = "I love java";

        // WHEN
        String actual = project.getLowerCase(str);
        String expected = str.toLowerCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLowerCase_test2() {
        // GIVEN
        String str = "I live in United States of America";

        // WHEN
        String actual = project.getLowerCase(str);
        String expected = str.toLowerCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLowerCase_test3() {
        // GIVEN
        String str = "Don't look here dude";

        // WHEN
        String actual = project.getLowerCase(str);
        String expected = str.toLowerCase();

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasDuplicates_test1() {
        // GIVEN
        Character[] characters = {'A', 'B', 'C', 'C'};

        // WHEN
        boolean condition = project.hasDuplicates(characters);

        // THEN
        Assert.assertTrue(condition);
    }

    @Test
    public void hasDuplicates_test2() {
        // GIVEN
        Character[] characters = {'A', 'B',  'B',  'C'};

        // WHEN
        boolean condition = project.hasDuplicates(characters);

        // THEN
        Assert.assertTrue(condition);
    }

    @Test
    public void hasDuplicates_test3() {
        // GIVEN
        Character[] characters = {};

        // WHEN
        boolean condition = project.hasDuplicates(characters);

        // THEN
        Assert.assertFalse(condition);
    }


    @Test
    public void convertToString_test1() {
        // GIVEN
        int number = 123;

        // WHEN
        String actual = project.convertToString(number);

        // THEN
        Assert.assertEquals("123", actual);
    }

    @Test
    public void convertToString_test2() {
        // GIVEN
        int number = -123;

        // WHEN
        String actual = project.convertToString(number);

        // THEN
        Assert.assertEquals("-123", actual);
    }

    @Test
    public void convertToString_test3() {
        // GIVEN
        int number = 0;

        // WHEN
        String actual = project.convertToString(number);

        // THEN
        Assert.assertEquals("0", actual);
    }


    @Test
    public void getFirst3Letters_test1() {
        // GIVEN
        String number = "abcde";

        // WHEN
        String actual = project.getFirst3Letters(number);
        String expected = "abc";

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFirst3Letters_test2() {
        // GIVEN
        String number = "bcde";

        // WHEN
        String actual = project.getFirst3Letters(number);
        String expected = "";

        // THEN
        Assert.assertNotNull(actual);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void getLast2Letters_test1() {
        // GIVEN
        String number = "abcde";

        // WHEN
        String actual = project.getFirst3Letters(number);
        String expected = "de";

        // THEN
        Assert.assertNotNull(actual);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void getLast2Letters_test2() {
        // GIVEN
        String number = "abcde";

        // WHEN
        String actual = project.getFirst3Letters(number);
        String expected = "cde";

        // THEN
        Assert.assertNotNull(actual);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void compareIntAndString_test1() {
        boolean condition = project.compareIntAndString(10, "10");

        Assert.assertTrue(condition);
    }

    @Test
    public void compareIntAndString_test2() {
        boolean condition = project.compareIntAndString(-10, "-10");

        Assert.assertTrue(condition);
    }

    @Test
    public void compareIntAndString_test3() {
        boolean condition = project.compareIntAndString(-110, "-10");

        Assert.assertFalse(condition);
    }

    @Test
    public void removeWhiteSpacesAround_test1() {
        String actual = project.removeWhiteSpacesAround("  HI  ");
        Assert.assertEquals("HI", actual);
    }

    @Test
    public void removeWhiteSpacesAround_test2() {
        String actual = project.removeWhiteSpacesAround("    ");
        Assert.assertEquals("", actual);
    }

    @Test
    public void removeWhiteSpacesAround_test3() {
        String actual = project.removeWhiteSpacesAround("    ");
        Assert.assertNotNull(actual);
        Assert.assertNotEquals(" ", actual);
    }

    @Test
    public void multipliedBy2_test1() {
        Object[] actual = project.multipliedBy2(Arrays.asList(1, 2, 3)).toArray();
        Object[] expected = Arrays.asList(2, 4, 6).toArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void multipliedBy2_test2() {
        Object[] actual = project.multipliedBy2(Arrays.asList(0, 0, 0)).toArray();
        Object[] expected = Arrays.asList(0, 0, 0).toArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void multipliedBy2_test3() {
        Object[] actual = project.multipliedBy2(Arrays.asList(0, 0, 0)).toArray();
        Object[] expected = Arrays.asList(1, 2, 3).toArray();

        Assert.assertEquals(3, actual.length);
        Assert.assertFalse(Arrays.equals(actual, expected));
    }

    @Test
    public void doubledWord_test1(){
        List<String> actual = project.doubledWord(Arrays.asList("Apple"));
        List<String> expected = Arrays.asList("AppleApple");

        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void doubledWord_test2(){
        List<String> actual = project.doubledWord(Arrays.asList("Apple"));
        List<String> expected = Arrays.asList("Apple");

        Assert.assertEquals(1, actual.size());
        Assert.assertFalse(expected.equals(actual));
    }

}
