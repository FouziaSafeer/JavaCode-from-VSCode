
class ex131b {

    public static void main(String args[]) {
        String location = "Utah";
        double salesTax = 0.0;
        if (location == "Utah") {
            salesTax = .067;

        } else {
            salesTax = .05;
        }
        System.out.println("Your sales tax rate is " + salesTax * 100 + "%.");

    }

}