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
