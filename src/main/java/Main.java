public class Main {

    public static void main (String[] args){
        int m = 5; //количество строк в матрице
        int n = 5; //количество столбцов
        int[][] mat = new int[m][n];
        int e = 1;
        int m2 = m;
        int n2= n;
        int row = 0;
        int col = 0;
        while (e < (m * n)){
            for (int i = col; i < (n2 - col); i++) {
                mat[row][i] = e;
                e++;
            }
            for (int i = (row + 1); i < (m2 - row); i++) {
                mat[i][n2 - col - 1] = e;
                e++;
            }
            for (int i = (n2 - (col + 2)); i >= col; i--) {
                mat[m2 - row - 1][i] = e;
                e++;
            }
            for (int i = (m2 - (row + 2)); i >= (row + 1); i--) {
                mat[i][col] = e;
                e++;
            }
            col++;
            row++;
        }

        if (mat[m/2][n/2] == 0){     //при размерности 3х3, 5х5 и т.д. центральный элемент не раполняется в цикле, делаем принудительно
            mat[m/2][n/2] = e;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
