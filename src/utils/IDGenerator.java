package utils;

public class IDGenerator {

    public static String generateId() {
        return "ID-" + System.currentTimeMillis();
    }
}