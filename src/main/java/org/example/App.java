package org.example;

import com.github.javafaker.Faker;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 */
@Singleton
@Startup
public class App {
    private final Logger logger = Logger.getLogger(getClass().getName());

    @Schedule(second = "*/5", minute = "*", hour = "*")
    public void doSomeTask() {
        logger.log(Level.INFO, new Faker().yoda().quote());
    }
}
