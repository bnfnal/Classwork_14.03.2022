# Classwork_14.03.2022

'Task 1: Points of Reflection'

'Class:' PointsOfReflection 
'Function:' reflectPoint(int[] p, int[] q)

"Point reflection" or "point symmetry" is a basic concept in geometry where a given point, P, at a given position relative to a mid-point, Q has a corresponding point, P1, which is the same distance from Q but in the opposite direction.

'Task:'
Given two points P and Q, output the symmetric point of point P about Q. Each argument is a two-element array of integers representing the point's X and Y coordinates. Output should be in the same format, giving the X and Y coordinates of point P1. You do not have to validate the input.

'Favorite solution:'

package cw;

import java.util.stream.IntStream;

public class Reflections {
    public static int[] reflectPoint(int[] p, int[] q) {
        return IntStream.range(0, p.length).map(i -> q[i]*2 - p[i]).toArray();
    }
}

'Task 2: Count Odd Numbers below n'

'Class:' CountOddNumbers
'Function:' oddCount(int n)

'Task:'
Given a number n, return the number of positive odd numbers below n, EASY!

oddCount(7) //=> 3, i.e [1, 3, 5]
oddCount(15) //=> 7, i.e [1, 3, 5, 7, 9, 11, 13]
Expect large Inputs!

'Favorite solution:'

package cw;

class Kata {
  static int oddCount(int n) {
    return n / 2;
  }
}
