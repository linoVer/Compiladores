public interface ScannerConstants
{

    int[] TOKEN_STATE = { 0,  0, -1,  0,  4,  2,  3,  5, 12,  7, -1,  6, 13, 11,  9, 10,  8 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3 };

    String[] SPECIAL_CASES_KEYS =
        {  "if", "int", "print" };

    int[] SPECIAL_CASES_VALUES =
        {  14, 16, 15 };

    String[] SCANNER_ERROR =
    {
        "Caractere não esperado",
        "",
        "Erro identificando \"!=\"",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando \"==\"",
        "",
        "",
        "",
        "",
        "",
        ""
    };

}
