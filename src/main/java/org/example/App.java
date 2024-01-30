package org.example;

import org.example.factory.ComputerFactory;
import org.example.model.Computer;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger logger = Logger.getLogger("App");
    public static void main( String[] args )
    {
        Computer pc = ComputerFactory.getComputer("pc", "8gb", "320gb", "core duo");
        Computer server = ComputerFactory.getComputer("server", "16gb", "1tb", "intel xeon");

        logger.info(pc.toString());
        logger.info(server.toString());
    }
}
