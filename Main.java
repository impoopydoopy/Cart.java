public class Main {
    public static void main(String[] args) {
        Cart myCart = new Cart(5); //створюємо корзину на 5 елементів

        //створюємо 5 об'єктів типу Item
        Item mousePad = new Item("Mouse Pad", 1000);
        Item monitor = new Item("Monitor", 15000);
        Item gamingKeyboard = new Item("Gaming Keyboard", 1500);
        Item mouse = new Item("Mouse LogiTech", 2000);
        Item headset = new Item("Headset Purple", 1800);

        //додаємо об'єкти до корзини

        myCart.addItem(mousePad);
        myCart.addItem(monitor);
        myCart.addItem(gamingKeyboard);
        myCart.addItem(mouse);
        myCart.addItem(headset);

        //виведемо сумму корзини
        System.out.println("Сума усіх товарів: " + myCart.getSum());

        //підвищимо ціни на 15%
        myCart.raisePricesInCart(15);
        System.out.println("Сума усіх товарів з надцінкою 15%: " + myCart.getSum());

        //виведемо сумму корзини
        myCart.reducePricesInCart(30);
        System.out.println("Сума усіх товарів після зниженні ціни на 30%: " + myCart.getSum());

    }
}