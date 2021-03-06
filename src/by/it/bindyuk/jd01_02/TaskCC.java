package by.it.bindyuk.jd01_02;

public class TaskCC {
    int[][] step3(int[][] mas) {
        //find max
        int max = Integer.MIN_VALUE;
        for (int[] row : mas) {
            for (int element : row) {
                if (max < element)
                    max = element;
            }

        }
        //build markers
        boolean[] delRow = new boolean[mas.length];
        boolean[] delCol = new boolean[mas[0].length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == max) {
                    delCol[j] = true;
                    delRow[i] = true;
                }
            }
        }
        //calc size result
        int rowcount = 0;
        for (boolean b : delRow) {
            if (!b) rowcount++;
        }
        int colcount = 0;
        for (boolean b : delRow) {
            if (!b) colcount++;
        }
        int[][] res = new int[rowcount][colcount];

        //fill res
        int ir = 0;
        for (int i = 0; i < mas.length; i++) {
            if (!delRow[i]) {
                int jc = 0;
                for (int j = 0; j < mas[i].length; j++) {
                    if (!delCol[j]) {
                        res[ir][jc] = mas[i][j];
                        jc++;
                    }
                }
                ir++;
            }
        }
        return mas;
    }
}
