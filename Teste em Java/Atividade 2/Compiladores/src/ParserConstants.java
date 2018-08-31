public interface ParserConstants
{
    int START_SYMBOL = 17;

    int FIRST_NON_TERMINAL    = 17;
    int FIRST_SEMANTIC_ACTION = 22;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0,  0, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  4,  4, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9,  8, -1, -1, -1 },
        {  3,  1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        {  7,  7,  7,  5,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 18, 20 },
        {  2, 18, 20 },
        {  3, 18, 20 },
        {  0 },
        { 19, 21 },
        {  4, 19, 21 },
        {  5, 19, 21 },
        {  0 },
        { 13 },
        { 12 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"*\"",
        "Era esperado \"/\"",
        "Era esperado \">\"",
        "Era esperado \"<\"",
        "Era esperado \">=\"",
        "Era esperado \"<=\"",
        "Era esperado \"==\"",
        "Era esperado \"!=\"",
        "Era esperado NUMERO",
        "Era esperado ID",
        "Era esperado if",
        "Era esperado print",
        "Era esperado int",
        "<E> inválido",
        "<T> inválido",
        "<F> inválido",
        "<E1> inválido",
        "<T1> inválido"
    };
}
