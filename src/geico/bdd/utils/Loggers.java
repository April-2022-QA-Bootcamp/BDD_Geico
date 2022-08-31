package geico.bdd.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Loggers {

	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void getLog(String msg) {
		//Java Console Logger
		LOGGER.log(Level.INFO, msg);
	}
}
