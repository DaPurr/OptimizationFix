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
 * f(x) = q.x + r
 * 
 * @author alberto trivellato (alberto.trivellato@gmail.com)
 */
public class LinearMultivariateRealFunction extends	QuadraticMultivariateRealFunction implements ConvexMultivariateRealFunction {

	public LinearMultivariateRealFunction(double[] qVector, double r) {
		super(null, qVector, r);
	}
}
