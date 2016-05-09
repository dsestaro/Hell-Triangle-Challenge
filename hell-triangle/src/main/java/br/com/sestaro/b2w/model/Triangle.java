package br.com.sestaro.b2w.model;

import br.com.sestaro.b2w.exception.NullTriangleException;

/**
 * Class that contain information about the triangle 
 * 
 * @author davidson.sestaro
 */
public class Triangle {
    private int[][] triangle;

    public Triangle(int[][] input) {
	if(input == null) {
	    throw new NullTriangleException();
	}
	
	this.triangle = input;
    }
    
    public final int getFristPosition() {
	return triangle[0][0];
    }
    
    protected final int getLeftNeighbor(int i, int j) {
	return triangle[i + 1][j];
    }
    
    protected final int getRightNeighbor(int i, int j) {
	return triangle[i + 1][j + 1];
    }
    
    public final int getBiggestNeighbor(int i, int j) {
	return Math.max(getLeftNeighbor(i, j), getRightNeighbor(i, j));
    }
    
    public final int getTriangleSize() {
	return this.triangle.length;
    }

    public final int getColBiggestNeighbor(int i, int j) {
	if(getLeftNeighbor(i, j) > getRightNeighbor(i, j)) {
	    return j;
	} else {
	    return j+1;
	}
    }
}
