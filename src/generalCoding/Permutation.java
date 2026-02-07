package src.generalCoding;



import java.util.*;

public class Permutation {
    public static final int MOD = 998244353;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of sequence:");
        int n= sc.nextInt();//size of an array
        int nums[] = new int[n];
        System.out.println("Enter values of sequence");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }


        System.out.println("Enter k vale:");
        int k = sc.nextInt();//reading k for a checking generated sequence exactly k times increas or not

        Set<List<Integer>> set = new HashSet<>();
        generatePermutation(nums,new ArrayList<Integer>(),set, new boolean[nums.length]);
        System.out.println("Permutation: "+set);
        int count =0;
        for( List<Integer> list:set){
            int ascent =0;
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)<list.get(i+1)){
                    ascent++;
                }
            }
            if(ascent==k) count ++;
            count = count%MOD;

        }
        System.out.println("Total possible sequence whee k times increases: "+count);

    }


    private static void generatePermutation(int[] nums, ArrayList<Integer> list, Set<List<Integer>> set, boolean[] used) {
        if(nums.length == list.size()){
            set.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;// Skip if an element is already used

            // 1. Choose: Add the number
            used[i] = true;
            list.add(nums[i]);

            // 2. Explore: Move to the next slot
            generatePermutation(nums,list,set,used);

            // 3. Un-choose (Backtrack): Remove the number to try another path
            used[i] = false;
            list.remove(list.size()-1);
        }
    }

}
