public class Pattern {

    public static void hollowRect(int totRows, int totCols){

        // row
        for(int i = 1; i <= totRows; i++){
            // column
            for(int j = 1; j <= totCols; j++){
                // (i,j)
                if( i == 1 || i == totRows || j == 1 || j == totCols ){
                    System.out.print("*" + " ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }

    public static void invRoHalPy(int totRows){
        //rows
        for(int i = 1; i <= totRows; i++){

            for(int j = 1; j<= totRows - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Inverted Half Pyramid With Numbers
    public static void invHaPWNums(int n){
        for (int i = 1; i<= n; i++){
            for(int j = 1; j<= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTri(int n){
        int counter = 1;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOne(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <=i; j++){
                if((((i+j) % 2) ==0)){
                    System.out.print(1 + " ");
                } else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterFly(int n){
        for(int i = 1; i<= n; i++){
            // star - i
            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }

            // space - 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print("  ");
            }

            // star -i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = n; i>= 1; i--){
                        // star - i
            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }

            // space - 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print("  ");
            }

            // star -i
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        
        // Print Hollow Rectangle
        // hollowRect(4,5);
        // invRoHalPy(5);
        //invHaPWNums(5);
        //floydsTri(5);
        //zeroOne(5);
        //butterFly(4);

    }
}
