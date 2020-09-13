package DataStructure;

public class InStack {

	private int ptr;
	private int max;
	private int[] stk;

	public class EmptyIntStackException extends RuntimeException {

		public EmptyIntStackException() {
		}
	}

	public class OverflowInStackException extends RuntimeException {

		public OverflowInStackException() {
		}
	}

	public InStack(int capacity) {
		max = capacity;
		ptr = 0;

		try {
			stk = new int[max];

		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
	}

	public int push(int x) throws OverflowInStackException {

		if (ptr >= max) {
			throw new OverflowInStackException();
		} else {
			stk[ptr] = x;
			ptr++;
		}
		return stk[ptr];
	}

	public int pop() throws EmptyIntStackException {

		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}

	public int peek() {

		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}

		return stk[ptr - 1];
	}

	public int indexOf(int x) { // 해당 인덱스가 없을

		for (int i = 0; i < stk.length; i++) {
			if (stk[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		ptr = 0;
	}

	public boolean isFull() {
		return ptr >= max;
	}

	public int capacity() {
		return max;
	}

	public void dump() {

		if(ptr<=0) {
			System.out.println("스택이 비어있습니다.");
		}else {
			
			for (int i = 0; i < ptr; i++) {
				System.out.printf("%d ",stk[i]);
			}
			System.out.println();
		}
		
		
	}
}
