public class Main {

    public static void main(String[] args) {

        HikeStrategy hiking = new HikeStrategy();
        SkiStrategy ski = new SkiStrategy();
        Context travelGuide = new Context(20,hiking);
        System.out.print("Is the temperature good enough for hiking: " + travelGuide.getResult());


        travelGuide.setStrategy(ski);
        System.out.println("\nChanging strategy");
        System.out.print("\nIs the temperature good enough for hiking: " + travelGuide.getResult());

    }
}
