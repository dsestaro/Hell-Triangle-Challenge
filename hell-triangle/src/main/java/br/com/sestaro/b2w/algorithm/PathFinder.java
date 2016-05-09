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
    
    /**
     * Given a triangule with, the algorithm returns the maximum sum from top to bottom, following
     * the rules:
     * - An element A[n][m] can only be summed with one of the two nearest elements A[n+1][m] and A[n+1][m+1].
     * - Each row has one more element than the previews row.
     * 
     * 
     * @return - the biggest sum.
     */
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
