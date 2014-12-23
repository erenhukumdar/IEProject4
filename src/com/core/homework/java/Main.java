package com.core.homework.java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
	
	
		//This is for writing to the file
				PrintWriter writer;
				
				//Open File 'output.txt'
				try {
					writer = new PrintWriter("output.txt", "UTF-8");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				} 


//				switch (methodEmployed){
//					case 1:  //BiSection
//					
//					BisectionMethod(e,l,u,cE);
//					
//					writer.println("Report of BisectionSearch");
//					writer.println("--------------------------------------");
//					writer.println("App. Optimum Soln.=" + String.valueOf(BisectionMethod.getXMean()));
//					writer.println("Abs. Range for Opt. Soln.=[" + String.valueOf(BisectionMethod.getXLower())+"-"+String.valueOf(BisectionMethod.getXUpper())+"]");
//					writer.println("Z=" + String.valueOf(BisectionMethod.getFunctionValue());
//					break;
//					case 2:  //GoldenSection
//					GoldenSectionMethod(e,l,u,cE);
//					
//					writer.println("Report of GoldenSectionSearch");
//					writer.println("--------------------------------------");
//					writer.println("App. Optimum Soln.=" + String.valueOf(GoldenSectionMethod.getXMean()));
//					writer.println("Abs. Range for Opt. Soln.=[" + String.valueOf(GoldenSectionMethod.getXLower())+"-"+String.valueOf(GoldenSectionMethod.getXUpper())+"]");
//					writer.println("Z=" + String.valueOf(GoldenSectionMethod.getFunctionValue());
//					break;
//					case 3: // NewtonMethod
//					
//					break;
//					case 4: // SecantMethod
//					
//					break;
//					}
				
				writer.close();
				
				System.out.println("--------------------------------------");
				System.out.println("RESULTS ARE WRITTEN TO 'output.txt' ");

	
	}

}
