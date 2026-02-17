package src.generalCoding;

import java.util.*;

public class EmployeeDetails {
    public static void main(String[] args) {
        String[][] emp = {
                {"emp1","IT","20500"},
                {"emp2","IT","27000"},
                {"emp9","Support","29000"},
                {"emp4","IT","22500"},
                {"emp5","Support","25000"},
                {"emp6","IT","32500"},
                {"emp7","Support","8000"},
                {"emp34","Sale","72500"},
                {"emp56","Support","72900"},
                {"emp90","Sale","52500"},
                {"emp34","IT","2900"},
                {"emp89","Sale","23500"},
                {"emp89","Sale","20000"}
        };

        findDeprtInfo(emp);

    }

    private static void findDeprtInfo(String[][] emp) {
        Map<String, List<String>> empMap = new HashMap<>();
        System.out.println("Total employe: "+emp.length);
//        for(int i=0;i<emp.length;i++){
//            System.out.println(emp[i][0]+emp[i][1]+emp[i][2]);
//        }
        for (String[] emps : emp) {
            if (!empMap.containsKey(emps[1])) {
                empMap.put(emps[1], new ArrayList<>());
            }
            empMap.get(emps[1]).add(emps[2]);
        }
       System.out.println(empMap);
        System.out.println("Department wise top three salary details: ");
        for(String key: empMap.keySet()){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(String salary:empMap.get(key)){
                pq.offer(Integer.valueOf(salary));
                if(pq.size()>3){
                    pq.poll();
                }
            }
            int salary3 = !pq.isEmpty()?pq.poll():0;
            int salary2 = !pq.isEmpty()?pq.poll():0;
            int salary1 = !pq.isEmpty()?pq.poll():0;
            System.out.println("Department: "+key);
            System.out.println("1st Max Salary: "+salary1);
            System.out.println("2nd Max Salary: "+salary2);
            System.out.println("3rd Max Salary: "+salary3);
            System.out.println("Sum of top 3 salary sum in "+key + " dept : " +(salary1 + salary2 + salary3));

        }
    }
}
