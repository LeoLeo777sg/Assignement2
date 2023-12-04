
public class Main {
    public static void main(String[] args) {
     Product product=new Product("Misc Product",239877,100.0,20.0);
        System.out.println(product.getInfo());
        System.out.println("");
     Chocolate chocolate=new Chocolate("Zorka",324590,200.0,20.0,160.0);
        System.out.println(chocolate.getInfo());
        System.out.println("");
     Wine wine=new Wine("Harlan",999357,500,20,10,0.75);
        System.out.println(wine.getInfo());

    }
}