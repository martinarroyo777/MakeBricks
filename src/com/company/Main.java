package com.company;
/*
MakeBricks :: CodingBat.com

Problem Statement:
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and
big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops.

Test Cases & Expected Results:
makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */
public class Main {
//TODO: Add unit testing
    public static void main(String[] args) {
        System.out.println("Expected Result: true; Actual Result: " + makeBricks(3, 1, 8)); // true
        System.out.println("Expected Result: false; Actual Result: " + makeBricks(3, 1, 9)); // false
        System.out.println("Expected Result: true; Actual Result: " + makeBricks(3, 2, 10)); // true
    }

    public static boolean makeBricks(int small, int big, int goal) {
  /********************************************************************
    Here's what we know about the problem:

    -We need to have enough bricks (small and/or big) to make our goal size
    - if small >= goal, then we already have enough
    - if small < goal, then check if we can meet goal using big
    - do we have enough big to combine with small to meet or exceed goal?
      big >= (goal / 5) ?
      - if yes, then check if we can meet or exceed goal by combining small (goal /5) * 5 + small >= goal
      - Otherwise, check if we can make do with what we have (big*5 + small >= goal)

  ** Solution (See implementation) **

  // One-line solution:
        return small < goal ? big >= (goal / 5) ?
                ((goal / 5) * 5) + small >= goal : ((big * 5) + small) >= goal:
                true;
 ***************************************************************/
        if (small < goal){
            // Check if we have enough big bricks for the goal
            if (big >= (goal / 5)){
                // we have more than enough big bricks... check to see if we can meet goal by combining with small
                return ((goal / 5) * 5) + small >= goal;
            }
            // We don't have enough big bricks, but may still be able to meet goal by combining what we have with small bricks
            return ((big * 5) + small) >= goal;
        }
        // if we made it here, it's because we have enough for goal with small bricks
        return true;
    }

}
