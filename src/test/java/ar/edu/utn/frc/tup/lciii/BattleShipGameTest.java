package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BattleShipGameTest {

    BattleShipGame game;
    List<Ship> ships;

    @BeforeEach
    void setUpTestValidateSunkenFleet() {

    }
    @Test
    void testValidateSunkenFleet() throws Exception {
        // TODO: Probar este metodo privado
        game = new BattleShipGame();
        Position position = new Position(1, 2);
        Position position2 = new Position(2, 1);

        Ship ship2 = new Ship(position,ShipStatus.AFLOAT);
        Ship ship3 = new Ship(position2,ShipStatus.SUNKEN);
        ships = new ArrayList<>(List.of(ship2, ship3));


        Method method = BattleShipGame.class.getDeclaredMethod("validateSunkenFleet", List.class);
        method.setAccessible(true);

        Boolean result = (Boolean) method.invoke(game, ships);
        assertFalse(result);
    }

    @Test
    void testValidateSunkenFleet2() throws Exception {
        // TODO: Probar este metodo privado
        game = new BattleShipGame();
        Position position = new Position(1, 2);
        Position position2 = new Position(2, 1);

        Ship ship2 = new Ship(position,ShipStatus.SUNKEN);
        Ship ship3 = new Ship(position2,ShipStatus.SUNKEN);
        ships = new ArrayList<>(List.of(ship2, ship3));

        Method method = BattleShipGame.class.getDeclaredMethod("validateSunkenFleet", List.class);
        method.setAccessible(true);

        Boolean result = (Boolean) method.invoke(game, ships);
        assertTrue(result);
    }
}