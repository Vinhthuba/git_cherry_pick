import java.util.Scanner;

class task_1
{
    public static void main(String[] args)
    {
        int[][] originalArray = {
            {10, 20, 30},
            {40, 50, 60}
        };
        
        // Transpose the array and print directly
        System.out.println("After changing the rows and columns of the said array:");
        for (int i = 0; i < originalArray[0].length; i++) {
            for (int j = 0; j < originalArray.length; j++) {
                System.out.print(originalArray[j][i] + " ");
            }
            System.out.println();
        }
    }

    

}
