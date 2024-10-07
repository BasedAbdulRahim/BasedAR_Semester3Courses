Zuhair Zubair - 300378419
Abdul Based Abdul Rahim - 300379200

Part I:
LinkedSequence - a class which uses the methods : add, remove, set, get, and checkIndex. These methodss are self     explanatory where add will add an element to the sequence, remove will remove an element from the sequence,     set will replace an element in a specific location with another element, get will  return the element at a     certain postion, and checkIndex will check if a given value is in the specific index.
    positionAtIndex gets the value/position of an index i and returns it. To do this, list traversal is needed until the needed index. If the index is not in the sequence, an exception is thrown. 
    Oppositly indexAtPosition is a postion and returns the index of that postion. For this, list traversal is also needed until the given position.
    get will return an element at a given index. For this, we used positionAtIndex to find a position at an index and got the element.
    set will return an element at a given index and replace it. For this, we found the position at the given index. Then we just saved the current element, replaced the element at the position, then returned the saved element.
    The add method adds a node to the sequence at an index. If the index is the same as the size, the method acts like addLast and if not the addBefore method is used to put it before the current position at the index.
    remove removes and returns the element at the given index, shifting all subsequentelements in the list one position closer to the front. To do this, the remove method in the positionalLinkedList class was used.
Part II:
SequenceAlgs - a class where different algorithms are made for sequences. These algorithms check if the sequence is a Palindrome or reverse the order.
     isPalindrome is a method which determines if a list is the same forward as it is backwards, to do this we used a for loop of O(n) time to check the first and last elements of the list, if not the same returns false, if all attempts are the same returns true
     inplaceReverse is a method which reverses the order of a list in O(n) time. to do thise we created a temporary variable and a for loop to go through the list by storing the first element into the temp and then do the same for the final element and swap their values until the entire list is changed