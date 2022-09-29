import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoWinTest {

    @Test
    public void turnOneShouldSayOne() {
        GoWinGame game = new GoWinGame();

        String response = game.evaluate(1);

        assertEquals("1", response);
    }
}
