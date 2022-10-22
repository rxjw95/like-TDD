package lotto;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    void print_6개의_서로_다른_숫자가_공백으로_분리된_문자열로_반환한다() {
        Lotto lotto = new Lotto();
        String print = lotto.print();

        Set<Integer> set = Arrays.stream(print.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        assertThat(set.size()).isEqualTo(6);
    }
}
