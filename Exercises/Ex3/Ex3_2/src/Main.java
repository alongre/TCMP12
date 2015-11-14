public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue();
        for (int i=1;i<=50;i++) {
            queue.add(i);
        }

        System.out.println("Removing first item");
        System.out.println(queue.remove()) ;

        System.out.println("Removing 2nd item");
        System.out.println(queue.remove()) ;

        System.out.println("Removing 3rd item");
        System.out.println(queue.remove()) ;

        System.out.println("Remaining queue:");
        queue.print();
    }
}
