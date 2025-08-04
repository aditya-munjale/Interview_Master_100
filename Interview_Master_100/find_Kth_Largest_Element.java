public class find_Kth_Largest_Element {

    public static int findKthLargest(int arr[],int k){
        int targetIndex = arr.length - k;
        return quickSelect(arr,0,arr.length-1,targetIndex);
    }

    public static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(arr[i] <= pivot && i <= high){
                i++;
            }

            while(arr[j] > pivot && j >= low){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static int quickSelect(int arr[],int low,int high,int k){

        if(low == high){
            return arr[low];
        }

        int pIndex = partition(arr,low,high);

        if(pIndex == k){
            return arr[pIndex];
        }
        else if(pIndex > k){
            return quickSelect(arr,low,pIndex-1,k);
        }

        else if(pIndex < k){
            return quickSelect(arr,pIndex+1,high,k);
        }

        return -1;
        
    }
    

    public static void main(String args[]){
        int arr[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        int result = findKthLargest(arr,k);
        System.out.println(result);
    }
}
