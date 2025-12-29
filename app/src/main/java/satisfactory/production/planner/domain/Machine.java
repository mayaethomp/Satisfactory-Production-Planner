package satisfactory.production.planner.domain;

import java.util.Objects;

public class Machine {
  private final String name;
  private final double powerMW;

  public Machine (String name, double powerMW) {
    this.name = Objects.requireNonNull(name);
    if (powerMW < 0) {
      throw new IllegalArgumentException("powerMW must be non-negative");
    }
    this.powerMW = powerMW;
  }

  public String getName() {
    return name;
  }

  public double getPowerMW() {
    return powerMW;
  }
}
