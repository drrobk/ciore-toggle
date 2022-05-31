import com.github.drrobk.coretoggle.CoreToggle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenUsingAToggle {
    @Test
    void testThatCorrectTruePathIsFollowed() {
        // GIVEN
        CoreToggle t = new CoreToggle();
        TestApp a = new TestApp(t);

        // WHEN
        String result = a.getResult();

        // THEN
        assertThat(result)
                .as("")
                .isEqualTo("true");
    }
}
