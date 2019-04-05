package com.nish.commonmanager;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CommonManagerProcessor {
	Node root;
	
	public void addEmployeeNode() {
		
	}
	
	private Node addEmployeeRecusrively(Node current, String empName) {
		if(current == null) {
			return new Node(empName);
		}
	}
	public String commonManagerIs(int employeeCount, Scanner in) {
		List<String> inputList = new LinkedList<String>();
		while (in.hasNextLine()) {
			if (!in.nextLine().isEmpty()) {
				inputList.add(in.nextLine());
			} else {
				break;
			}
		}

		return null;
	}
}
