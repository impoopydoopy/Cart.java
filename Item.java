public class Item {
    private String name;
    private float price;

    public Item(String name, float price){
        setName(name);
        setPrice(price);
    }

    public String getName(){
        return name;
    }

    public void setName(String a){
        name = a;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float a){
        if(a > 0) price = a;
        else price = 0;
    }

    public void raisePrice(float percent){
        setPrice(price + price*percent/100);
    }

    public void reducePrice(float percent){
        setPrice(price - price*percent/100);
    }
}
