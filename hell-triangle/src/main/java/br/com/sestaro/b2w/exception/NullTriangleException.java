package br.com.sestaro.b2w.exception;

/**
 * Exception to handle invalid triangles.
 * 
 * @author davidson.sestaro
 */
public class NullTriangleException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public NullTriangleException() {
	super("The tiangle cannot be null!");
    }
}
