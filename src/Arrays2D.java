import java.util.Scanner;

public class Arrays2D {
    public static void main(){
        System.out.println("=========Practice1=========");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int q = 0; q < matrix.length; q++){
            for(int t = 0; t < matrix[q].length; t++){
                System.out.print(matrix[q][t] + " ");
            }
            System.out.println();

        }
        System.out.println("=========Practice2=========");
        int[][] modify = {
                {5, 10, 15},
                {20, 25, 30}
        };
        System.out.print(modify[1][2] + " ");
        int change = 99;
        if (change != modify[0][1]){
            modify[0][1] = change;
        }
        System.out.println(modify[0][1]);


        System.out.println("=========Practice3=========");
        int[][] sum2 = {
                {67, 64, 78},
                {12, 15, 19},
                {33, 36, 39}
        };
        int sum10 = 0;
        for(int gh = 0; gh < sum2.length; gh++){
            for(int hg = 0; hg < sum2[gh].length; hg++){
                sum10 += sum2[gh][hg];

            }
        }
        System.out.println("Sum of numbers: "+sum10);


        System.out.println("=========Practice4=========");
        int[][] evenOdd = {
                {10, 11, 12},
                {21, 22, 23},
                {32, 33, 34}
        };
        int even = 0;
        int odd = 0;
        for (int e = 0; e < evenOdd.length; e++){
            for (int o = 0; o < evenOdd[e].length; o++){
                if (evenOdd[e][o] %2 != 0){
                    odd++;
                }
                else{
                    even++;
                }
            }
        }
        System.out.println("Even numbers: " +even);
        System.out.println("Odd numbers: "+odd);


        System.out.println("=========Practice5=========");
        int[][] matrix2 = {
                {10, 11, 12, 17},
                {21, 22, 23, 27},
                {32, 33, 34, 37}
        };
        int max = matrix2[0][0];
        int min = matrix2[0][0];
        for (int l = 0; l < matrix2.length; l++) {
            for (int s = 0; s < matrix2[l].length; s++) {
                if (matrix2[l][s] > max) {
                    max = matrix2[l][s];
                }
                if (matrix2[l][s] < min) {
                    min = matrix2[l][s];
                }

            }
        }
        System.out.println(max);
        System.out.println(min);


        System.out.println("=========Practice6=========");
        Scanner sc = new Scanner(System.in);
        int scanner;
        int[][] matrix3 = {
                {scanner = sc.nextInt(), scanner = sc.nextInt(), scanner = sc.nextInt()},
                {scanner = sc.nextInt(), scanner = sc.nextInt(), scanner = sc.nextInt()},
        };
        for (int a = 0; a < matrix3.length; a++){
            for (int w = 0; w < matrix3[a].length; w++){
                System.out.print(matrix3[a][w] + " ");
            }
            System.out.println();
        }


        System.out.println("=========Practice7=========");
        int[][] sum3 = {
                {10, 11, 12},
                {21, 22, 23},
                {32, 33, 34}
        };

        for(int r = 0; r< sum3.length; r++){
            int sum4 = 0;
            for (int f = 0; f< sum3[r].length; f++){
                sum4+=sum3[r][f];
            }
            System.out.println("Row " + r + ": " + sum4);
        }

        System.out.println("=========Practice8=========");
        int[][] num = {
                {10, 11, 12},
                {21, 22, 23},
                {32, 33, 34}
        };
        int count = 0;
        System.out.print("Enter number: ");
        int ent = sc.nextInt();
        for(int tr = 0; tr < num.length; tr++){
            for(int res = 0; res < num[tr].length; res++){
                if(ent < num[tr][res] ){
                    count++;
                }
            }
        }
        System.out.println("How many matrix num more than Number: " + count);


        System.out.println("=========Practice9=========");

