import lotto.LottoGenerator;

import java.util.stream.Stream;

public class LottoIssuer {
    private final LottoGenerator generator;

    public LottoIssuer(LottoGenerator generator) {
        this.generator = generator;
    }

    public Lottos issue(int game) {
        validate(game);

        return new Lottos(Stream.generate(generator::generate)
                .limit(game)
                .toList());
    }

    private void validate(int game) {
        if(isCorrectRange(game)) {
            throw new IllegalArgumentException("game can be created minimum 1 and maximum 5.");
        }
    }

    private static boolean isCorrectRange(int game) {
        return game < 1 || game > 5;
    }
}
