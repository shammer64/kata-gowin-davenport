import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoWinTest {

    private GoWinGame game;

    @BeforeEach
    public void setup() {
        game = new GoWinGame();
    }

    @Test
    public void turnOneShouldSayOne() {
        assertEquals("1", game.evaluate(1));
    }

    @Test
    public void turnTwoShouldSayTwo() {
        assertEquals("2", game.evaluate(2));
    }

    @Test
    public void turnThreeShouldSayGo() {
        assertEquals("Go", game.evaluate(3));
    }

    @Test
    public void turnFourShouldSayFour() {
        assertEquals("4", game.evaluate(4));
    }

    @Test
    public void turnFiveShouldSayWin() {
        assertEquals("Win", game.evaluate(5));
    }

    @Test
    public void turnSixShouldSayGo() {
        assertEquals("Go", game.evaluate(6));
    }

    @Test
    public void turnTenShouldSayWin() {
        assertEquals("Win", game.evaluate(10));
    }

    @Test
    public void turnFifteenShouldSayGoWin() {
        assertEquals("GoWin", game.evaluate(15));
    }

    @Test
    public void turnThirtyShouldSayGoWin() {
        assertEquals("GoWin", game.evaluate(30));
    }

}
