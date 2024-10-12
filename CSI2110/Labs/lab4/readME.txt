Abdul Based Abdul Rahim - 300379200
Zuhair Zubair - 300378419

Priority Queue Methods:
Size() - returns the length of the prioity queue by returning the positiona of the tail + 1

isEmpty() - determines if the position of the tail is at -1 (before the first index of the array)

insert() - inserts a new Entry at the location of the tail and then increases the tail value by 1, if the array is full then thows IllegalArgumentExcepetion("Array is full")

min() - returns the first position of the sorted HeapPriorityQueue

removeMin() - removes the first positon of the sorted HeapPriorityQueue then the Heap downheaps.

Heap methods:
upheap(): The upheap method runs when an element is added at the end of the heap. This method is done using recursion to ensure that the element compares with its parent and compares its key and swaps when needed.

downheap(): The downHeap method runs when the min is removed and the last element replaces it. This method is also done using recursion to ensure that the element compares with its children and swaps with the lowest only when the lowest is lower than the current key.

parent(): The parent method identifies the index of the parent entry in the array when the index of the current node is that stores the key values.

swap(): The swap method swaps two nodes given their indexes.