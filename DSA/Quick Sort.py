#Quick Sort

def quicksort(arr, firstI, lastI):

    if firstI<lastI:
        splitpoint = partition(arr, firstI, lastI)

        quicksort(arr, firstI, splitpoint-1)
        quicksort(arr, splitpoint+1, lastI)

def partition(arr, firstI, lastI):
    pivot = arr[firstI]

    leftmark = firstI+1
    rightmark = lastI

    done = False
    while not done:

        while leftmark <= rightmark and arr[leftmark] <= pivot:
            leftmark +=1

        while rightmark >= leftmark and arr[rightmark] >= pivot:
            rightmark -= 1

        if rightmark < leftmark:
            done = True
        else:
            temp = arr[leftmark]
            arr[leftmark] = arr[rightmark]
            arr[rightmark] = temp


    temp = pivot
    arr[firstI] = arr[rightmark]
    arr[rightmark] = temp

    return rightmark

    
array = [54,26,93,17,77,31,44,55,20]
quicksort(array, 0, len(array)-1)
print(array)
