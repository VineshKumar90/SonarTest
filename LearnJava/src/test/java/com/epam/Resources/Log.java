package com.epam.Resources;

import org.apache.log4j.Logger;

public class Log {
    public static Logger log = Logger.getLogger(Log.class.getName());
    public static void startLog (String testClassName){
        log.info("Test is Starting...");
    }
}
