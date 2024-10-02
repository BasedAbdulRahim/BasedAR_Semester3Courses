Zuhair Zubair - 300378419
Based Abdul Rahim - 300379200

TryStack1 - we observed a stack that was n+=2 from 0-100 then it flipped, array stack is very timecomplex…
	    When doing Try stack 1 we observed the class creating an array that would count up by 2 to 100 	    and then reverse the order and print it to the screen, due to needing to make an entire array for the 	    stack, this was fairly more time complex than its future counterpart

Linked Stack - Simple implementation of pop, top, push … 
	      This was meant to simply implement the pop stack and push methods, to do pop() we made the header 	      header. next while storing the value of the current header, push we implemented a way to create a new 	      header variable and make it point to the current head, And top returned the current head value
	       


TryStack2 - changed ArrayStack<>(n) to LinkedStaack<Integer>() to avoid serial error Integer is in brackets
	    and more importantly to make the class point to Linked Stack and not Array Stack 

Brackets Balance - We had to develop a method (IsBalanced) that checks if an input String is balanced, which means 	that for every open bracket there is a closed bracket. We already did something similar to this during the 	lecture, so we already had an idea about what to do. First, Convert the String to an array of characters to 	easily use the stack operations with the individual characters in the String. Then check each character to 	see if there is a bracket. Then if there is an open bracket, push it to the stack. If there is a closed 	bracket, compare it to the top element of the stack and if the closed bracket matches the top element, pop t	he stack. If it doesn't match or if the stack is empty, return false. In the end, if the stack is empty, 	this means that all of the brackets have been matched. When coding this, we had some issues with trying to 	use the buffer array since we were unaware on how to use a for loop on characters and that we can turn a 	String into an array of characters.

