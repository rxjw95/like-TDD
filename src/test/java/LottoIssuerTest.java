import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoIssuerTest {

    @Test
    void issue_로또를_최소_1개_혹은_최대_5개만_발급할_수_있다() {
        LottoIssuer issuer = new LottoIssuer();

        Lottos lottos = issuer.issue(4);

        int size = lottos.getGameCount();
        assertThat(size).isEqualTo(4);
    }


}
