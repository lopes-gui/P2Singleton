/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author guilh
 */
public class P2Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         Singleton LivroSingleton = Singleton.getInstance();
        
        Singleton.Livro livro  = LivroSingleton.checkAvailable();
        
        System.out.println(livro.name);
    }
    
}
