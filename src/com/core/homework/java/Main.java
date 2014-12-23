package com.core.homework.java;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader myReader=new FileReader();
		try {
			myReader.readFile("D:/test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
