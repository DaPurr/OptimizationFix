/*
 * Copyright 2011-2016 joptimizer.com
 *
 * This work is licensed under the Creative Commons Attribution-NoDerivatives 4.0 
 * International License. To view a copy of this license, visit 
 *
 *        http://creativecommons.org/licenses/by-nd/4.0/ 
 *
 * or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */
package com.joptimizer.functions;


/**
 * @author alberto trivellato (alberto.trivellato@gmail.com)
 */
public interface  TwiceDifferentiableMultivariateRealFunction {

	/**
	 * Evaluation of the function at point X.
	 */
	public double value(double[] X);
	
	/**
	 * Function gradient at point X.
	 */
	public double[] gradient(double[] X);
	
	/**
	 * Function hessian at point X.
	 */
	public double[][] hessian(double[] X);
	
	/**
	 * Dimension of the function argument.
	 */
	public int getDim();
}
