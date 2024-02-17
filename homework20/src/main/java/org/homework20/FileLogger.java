package org.homework20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class FileLogger {
    public static void logInFile(String message, FileLoggerConfiguration file, LoggingLevel flag) throws IOException {
        if (file.getLogLvl().equals(LoggingLevel.DEBUG)&&flag.equals(LoggingLevel.DEBUG)) {
            debug(message, file);
        }else if (file.getLogLvl().equals(LoggingLevel.INFO)&&flag.equals(LoggingLevel.INFO)) {
            info(message, file);
        }else if (file.getLogLvl().equals(LoggingLevel.INFO)&&flag.equals(LoggingLevel.DEBUG)) {
            debug(message, file);
        }
    }
    private static void info(String message, FileLoggerConfiguration file) throws IOException {
        if (file.getFile().length() >= file.getMaxSize()) {
            throw new FileMaxSizeReachedException("File size (" + file.getFile().length() + ") exceeded allowable (" + file.getMaxSize() + ")"
                    + "\n Path: " + file.getPath());
        } else {
            FileOutputStream fos = new FileOutputStream(file.getPath(), true);
            LocalDate date = LocalDate.now();
            String mess = String.format(file.getFormat(), date, LoggingLevel.INFO, message) + "\n";
            fos.write(mess.getBytes(StandardCharsets.UTF_8));
        }
    }
    private static void debug(String message, FileLoggerConfiguration file) throws IOException {
        if (file.getFile().length() >= file.getMaxSize()) {
            throw new FileMaxSizeReachedException("File size (" + file.getFile().length() + ") exceeded allowable (" + file.getMaxSize() + ")"
                    + "\n Path: " + file.getPath());
        } else {
            FileOutputStream fos = new FileOutputStream(file.getPath(), true);
            LocalDate date = LocalDate.now();
            String mess = String.format(file.getFormat(), date, LoggingLevel.DEBUG, message) + "\n";
            fos.write(mess.getBytes(StandardCharsets.UTF_8));
        }
    }
}
