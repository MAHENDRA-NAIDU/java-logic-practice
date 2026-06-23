//                          ************
/* 
public class AllPatterns {
    public static void main(String[] args) {
        int n=12;
        for(int i=0 ; i<n ; i++){
            System.out.print("*");
        }
    }
}
*/


/*

                            *
                            *
                            *
                            *
                            *

*/
/* 
public class AllPatterns {

    public static void main(String[] args) {
        int n=5;
        for(int i=1 ; i<=n ; i++){
            System.out.print("*\n");
        }
        System.out.println();
    }
}
*/

/*
                        square rectangle
                            *****
                            *****
                            *****
                            *****
                            *****
*/
/* 
public class AllPatterns {

    public static void main(String[] args) {
        int n=5;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/

/*
                            Right Triangle Star Pattern
                                *
                                **
                                ***
                                ****
                                *****
*/
/* 
package Patterns;

public class AllPatterns {

    public static void main(String[] args) {
        
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
 */

/*
                            Left Triangle Star Pattern

                                    *
                                   **
                                  ***
                                 ****
                                *****
*/
/* 

public class AllPatterns {

    public static void main(String[] args) {
        int n=5;
        for(int i=1 ; i<=n ; i++){
           for(int j=1 ; j<=n-i ; j++){
            System.out.print(" ");
           }
           for(int j=1 ; j<=i ; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        
    }
}
*/

/*

                         * 
                        * * 
                       * * * 
                      * * * * 
                     * * * * * 
                    * * * * * * 

*/
/* 
public class AllPatterns {

    public static void main(String[] args) {
        int n=6;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/
/*

                    * * * * *
                     * * * *
                      * * *
                       * *
                        *
*/
/* 
public class AllPatterns {

    public static void main(String[] args) {
        int n=5;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i-1 ; j++){
                System.out.print(" ");
            }
            for(int j=i ; j<=n ; j++){
                System.out.print("* ");
            }
            //for(int j=i ; j<n ; j++){
            //    System.out.print("a");
            //}
            System.out.println();
        }
    }
}

*/


/*
                         * 
                        * * 
                       * * * 
                      * * * * 
                     * * * * *  
                      * * * * 
                       * * * 
                        * * 
                         * 
                        

*/

public class AllPatterns {

    public static void main(String[] args) {
        int n=6;
        for(int i=1 ; i<=n ; i++){
            for(int j=i ; j<n ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i-1 ; j++){
                System.out.print(" ");
            }
            for(int j=i ; j<=5 ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}