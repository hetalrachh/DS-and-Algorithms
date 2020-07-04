//map for storing matching parenthesis pairs
private static final Map<Character, Character> matchingParenMap = new HashMap<>();

//set for storing opening parenthesis
private static final Set<Character> openingParenSet = new HashSet<>();

static {
     matchingParenMap.put(')','(');
     matchingParenMap.put(']','['); 
     matchingParenMap.put('}','{'); 
     openingParenSet.addAll(matchingParenMap.values());  
}

//check if parenthesis match
public static boolean hasMatchingParen(String input) {
  try {
     //stack to store opening parenthesis
     Stack<Character> parenStack = new Stack<>();
     
     for(int i=0; i< input.length(); i++) {
        char ch = input.charAt(i);

        //if an opening parenthesis then push to the stack
        if(openingParenSet.contains(ch)) {
             parenStack.push(ch);
        } 

        //for closing parenthesis
        if(matchingParenMap.containsKey(ch)) {
             Character lastParen = parenStack.pop();
             if(lastParen != matchingParenMap.get(ch)) {
                return false;
             } 
        }
     }

     //returns true if the stack is empty else false
     return parenStack.isEmpty();
   }
     catch(StackOverflowException s) {}
     catch(StackUnderflowException s1) {}
     return false;
}


//method to check if the stack is empty
public boolean isEmpty() {
   return size==0;
}

//method to check if the stack is full
public boolean isFull() {
   return size==MAX_SIZE;
}

//method to get the size of the stack
public int getSize() {
   return size;
}