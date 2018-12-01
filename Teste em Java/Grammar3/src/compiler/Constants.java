package compiler;

public interface Constants extends ScannerConstants, ParserConstants
{
    int EPSILON  = 0;
    int DOLLAR   = 1;

    int t_TOKEN_2 = 2; //"+"
    int t_TOKEN_3 = 3; //"-"
    int t_TOKEN_4 = 4; //"*"
    int t_TOKEN_5 = 5; //"/"
    int t_TOKEN_6 = 6; //"("
    int t_TOKEN_7 = 7; //")"
    int t_TOKEN_8 = 8; //"="
    int t_TOKEN_9 = 9; //";"
    int t_TOKEN_10 = 10; //"print"
    int t_NUMERO = 11;
    int t_ID = 12;

}
