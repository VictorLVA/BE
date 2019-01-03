import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {

    public static void main(String[] args) {
        List<Integer> vampiresNumbersList = new ArrayList<>();
        for (int i = 10; i <= 99; i++) {
            for (int j = i; j <= 99; j++) {
                Integer result = i * j;
                if (result > 999 && result < 10000) {
                    List<Character> resultSymbolsList = new ArrayList<>();
                    for (char everyResultSymbol : result.toString().toCharArray()) {
                        resultSymbolsList.add(everyResultSymbol);
                    }
                    List<Character> firstNumberSymbolsList = new ArrayList<>();
                    for (char everyFirstNumberSymbol : ((Integer) i).toString().toCharArray()) {
                        firstNumberSymbolsList.add(everyFirstNumberSymbol);
                    }
                    List<Character> secondNumberSymbolsList = new ArrayList<>();
                    for (char everySecondNumberSymbol : ((Integer) j).toString().toCharArray()) {
                        secondNumberSymbolsList.add(everySecondNumberSymbol);
                    }
                    for (Character firstNumberSymbol : firstNumberSymbolsList) {
                        for (Character resultSymbol : resultSymbolsList) {
                            if (firstNumberSymbol == resultSymbol) {
                                resultSymbolsList.remove(resultSymbol);
                                break;
                            }
                        }
                    }
                    for (Character secondNumberSymbol : secondNumberSymbolsList) {
                        for (Character resultSymbol : resultSymbolsList) {
                            if (secondNumberSymbol == resultSymbol) {
                                resultSymbolsList.remove(resultSymbol);
                                break;
                            }
                        }
                    }
                    if (resultSymbolsList.size() == 0) {
                        vampiresNumbersList.add(result);
                    }
                }
            }
        }
        System.out.println("Vampires is: " + vampiresNumbersList.stream().sorted().collect(Collectors.toList()));
    }
}