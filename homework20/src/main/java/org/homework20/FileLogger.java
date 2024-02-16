package org.homework20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class FileLogger {
//    public static void  sort(String message, FileLoggerConfiguration file, LoggingLevel flag) {
//
//    }
    public static void info(String message, FileLoggerConfiguration file) throws IOException {
            FileOutputStream fos = new FileOutputStream(file.getPath());
            LocalDate date = LocalDate.now();
            String mess = String.format(file.getFormat(), date, LoggingLevel.INFO, message);
            fos.write(mess.getBytes(StandardCharsets.UTF_8));
        }
    public static void debug(String message, FileLoggerConfiguration file) throws IOException {
            FileOutputStream fos = new FileOutputStream(file.getPath());
            LocalDate date = LocalDate.now();
            String mess = String.format(file.getFormat(), date, LoggingLevel.DEBUG, message);
            fos.write(mess.getBytes(StandardCharsets.UTF_8));
    }
}
