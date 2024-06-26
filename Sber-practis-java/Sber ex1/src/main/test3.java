package main;

import lombok.NonNull;

import java.io.FileNotFoundException;
import java.io.IOException;

class test3 extends test {
    public test3() throws FileNotFoundException {
    }
    @Repit(value = 1)
    public void setData(@NonNull int anInt, String str, double aDouble, boolean bool){
        this.container.setADouble(aDouble);
        this.container.setString(str);
        this.container.setAnInt(anInt);
        this.container.setABoolean(bool);
        try {
            this.writeToFile();
        } catch (IOException ignored) {
        }
    }
}
