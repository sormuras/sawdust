package foo.bar.alpha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AlphaPublicTests {
  @Test
  void simpleNameIsAlphaPublic() {
    assertEquals("AlphaPublic", AlphaPublic.class.getSimpleName());
  }
}
