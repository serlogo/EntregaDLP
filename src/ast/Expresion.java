/**
 * @generated VGen 1.3.3
 */

package ast;

public interface Expresion extends AST {
	public Tipo getTipo();
	public void setTipo(Tipo tipo);
	
	public boolean getModificable();
	public void setModificable(boolean modificable);
}

