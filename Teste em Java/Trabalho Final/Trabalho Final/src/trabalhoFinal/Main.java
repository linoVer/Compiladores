package trabalhoFinal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, LexicalError, SyntaticError, SemanticError {

		Reader reader1 = new FileReader("example1.txt");
		Reader reader2 = new FileReader("example2.txt");
		Reader reader3 = new FileReader("example3.txt");
		Reader reader4 = new FileReader("example4.txt");
		Reader reader5 = new FileReader("example5.txt");
		


		Lexico lex1 = new Lexico(reader1);
		Lexico lex2 = new Lexico(reader2);
		Lexico lex3 = new Lexico(reader3);
		Lexico lex4 = new Lexico(reader4);
		Lexico lex5 = new Lexico(reader5);
		
		Sintatico sint = new Sintatico();
		Semantico sem = new Semantico();

//		Token t;
//		
//		System.out.println("Lex: \n");
//		while(( t = lex1.nextToken()) != null) {
//			System.out.println(t.toString());
//		}
		
		System.out.println("Sint: \n");
		sint.parse(lex1, sem);
		sint.parse(lex2, sem);
		sint.parse(lex3, sem);
		sint.parse(lex4, sem);
		sint.parse(lex5, sem);
		


	}

}