        int[][] num2 = {
                {10, 11, 12},
                {22, 22, 23},
                {32, 33, 34}
        };
        System.out.print("Enter number: ");
        int enter = sc.nextInt();
        boolean found = false;
        for (int kel = 0; kel < num2.length; kel++) {
            for (int del = 0; del < num2[kel].length; del++) {
                if (enter == num2[kel][del]) {
                    System.out.println("Row: " + kel + " Column: " + del);
                    found = true;
                }

            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        System.out.println("=========Practice10========");
        int[][] num3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int summ = 0;
        for(int i = 0; i < num3.length; i++){
            summ += num3[i][i];
            for(int a = 0; a < num3[i].length; a++){
                System.out.print(num3[i][a] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum: " + summ );
        System.out.println();


        System.out.println("=========Practice11========");
        int[][] num4 = {
                {1, 2, 3, -2},
                {-4, -3, -1, -5}
        };
        System.out.println("Original: ");
        for(int i = 0; i < num4.length; i++){
            for(int a = 0; a < num4[i].length; a++) {
                System.out.print(num4[i][a]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Changed: ");
        for(int i = 0; i < num4.length; i++){
            for(int a = 0; a < num4[i].length; a++) {
                if (num4[i][a] >= 0) {
                    System.out.print(num4[i][a] + " ");
                } else if (num4[i][a] < 0) {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("=========Practice12========");
        int[][] num5 = {
                {50, 60, 70, 80},
                {20, 60, 90, 55},
                {89, 70, 65, 50}
        };
        int max5 = num5[0][0];
        for(int i = 0; i < num5.length; i++){
            for(int a = 0; a < num5[i].length; a++){
                if(num5[i][a] > max5){
                    max5 = num5[i][a];
                }
            }
        }
        String name = "Student A";
        System.out.println(name+ ":");
        int summ1 = 0;
        for(int i = 0; i < 4; i++){
            System.out.print(num5[0][i] + " ");
            summ1 += num5[0][i];
        }
        double average = (summ1/4);
        System.out.println();
        System.out.println("Average A: "+average);
        System.out.println();


        String name2 = "Student B";
        System.out.println(name2+ ":");
        int summ2 = 0;
        for(int i = 0; i < 4; i++){
            System.out.print(num5[1][i] + " ");
            summ2 += num5[1][i];
        }
        double average2 = (summ2/4);
        System.out.println();
        System.out.println("Average B: "+average2);

        System.out.println();
        String name3 = "Student C";
        System.out.println(name3+ ":");
        int summ3 = 0;
        for(int i = 0; i < 4; i++){
            System.out.print(num5[2][i] + " ");
            summ3 += num5[2][i];
        }
        double average3 = (summ3/4);
        System.out.println();
        System.out.println("Average B: "+average3);
        System.out.println();
        System.out.println("The Maximum score is: " + max5);
        double allAverage = (average+average2+average3);
        double total = (allAverage/3);
        System.out.println("Overall average: " + total);
        System.out.println();
        System.out.println("=====Challenge A=====");
        int[][] taskA = {
                {50, 60, 70, 80},
                {20, 60, 90, 55},
                {89, 70, 65, 50}
        };
        int sumA = 0;
        for(int i = 0; i < 4; i++){
            System.out.print(taskA[0][i] + " ");
            sumA += taskA[0][i];
        }
        System.out.println("= " + sumA);
        int sumB = 0;
        for(int i = 0; i < 4; i++){
            System.out.print(taskA[1][i] + " ");
            sumB += taskA[1][i];
        }
        System.out.println("= " + sumB);
        int sumC = 0;
        for(int i = 0; i < 4; i++){
            System.out.print(taskA[2][i] + " ");
            sumC += taskA[2][i];
        }
        System.out.println("= " + sumC);
        if(sumA > sumB && sumA > sumC){
            System.out.println("Sum of matrix row 0 is beggest");
        }
        else if(sumB > sumA && sumB > sumC){
            System.out.println("Sum of matrix row 1 is beggest");
        }
        else if(sumC > sumA && sumC > sumB){
            System.out.println("Sum of matrix ROW 2 is beggest");

        }
        System.out.println();
        System.out.println("=====Challenge B=====");
        int[][] matrix4 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] tr = new int[3][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                tr[j][i] = matrix4[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(tr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("=====Challenge C=====");
        int[][] matrix6 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrix5 = {
                {7, 8, 9},
                {10, 11, 12}
        };
        int[][] result = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix6[i][j] + matrix5[i][j];
            }
        }
        System.out.println("Sum of Matrices: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}

