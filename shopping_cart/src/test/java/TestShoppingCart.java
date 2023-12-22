import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.example.Item;
import com.example.ShoppingCart;

public class TestShoppingCart {

    @Test
    public void testAddItemsToCart() {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item(1, "Iphone", 100000);
        cart.addItem(item);
        assertEquals(1, cart.getCartSize());
    }

    @Test
    public void testRemoveItemsFromCart() {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item(1, "Iphone", 100000);
        cart.addItem(item);
        cart.removeItem(item);
        assertEquals(0, cart.getCartSize());
    }

    @Test
    public void testViewItemsInCart() {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item(1, "Iphone", 100000);
        Item item2 = new Item(2, "Smartphone", 50000);
        cart.addItem(item1);
        cart.addItem(item2);

        List<Item> itemsInCart = cart.viewItemsInCart();
        assertEquals(2, itemsInCart.size());
        assertTrue(itemsInCart.contains(item1));
        assertTrue(itemsInCart.contains(item2));
    }

    @Test
    public void testCalculateTotalPrice() {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item(1, "Iphone", 100000);
        Item item2 = new Item(2, "Smartphone", 50000);
        cart.addItem(item1);
        cart.addItem(item2);
        assertNotEquals(200000, cart.calculateTotalPrice());
    }
}
