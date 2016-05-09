package br.com.sestaro.b2w.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.b2w.exception.NullTriangleException;

public class TriangleTest {
    @Test
    public final void constructorTest() {
	int[][] triangle = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	new Triangle(triangle);
    }
    
    @Test(expected = NullTriangleException.class)
    public final void incorrectConstructorTest() {
	int[][] triangle = null;
	
	new Triangle(triangle);
    }
    
    @Test
    public final void getFristPositionTest() {
	int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	Triangle triangle = new Triangle(triangleConfig);
	
	assertEquals(6, triangle.getFristPosition());
    }
    
    @Test
    public final void getLeftNeighborTest() {
	int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	Triangle triangle = new Triangle(triangleConfig);
	
	assertEquals(7, triangle.getLeftNeighbor(1, 1));
    }
    
    @Test
    public final void getRightNeighborTest() {
	int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	Triangle triangle = new Triangle(triangleConfig);
	
	assertEquals(1, triangle.getLeftNeighbor(1, 2));
    }
    
    @Test
    public final void getBiggestNeighborTest() {
	int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	Triangle triangle = new Triangle(triangleConfig);
	
	assertEquals(8, triangle.getBiggestNeighbor(2, 1));
    }
    
    @Test
    public final void getTriangleSizeTest() {
	int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	Triangle triangle = new Triangle(triangleConfig);
	
	assertEquals(4, triangle.getTriangleSize());
    }
    
    @Test
    public final void getColBiggestNeighborTest() {
	int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	Triangle triangle = new Triangle(triangleConfig);
	
	assertEquals(1, triangle.getColBiggestNeighbor(0, 0));
    }
}
