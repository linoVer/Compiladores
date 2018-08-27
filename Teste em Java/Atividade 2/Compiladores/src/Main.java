import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, LexicalError, SyntaticError, SemanticError {

		Reader reader = new FileReader("mytext.txt");


		Lexico lex = new Lexico(reader);
		Sintatico sint = new Sintatico();
		Semantico sem = new Semantico();

		Token t;
		
		System.out.println("Lex: \n");
		while(( t = lex.nextToken()) != null) {
			System.out.println(t.toString());
		}
		
		System.out.println("Sint: \n");
		sint.parse(lex, sem);


	}

}
