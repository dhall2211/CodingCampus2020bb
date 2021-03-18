package Bokhee.Exceptions;

import Bokhee.Exceptions.Logging.LogType;
import Bokhee.Exceptions.Logging.SimpleLogger;

public class Main {
    public static void main(String[] args) {
        SimpleLogger logger = SimpleLogger.getInstance();
        for (var item : Items.values()) {
            try {
                logger.log(LogType.INFO, item.name() + " kostet " + item.getPrice());
            } catch (ItemUnknownPriceException e) {
                logger.log(LogType.ERROR, "Fehler bei Pricing: " + e.getMessage());
            } finally {
                logger.log(LogType.INFO, "dieser Block wird immer ausgeführt");
            }
        }
    }
}
