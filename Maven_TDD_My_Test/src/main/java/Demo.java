import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Demo {

    /*@**
    Write code that would take a String array of numbers, and sort them from
    smallest to largest. Without converting from a string. So strictly observe string type
    Then. Think of edge cases with
        - words
        - decimals,
        - negative,
        - leading 0's

    impossible to solve are fractions and exponents
    *@*/


    String[] array;
    //Sort numbers without converting to string;

    public String[] reArrange(String[] input){ //works
        String temp = "";

    for (int j = 0; j <input.length-1; j++){
        for(int i = 0; i<input.length-1; i++){
            if (input[i].length() > input[i+1].length() ||
                    (input[i].length() == input[i+1].length() && input[i].compareTo(input[i+1]) > 0)) {
                temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
            }
        }
    }
        System.out.println(Arrays.toString(input));
        return input;
    }   //First part we did before Break

    //We can improve the code by doing the following.
    //Shortening the "if" by
    //Can make code more efficient, run less times
    //


    //Now to create more methods to improve code
    public String[] reArrange2(String[] input){
        String temp = "";

        for (int j = 0; j <input.length-1; j++){
            for(int i = 0; i<input.length-1; i++){
                if (firstLineIsBigger(input[i],input[i+1]) ||
                        (input[i].length() == input[i+1].length() && input[i].compareTo(input[i+1]) > 0)) {
                    temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        return input;
    }

    public boolean firstLineIsBigger(String input1, String input2){     //Condensing
        if(input1.charAt(0) == '-'){
            return false;
        } else if (input2.charAt(0) == '-'){
            return true;
        }else if (input1.length() > input2.length()){
            return true;
        }
        return false;
    }

    public String[] reArrange3(String[] input){     //Works for negative;
        String temp = "";

        for (int j = 0; j <input.length-1; j++){
            for(int i = 0; i<input.length-1; i++){
                if (firstLineIsBigger(input[i],input[i+1]) || firstUnicodeBigger(input[i], input[i+1])) {
                    temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        return input;
    }

    public boolean firstUnicodeBigger(String input1, String input2){
        if (input1.charAt(0) == '-' && input2.charAt(0) =='-'){
            if (input1.length() == input2.length() && input1.compareTo(input2) > 0){
                return false;
            }
        }

        if (input1.length() == input2.length() && input1.compareTo(input2) > 0){
            return true;
        }
        return false;
    }
//    public boolean firstLineSmaller(String )

    //public boolean

    public String[] reArrange4(String[] input){
        String temp = "";

        //for (int j = 0; j <input.length-1; j++){
            for(int i = 0; i<input.length-1; i++){
                if (firstLineIsBigger(input[i],input[i+1]) || firstUnicodeBigger(input[i], input[i+1])) {
                    temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                    i=0;
                }
            }
        //}
        System.out.println(Arrays.toString(input));
        return input;
    }





}
