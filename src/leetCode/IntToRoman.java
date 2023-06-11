package leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// https://leetcode.com/problems/integer-to-roman/
public class IntToRoman {
    public static String intToRoman(int num) {
        int value;
        int n = String.valueOf(num).length();
        int[] listOfNumbers = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000,2000,3000};
        String[] listOfRomans = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M","MM","MMM"};
        List<Integer> nums = Arrays.stream(listOfNumbers).boxed().collect(Collectors.toList());
        List<String> roms = Arrays.asList(listOfRomans);
        StringBuilder answer = new StringBuilder("");

        if (nums.contains(num)){
            return (String) roms.get(nums.indexOf(num));
        }

        for (double i = n; i > 0; i--) {
            value = (int) (((num % (int)(Math.pow(10,i))) / (int)(Math.pow(10,i-1) ) * (int) (Math.pow(10,i-1))));
            System.out.println(value);
            if (value == 0){
                continue;
            }
            answer.append(roms.get(nums.indexOf(value)));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(33));
    }
}
