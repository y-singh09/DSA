def insertionsort(arr):
    for i in range(1,len(arr)):
        j=i
        while(arr[j-1]>arr[j] and j>0):
            arr[j-1],arr[j]=arr[j],arr[j-1]
            j-=1
def mergesort(a):
    if(len(a)>1):
        mid=len(a)//2
        left=a[:mid]
        right=a[mid:]

        mergesort(left)
        mergesort(right)
        i=j=k=0
        while i<len(left) and j<len(right):
            if(left[i]<right[j]):
                a[k]=left[i]
                i+=1
            else:
                a[k]=right[j]
                j+=1
            k+=1
        while(i<len(left)):
            a[k]=left[i]
            i+=1
            k+=1
        while(j<len(right)):
            a[k]=right[j]
            j+=1
            k+=1

arr=[2,6,5,1,3,4]
print("Insertion Sorted array:")
insertionsort(arr)
print(arr)
a=[2,6,5,1,3,4]

print("Merge Sorted array:")
mergesort(a)
print(a)