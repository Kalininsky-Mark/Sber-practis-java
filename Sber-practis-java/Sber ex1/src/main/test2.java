package main;

import lombok.NonNull;

import java.io.FileNotFoundException;
import java.io.IOException;

class test2 extends test {
    public test2() throws FileNotFoundException {
    }
    @Repit(value = 2)
    public void setData(@NonNull int anInt, String str, double aDouble, boolean bool){
            container.setADouble(aDouble);
            container.setString(str);
            container.setAnInt(anInt);
            container.setABoolean(bool);
        try {
            this.writeToFile();
        } catch (IOException ignored) {
        }
    }
}
