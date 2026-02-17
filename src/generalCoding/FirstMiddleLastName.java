package src.generalCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstMiddleLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of employees");
//        int n = sc.nextInt();
//
//        String[] namesArray = new String[n];
//
//        for(int i=0;i<n;i++){
//            System.out.println("Enter the "+(i+1)+"th employee Details: ");
//
//            System.out.println("First Name: ");
//            String firstName = sc.nextLin();
//            System.out.println("Middle Name: ");
//            String middleName = sc.next();
//            System.out.println("Last Name: ");
//            String lastName = sc.next();
//
//            String name = firstName +" "+middleName + " "+lastName;
//            namesArray[i] = name;
//        }
//
//        System.out.println("All Employees name: ");
//        for(String name:namesArray){
//            System.out.println(name);
//        }

        String[] names = {"Nitish Kumar Singh","Ramesh Raj","Sumit Kumar","Nitish kumar","Abc abc abc","ramesh    kumar"};
//        solve(namesArray);
            solve(names);
    }

    private static void solve(String[] namesArray) {
        List<String> names = new ArrayList<>();
        System.out.println("Names List before: [");
        for(String n:namesArray){
            System.out.print(n+",");
        }
        System.out.println("]");
        for(String name:namesArray){
            String[] temp = name.split(" ");
            int c = 3;
            for(String str:temp){
                if(str.isBlank()){
                    c--;
                }
            }
            if(c==3 && temp.length == 3){
                names.add(name);
            }
        }
        System.out.println("Names List after: ");
        System.out.println(names);


    }
}
