/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;


/**
 *
 * @author User
 */ 
public class MatrizInvalidaException extends Exception{
    private final int i;
    private final int j;
    
    public MatrizInvalidaException(int i, int j){
        super(String.format(
            "Matriz de %dx%d não pode ser criada",
            i,j ));
        this.i = i;
        this.j = j;
    }

    public int getNumLinhas(){
        return i;
    }
    public int getNumColunas(){
        return j;
    }
    
}
