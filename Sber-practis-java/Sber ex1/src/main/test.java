package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.io.File;
@MyAnnotation(day = 23)
@MyInheritedAnnotation
public class test {

    private final OutputStreamWriter writer;
    protected static DataContainer container;
    public test() throws FileNotFoundException{
        FileOutputStream outputStream = new FileOutputStream(String.format("log/%td-%<tm-%<tY %<tH.%<tM.%<tS", new Date()));
        this.writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
        File file = new File("log");
        int l = file.listFiles().length;
        if (l>2){
            for (File f : file.listFiles()) f.delete();
        }
    }
    protected void writeToFile() throws IOException {
        Class<? extends test> clazz = this.getClass();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        writer.write(String.format("%s(%s)\n", clazz.getName(), stackTrace[2].getMethodName()));
        writer.flush();
    }

}

