//Suppose there is a list of numbers (stored in an array).
//How do you find the number of element pairs of which sum is greater than or equal a given number?
// eg. list  {3,6,2,5,9} has 5 number pairs (3,9), (6,5), (6, 9), (2, 9), {5, 9} greater than or equal 10.



10 - 2 = 8
binary search (8)
8 onwards, counter + length
{2,3,5,6,9}


//input : int[], int k 
//output :int k 

public solution {
    public int sol(int[] arr, int k) {
        int counter = 0;
        int i = 0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        while (i != j) {
            if (arr[i] + arr[j] >= k) {
                counter += j - i;
                j--;
            }
            else {
                i++;
            }
        }
        return counter;
    }
}


{3,6,2,5,9}
{2,3,5,6,9}
i = 1
j = 3
counter += 4