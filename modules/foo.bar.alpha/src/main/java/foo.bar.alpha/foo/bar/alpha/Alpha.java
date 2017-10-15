package foo.bar.alpha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Alpha {

  private static final Logger logger = LoggerFactory.getLogger(Alpha.class);

  static {
    logger.info("class initialized");
  }

  public Alpha() {
    logger.info("instance initialized");
  }
}
