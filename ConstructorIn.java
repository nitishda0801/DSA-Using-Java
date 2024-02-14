
class Prince {

    public void add(int a, int b) {
        System.out.println("sum is:" + (a + b));
    }

    // public void add(int a, int b, int c) {
    // System.out.println("sum is:" + (a + b + c));
    // }

    // public void add(int a, String name) {
    // System.out.println("");
    // }

}

class nitish extends Prince {

    public void add(int a, int b) {

        System.out.println("Diff is:" + (a - b));
        // super.add();
    }

}

public class ConstructorIn {
    // ConstructorIn() {
    // System.out.println("this is constructor of ConstructorIn class");
    // }

    public static void main(String[] args) {
        ConstructorIn cns = new ConstructorIn();
        // Prince p = new Prince();
        nitish n = new nitish();
        // p.info();
        n.add(12, 13);
        // p.add(33, 13, 14);

    }
}
