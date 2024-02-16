package org.homework20;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        FileLoggerConfiguration file = new FileLoggerConfiguration("C:\\Users\\Administrator\\Desktop\\hillel\\Java Pro\\homework20\\src\\main\\java\\org\\homework20",
                LoggingLevel.INFO, 1000, "%s %s Message: %s");
    }
}
