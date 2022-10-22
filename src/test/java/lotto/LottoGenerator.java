package lotto;

import java.util.concurrent.ThreadLocalRandom;

public class LottoGenerator {
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    public Lotto generate() {
        return new Lotto(random.ints(6, 1, 46)
                .boxed()
                .toList());
    }
}
