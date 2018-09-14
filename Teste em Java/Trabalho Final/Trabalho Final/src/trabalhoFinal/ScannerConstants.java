package trabalhoFinal;

public interface ScannerConstants
{

    int[] TOKEN_STATE = { 0,  0,  8,  9,  2,  3, -2, 11,  5,  4, 10, 12,  6,  7, -2, -2,  0 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4 };

    String[] SPECIAL_CASES_KEYS =
        {  "do", "else", "if", "while" };

    int[] SPECIAL_CASES_VALUES =
        {  15, 14, 13, 16 };

    String[] SCANNER_ERROR =
    {
        "Caractere não esperado",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando <ignorar>",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando <ignorar>",
        "Erro identificando <ignorar>",
        ""
    };

}
