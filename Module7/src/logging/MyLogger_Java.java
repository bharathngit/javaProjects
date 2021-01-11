package logging;

import org.apache.log4j.Logger;

public class MyLogger_Java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger myLogger = Logger.getLogger("devpinoyLogger");
		myLogger.debug("starting testcase");
		myLogger.debug("logging in the app");
		myLogger.debug("ending test");

	}

}
