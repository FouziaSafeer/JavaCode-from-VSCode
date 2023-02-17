class ex112 {

    public static void main(String args[]) {
        Product product1 = new Product("Coffee", "Medium Roast", 9.99);
        Product product2 = new Product("Tea", "Organic White", 7.99);

        System.out.println(product1.name + "   " + product1.price + " " + product1.type);
        System.out.println(product2.name + "    " + product2.price + " " + product2.type);
    }

}

class Product {

    String type;
    String name;
    double price;

    Product(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }
}