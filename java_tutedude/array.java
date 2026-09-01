public class array { 
    public static void main(String[] args) {
        int[] arr = new int[5]; // Declaration and initialization of an array of integers with size 5

        // Assigning values to the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int two[]= arr;
        two [2] = 100; // Modifying the value at index 2 of the array

        // Accessing and printing the values of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" element " + arr[i]);
        }
    }
    
}
