package src.generalCoding;

class SearchingInSortedMatrix{
    public static boolean search1(int matrix[][],int key)//time: O(Row*log(Col))
    {
       for(int i=0;i<matrix.length;i++)
       {
        int start=0,last=matrix[0].length-1;
            while(start<=last)
            {
                int mid= (start+last)/2;
                if(matrix[i][mid]==key)
                {
                    System.err.println("Element found at: ("+i+" "+mid+")");
                    return true;
                }
                if(key<matrix[i][mid])
                {
                    last--;
                }
                else
                if(key>matrix[i][mid])
                {
                    start++;
                }
            }
       }
        System.err.println("Key Not found");
        return false;
    }
    public static boolean search(int matrix[][],int key)//O(row+Col)
    {
        int i=0;
        int j=matrix[0].length-1;
        while(i<=matrix.length-1 && j>=0)
        {
            if(key==matrix[i][j])
            {
                System.err.println("Key found at "+"("+i+","+j+")");
                return true;
            }
            if(key>matrix[i][j])
            {
                i++;
            }
            else
            if(key<matrix[i][j])
            {
                j--;
            }
        }
        System.err.println("Key Not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        boolean b=search(matrix,5);
        boolean b1=search1(matrix,5);
    }

}