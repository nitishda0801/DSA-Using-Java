package src.generalCoding;

import java.util.Scanner;

public class TrafficFlowCodeVita {

  static int minTrafficFlow1(int[][] grid, int startX, int startY, int endX, int endY) {
    //Brute Force: Recursive solution, Time: O(2^(N+M), Space: O(N+M))
    // Base case: If Srihan is out of bounds or if there's no path to reach the destination
    if (startX < 1 || startY < 1 || startX > grid.length || startY > grid[0].length) {
        return Integer.MAX_VALUE; // Return a large value to indicate no path
    }
    if (startX == endX && startY == endY) {
        return grid[endX - 1][endY - 1];
    }
    
    // Move right
    int right = minTrafficFlow(grid, startX, startY + 1, endX, endY);
    // Move down
    int down = minTrafficFlow(grid, startX + 1, startY, endX, endY);
    
    // Choose the minimum path
    return grid[startX - 1][startY - 1] + Math.min(right, down);
}

  static int minTrafficFlow(int[][] grid, int startX, int startY, int endX, int endY) {
    //Time O(N*M) and Space:(M)
    int n = grid.length;
    int m = grid[0].length;

    int[] dp = new int[m];
    dp[startY - 1] = grid[startX - 1][startY - 1];

    // Fill the first row
    for (int j = startY; j < m; j++) {
        dp[j] = dp[j - 1] + grid[startX - 1][j];
    }

    // Fill rest of the grid
    for (int i = startX; i < n; i++) {
        int[] newRow = new int[m];
        newRow[startY - 1] = dp[startY - 1] + grid[i][startY - 1];

        for (int j = startY; j < m; j++) {
            newRow[j] = Math.min(newRow[j - 1], dp[j]) + grid[i][j];
        }

        dp = newRow;
    }

    // If there's no path to reach the destination
    if (dp[endY - 1] == 0) {
        return -1;
    }

    return dp[endY - 1];
}

public static int findBestPath(int n,int m,int grid[][],int currow,int curcol,int destrow,int destcol)
{    //Time O(N*M) and Space:(N*M)
    int dp[][]=new int[n][m];
    dp[currow][curcol]=grid[currow][curcol];
    for(int i=currow+1;i<n;i++)
    {
        dp[i][curcol]=dp[i-1][curcol]+grid[i][curcol];//fill the starting col...
    }
    for(int j=curcol+1;j<m;j++)
    {
        dp[currow][j]=dp[currow][j-1]+grid[currow][j];
    }
    for(int i=currow+1;i<n;i++)
    {
        for(int j=curcol+1;j<m;j++)
        {
            dp[i][j]=grid[i][j]+(int)Math.min(dp[i][j-1],dp[i-1][j]);
        }
    }
    if(dp[destrow][destcol]==0) return -1;


    return dp[destrow][destcol];

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int grid[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }
        int startrow=sc.nextInt();
        int startcol=sc.nextInt();
        int destrow=sc.nextInt();
        int desctcol=sc.nextInt();
        System.out.println(findBestPath(n,m,grid,startrow-1,startcol-1,destrow-1,desctcol-1));
        System.out.println(minTrafficFlow(grid,startrow,startcol,destrow,desctcol));

        int result = minTrafficFlow(grid, startrow, startcol, destrow, desctcol);
        if (result == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }
    }
}

/*
 * testcase1:
 *
 3 3
6 9 1
4 7 3
5 0 2
1 1
3 3
O/P: 17


Testcase2:
3 3
6 9 1
4 7 3
5 0 2
1 1
3 3


O/P:27












Traffic Flow
Problem Description
A traffic flow grid is a conceptual representation used in transportation planning and traffic engineering to model and analyze the movement of vehicles through a network of intersections in the city called as junctions. A traffic flow grid is akin to a matrix, with rows and columns denoting various junctions, and matrix cell values symbolizing the traffic flow in that junction. In the era of screens and swipes, traffic's stage can be seen on mobile!

Srihan finds himself caught in traffic on his way to the workplace. To speed up his journey, he opts to assess the traffic flow grid and chooses a quicker route. He currently resides at coordinates (i, j), and his office is located at coordinates (a, b) in the traffic grid. Given a rule that from a given junction, he can only go to right or down junction (junction is a cell, in terms of matrix). Could you assist him in finding a faster route to reach his workplace?

Constraints
Note that the provided positions in the input are indexed starting from 1, where left top is (1, 1).

1 <= n, m <= 100

0 <= traffic flow <= 10^3

Input
First line consists of two space separated integers n, m denoting the number of rows and columns in the traffic grid.

Next n lines consists of m space separated integers denoting the traffic flow. The value at i, j indicates the traffic flow at junction i and j.

Line n+2 consists of two space separated integers denoting the coordinates of Srihan's current position.

Line n+3 consists of two separated integers denoting the coordinates of Srihan's workplace.

Output
Single integer denoting the the minimum traffic flow Srihan must navigate to reach his workplace. In case there is no path from his current location to workplace, print "-1".

Time Limit (secs)
1

Examples
Example 1

Input

4 4

3 1 9 2

12 3 10 1

11 10 14 2

5 4 3 7

1 2

4 4

Output

22

Explanation

Srihan will choose the path - (1,2) -> (1,3) -> (1,4) -> (2,4) -> (3,4) -> (4,4)

The total traffic flow Srihan navigated is 1 + 9 + 2 + 1 + 2 + 7 = 22 which is the minimum possible.

Example 2

Input

3 3

6 9 1

4 7 3

5 0 2

1 1

3 3

Output

17

Explanation

Srihan will choose the path - (1,1) -> (2,1) -> (2,2) -> (3,2) -> (3,3)

The total traffic flow Srihan navigated is 6 + 4 + 5 + 0 + 2 = 17 which is the minimum possible.


import java.util.*;
class TrafficFlow{
  
  public static int FindBestPath(int grid [][],int n,int m,int currentRow,int currentCol,int destRow,int destCol)
  {
    int dp[][]=new int[n][m];//creating 2D array for filling the shortest traffic flow value.
    dp[currentRow][currentCol]=grid[currentRow][currentCol];
    //filling the full row of current postion;
    for(int i=currentRow+1;i<n;i++)
      dp[i][currentCol]=grid[i][currentCol]+dp[i-1][currentCol];
    //filling the full column of current postion;
    for(int j=currentCol+1;j<m;j++)
      dp[currentRow][j]=grid[currentRow][j]+dp[currentRow][j-1];
    for(int i=currentRow+1;i<n;i++)
    {
      for(int j=currentCol+1;j<m;j++)
      {
        dp[i][j]=grid[i][j]+(int)Math.min(dp[i-1][j],dp[i][j-1]);//updating the traffic value at i,j position. 
      }
    }
    if(dp[destRow][destCol]==0)
      return -1;
    return dp[destRow][destCol];//answer at destination position. 
  }
  
  
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
  		int n,m;
  		n=sc.nextInt();
  		m=sc.nextInt();
  		int [][] grid=new int[n][m];//craeting 2D array for reading  the traffic flow.
  		for(int i=0;i<n;i++)
        {
          for(int j=0;j<m;j++)
          {
            grid[i][j]=sc.nextInt();//reading the traffic flow data at i, j pos.
          }
        }
  		int strtRow=sc.nextInt()-1;//start actual row according question.
  		int strtCol=sc.nextInt()-1;//actual column position
  		int destRow=sc.nextInt()-1;//destination row
        int destCol=sc.nextInt()-1;//destination column

  		System.out.print(FindBestPath(grid,n,m,strtRow,strtCol,destRow,destCol));
  		
  	 
	} 
}
 */
