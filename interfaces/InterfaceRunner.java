package interfaces;

public class InterfaceRunner {

    public static void main(String[] args) {

        Pricable pizza = new Pizza("Neapilitana", 1, 20, Size.L);
        Pricable phone = new CellPhone("Motorola", "XT1575", 1, 250);
        Pricable fridge = new Fridge("LG", "E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Pricable del) {
        System.out.println("Delivery price = " + del.calcDeliveryPrice());
        System.out.println("Order price = " + del.calcOrderPrice());
    }
}
