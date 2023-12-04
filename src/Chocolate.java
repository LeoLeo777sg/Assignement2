public class Chocolate extends Product{
    double nettoChocoWeight;
    public Chocolate(String productName, int barCode, double basicPrice,final double tax,double nettoChocoWeight){
        super(productName,barCode,basicPrice,tax);
        this.nettoChocoWeight=nettoChocoWeight;
    }

@Override
    public String getInfo(){
        return super.getInfo()+"\n"+"netto weight of the chocolate is: "+nettoChocoWeight+" grams";

}
}
