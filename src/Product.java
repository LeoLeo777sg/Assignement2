public class Product {
    String productName;
     int barCode;
    double basicPrice;
    double priceAfterTax;
    final double tax=20.0;
    public Product(String productName, int barCode, double basicPrice,final double tax) {
        this.productName = productName;
        this.barCode = barCode;
        this.basicPrice = basicPrice;
        this.priceAfterTax = (basicPrice + tax) / 100;
    }
    public double priceAfterTax() {
        return priceAfterTax;
    }
    public String getInfo(){
       return "Products: "+productName+"\n"+"Basic price of the product is: "
               +basicPrice+" cents"
               +",the price after tax is: "+priceAfterTax+" euros"+"\n"
               +",the barcode for this specific item is: "+barCode;
    }

    }



