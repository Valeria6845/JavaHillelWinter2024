package org.homework20;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        FileLoggerConfiguration file = new FileLoggerConfiguration("C:\\Users\\Administrator\\Desktop\\hillel\\Java Pro\\homework20\\src\\main\\java\\org\\homework20",
                LoggingLevel.INFO, 150, "%s %s Message: %s");
        FileLoggerConfiguration file1 = new FileLoggerConfiguration("C:\\Users\\Administrator\\Desktop\\hillel\\Java Pro\\homework20\\src\\main\\java\\org\\homework20",
                LoggingLevel.DEBUG, 150, "%s %s Message: %s");
        FileLogger.logInFile("message3", file, LoggingLevel.DEBUG);
        FileLogger.logInFile("message4", file, LoggingLevel.INFO);
        FileLogger.logInFile("message5", file1, LoggingLevel.DEBUG);
        FileLogger.logInFile("message6", file1, LoggingLevel.INFO);
        System.out.println(file.getFile().length());
        System.out.println(file1.getFile().length());
    }
}
