class commandline{
    public static void main(String [] args)
    {
        int a;
        double d;
        a=Integer.parseInt(args[0]);
        float f=Float.parseFloat(args[1]);
        d=Double.parseDouble(args[2]);
        System.out.println(a);
        System.out.println(d);
        System.out.println(f);
       System.out.println(args[3]);
       
    }
}