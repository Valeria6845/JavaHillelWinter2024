package org.homework21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.util.Date;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert files in current folder? [Y/N]");
        String isNext = "";
        boolean check = true;
        while (check) {
            isNext = scanner.nextLine();
            if (!isNext.equalsIgnoreCase("y") && !isNext.equalsIgnoreCase("n")) {
                System.out.println("You can only choose [Y] (yes) or [N] (no)!");
                continue;
            }
            check = false;
        }
        String mess = "";
        String path = "";
        if (isNext.equalsIgnoreCase("n")) {
            System.out.println("Enter the folder path: ");
            path = scanner.nextLine();
        }else if (isNext.equalsIgnoreCase("y")) {
            path = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        }
        long start = System.currentTimeMillis();
        Convert convert = new Convert(path);
        mess = convert.findAndConvert().toString();
        long end = System.currentTimeMillis();
        long time = end-start;
        String timeRes = "Conversion time: "+time+"ms";
        File log = new File(path+"/result.log");
        log.createNewFile();
        FileOutputStream fos = new FileOutputStream(log);
        fos.write(mess.getBytes(StandardCharsets.UTF_8));
        fos.write(timeRes.getBytes(StandardCharsets.UTF_8));
    }
}
