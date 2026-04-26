// Maximum Element in Array

array = [12,6,7,2,19]
output = 19

//Program
//If you want you can use Scanner for input

// Approch 1 : Using loop
public class Max Element{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); // if you want to read from the user
    int n = 5; // if you want to declare directly 
    int arr[] = new int[n];
    for(int i=1;i<n;i++){
      arr[i] = s.nextInt();
    }
    int max = arr[0];
    for (int i=1;i<n;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    System.out.print(max);
  }
}

// Approch 1 : Using function

public class MaxElement{

public static int maxElement(int n, int[] arr){
int max = arr[0];
for (int i=0;i<n;i++){
  if(arr[i]> max){
    max = arr[i];
  }
}
return max;
}
public static void main(String[] args){
  int n = 5;
  int arr[] = {12,6,7,2,19};
  int result = maxElement(n,arr)
  System.out.println(result);
}
}

// Approch 3 : Using Sort method
public class Max Element{
  public static void main(String[] args){
    import java.util.Arrays;
    int arr[] = { 12,3,9,24,6,90,67}
    Arrays.sort(arr); // After sorting the array will be {3,6,9,12,24,67,90}
    // Print the last element
    int n= arr.length;
    System.out.println(arr[n-1]);
  }
}


