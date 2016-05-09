package br.com.sestaro.b2w.algorithm;

import br.com.sestaro.b2w.exception.NullTriangleException;
import br.com.sestaro.b2w.model.Triangle;

/**
 * Class that implements the algorithm to solve the hell triangle problem
 * 
 * @author davidson.sestaro
 */
public class PathFinder {
    
    private Triangle triangle;
    
    public PathFinder(Triangle input) {
	if(input == null) {
	    throw new NullTriangleException();
	}
	
	this.triangle = input;
    }
    
    public final long getBiggestSum() {
	long sum = triangle.getFristPosition();
	
	int col = 0;
	
	for(int i = 0; i < triangle.getTriangleSize() - 1; i++) {
	    sum += triangle.getBiggestNeighbor(i, col);
	    
	    col = triangle.getColBiggestNeighbor(i, col);
	}
	
	return sum;
    }
}
