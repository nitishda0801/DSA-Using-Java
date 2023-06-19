class variableexample{
    int qty=40;
    static double rate=50.5;
     public void compute()
     {
     double comm=3.5;
     System.out.println("Pay rs"+qty*rate*comm/100);
     }
     public static void main(String args[]){
        variableexample s1=new variableexample();
     double total=s1.qty*rate;
     System.out.println("total pay rs. "+total);
     s1.compute();
     }
    }
    