import java.util.Scanner;

class Stack<Item> {
    private Node top;
    private int N;
    private class Node{
        Item item;
        Node next;
    }
    public int stackSize(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public Node push(Item i){
        Node add= top;    
        top= new Node();
        top.item=i;
        top.next=add;
        N++;
        return top;
    }
    public Node pop(){
        Node rem= top;
        top=top.next;
        N--;
        return rem;
    }
    public Node getTop(){
        return top;
    }
    public Item getTopItem(){
        return top.item;
    }
    public void iterator(){
        for(Node n=top;n!=null;n=n.next){
            System.out.println(n.item);
        }
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(checkStack(sc.next()));
        //System.out.println(args[0]);
    }
    public static boolean checkStack(String input){
        Stack<Character> stack1= new Stack<Character>();
        for(int i=0; i< input.length();i++){
            if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='[')
                stack1.push(input.charAt(i));
            else if(input.charAt(i)==')'){
                if(stack1.getTopItem()=='(')
                    stack1.pop();
			}
            else if(input.charAt(i)=='}'){
                if(stack1.getTopItem()=='{')
                    stack1.pop();
			}
            else if(input.charAt(i)==']'){
                if(stack1.getTopItem()=='[')
                    stack1.pop();
			}
        }
        stack1.iterator();
        return stack1.isEmpty();
    }
}