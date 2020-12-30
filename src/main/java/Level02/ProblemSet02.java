package Level02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class ProblemSet02 {
    /**
     * Have the function TimeConvert(num) take the num parameter being passed and return
     * the number of hours and minutes the parameter converts to (ie. if num = 63 then
     * the output should be 1:3). Separate the number of hours and minutes with a colon.
     */
    public String timeConvert(int num) {
        //1)  divide num given by 60 to get a double of hours
        //2)  use modulus to get minutes after dividing by 60
        //3)  concatenate the string with hours + colon + minutes
        //4)  return the String convertedTime

        int hours = num / 60;
        int minutes = (num % 60);
        String convertedTime = hours + ":" + minutes;
        return convertedTime;

    }

    /**
     * Have the function CountingMinutesI(str) take the str parameter being passed which
     * will be two times (each properly formatted with a colon and am or pm) separated
     * by a hyphen and return the total number of minutes between the two times.
     * The time will be in a 12 hour clock format.
     * For example: if str is 9:00am-10:00am then the output should be 60.
     * If str is 1:00pm-11:00am the output should be 1320.
     */
    public String countingMinutes(String str) {
        // 1) split the string at the hyphen and call it timesArray
        // 2) set the first index, i.e., index[0] of timesArray to time1
        // 3) set time2 to timesArray[1]
        // 4) split the time1 & time2 arrays at the colon to separate hours & minutes
        // 5) create integers of hours by parseInt the 0 index for both hours2 and hours2
        // 6) if second half after splitting hours from minutes has pm, add 12 to hours
        // 7) then use StringBuffer to get rid of am & pm and make minutes integers
        // 8) test to see if the hours are equal and minutes at time2 are less than time1
        // 9) if step above is true, add 24 hours to hours because it's the next day
        //10) calculate the absolute value of difference between hours and add difference in minutes
        //11) return string value of difference


        String[] timesArray = str.split("-");
        String time1 = timesArray[0];
        String time2 = timesArray[1];
        String[] separateHoursFromMinT1 = time1.split(":");
        String[] separateHoursFromMinT2 = time2.split(":");
        Integer hours1 = parseInt(separateHoursFromMinT1[0]);
        String min1 = separateHoursFromMinT1[1];
        Integer hours2 = parseInt(separateHoursFromMinT2[0]);
        String min2 = separateHoursFromMinT2[1];
        if (min1.contains("pm")) {
            hours1 = hours1 + 12;
        }
        if (min2.contains("pm")) {
            hours2 = hours2 + 12;
        }
        StringBuffer minutes1WithoutAmPm = new StringBuffer(min1);
        minutes1WithoutAmPm.delete(min1.length() - 2, min1.length());
        Integer minutes1 = parseInt(minutes1WithoutAmPm.toString());

        StringBuffer minutes2WithoutAmPm = new StringBuffer(min2);
        minutes2WithoutAmPm.delete(min2.length() - 2, min2.length());
        Integer minutes2 = parseInt(minutes2WithoutAmPm.toString());

        Integer difference = 0;
        if ((hours2 - hours1 == 0) && (minutes2 < minutes1)) {
            difference = (24 * 60) + minutes2 - minutes1;
        } else {
            difference = (Math.abs((hours2 - hours1)) * 60) + (minutes2 - minutes1);
        }

        return new String(String.valueOf(difference));
    }

    public String timeDifference(String str) throws Exception {
        String[] timesArray = str.split("-");
        String time1 = timesArray[0];
        String time2 = timesArray[1];
        //  LocalTime T = LocalTime.parse("17:40");
        //  String sample = T.toString();
        //SimpleDateFormat format = new SimpleDateFormat("h:mma");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy h:mm a");
        LocalTime date1 = LocalTime.parse(time1);
        LocalTime date2 = LocalTime.parse(time2);
        if (date2.compareTo(date1) < 0) {
            date2 = date2.plusMinutes(1440);
            }long difference = Math.abs((date2.getMinute() - date1.getMinute())/1000/60);

            System.out.println(date2 + "-" + date1);


            return new String(String.valueOf(1));

        }



    /**
     * Have the function ArrayMatching(strArr) read the array of strings stored in strArr
     * which will contain only two elements, both of which will represent an array of
     * positive integers. For example: if strArr is ["[1, 2, 5, 6]", "[5, 2, 8, 11]"],
     * then both elements in the input represent two integer arrays, and your goal for
     * this challenge is to add the elements in corresponding locations from both arrays.
     * For the example input, your program should do the following additions:
     * [(1 + 5), (2 + 2), (5 + 8), (6 + 11)] which then equals [6, 4, 13, 17].
     * Your program should finally return this resulting array in a string format with
     * each element separated by a hyphen: 6-4-13-17.
     * <p>
     * If the two arrays do not have the same amount of elements, then simply append the
     * remaining elements onto the new array (example shown below).
     * Both arrays will be in the format: [e1, e2, e3, ...] where at least one element will
     * exist in each array.
     */
    public String arrayMatching(String[] strArr) {
        // code goes here
        return null;
    }
}