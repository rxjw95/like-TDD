package lotto;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public String print() {
        return numbers.stream()
                .sorted()
                .map(Objects::toString)
                .collect(Collectors.joining(" "));
    }
}
