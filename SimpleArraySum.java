/*

https://www.hackerrank.com/challenges/simple-array-sum

Difficulty: Easy

Given an array of N integers, can you find the sum of its elements?

Input Format

The first line contains an integer, N, denoting the size of the array. 
The second line contains N space-separated integers representing the array's elements.

Output Format

Print the sum of the array's elements as a single integer.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for (int i=n;i>0;i--)
            count+=in.nextInt();
        System.out.print(count);
    }
}