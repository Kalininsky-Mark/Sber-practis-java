package main;

import java.io.FileNotFoundException;

public class tests extends test {
    public tests() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        test2 tests2 = new test2();
        container = new DataContainer();
        tests2.setData(1, "1", 1, true);
        tests2.setData(2, "2", 2, true);
    }
}
