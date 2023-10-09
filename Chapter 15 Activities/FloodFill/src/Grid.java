import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<pair> spots = new Stack<>();
    
    
    

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        //System.out.println(row);
        //System.out.println(column);
        //System.out.println(pixels[row][column]);
        //spots.push(new pair(row, column));
        //pixels[row][column] = 1;
         for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                pixels[i][j] = 0;

        }
        spots.push(new pair(row-1, column));
        spots.push(new pair(row, column+1));
        
        spots.push(new pair(row+1, column));
        spots.push(new pair(row, column-1));
        
        


         while()
        
        while(spots.size()<=100){
        
        if(pixels[row][column] == 0)
        {
        if(row>0)
        {
                
            spots.push(new pair(row,column));
            row--;//north
                
        }
        else if(column<SIZE-1)
        {
            //if(pixels[row][column] == 0)
                
                    spots.push(new pair(row,column));
                    column++;//east
                
                
        }
        else if(row<SIZE-1)
        {
            //if(pixels[row][column] == 0)
                
                    spots.push(new pair(row,column));
                    row++;//south
                
                
        }
        else if(column>0)
        {
            //if(pixels[row][column] == 0)
                
                    spots.push(new pair(row,column));
                    column--;//west
                
        }     
        }
        }
        int count = 100;
        while(spots.size()>0)
        {
            pair p  = spots.pop();
            pixels[p.row][p.col] = count;
            count--; 

        }
        
    }

    

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
