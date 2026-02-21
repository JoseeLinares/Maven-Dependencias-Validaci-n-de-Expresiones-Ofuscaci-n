package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

	private Node top; // tope de la pila

	public boolean isEmpty() {
		return top == null;
	}
	
	public void initStack(char value) {
		top = new Node(value, top, 0); 
	}

	public void push(char value) {
	    // Si la pila está vacía, el conteo es 1. Si no, es el conteo actual + 1.
	    int nuevoConteo = (top == null) ? 1 : top.count + 1;
	    top = new Node(value, top, nuevoConteo);
	}
	
	public int size() {
		return top.count;
	}

	public char pop() {
		if (isEmpty()) {
			return '0';
		}
		char value = top.value;
		top = top.next;
		return value;
	}

	public char peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack underflow");
		}
		return top.value;
	}

	
	public Object getNodeInit() {
		if (isEmpty()) {
			return null;
		}
		Node current = top;
		while (current.next != null) {
			current = current.next;
		}
		return current; // Retorna el nodo del fondo
	}
}