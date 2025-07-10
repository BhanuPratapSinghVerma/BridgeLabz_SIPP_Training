package LinkedList;

public class FuntionalityTextEditor {
	import java.util.Scanner;

	class TextState {
	    String content;
	    TextState prev, next;

	    public TextState(String content) {
	        this.content = content;
	        this.prev = null;
	        this.next = null;
	    }
	}

	class TextEditor {
	    TextState head = null, tail = null, current = null;
	    int maxSize = 10;
	    int size = 0;

	    public void performAction(String newText) {
	        TextState newState = new TextState(newText);
	        if (current != null && current.next != null) {
	            current.next = null;
	            tail = current;
	        }
	        newState.prev = current;
	        if (current != null) current.next = newState;
	        current = newState;
	        if (head == null) head = newState;
	        tail = newState;
	        size++;

	        if (size > maxSize) {
	            head = head.next;
	            if (head != null) head.prev = null;
	            size--;
	        }
	    }

	    public void undo() {
	        if (current != null && current.prev != null)
	            current = current.prev;
	        else
	            System.out.println("No more undo available.");
	    }

	    public void redo() {
	        if (current != null && current.next != null)
	            current = current.next;
	        else
	            System.out.println("No more redo available.");
	    }

	    public void showCurrentState() {
	        if (current != null)
	            System.out.println("Current Text: " + current.content);
	        else
	            System.out.println("Editor is empty.");
	    }
	}

	public class FuntionalityTextEditor {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        TextEditor editor = new TextEditor();
	        while (true) {
	            System.out.println("\n1. Type Text\n2. Undo\n3. Redo\n4. Show Current State\n5. Exit");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            if (choice == 5) break;
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter text: ");
	                    String text = sc.nextLine();
	                    editor.performAction(text);
	                    break;
	                case 2:
	                    editor.undo();
	                    break;
	                case 3:
	                    editor.redo();
	                    break;
	                case 4:
	                    editor.showCurrentState();
	                    break;
	            }
	        }
	        sc.close();
	    }
	}
