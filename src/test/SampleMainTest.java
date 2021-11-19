package test;

import main.SampleMain;

public class SampleMainTest {
    public static void main(String[] args) {
        testSquare();
    }

    private static void testSquare() {
        SampleMain sampleMain = new SampleMain();

        assert sampleMain.square(4) == 16;
    }
}