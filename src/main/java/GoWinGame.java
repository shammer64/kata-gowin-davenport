public class GoWinGame {

    public String evaluate(int turnNumber) {
        String response = "";
        if (isDivisibleBy3(turnNumber)) {
            response += "Go";
        }
        if (isDivisibleBy5(turnNumber)) {
            response += "Win";
        }
        return response.isEmpty() ? String.valueOf(turnNumber) : response;
    }

    private boolean isDivisibleBy5(int turnNumber) {
        return turnNumber % 5 == 0;
    }

    private boolean isDivisibleBy3(int turnNumber) {
        return turnNumber % 3 == 0;
    }
}
