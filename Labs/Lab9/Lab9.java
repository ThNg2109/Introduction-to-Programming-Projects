package Labs.Lab9;

public class Lab9 {

    public static void main(String[] args) {
        int [][] addTo10Input = {
                {  6,  3,  2,  0,  4},
                { 34, 53,  0, 23,  1},
                {  0, 23, 54, 11,  7}
        };

        double [][] findAvgInput = {
                {  5, 4.5,  6.8},
                {  6,  0,  3.4},
                { 7,  8.4,  2.3}
        };

        double [][] findAvgInputLarge = {
                { 6.7,  23.8,  0,  5.9,  12.8,  45.7},
                {  0,  36.8,  13.5,  6.7,  54.9,  67.4},
                {  37.4,  2.5,  39.8,  0,  2.4,  43.6},
                {  44.6,  76.5,  4.5, 2.4,  0, 54.6},
                {  5.4,  76.3,  6.5, 28.5,  54.7,  0},
                {  19.4,  0,  5.3,  65.4,  93.5,  3.5}
        };

       addTo10 (addTo10Input);
        System.out.println();
        findAverage (findAvgInput);
        System.out.println();
        findAverage (findAvgInputLarge);
        }

        //modify element that equals to 0 to make sum of each row is 10
    public static void addTo10 (int [][] array) {
        // find the element that equals to 0
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if (array[i][j] == 0){
                    // loop the array row again to sum the total of the row
                    int total = 0;
                    for(int j1 = 0; j1 < array[i].length; j1++){
                        total = total + array[i][j1];
                    }
                    array[i][j] = 10 - total;
                }
            }
        }

    }

    //modify the 0 values found in the array to be the larger of the row or column average
    public static void findAverage (double [][] array) {
        //find the 0 value
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == 0){
                    double avarageRow = 0.0;
                    double avarageColumn = 0.0;
                    // loop the array column again to get the average column
                    for(int i1 = 0; i1 < array.length; i1++){
                        avarageColumn = avarageColumn + array[i1][j];
                    }
                    avarageColumn = avarageColumn / array.length;
                    // loop the array row again to get the average row
                    for(int j1 = 0; j1 < array[i].length; j1++){
                        avarageRow = avarageRow + array[i][j1];
                    }
                    avarageRow = avarageRow / array[i].length;
                    //assign the value of larger average to the 0 value found
                    if(avarageColumn > avarageRow){
                        array[i][j] = avarageColumn;
                    }
                    else {
                        array[i][j] = avarageRow;
                    }
                }
            }
        }
    }


}