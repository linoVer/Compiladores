package trabalhoFinal;

public interface ParserConstants
{
    int START_SYMBOL = 17;

    int FIRST_NON_TERMINAL    = 17;
    int FIRST_SEMANTIC_ACTION = 27;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1,  0,  0, -1,  0, -1, -1,  0,  0,  0, -1,  0,  0 },
        { -1, -1, -1, -1,  8,  6, -1,  7, -1, -1,  7,  7,  3, -1,  5,  4 },
        { 10, -1, -1, -1, 10, 10, 10, 10, -1, -1, 10, 10, 10,  9, 10, 10 },
        { -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, 12, 13, -1, -1, -1, -1 },
        { -1, 15, 16, 17, 18, -1, -1, -1, 18, 14, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, 19, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1,  1,  1,  2,  1, -1, -1,  1,  1,  1, -1,  1,  1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 18 },
        { 18, 26 },
        {  0 },
        { 13, 20, 18, 19 },
        { 16, 20, 18 },
        { 15, 18, 16, 20,  5 },
        {  6, 18, 26,  7 },
        { 21,  5 },
        {  5 },
        { 14, 18 },
        {  0 },
        {  8, 21,  9 },
        { 23, 22 },
        { 24, 22 },
        { 10, 21 },
        {  2, 21 },
        {  3, 21 },
        {  4, 21 },
        {  0 },
        { 25 },
        { 20 },
        { 12 },
        { 11 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"<\"",
        "Era esperado \";\"",
        "Era esperado \"{\"",
        "Era esperado \"}\"",
        "Era esperado \"(\"",
        "Era esperado \")\"",
        "Era esperado \"=\"",
        "Era esperado NUMERO",
        "Era esperado ID",
        "Era esperado if",
        "Era esperado else",
        "Era esperado do",
        "Era esperado while",
        "<program> inválido",
        "<statement> inválido",
        "<statement2> inválido",
        "<paren_expr> inválido",
        "<expr> inválido",
        "<expr2> inválido",
        "<term> inválido",
        "<id> inválido",
        "<int> inválido",
        "<key> inválido"
    };
}
