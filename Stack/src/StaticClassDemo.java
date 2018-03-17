
public class StaticClassDemo {
public static void main(String[] args) {
	StaticStack staticStack=new StaticStack(5);
	staticStack.push(11);
	staticStack.displayStack();
	staticStack.push(22);
	staticStack.displayStack();
	staticStack.push(33);
	staticStack.displayStack();
	staticStack.push(44);
	staticStack.displayStack();
	staticStack.push(55);
	staticStack.displayStack();
	//staticStack.push(58);
	staticStack.pop();
	staticStack.displayStack();
	staticStack.pop();
	staticStack.displayStack();
	staticStack.pop();
	staticStack.displayStack();
	staticStack.pop();
	staticStack.displayStack();
	staticStack.pop();
	staticStack.displayStack();
	//staticStack.pop();
	

}
}
