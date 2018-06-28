package com.classpath.behavior.memento;

import java.util.Stack;

public class MementoClient {

	public static void main(String[] args) {

		FileWriterCaretaker caretaker = new FileWriterCaretaker();
		Stack<Object> stack = new Stack<>();

		FileWriterOriginator fileWriter = new FileWriterOriginator("data.txt");
		fileWriter.write("First Set of Data\n");
		System.out.println(fileWriter + "\n\n");

		// lets save the file
		Object currentState = caretaker.save(fileWriter);
		stack.push(currentState);
		// now write something else
		fileWriter.write("Second Set of Data\n");

		// checking file contents
		System.out.println(fileWriter + "\n\n");

		// lets save the file
		currentState = caretaker.save(fileWriter);
		stack.push(currentState);

		// third set of changes
		fileWriter.write("Third Set of Data\n");
		System.out.println(fileWriter + "\n\n");

		// lets save the file
		currentState = caretaker.save(fileWriter);
		stack.push(currentState);

		// fourth set of changes
		fileWriter.write("Fourth Set of Data\n");
		System.out.println(fileWriter + "\n\n");

		// lets save the file
		currentState = caretaker.save(fileWriter);
		stack.push(currentState);

		// lets undo to last save
		stack.pop();
		stack.pop();

		stack.forEach((obj)-> {System.out.println(((FileWriterOriginator.Memento)obj));});
	}

}
