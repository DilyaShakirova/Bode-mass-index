public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(1.87, 98);
        System.out.println("Рост - 1,87м, вес - 98кг");
        System.out.println("Индекс массы тела:" + index);
        System.out.println();
        index = service.calculate(1.76, 75);
        System.out.println("Рост - 1,76м, вес - 75кг");
        System.out.println("Индекс массы тела:" + index);
    }
}