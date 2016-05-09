package br.com.sestaro.b2w.model;

import br.com.sestaro.b2w.exception.NullTriangleException;

/**
 * Class that contain information about the triangle 
 * 
 * @author davidson.sestaro
 */
public class Triangle {
    private int[][] triangle;

    public Triangle(final int[][] input) {
	if(input == null) {
	    throw new NullTriangleException();
	}
	
	this.triangle = input;
    }
    
    public final int getFristPosition() {
	return triangle[0][0];
    }
    
    protected final int getLeftNeighbor(final int i, final int j) {
	return triangle[i + 1][j];
    }
    
    protected final int getRightNeighbor(final int i, final int j) {
	return triangle[i + 1][j + 1];
    }
    
    public final int getBiggestNeighbor(final int i, final int j) {
	return Math.max(getLeftNeighbor(i, j), getRightNeighbor(i, j));
    }
    
    public final int getTriangleSize() {
	return this.triangle.length;
    }

    /**
     * Find the column position of the biggest neighbor.
     * 
     * @param i	- The row of the current position
     * @param j - The column of the current position
     * @return	- The column of the biggest neighbor
     */
    public final int getColBiggestNeighbor(final int i, final int j) {
	if(getLeftNeighbor(i, j) > getRightNeighbor(i, j)) {
	    return j;
	} else {
	    return j+1;
	}
    }
}
