class ShortestPathString
{
    public static int findshortestdistence(String string)
    {
        int x=0,y=0;
        for(int i=0;i<string.length();i++)
        {
            char c=string.charAt(i);
            if(c=='N') {
                y++;
            }
            else
            if(c=='E')
            {
                x++;
            }
            else
            if(c=='W')
            {
                x--;
            }
            else
            {
                y--;
            }
        }
        int distance =(int)Math.sqrt(x*x+y*y);
        return distance;
    }

    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.err.println(findshortestdistence(str));
    }
}