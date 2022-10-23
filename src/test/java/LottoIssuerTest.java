import lotto.LottoGenerator;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;

public class LottoIssuerTest {

    @Test
    void issue_로또를_최소_1개_혹은_최대_5개만_발급할_수_있다() {
        LottoGenerator generator = new LottoGenerator();
        LottoIssuer issuer = new LottoIssuer(generator);

        Lottos lottos = issuer.issue(3);

        int size = lottos.getGameCount();
        assertThat(size).isEqualTo(3);
    }

    @Test
    void issue_1보다_작거나_5보다_큰_값을_입력하면_예외가_발생한다() {
        LottoGenerator generator = new LottoGenerator();
        LottoIssuer issuer = new LottoIssuer(generator);

        assertThatThrownBy(() -> issuer.issue(-1));
    }
}
