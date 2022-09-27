public class Cart {
    private Item[] stack;
    private int topIndex;

    public Cart(int size){
        stack = new Item[size];
        topIndex = -1;
    }

    public void addItem(Item item){
        if(isFull()) System.out.println("Неможливо додати товар до корзини: Корзина переповнена.");
        else {
            stack[++topIndex] = item;
        }
    }

    public void deleteItem(){
        if(isEmpty()) System.out.println("Неможливо видалити товар: Корзина порожня.");
        else {
            stack[topIndex--] = null;
        }
    }

    public void raisePricesInCart(int percent){
        if(isEmpty()) System.out.println("Неможливо опрацювати ціни: Корзина порожня.");
        else {
            for (Item item : stack) {
                item.raisePrice(percent);
            }
        }
    }

    public void reducePricesInCart(int percent){
        if(isEmpty()) System.out.println("Неможливо опрацювати ціни: Корзина порожня.");
        else {
            for (Item item : stack) {
                item.reducePrice(percent);
            }
        }
    }

    public float getSum(){
        float sum = 0;
        if(isEmpty()) System.out.println("Неможливо опрацювати ціни: Корзина порожня.");
        else {
            for (Item item : stack) {
                sum += item.getPrice();
            }
        }
        return sum;
    }

    public boolean isFull(){
        return (topIndex == stack.length-1);
    }

    public boolean isEmpty(){
        return (topIndex < 0);
    }

}
