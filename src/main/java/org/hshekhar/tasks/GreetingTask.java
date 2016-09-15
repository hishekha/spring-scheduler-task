package org.hshekhar.tasks;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 609080540 on 15/09/2016.
 */

@Component
public class GreetingTask {

    private static final Logger LOGGER = Logger.getLogger(GreetingTask.class);

    @Scheduled(fixedDelay = 3000)
    public boolean greet() {
        LOGGER.info("Hello...");
        return true;
    }
}
