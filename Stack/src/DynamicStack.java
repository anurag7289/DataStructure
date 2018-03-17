import java.util.NoSuchElementException;

public class DynamicStack {
	private int arr[];
	private int top;
	private int initialSize;
	private int length;
	private int DEFAULT_INIT_SIZE=5;

	public DynamicStack() {
		super();
		initialSize = DEFAULT_INIT_SIZE;
		arr = new int[initialSize];
		top = -1;
		length = 0;
	}

	public boolean isEmpty() {
		return top == -1;

	}

	private boolean isFull() {
		return top == (initialSize - 1);

	}

	public int getSize() {
		return length;

	}

	public void push(int record) {
		if (isFull()) {
			expand();
		}
		arr[++top] = record;
		length++;
	}

	public int pop() {
		if (!isEmpty()) {
			int popElement= arr[top];
			arr[top]=0;
			--length;
			--top;
			srink();
			return popElement;
		}
		
		throw new NoSuchElementException("Underflow Exception");
	}

	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return arr[top];

	}
	
	private void expand() {
		int bufferIncrease=(initialSize*2)/3;
		if(bufferIncrease==0) {
			bufferIncrease=2;
		}
		System.out.println("--------------------------------------------------------------Expand");
		int expandedSize=initialSize+bufferIncrease;
		System.out.println("bufferIncrease = "+bufferIncrease);
		int expandArr[]=new int[expandedSize];
		for(int i=0;i<length;i++) {
			expandArr[i]=arr[i];
		}
		arr=expandArr;
		initialSize=expandedSize;
	}
	
	private void srink() {
		if(initialSize>DEFAULT_INIT_SIZE) {
			int emptySpace=initialSize-length;
			int twoByThree=(initialSize*2)/3;
			System.out.println("emptySpace = "+emptySpace);
			System.out.println("Buffer Srink = "+twoByThree);
			if(emptySpace>twoByThree){
				int srinkedSize=initialSize-twoByThree;
				System.out.println("srinkedSize = "+srinkedSize+"\t DEFAULT_INIT_SIZE \t"+DEFAULT_INIT_SIZE);
				System.out.println(srinkedSize>DEFAULT_INIT_SIZE);
				if(srinkedSize>DEFAULT_INIT_SIZE) {
					System.out.println("--------------------------------------------------------------Srink");
					int srinkArr[]=new int[srinkedSize];
					for(int i=0;i<length;i++) {
						srinkArr[i]=arr[i];
						System.out.println("COPY");
					}
					arr=srinkArr;
					initialSize=srinkedSize;
				}
			}
			if( top==0 && initialSize>DEFAULT_INIT_SIZE) {
				System.out.println("--------------------------------------------------------------Srink~2");
				int srinkArr[]=new int[DEFAULT_INIT_SIZE];
				for(int i=0;i<length;i++) {
					srinkArr[i]=arr[i];
					System.out.println("COPY");
				}
				arr=srinkArr;
				initialSize=DEFAULT_INIT_SIZE;
			}
		}
	}

	public void displayStack() {
		System.out.println("initialSize = "+initialSize+"\t ~\t"+ arr.length);
		System.out.println("top = "+top);
		System.out.println("length = "+length+"\n ");
		if (length > 0) {
			System.out.println("|-----------------|");
			for (int i = arr.length-1; i>=0; i--) {
				System.out.println("\t"+arr[i]);
				System.out.println("|-----------------|");
			}
		} else {
			System.out.println("Stack Is Empty !!!!");
		}
	System.out.println("\n \n");
	}

}
