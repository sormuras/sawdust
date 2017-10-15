package test.user.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import foo.bar.alpha.Alpha;
import org.junit.jupiter.api.Test;

class IntegrationTests {
  @Test
  void alpha() {
    assertEquals("Alpha", new Alpha().getClass().getSimpleName());
    // assertEquals("Protected", foo.bar.alpha.Protected.class.getSimpleName());
  }
}
