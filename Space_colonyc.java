public class Space_colony {

            private int oxygen = 100;
            private int food = 100;
            private int energy = 100;
            private int population = 10;

            public void status () {
                System.out.println ("Colony-Status!");
                System.out.println ("Oxygen = " +oxygen);
                System.out.println ("Food = " +food);
                System.out.println ("Population = " +energy);
                System.out.println ("Population = " +population);
    }
    public static void main(String[] args) {
        Space_colony colony = new Space_colony();
        colony.status();
}