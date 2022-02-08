public class StackOfIntegers {
    private int elements[] = new int[0]; //var-name = new type [size];
    private int size = this.elements.length; //length property used to calculate length of array

    public StackOfIntegers(){ //constructs empty stack with a default capacity of 16
        this.elements = new int[20];
    }

    public StackOfIntegers(int capacity){ //constructs stack with capicty
        this.elements = new int[capacity];
    }

    public boolean empty(){ //returns true if stack is empty
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){ //returns the integer at the top of the stack without removing it from the stack,
        int data;
        data = elements[this.size-1];
        return data;
    }

    public void push(int data){ //stores integer to the top of the stack
        elements[this.size] = data;
        this.size++; //top increments
    }

    public int pop(){ //removes integer at the top of the stack and returns in
        int data;
        this.size--; 
        data = elements[this.size];
        elements[this.size] = 0;
        return data;
    }

    public int getSize(){ //returns the number of elements in the stack
        return this.size;
     }

}
