package test.user.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import foo.bar.alpha.AlphaPublic;
import org.junit.jupiter.api.Test;

class IntegrationTests {
  @Test
  void accessExportedTypes() {
    assertEquals("AlphaPublic", AlphaPublic.class.getSimpleName());
    // foo.bar.alpha.AlphaProtected.class not visible
  }
}
