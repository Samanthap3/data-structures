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
        pair currentSpot = new pair(row, column);
        
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
