import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "Sh’aent Sor’ca Sledd  Straede Taedh Tedd Deireadh aep Thaess Tor Va'en Va faill Vatt’ghern Vessekheal Vort";

        Function<String, List<String>> function = (a) ->
                Arrays.stream(a.split(" "))
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.toList());

        function.apply(text).forEach(System.out::println);
    }
}
