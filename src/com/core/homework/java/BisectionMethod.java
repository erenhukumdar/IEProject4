package com.core.homework.java;
import java.lang.Math;


public class BisectionMethod {
	
	//Variables of steps
	private double XMean,XUpper,XLower,UnCertanity;
	private double[] coEffs;
	
	

	public BisectionMethod(double e,double l, double u,double [] cE)
	{
		
		//Step 0
		setUnCertanity(e);  
		setCoEffs(cE);
		
		// Step 1
		setXLower(l);  
		setXUpper(u);
		
		//Step 3 which is stop condition if fails then 
		//go step5 otherwise iterate step2
		while (getXUpper()-getXLower() > getUnCertanity()) 
		{
		//Step 2
		setXMean(calculateXm(getXUpper(),getXLower())); 
		//Step 4
		if (calculateFirstDerivative(getXMean(),getCoEffs()) > 0)
			{
			setXLower(getXMean());	
			}else
			{
			setXUpper(getXMean());	
			}
		}
		//Step5
		//RETURN RESULTS
		
		System.out.println("Report of BisectionSearch");
		System.out.println("App. Optimum Soln.=" + String.valueOf(getXMean()));
		System.out.println("Abs. Range for Opt. Soln.=[" + String.valueOf(getXLower())+"-"+String.valueOf(getXUpper())+"]");
		System.out.println("Z=" + String.valueOf(calculateFunction(getXMean(),getCoEffs())));

	
		
	}
	
	//_______________________________________ Preparation operations ____________________________________________	
	public double calculateXm(double Xu,double Xl)
	{
		return (Xu+Xl)/2;	
	}
	public double calculateFunction(double XMean,double[] coEffs)
	{
		//the code below just calculates the value of the function f(x)=x^3*c0 +x^2*c1 +x^1*c2 + c3
		//coeff indexes are constant since the equation format in the question is static
		return  coEffs[3]+(coEffs[2]*XMean)+(Math.pow(XMean, 2)*coEffs[1])+(Math.pow(XMean, 3)*coEffs[0]);
		
	}
	public double calculateFirstDerivative(double XMean,double[] coEffs)
	{
		//the code below just calculates the derivative of the function f'(x)=3*x^2*c0 +2*x*c1 +c2 
		//coeff indexes are constant since the equation format in the question is static
		return  (coEffs[2])+(2*XMean*coEffs[1])+(3*Math.pow(XMean, 2)*coEffs[0]);
		
	}

	public double getXMean() {
		return XMean;
	}

	public void setXMean(double xMean) {
		XMean = xMean;
	}

	public double getXUpper() {
		return XUpper;
	}

	public void setXUpper(double xUpper) {
		XUpper = xUpper;
	}

	public double getXLower() {
		return XLower;
	}

	public void setXLower(double xLower) {
		XLower = xLower;
	}

	public double getUnCertanity() {
		return UnCertanity;
	}

	public void setUnCertanity(double unCertanity) {
		UnCertanity = unCertanity;
	}

	public double[] getCoEffs() {
		return coEffs;
	}

	public void setCoEffs(double[] coEffs) {
		this.coEffs = coEffs;
	}
	

}
