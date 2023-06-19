 class classexample1 {
double width;
double height;
double depth;
//}
// class Box{
    public static void main(String [] args)
    {
        classexample1 b=new classexample1();
        double volume;
        b.width=10;
        b.height=20;
        b.depth=30;
        volume=b.width*b.height*b.depth;
        System.out.println("voiume is:"+volume);
    }
}