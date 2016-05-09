package br.com.sestaro.b2w.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.sestaro.b2w.exception.NullTriangleException;
import br.com.sestaro.b2w.model.Triangle;

public class PathFinderTest {

    @Test
    public final void constructorTest() {
	int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	Triangle triangle = new Triangle(triangleConfig);
	
	new PathFinder(triangle);
    }
    
    @Test(expected = NullTriangleException.class)
    public final void incorrectConstructorTest() {
	Triangle triangle = null;
	
	new PathFinder(triangle);
    }
    
    @Test
    public final void getBiggestSumTest() {
	int[][] triangleConfig = {{6},{3,5},{9,7,1},{4,6,8,4}};
	
	Triangle triangle = new Triangle(triangleConfig);
	
	PathFinder pathFinder = new PathFinder(triangle);
	
	assertEquals(26, pathFinder.getBiggestSum());
    }
    
    @Test
    public final void getBiggestSumStressTest() {
	int[][] triangleConfig = new int[10000][];
	
	for(int i = 0; i < triangleConfig.length; i++) {
	    triangleConfig[i] = new int[i + 1];
	    
	    for(int j = 0; j < (i + 1); j++) {
		triangleConfig[i][j] = (int) (Math.random() * 1000);
	    }
	}
	
	Triangle triangle = new Triangle(triangleConfig);
	
	PathFinder pathFinder = new PathFinder(triangle);
	
	pathFinder.getBiggestSum();
    }
}
