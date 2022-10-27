/*
Date : 23-10-2022
Author : Neha Kumari
Description:
- This program consists of different types of patterns.
 */
package com.pattern;

public class AssignmentPattern {
    public static void main(String[] args) {
/*
- The #main function consists of function call statements to different patterns.
- Variable n stands for the number of rows in the pattern.
- There are 8 patterns in total.
- Each function is one complete pattern.
- There is no dependency between any two functions.
 */
        System.out.println("Star Patter 1");
        pattern1(5);
        System.out.println("\nStar Patter 2");
        pattern2(5);
        System.out.println("\nStar Patter 3");
        pattern3(5);
        System.out.println("\nNumber Pattern 4 (Pascal's Triangle)");
        pattern4(6);
        System.out.println("\nNumber Pattern 5");
        pattern5(5);
        System.out.println("\nRuby Pattern 6");
        pattern6(4);
        System.out.println("\nPattern 7");
        pattern7(5);
        System.out.println("\nPattern 8");
        pattern8(4);
    }

    /*
    Star Patter 1
    ----------------
    - In this pattern there are 'n' rows.
    - In each row there are 'row' number of columns.
    - In each column we are printing "*".
    - After each row we are adding a new line.
     */
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Star Patter 2
    ----------------
    - In this pattern there are 'n' rows.
    - In each row there are 'n-row+1' number of columns.
    - In each column we are printing "*".
    - After each row we are adding a new line.
     */
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    Star Patter 3
    ---------------
    - Complete pattern is generated using just 1 outer 'for' loop.
    - In this pattern there are '2n-1' rows.
    - Number of columns in each row is given by:-
              n(columns) = n(rows)         {if rows<=n}
              n(columns) = 2*n - n(rows)   {if rows>n}
    - In each column we are printing "*".
    - After each row we are adding a new line.
     */
    static void pattern3(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
   Number Pattern 4 (Pascal's Triangle)
   --------------------------------------
   - In this pattern there are 'n' rows.
   - Each row consists of:
       1.Space pattern
       2.Number pattern
   - In each row there are 'row' number of columns.
   - Value in the first and last column of a row is '1'.
   - Given the row number and the column number we can find:-
                      Value_at (row,column) = Value_at (row,column-1)*(row-column+1)/column
   - For each (row,column) print Value_at (row,column)
   - After each row add a new line.
    */
    static void pattern4(int n) {
        int initialCoefficient = 1, space, row, col;
        for (row = 0; row < n; row++) {
            for (space = 1; space < n - row; space++) {
                System.out.print(" ");
            }
            for (col = 0; col <= row; col++) {
                if (col == row || col == 0) {
                    initialCoefficient = 1;
                } else {
                    initialCoefficient = initialCoefficient * (row - col + 1) / col;
                }
                System.out.print(initialCoefficient + " ");
            }
            System.out.println();
        }
    }

    /*
   Number Pattern 5
   --------------------------------------
   - In this pattern there are 'n' rows.
   - In each row there are 'n' columns.
   - Value in the first column of row is given by variable 'num':-
             num = 1 {if row is odd}
             num = 0 {if row is even}
   - Rest (n-1) columns of each row are filled with alternate series of 's and 1's.
   - If value in first column is 1 then the value is changed to 0 and vice versa.
   - After each row add a new line.
    */
    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            int num = row % 2 == 0 ? 0 : 1;
            System.out.print(num);
            for (int col = 1; col < n; col++) {
                num = num == 1 ? 0 : 1;
                System.out.print(num);
            }
            System.out.println();
        }
    }

    /*
   Ruby Pattern 6
   --------------------------------------
   - In this pattern there are '2n-1' rows.
   - In each row there are 'row' number of columns.
   - Value in the first column of row is given by variable 'num':-
           num = 1 {if row is odd}
           num = 0 {if row is even}
   - Rest (n-1) columns of each row are filled with alternate series of 's and 1's.
   - If value in first column is 1 then the value is changed to 0 and vice versa.
   - After each row add a new line.
    */
    static void pattern6(int n) {
        char c= 'A';
        for (int row = 1; row < 2 * n; row++) {
            int space  =  row>n?row-n:n-row;
            for(int s  = 1;s<=space; s++){
                System.out.print(" ");
            }
            int colInEacRow = row>n?2 *n - row:row;
            for(int col = 1;col<=colInEacRow;col++){
                if(col == 1 || col == colInEacRow){
                    System.out.print(c+" ");
                }else{
                    System.out.print("  ");
                }
            }
            c = row>=n?--c:++c;
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row = 1;row<=n;row++){
            for(int s = 2;s<=row;s++){
                System.out.print(" ");
            }
            for(int col = 1; col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1;row<=n;row++){
            for(int s = 1;s<=n-row;s++){
                System.out.print(" ");
            }
            for(int col = 1; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int row = 1;row<2*n;row++){
            int space = row>n?row-n:n-row;
            for(int s = 1;s<=space;s++){
                System.out.print(" ");
            }
            int c = row>n?2*n-row:row;
            for(int col = c;col>=1;col--){
                System.out.print(col);
            }
            for(int col2=2;col2<=c;col2++){
                System.out.print(col2);
            }
            System.out.println();
        }
    }
}