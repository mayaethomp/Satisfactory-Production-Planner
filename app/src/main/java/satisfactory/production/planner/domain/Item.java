package satisfactory.production.planner.domain;

import java.util.Objects;

/**
 * Represents a distinct item or material in the production system
 * 
 * 
 * An {@code Item} is a core domain concept that models anything that can be produced, consumed, or used as an ingredient in a recipe.
 * Items are immutable and uniquely identified by their name. 
 * </p>
 */

public class Item {
  
  /** 
   * The unique, non-null name of the item
   */
  private final String name;


  /** 
   * Constructs a new {@code Item} with the given name.
   * 
   * @param name the non-null name of the item
   * @throws NullPointerException if {@code name} is null
   */

  public Item (String name) {
    this.name = Objects.requireNonNull(name);
  }

  /**
   * Returns the name of this item.
   * @return the item name
   */
  public String getName() {
    return name;
  }
}
