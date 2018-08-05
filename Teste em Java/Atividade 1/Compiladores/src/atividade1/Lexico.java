package atividade1;

public class Lexico implements Constants
{
    private int position;
    private String input;

    public Lexico()
    {
        this(new java.io.StringReader(""));
    }

    public Lexico(java.io.Reader input)
    {
        setInput(input);
    }

    public void setInput(java.io.Reader input)
    {
        StringBuffer bfr = new StringBuffer();
        try
        {
            int c = input.read();
            while (c != -1)
            {
                bfr.append((char)c);
                c = input.read();
            }
            this.input = bfr.toString();
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }

        setPosition(0);
    }

    public void setPosition(int pos)
    {
        position = pos;
    }

    public Token nextToken() throws LexicalError
    {
        if ( ! hasInput() )
            return null;

        int start = position;

        int state = 0;
        int lastState = 0;
        int endState = -1;
        int end = -1;

        while (hasInput())
        {
            lastState = state;
            state = nextState(nextChar(), state);

            if (state < 0)
                break;

            else
            {
                if (tokenForState(state) >= 0)
                {
                    endState = state;
                    end = position;
                }
            }
        }
        if (endState < 0 || (endState != state && tokenForState(lastState) == -2))
            throw new LexicalError(SCANNER_ERROR[lastState], start);

        position = end;

        int token = tokenForState(endState);

        if (token == 0)
            return nextToken();
        else
        {
            String lexeme = input.substring(start, end);
            token = lookupToken(token, lexeme);
            return new Token(token, lexeme, start);
        }
    }

