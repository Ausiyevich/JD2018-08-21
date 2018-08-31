package by.it.galushka.jd01_05;

public class TaskC {
    public static void main(String[] args) {

        //Task C1
        double[] array = new double[37];
        getArray(array);
        printArrayA(array);
        getArrayB(array);
        printArrayB(array);
        findGeoAvr(array);

        //Task C2

    }

    private static double[] getArray(double[] array) {
        int i = 0;
        for (double x = 5.33; x <= 9; x = x + 0.1) {
            array[i] = Math.cbrt(x * x + 4.5);
            i++;
        }
        return array;
    }

    private static void printArrayA(double[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%c[% -3d] = %-10.5f", 'A', j, array[j]);
            if ((j + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    private static double[] getArrayB(double[] array) {
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3.5)
                t++;
        }
        double[] arrayB = new double[t];
        t =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3.5) {
                arrayB[t] = array[i];
                t++;
            }
        }
        return arrayB;
    }

    private static void printArrayB (double[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%c[% -3d] = %-10.5f", 'A', j, array[j]);
            if ((j + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    private static void findGeoAvr(double[] array) {
        double mul = 1;
        for (int i = 0; i < array.length; i++) {
            mul = mul * array[i];
        }
        double geoAvr = Math.pow(mul, 1 / (double)(array.length));
        System.out.println("Среднее геометрическое значение массива B: "+geoAvr);
    }
}
