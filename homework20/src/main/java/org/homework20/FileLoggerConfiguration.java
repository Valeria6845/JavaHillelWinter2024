package org.homework20;

import lombok.Getter;

import java.io.File;
import java.io.IOException;
@Getter

public class FileLoggerConfiguration {
    private File file;
    private String path;
    private LoggingLevel logLvl;
    private int maxSize;
    private static int counter;
    private String format;
    public FileLoggerConfiguration(String path, LoggingLevel logLvl, int maxSize, String format) throws IOException {
        this.format = format;
        counter++;
        this.file = new File(path+"\\log_file"+counter);
        file.createNewFile();
        this.path = path+"\\log_file"+counter;
        this.logLvl = logLvl;
        this.maxSize = maxSize;
    }
}
