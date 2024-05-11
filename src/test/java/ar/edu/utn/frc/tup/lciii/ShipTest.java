package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    Ship ship;

    @BeforeEach
    public void setUp(){
        Position position = new Position(1, 0);
        ship = new Ship(position,ShipStatus.AFLOAT);
    }

    @Test
    void testEquals() {
        // TODO: Probar este metodo publico
        Position position = new Position(1, 0);
        Ship ship2 = new Ship(position,ShipStatus.AFLOAT);
        boolean result = ship.equals(ship2);
        assertTrue(result);
    }

    @Test
    void testEqualsCase2() {
        // TODO: Probar este metodo publico
        Position position = new Position(2, 0);
        Ship ship2 = new Ship(position,ShipStatus.AFLOAT);
        boolean result = ship.equals(ship2);
        assertFalse(result);
    }
}