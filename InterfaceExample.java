public class InterfaceExample {

    /**
     * Herbivore
     */
    public interface Herbivore {
        // void eat1();
        void eat1();
    }
    /**
     * Carnivore
     */
    public interface Carnivore {
    void eat2();
        
    }
    static class Bear implements Herbivore,Carnivore{
        public void eat1()
        {
            System.err.println("Eat grass");
        }
        public void eat2()
        {
            System.err.println("Eat meat");
        }
        
    }
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat1();b.eat2();

    }
    
}
