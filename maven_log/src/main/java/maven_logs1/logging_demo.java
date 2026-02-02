package maven_logs1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logging_demo {

	private static final Logger logger = LogManager.getLogger(logging_demo.class);

    public static void main(String[] args) {
        logger.info("Hello World!");
        logger.debug("Hello World!");
    }
}
