package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        int measurement = 3;

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer("Pinky", 14);

        System.out.println("Min Price:" + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-shirt", 10.5, "S")};


        c1.addItems(items);

        System.out.println("Customer is " + c1.getName() + ", size:" + c1.getSize() + ", total:" + c1.getTotalClotingCost());


        for (Clothing item : c1.getItems()) {
            System.out.println("Items: " + item.getDescription());
        }

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }
        try {
            average = (count==0)? 0: average / count;
           // average= average / count;
            System.out.println("Average price: " + average + ", count: " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divided by 0");
        }


    }
}
