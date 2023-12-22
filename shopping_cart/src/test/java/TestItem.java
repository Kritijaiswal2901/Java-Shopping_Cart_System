import static org.junit.Assert.*;
import org.junit.Test;

import com.example.Item;

public class TestItem {

    @Test
    public void validateItemDetails() {
        Item item = new Item(1, "Iphone", 100000);
        assertNotNull(item);
    }

    @Test
    public void testGetItemDetails() {
        Item item = new Item(1, "Iphone", 100000);
        assertEquals(1, item.getId());
        assertEquals("Iphone", item.getName());
        assertNotEquals(100, item.getPrice());
    }
}

