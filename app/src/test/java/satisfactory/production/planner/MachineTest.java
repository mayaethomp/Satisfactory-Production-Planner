package satisfactory.production.planner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import satisfactory.production.planner.domain.Machine;

class MachineTest {

    private Machine machine;

    @BeforeEach
    @SuppressWarnings("unused")
    void setUp() {
        machine = new Machine("machine", 5000);
    }

    @Test
    @DisplayName("Machine returns correct name")
    void testGetName() {
        assertEquals("machine", machine.getName());
    }

    @Test
    @DisplayName("Machine returns correct power in MW")
    void testGetPowerMW() {
        assertEquals(5000, machine.getPowerMW());
    }
}
