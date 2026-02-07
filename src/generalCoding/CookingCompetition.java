package src.generalCoding;

import java.util.Arrays;
import java.util.Scanner;
/*
#Infosys Assessment: 4 Jan 2026
Question: there is a cooking competition where n chef takes part in it.
 All chefs will take part in optimal order.
and initial complexity is C and for each chef, expertise and messiness is a[i] = (e,m)
and to cook dish complexity p,
(p<=e) and updated complexity will be as max(p,m), where p = current complexity
and m is messiness of chef who preparing the dish currently
 */
public class CookingCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of chefs:");
        int n = sc.nextInt();//number of chefs
        System.out.println("Initial complexity to prepare dish:");
        int  complexity = sc.nextInt();//initial complexity to cook a dish

        int arr[][] = new int[n][2];//expertise and messiness of each chef

        for(int i=0;i<n;i++){
            System.out.println("Expertise and Messiness of "+i+"th chef:");
            arr[i][0] = sc.nextInt();//expertise e
            arr[i][1] = sc.nextInt();//messiness m
        }
        int count=0;//to find the maximum number of chef so that can cook dish.

        //rule: to cook dish p = complexity(c) p<=e and updated complexity p = max(p,m)
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));

        for(int i=0;i<n;i++){
            int expertise = arr[i][0];
            int messiness = arr[i][1];
            if(expertise>=complexity){
                count++;
                complexity = Math.max(complexity,messiness);
            }

        }
        System.out.println("Total number of Chefs cook this Dish: "+count);
    }
}
/*
Number of chefs:
5
Initial complexity to prepare dish:
5
Expertise and Messiness of 0th chef:
5 5
Expertise and Messiness of 1th chef:
5 5
Expertise and Messiness of 2th chef:
5 5
Expertise and Messiness of 3th chef:
5 5
Expertise and Messiness of 4th chef:
5 5
Total number of Chefs cook this Dish: 5

Testcase 2:
Number of chefs:
3
Initial complexity to prepare dish:
3
Expertise and Messiness of 0th chef:
3 7
Expertise and Messiness of 1th chef:
3 6
Expertise and Messiness of 2th chef:
6 8
Total number of Chefs cook this Dish: 2

*/
