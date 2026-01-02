package satisfactory.production.planner.domain;

import java.util.Objects;

/**
 * Represents a machine used to process recipes in the production system
 * 
 * 
 * <p> A {@code Machine} has a fixed power consumption measured in megawatts (MW)
 * and is responsible for performing production steps defined by recipes.
 * Machines are immutable domain objects and contain no production logic.
 * </p>
 */
public class Machine {

  /**
   * The non-null name of the machine.
   */
  private final String name;

  /**
   * The power consumption of the machine, measured in megawatts (MW).
   */
  private final double powerMW;

  /**
   * Constructs a new {@code Machine}.
   * @param name the non-null name of the machine
   * @param powerMW the power consumption in megawatts (MW); must be non-negative
   * @throws NullPointerException if {@code name} is null
   * @throws IllegalArgumentException if {@code powerMW} is negative
   */
  public Machine (String name, double powerMW) {
    this.name = Objects.requireNonNull(name);
    if (powerMW < 0) {
      throw new IllegalArgumentException("powerMW must be non-negative");
    }
    this.powerMW = powerMW;
  }

  /**
   * Returns the name of the machine.
   * 
   * @return the machine name
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the power consumption of this machine in megawatts.
   * 
   * @return the power consumption in MW
   */

  public double getPowerMW() {
    return powerMW;
  }
}
