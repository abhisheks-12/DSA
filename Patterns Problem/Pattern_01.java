public class Pattern_01 {
    public static void main(String[]args){

        // 1 .
        /*

            ***
            ***
            ***

         */
        int n  = 3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

        //2.
        /*

                111
                222
                333

         */

         for(int i=1; i<=3; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i);
            }
            System.out.println("\n");
         }
    }
}
