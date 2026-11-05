package org.example;

public abstract class Abstrct {
    private int test;

    public Abstrct(int test) {
        this.test = test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public int getTest() {
        return test;
    }

    public abstract void testa();

    public void test(){
        System.out.print(test);
    }
}
