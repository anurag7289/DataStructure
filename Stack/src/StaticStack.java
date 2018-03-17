import java.util.NoSuchElementException;

public class StaticStack {
	private int arr[];
	private int top;
	private int initialSize;
	private int length;

	public StaticStack(int initialSize) {
		super();
		this.initialSize = initialSize;
		arr = new int[initialSize];
		top = -1;
		length = 0;
	}

	public boolean isEmpty() {
		return top == -1;

	}

	public boolean isFull() {
		return top == (initialSize - 1);

	}

	public int getSize() {
		return length;

	}

	public void push(int record) {
		if (!isFull()) {
			arr[++top] = record;
			length++;
		} else {
			throw new NoSuchElementException("Overflow Exception");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			length--;
			return arr[top--];
		}
		throw new NoSuchElementException("Underflow Exception");
	}

	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return arr[top];

	}

	public void displayStack() {
		System.out.println("top = "+top);
		System.out.println("length = "+length+"\n ");
		if (length > 0) {
			System.out.println("|-----------------|");
			for (int i = length-1; i>=0; i--) {
				System.out.println("\t"+arr[i]);
				System.out.println("|-----------------|");
			}
		} else {
			System.out.println("Stack Is Empty !!!!");
		}
	System.out.println("\n \n");
	}

}
