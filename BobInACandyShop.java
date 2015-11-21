import java.io.*;
import java.util.*;

/*
  This was appeared in Zenhacks November, 2015

  Problem Statement
  Bob is in a candy shop and wants to purchase his favorite candy, which he knows costs N dollars. He has an infinite number of 1,2,5,10,20,50, and 100 dollar bills in his pocket. Bob wants to know the number of different ways he can pay the N dollars for his candy.
  
  Input Format
  A single integer, N, which is the cost of Bob's candy.
  
  Constraint
  1≤N≤250
  
  Output Format
  Print an integer representing the number of different variations of how Bob can pay.
  
  Sample Input1
  5
  Sample Output1
  4
*/

public class Solution {

    public static int makeChange(int n, int denom) {
        int next_denom = 0;
        
        switch(denom) {
            case 100:
                next_denom = 50;
                break;
            case 50:
                next_denom = 20;
                break;
            case 20:
                next_denom = 10;
                break;
            case 10:
                next_denom = 5;
                break;
            case 5:
                next_denom = 2;
                break;
            case 2:
                next_denom = 1;
                break;
            case 1:
                return 1;            
        }
        int ways = 0;
        for (int i=0; i*denom <= n; i++) {
            ways += makeChange(n-i * denom, next_denom);
        }
        return ways;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        int result = makeChange(input, 100);
        System.out.println(result);
    }
}
