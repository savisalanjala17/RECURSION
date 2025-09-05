class Solution {
    public int numIslands(char[][] grid) {

        int row_size=grid.length;
        int col_size=grid[0].length;
        int count=0;

        for(int row=0; row<row_size;row++){
            for(int col=0; col<col_size;col++){
                if(grid[row][col]=='1'){
                    countisLand(row_size,col_size,grid,row,col);
                    count++;
                }
            }
        }

        return count;
    }

     public static void countisLand(int row_size,int col_size, char [][]grid,int row,int col){
        if (row < 0 || col < 0 || row >= row_size || col >= col_size || grid[row][col] == '2' || grid[row][col] == '0'){
            return;
        }

        else{
            grid[row][col]='2';
            countisLand(row_size,col_size,grid,row,col-1);
            countisLand(row_size,col_size,grid,row,col+1);
            countisLand(row_size,col_size,grid,row-1,col);
            countisLand(row_size,col_size,grid,row+1,col);
        }
     }


200. Number of Islands
Solved
Medium
Topics
premium lock icon
Companies
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
        
    }



