package foo.bar.alpha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AlphaTests {
  @Test
  void alpha() {
    assertEquals("Alpha", Alpha.class.getSimpleName());
  }
}
