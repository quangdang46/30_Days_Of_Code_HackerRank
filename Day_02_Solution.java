
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_02_Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();
        int totalCost = (int) Math.round(mealCost + mealCost * tipPercent / 100.0 + mealCost * taxPercent / 100.0);
        System.out.println(totalCost);
    }
}
