package lotto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoGeneratorTest {

    @Test
    void generate_난수가_6개인_Lotto를_생성한다() {
        LottoGenerator generator = new LottoGenerator();
        Lotto lotto1 = generator.generate();
        Lotto lotto2 = generator.generate();

        assertThat(lotto1.print()).isNotEqualTo(lotto2.print());
    }

}
