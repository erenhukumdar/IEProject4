package com.core.homework.java;
import java.lang.Math;


public class BisectionMethod {
	
	// UNWRITTEN
	
//	private double x, xnew;   // value of iterates
//	private double delta;     // amount added to get next iterate
//	private double error;     // error estimate
//	private double tol;       // tolerance (max error)
//	private double l, u;    // interval values lower and upper boundary
//	private double[] coeffs;
//	public double getX() {
//		return x;
//	}
//	public void setX(double x) {
//		this.x = x;
//	}
//	public double getXnew() {
//		return xnew;
//	}
//	public void setXnew(double xnew) {
//		this.xnew = xnew;
//	}
//	public double getDelta() {
//		return delta;
//	}
//	public void setDelta(double delta) {
//		this.delta = delta;
//	}
//	public double getError() {
//		return error;
//	}
//	public void setError(double error) {
//		this.error = error;
//	}
//	public double getTol() {
//		return tol;
//	}
//	public void setTol(double tol) {
//		this.tol = tol;
//	}
//	
//	public double getL() {
//		return l;
//	}
//	public void setL(double l) {
//		this.l = l;
//	}
//	public double getU() {
//		return u;
//	}
//	public void setU(double u) {
//		this.u = u;
//	}
//	
//	
//	
//	public double[] getCoeffs() {
//		return coeffs;
//	}
//	public void setCoeffs(double[] coeffs) {
//		this.coeffs = coeffs;
//	}
//	
//	//Code begins from here the part above is just for getters setters and necessary variable declaration 
//
//	public void NewtonMethod(int problemType,double[] coeffs, double l, double u,double tol)
//	{
//		setTol(tol);
//		setCoeffs(coeffs);
//		setL(l);
//		setU(u);
//		
//	}
//	
//	
//	//_______________________________________ Preparation operations ____________________________________________
//	public double getFunction(double x)
//	{
//		double[] myCoeffs=getCoeffs();
//		//the code below just calculates the value of the function f(x)=x^3*c0 +x^2*c1 +x^1*c2 + c3
//		//coeff indexes are constant since the equation format in the question is static
//		return  myCoeffs[3]+(myCoeffs[2]*x)+(Math.pow(x, 2)*coeffs[1])+(Math.pow(x, 3)*coeffs[0]);
//		
//	}
//	public double getFunctionDerivative(double x)
//	{
//		double[] myCoeffs=getCoeffs();
//		//the code below just calculates the derivative of the function f'(x)=3*x^2*c0 +2*x*c1 +c2 
//		//coeff indexes are constant since the equation format in the question is static
//		return  (myCoeffs[2])+(2*x*coeffs[1])+(3*Math.pow(x, 2)*coeffs[0]);
//		
//	}
//	public double getFunctionSecondDerivative(double x)
//	{
//		double[] myCoeffs=getCoeffs();
//		//the code below just calculates the derivative of the function f'(x)=6*x*c0 +2*c1
//		//coeff indexes are constant since the equation format in the question is static
//		return  (2*coeffs[1])+(6*x*coeffs[0]);
//		
//	}
//	
//	public double getInitialValueOfX()
//	{
//		
//		return ((getU()+getL())/2);
//	}
//	
//	
//	public double performNewtonMethod()
//	{
//		//gets the initial value of x (from lecture notes if interval is given then the x initial can be easily calculated)
//		x=getInitialValueOfX();
//		int iterationCount=0;
//		//compares delta tolerance before that to calculate delta must iterate once. thus i used do while instead of while do
//	    do{
//			//calculates new x for the iteration
//			double xNew = x- (getFunctionDerivative(x)/getFunctionSecondDerivative(x));
//			System.out.println (" # of Iteration: " +String.valueOf(iterationCount)+"------->" + String.valueOf(xNew));
//			iterationCount++;
//			//calculates delta
//			delta=Math.abs((x-xNew));
//			//prepares x for new iteration
//			x = xnew;
//	    }while ( delta > tol);
//	    
//	    //returns Newton's method result
//		return x;
//	}
}
