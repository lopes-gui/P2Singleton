

import java.util.Random;

public class Singleton {

    private static Singleton uniqueInstance;
    	private boolean disponivel;
	private boolean emprestado;
   

	private Singleton() {
            disponivel = true;
            emprestado = true;
	}

	public Livro checkAvailable() {

            if (!disponivel || !emprestado) {
		return null;
            } else {
		disponivel = false;
                return retirarLivro();
            }
        }
        
	private Livro retirarLivro() {
            Genero genero = new Genero();
            Ano ano = new Ano();
            Autor autor = new Autor();
            Saidadata exit = new Saidadata();
            Devoluçao back = new Devoluçao();
             Quantidade qtd = new Quantidade();
            String name = "Carro numero " + new Random().nextInt(new Random().nextInt(99999));

            Livro livro = new Livro(name, genero, autor, ano,exit,back);
            disponivel = true;
		
            return livro;
	}
	
	public void devolver() {
            if(emprestado) {
            	return;
            }else {}
		emprestado = true;
        }
	
	public static synchronized Singleton getInstance() {
            if (uniqueInstance == null) {
		uniqueInstance = new Singleton();
            }
                return uniqueInstance;
        }

    private static class Livro {

        public Livro() {
        }

        private Livro(String name, Genero genero, Autor autor, Ano ano,Saidadata exit, Devoluçao back) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
