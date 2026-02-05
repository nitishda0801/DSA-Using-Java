package src.generalCoding;

public class SpiralMatrix {
    public static void printspiralmatrix(int matrix[][])
    {
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol)
        {
            //upper part
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(matrix[startrow][j]+" ");
            }
            
            //right part
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(matrix[i][endcol]+" ");
            }

            //bottom part
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            //left part
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;


        }
        System.err.println();

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11},
                        {13,14,15}};
        printspiralmatrix(matrix);

    }
}
