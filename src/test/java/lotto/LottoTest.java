package lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    void print_6개의_서로_다른_숫자가_공백으로_분리된_문자열로_반환한다() {
        Lotto lotto = new Lotto(List.of(1, 2, 3, 4, 5, 6));
        String print = lotto.print();

        assertThat(print).isEqualTo("1 2 3 4 5 6");
    }
}
