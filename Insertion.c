#include<stdio.h>

int main(){

    int arr[]={2,40,1,5,3};
     int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 1; i < n; i++)
    {
        int temp=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
        
    }
    printf("Sorted array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
