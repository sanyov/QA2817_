package by.itstep.logging;

import org.apache.log4j.Logger;

public class LogProgram {

    private static final Logger LOG = Logger.getLogger(LogProgram.class);

    public static void main(String[] args) {
        LOG.info("LogProgram started");
    }
}
