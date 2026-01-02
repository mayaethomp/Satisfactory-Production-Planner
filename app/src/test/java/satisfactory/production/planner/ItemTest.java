package satisfactory.production.planner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import satisfactory.production.planner.domain.Item;

public class ItemTest {
  
    @Test
    @DisplayName("Item returns correct name")
    void testItemHasGetName() {
        Item item = new Item("name");
        assertEquals("name", item.getName());
    }
}
