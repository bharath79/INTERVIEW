import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringUnitTest {

	@Test
	void shouldReverse() {
		assertEquals("abcde", ReverseString.reverse("edcba"));
	}
}
