
public class task_4 {
  public static void main (String[] args)
  {
    int[] arr = {1,23,2,3,53,10};
    inputArr(arr);
  }
  public static void inputArr(int[] arr)
  {
    int first, second, third;
    first = second = third = arr[0];
    for(int i = 1; i < arr.length; i++)
    {
       if(arr[i] > first)
       {
       
        
        third = second;
        second = first ;
        first = arr[i];
       
       
       }
       else if(arr[i] > second){
        third = second;
          second = arr[i];
          
       }
       else if(arr[i] > third){
         third = arr[i];   
    }

    }

    System.out.println(third + " " + second + " " +first);
  }
}
