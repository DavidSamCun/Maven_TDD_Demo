import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DemoTest {

    @org.junit.jupiter.api.Test
    void demoMethod() {

    }

    @Test
    public void test2(){

        Demo demoTest = new Demo();

        //Given
        String[] array = {"1", "5", "15", "9", "4"};
        String[] expected = {"1", "4", "5", "9", "15"};

        //When
        String[] actual = demoTest.reArrange(array);

        //Then
        Assert.assertArrayEquals(expected,actual);


    }

    @Test
    void firstLineIsBiggerTest(){

        Demo demoTest = new Demo();
        Boolean expected = true;

        //Given
        String first = "12";
        String second = "1";

        //When
        Boolean actual = demoTest.firstLineIsBigger(first, second);


        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test3(){

        Demo demoTest = new Demo();

        //Given
        String[] array = {"1", "5", "15", "9", "4"};
        String[] expected = {"1", "4", "5", "9", "15"};

        //When
        String[] actual = demoTest.reArrange3(array);

        //Then
        Assert.assertArrayEquals(expected,actual);


    }

    @Test
    public void test5Negative(){

        Demo demoTest = new Demo();

        //Given
        String[] array = {"1", "5", "-15", "9", "4"};
        String[] expected = {"-15", "1", "4", "5", "9"};

        //When
        String[] actual = demoTest.reArrange3(array);

        //Then
        Assert.assertArrayEquals(expected,actual);


    }

    @Test
    public void test6Negative(){

        Demo demoTest = new Demo();

        //Given
        String[] array = {"1", "-5", "-15", "9", "-4"};
        String[] expected = {"-15", "-5", "-4", "1", "9"};

        //When
        String[] actual = demoTest.reArrange3(array);

        //Then
        Assert.assertArrayEquals(expected,actual);


    }
}