package by.it.yaroshchuk.jd01_01;

public class Args {

    private String[] args;

    Args(String[] args) {
        this.args = args;
    }

    void printArgs() {
        int i = 0;
        for (String arg : args) {
            i = i + 1;
            System.out.println("Argument " + i + "=" + arg);
        }
    }
}
