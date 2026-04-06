class MinStack {

    ArrayList<Integer> stack = new ArrayList<>();
    int min = 0;

    public MinStack() {

    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            min = val;
        }else{
            if( min > val){
                min = val;
            }
        }
        stack.add(val);
    }
    
    public void pop() {
        stack.removeLast();
        if(!stack.isEmpty()){
            min = Collections.min(stack);
        }
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int getMin() {
        return min;
    }
}
