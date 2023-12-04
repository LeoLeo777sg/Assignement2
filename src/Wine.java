public class Wine extends Product{
    double bottleVolume;
    double priceAfterAlcTax;
    final double alcTax=10;
    public Wine(String productName, int barCode, double basicPrice, final double tax,final double alcTax,double bottleVolume) {
        super(productName,barCode,basicPrice,tax);
        this.bottleVolume=bottleVolume;
        this.priceAfterAlcTax=((basicPrice+tax)/100)*((basicPrice+alcTax)/100);
    }
@Override
    public String getInfo(){
    return "Products: "+productName+" "+bottleVolume+"\n"+"Basic price of the product is: "
            +basicPrice+" cents"
            +",for alcoholic beverages there is an additional 10% tax so the price for this wine is: "+priceAfterAlcTax+ "euros"+"\n"
            +",the barcode for this specific item is: "+barCode;
}
}
