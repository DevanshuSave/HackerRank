/*

https://www.hackerrank.com/challenges/compare-the-triplets

Difficulty: Easy

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet A= (ao, a1, a2), and the rating for Bob's challenge to be the triplet B = (b0, b1, b2).

Your task is to find their comparison scores by comparing  with ,  with , and  with .

If ai > bi, then Alice is awarded 1 point.
If ai < bi, then Bob is awarded 1 point.
If ai = bi, then neither person receives a point.
Comparison score is the total score a person earned.

Given A and B, can you compare the two challenges and print their respective comparison points?

Input Format

The first line contains 3 space-separated integers, a0, a1, and a2, describing the respective values in triplet A. 
The second line contains 3 space-separated integers, b0, b1, and b2, describing the respective values in triplet B.

Constraints

1 <= ai <= 100
1 <= bi <= 100

Output Format

Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        if(a0>b0){
            a0=1;
            b0=0;
        }
        else if(a0<b0){
            b0=1;
            a0=0;
        }
        else{
            a0=b0=0;
        }
        if(a1>b1)
            a0++;
        else if(a1<b1)
            b0++;
        else{}
        if(a2>b2)
            a0++;
        else if(a2<b2)
            b0++;
        else{}
        System.out.print(a0+" "+b0);
    }
}

