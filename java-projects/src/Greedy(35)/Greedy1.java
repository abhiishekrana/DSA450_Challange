// https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/


// Input: start[]  =  {10, 12, 20}, finish[] =  {20, 25, 30}
// Output: 0 2
// Explanation: A person can perform at most two activities. The 
// maximum set of activities that can be executed 
// is {0, 2} [ These are indexes in start[] and finish[] ]

import java.util.*;

class Greedy1 {
    public static void printMaxActivities(int start[], int finish[], int n) {
        int i, j;
        i = 0;
        System.out.println(i + " ");
        for (j = 0; j < finish.length; j++) {
            if (start[j] >= finish[i]) {
                System.out.println(j + " ");
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        int n = s.length;

        // Function call
        printMaxActivities(s, f, n);
    }
}