    private int nextState(char c, int state)
    {
        switch (state)
        {
            case 0:
                switch (c)
                {
                    case 9: return 1;
                    case 10: return 1;
                    case 13: return 1;
                    case 32: return 1;
                    case 33: return 2;
                    case 35: return 3;
                    case 42: return 4;
                    case 43: return 5;
                    case 45: return 6;
                    case 47: return 7;
                    case 48: return 8;
                    case 49: return 8;
                    case 50: return 8;
                    case 51: return 8;
                    case 52: return 8;
                    case 53: return 8;
                    case 54: return 8;
                    case 55: return 8;
                    case 56: return 8;
                    case 57: return 8;
                    case 60: return 9;
                    case 61: return 10;
                    case 62: return 11;
                    case 65: return 12;
                    case 66: return 12;
                    case 67: return 12;
                    case 68: return 12;
                    case 69: return 12;
                    case 70: return 12;
                    case 71: return 12;
                    case 72: return 12;
                    case 73: return 12;
                    case 74: return 12;
                    case 75: return 12;
                    case 76: return 12;
                    case 77: return 12;
                    case 78: return 12;
                    case 79: return 12;
                    case 80: return 12;
                    case 81: return 12;
                    case 82: return 12;
                    case 83: return 12;
                    case 84: return 12;
                    case 85: return 12;
                    case 86: return 12;
                    case 87: return 12;
                    case 88: return 12;
                    case 89: return 12;
                    case 90: return 12;
                    case 97: return 12;
                    case 98: return 12;
                    case 99: return 12;
                    case 100: return 12;
                    case 101: return 12;
                    case 102: return 12;
                    case 103: return 12;
                    case 104: return 12;
                    case 105: return 12;
                    case 106: return 12;
                    case 107: return 12;
                    case 108: return 12;
                    case 109: return 12;
                    case 110: return 12;
                    case 111: return 12;
                    case 112: return 12;
                    case 113: return 12;
                    case 114: return 12;
                    case 115: return 12;
                    case 116: return 12;
                    case 117: return 12;
                    case 118: return 12;
                    case 119: return 12;
                    case 120: return 12;
                    case 121: return 12;
                    case 122: return 12;
                    default: return -1;
                }
            case 1:
                switch (c)
                {
                    case 9: return 1;
                    case 10: return 1;
                    case 13: return 1;
                    case 32: return 1;
                    default: return -1;
                }
            case 2:
                switch (c)
                {
                    case 61: return 13;
                    default: return -1;
                }
            case 3:
                switch (c)
                {
                    case 48: return 3;
                    case 49: return 3;
                    case 50: return 3;
                    case 51: return 3;
                    case 52: return 3;
                    case 53: return 3;
                    case 54: return 3;
                    case 55: return 3;
                    case 56: return 3;
                    case 57: return 3;
                    case 65: return 3;
                    case 66: return 3;
                    case 67: return 3;
                    case 68: return 3;
                    case 69: return 3;
                    case 70: return 3;
                    case 71: return 3;
                    case 72: return 3;
                    case 73: return 3;
                    case 74: return 3;
                    case 75: return 3;
                    case 76: return 3;
                    case 77: return 3;
                    case 78: return 3;
                    case 79: return 3;
                    case 80: return 3;
                    case 81: return 3;
                    case 82: return 3;
                    case 83: return 3;
                    case 84: return 3;
                    case 85: return 3;
                    case 86: return 3;
                    case 87: return 3;
                    case 88: return 3;
                    case 89: return 3;
                    case 90: return 3;
                    case 95: return 3;
                    case 97: return 3;
                    case 98: return 3;
                    case 99: return 3;
                    case 100: return 3;
                    case 101: return 3;
                    case 102: return 3;
                    case 103: return 3;
                    case 104: return 3;
                    case 105: return 3;
                    case 106: return 3;
                    case 107: return 3;
                    case 108: return 3;
                    case 109: return 3;
                    case 110: return 3;
                    case 111: return 3;
                    case 112: return 3;
                    case 113: return 3;
                    case 114: return 3;
                    case 115: return 3;
                    case 116: return 3;
                    case 117: return 3;
                    case 118: return 3;
                    case 119: return 3;
                    case 120: return 3;
                    case 121: return 3;
                    case 122: return 3;
                    default: return -1;
                }
            case 8:
                switch (c)
                {
                    case 48: return 8;
                    case 49: return 8;
                    case 50: return 8;
                    case 51: return 8;
                    case 52: return 8;
                    case 53: return 8;
                    case 54: return 8;
                    case 55: return 8;
                    case 56: return 8;
                    case 57: return 8;
                    default: return -1;
                }
            case 9:
                switch (c)
                {
                    case 61: return 14;
                    default: return -1;
                }
            case 10:
                switch (c)
                {
                    case 61: return 15;
                    default: return -1;
                }
            case 11:
                switch (c)
                {
                    case 61: return 16;
                    default: return -1;
                }
            case 12:
                switch (c)
                {
                    case 48: return 12;
                    case 49: return 12;
                    case 50: return 12;
                    case 51: return 12;
                    case 52: return 12;
                    case 53: return 12;
                    case 54: return 12;
                    case 55: return 12;
                    case 56: return 12;
                    case 57: return 12;
                    case 65: return 12;
                    case 66: return 12;
                    case 67: return 12;
                    case 68: return 12;
                    case 69: return 12;
                    case 70: return 12;
                    case 71: return 12;
                    case 72: return 12;
                    case 73: return 12;
                    case 74: return 12;
                    case 75: return 12;
                    case 76: return 12;
                    case 77: return 12;
                    case 78: return 12;
                    case 79: return 12;
                    case 80: return 12;
                    case 81: return 12;
                    case 82: return 12;
                    case 83: return 12;
                    case 84: return 12;
                    case 85: return 12;
                    case 86: return 12;
                    case 87: return 12;
                    case 88: return 12;
                    case 89: return 12;
                    case 90: return 12;
                    case 95: return 12;
                    case 97: return 12;
                    case 98: return 12;
                    case 99: return 12;
                    case 100: return 12;
                    case 101: return 12;
                    case 102: return 12;
                    case 103: return 12;
                    case 104: return 12;
                    case 105: return 12;
                    case 106: return 12;
                    case 107: return 12;
                    case 108: return 12;
                    case 109: return 12;
                    case 110: return 12;
                    case 111: return 12;
                    case 112: return 12;
                    case 113: return 12;
                    case 114: return 12;
                    case 115: return 12;
                    case 116: return 12;
                    case 117: return 12;
                    case 118: return 12;
                    case 119: return 12;
                    case 120: return 12;
                    case 121: return 12;
                    case 122: return 12;
                    default: return -1;
                }
            default: return -1;
        }
    }

    private int tokenForState(int state)
    {
        if (state < 0 || state >= TOKEN_STATE.length)
            return -1;

        return TOKEN_STATE[state];
    }

    public int lookupToken(int base, String key)
    {
        int start = SPECIAL_CASES_INDEXES[base];
        int end   = SPECIAL_CASES_INDEXES[base+1]-1;

        while (start <= end)
        {
            int half = (start+end)/2;
            int comp = SPECIAL_CASES_KEYS[half].compareTo(key);

            if (comp == 0)
                return SPECIAL_CASES_VALUES[half];
            else if (comp < 0)
                start = half+1;
            else  //(comp > 0)
                end = half-1;
        }

        return base;
    }

    private boolean hasInput()
    {
        return position < input.length();
    }

    private char nextChar()
    {
        if (hasInput())
            return input.charAt(position++);
        else
            return (char) -1;
    }
}
