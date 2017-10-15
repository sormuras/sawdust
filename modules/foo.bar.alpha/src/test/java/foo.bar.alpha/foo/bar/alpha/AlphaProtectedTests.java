package foo.bar.alpha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AlphaProtectedTests {
  @Test
  void simpleNameIsAlphaProtected() {
    assertEquals("AlphaProtected", AlphaProtected.class.getSimpleName());
  }
}
