import java.util.Scanner;

// Task 1: Points of Reflection 

public class PointsOfReflection 
{
  public static int[] reflectPoint(int[] p, int[] q) {
    int[] p1 = new int[p.length];
    for (int i = 0; i<p.length; i++){
            p1[i] = 2*q[i] - p[i];
        }
    return p1;
  }
}

// Task 2: Count Odd Numbers below n

public class CountOddNumbers {
  public static int oddCount(int n)
  {
    int count = n/2;
    return count;
  }
}

// Task 3: Sentence Smash

import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    int n = words.length;
    String res = "";
    if (n == 0) return res;
    for (int i = 0; i<n - 1; i++){
      res += words[i];
      res += ' ';
    }
    res += words[n-1];
    return res;
  }
}
