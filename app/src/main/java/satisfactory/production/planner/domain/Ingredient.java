package satisfactory.production.planner.domain;

import java.util.Objects;

/**
 * Represents an ingredient required by a recipe.
 * <p>
 * An {@code Ingredient} pairs an {@link Item} with a required quantity.
 * It is an immutable domain object and does not contain production logic.
 * </p>
 */

public class Ingredient {

   /** 
   * The unique, non-null name of the ingredient
   */
  private final Item item;

  /**
   * The quantity of the item required.
   */
  private final double amount;

    /** 
   * Constructs a new {@code Ingredient}.
   * 
   * @param item the non-null item required
   * @param amount the required quantity (must be positive)
   * @throws NullPointerException if {@code item} is null
   * @throws IllegalArgumentException if {@code amount} is not positive
   */

  public Ingredient (Item item, double amount) {
    this.item = Objects.requireNonNull(item);
    if (amount <= 0) {
      throw new IllegalArgumentException("amount must be positive");
    }
    this.amount = amount;
  }

  /**
   * Returns the item required by this ingredient
   * 
   * @return the item
   */
  public Item getItem() {
    return item;
  }

  /**
   * Returns the quantity of the item required.
   * 
   * @return the required amount
   */

  public double getAmount() {
    return amount;
  }  
}
