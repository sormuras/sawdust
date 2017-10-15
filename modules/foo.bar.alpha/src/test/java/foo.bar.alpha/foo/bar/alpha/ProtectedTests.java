package foo.bar.alpha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProtectedTests {
  @Test
  void simpleName() {
    assertEquals("Protected", Protected.class.getSimpleName());
  }
}
