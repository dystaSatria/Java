class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int x=0 ;x<grid.length;x++){
            for (int y =0;y<grid.length;y++){
                if(grid[x][y] == '1'){
                    count += 1;
                    callMethod(grid,x,y);
                }       
            }
        }

        return count;  

    }

    public void callMethod(char  [][] grid, int x, int y){
        if(x<0 || y<0  || x >= grid.length || y  >= grid[x].length || grid[x][y]== '0')
    return;

        grid[x][y] = '0';
        callMethod(grid,x+1,y);//up
        callMethod(grid,x-1,y);//down
        callMethod(grid,x,y+1);//right
        callMethod(grid,x,y-1);//left

    }
}
