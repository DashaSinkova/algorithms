package chaptertwo.soderzhname;
import static org.hamcrest.core.Is.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class GuessStatisticsMessageTest {
    @Test
    public void when2cakesWeHave() {
        GuessStatisticsMessage cakeOrderMessage = new GuessStatisticsMessage();
        assertThat(cakeOrderMessage.make("cake", 2), is("There are 2 cakes"));
    }
}
