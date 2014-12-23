package com.core.homework.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * IE 310 Assignment IV
 * Group Name: 'Noname'
 * GroupID: 4
 * 
 * @author Eren Hukumdar
 * @author Gorkem Karadeniz
 * @author Sertac Onal
 * 
 * Simple file reader class that reads lines 
 */
public class FileReader {

	private boolean isMaximization;
	private double u;
	private double l,error;
	private int methodNumber;
	private double[] coeffs;
	


	public void readFile(String filePath) throws FileNotFoundException
	{
		@SuppressWarnings("resource")
		Scanner fileIn = new Scanner(new File(filePath));

		
		fileIn.nextLine();
		
		String typeLine = fileIn.nextLine();
		isMaximization=(typeLine.equals("max") ? true : false );
		
		fileIn.nextLine();

		
		fileIn.nextLine();
		
		String myLine = fileIn.nextLine();
		String[] rowValues=myLine.split(",");
		coeffs=new double[4];
		for(int i=0;i<rowValues.length;i++)
		{
			coeffs[i]=Double.parseDouble(rowValues[i]);					
		}
		fileIn.nextLine();
		fileIn.nextLine();
		String myIntervalLine = fileIn.nextLine();
		String[] rowValuesInt=myIntervalLine.split(",");
		l=Double.valueOf(rowValuesInt[0]);
		u=Double.valueOf(rowValuesInt[1]);

		
		fileIn.nextLine();
		fileIn.nextLine();
		
		error = Double.valueOf(fileIn.nextLine());
		
		myLine = fileIn.nextLine();
		myLine = fileIn.nextLine();
		myLine = fileIn.nextLine();
		methodNumber=Integer.valueOf(myLine = fileIn.nextLine());
	
	}




}
