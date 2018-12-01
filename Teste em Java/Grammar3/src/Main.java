import compiler.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        Reader reader = new FileReader("files/code02.txt");


        Lexico lex = new Lexico(reader);
        
        Sintatico sym = new Sintatico();
        Semantico sem = new Semantico();
        
        


        try {
            sym.parse(lex, sem);
        }
        catch (LexicalError e) {
            e.printStackTrace();
        }
        catch (SyntaticError e) {
            e.printStackTrace();
        }
        catch (SemanticError e) {
            e.printStackTrace();
        }



    }
}
