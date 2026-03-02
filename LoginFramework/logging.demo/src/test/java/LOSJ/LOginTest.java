package LOSJ;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LOginTest {
    private static final Logger Log = LogManager.getLogger(LOginTest.class);

    public void login() {
        Log.info("Login test started");
        Log.warn("This is a warning message");
        Log.error("Login failed due to invalid cred");
    }
}


