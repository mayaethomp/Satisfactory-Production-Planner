package satisfactory.production;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import satisfactory.production.planner.domain.Ingredient;
import satisfactory.production.planner.domain.Item;

public class IngredientTest {
  
  @Test
  @DisplayName("Ingredient stores item and amount")
  void ingredientStoresValues(){ 
    Item item = new Item("Iron ore");
    Ingredient ingredient = new Ingredient(item, 2.5);

    assertEquals(item, ingredient.getItem());
    assertEquals(2.5, ingredient.getAmount());
  }

  @Test
  @DisplayName("Ingredient does not allow null item")
  void ingredientRejectNullItem() {
    assertThrows(
      NullPointerException.class,
      () -> new Ingredient(null, 1.0)
    );
  }

  @Test
  @DisplayName("Ingredient does not allow zero or negative amount")
  void ingredientRejectsInvalidAmount() {
    Item item = new Item("Iron ore");

    IllegalArgumentException ex = assertThrows(
        IllegalArgumentException.class,
        () -> new Ingredient(item, 0.0)
    );
    assertEquals("amount must be positive", ex.getMessage());

    IllegalArgumentException neg = assertThrows(
        IllegalArgumentException.class,
        () -> new Ingredient(item, -1.0)
    );
    assertEquals("amount must be positive", neg.getMessage());
  }

}




