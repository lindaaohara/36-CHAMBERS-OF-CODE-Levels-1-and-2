package Level02;

import org.junit.Assert;
import org.junit.Test;

public class ProblemSet02Test {

    @Test
    public void timeConvertTest01(){
        ProblemSet02 problemSet02 = new ProblemSet02();
        int input = 126;
        String expected = "2:6";
        String actual = problemSet02.timeConvert(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeConvertTest02(){
        ProblemSet02 problemSet02 = new ProblemSet02();
        int input = 45;
        String expected = "0:45";
        String actual = problemSet02.timeConvert(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeConvertTest03(){
        ProblemSet02 problemSet02 = new ProblemSet02();
        int input = 63;
        String expected = "1:3";
        String actual = problemSet02.timeConvert(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void countingMinutesTest01(){
        ProblemSet02 problemSet02 = new ProblemSet02();
        String input = "12:30pm-12:00am";
        String expected = "690";
        String actual = problemSet02.countingMinutes(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countingMinutesTest02(){
        ProblemSet02 problemSet02 = new ProblemSet02();
        String input = "1:23am-1:08am";
        String expected = "1425";
        String actual = problemSet02.countingMinutes(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeDifferenceTest01() throws Exception {
        ProblemSet02 problemSet02 = new ProblemSet02();
        String input = "12:30pm-12:00am";
        String expected = "690";
        String actual = problemSet02.timeDifference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeDifferenceTest02() throws Exception {
        ProblemSet02 problemSet02 = new ProblemSet02();
        String input = "1:23am-1:08am";
        String expected = "1425";
        String actual = problemSet02.timeDifference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void timeDifferenceTest03() throws Exception {
        ProblemSet02 problemSet02 = new ProblemSet02();
        String input = "1:00pm-2:00pm";
        String expected = "60";
        String actual = problemSet02.timeDifference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayMatchingTest01(){
        ProblemSet02 problemSet02 = new ProblemSet02();
        String[] input = {"{5, 2, 3}", "{2, 2, 3, 10, 6}"};
        String expected = "7-4-6-10-6";
        String actual = problemSet02.arrayMatching(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayMatchingTest02(){
        ProblemSet02 problemSet02 = new ProblemSet02();
        String[] input = {"[1, 2, 1]", "[2, 1, 5, 2]"};
        String expected = "3-3-6-2";
        String actual = problemSet02.arrayMatching(input);
        Assert.assertEquals(expected, actual);
    }


}
