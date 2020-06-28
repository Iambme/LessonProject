package lesson.loging.ex2_fileLogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main2 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main2.class);
        logger.info("Start program" );
        for (int i = 0; i < 10000000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.info("{}", i);
        }
        logger.info("End program" );

    }
}
