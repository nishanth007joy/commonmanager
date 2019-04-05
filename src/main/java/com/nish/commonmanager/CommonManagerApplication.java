package com.nish.commonmanager;

import java.util.Scanner;

public class CommonManagerApplication {
	public static void main(String[] args) {
		CommonManagerProcessor commonManagerProcessor = new CommonManagerProcessor();
		Scanner in = new Scanner(System.in);
		commonManagerProcessor.commonManagerIs(Integer.parseInt(in.nextLine()), in);
	}
}
