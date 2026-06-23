//package Array Practice;

public class CalculateAverageAge {
    public static void main(String[] args) {
        int[] ages = {10,20,30,40,50};
        int avg;
        int sum=0;
        //int length = ages.length;
        for(int i=0 ; i<ages.length ; i++){
            sum = sum+ages[i];
        }

        avg = sum/ages.length;

        System.out.println(
            "average is : "+ avg
        );
    }
}
