package satisfactory.production.planner.domain;

import java.util.Objects;

public class Item {
  private final String name;

  public Item (String name) {
    this.name = Objects.requireNonNull(name);
  }

  public String getName() {
    return name;
  }
}
