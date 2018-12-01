package compiler;

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
                    case 40: return 2;
                    case 41: return 3;
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
                    case 59: return 9;
                    case 61: return 10;
                    case 65: return 11;
                    case 66: return 11;
                    case 67: return 11;
                    case 68: return 11;
                    case 69: return 11;
                    case 70: return 11;
                    case 71: return 11;
                    case 72: return 11;
                    case 73: return 11;
                    case 74: return 11;
                    case 75: return 11;
                    case 76: return 11;
                    case 77: return 11;
                    case 78: return 11;
                    case 79: return 11;
                    case 80: return 11;
                    case 81: return 11;
                    case 82: return 11;
                    case 83: return 11;
                    case 84: return 11;
                    case 85: return 11;
                    case 86: return 11;
                    case 87: return 11;
                    case 88: return 11;
                    case 89: return 11;
                    case 90: return 11;
                    case 97: return 11;
                    case 98: return 11;
                    case 99: return 11;
                    case 100: return 11;
                    case 101: return 11;
                    case 102: return 11;
                    case 103: return 11;
                    case 104: return 11;
                    case 105: return 11;
                    case 106: return 11;
                    case 107: return 11;
                    case 108: return 11;
                    case 109: return 11;
                    case 110: return 11;
                    case 111: return 11;
                    case 112: return 12;
                    case 113: return 11;
                    case 114: return 11;
                    case 115: return 11;
                    case 116: return 11;
                    case 117: return 11;
                    case 118: return 11;
                    case 119: return 11;
                    case 120: return 11;
                    case 121: return 11;
                    case 122: return 11;
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
            case 11:
                switch (c)
                {
                    case 65: return 11;
                    case 66: return 11;
                    case 67: return 11;
                    case 68: return 11;
                    case 69: return 11;
                    case 70: return 11;
                    case 71: return 11;
                    case 72: return 11;
                    case 73: return 11;
                    case 74: return 11;
                    case 75: return 11;
                    case 76: return 11;
                    case 77: return 11;
                    case 78: return 11;
                    case 79: return 11;
                    case 80: return 11;
                    case 81: return 11;
                    case 82: return 11;
                    case 83: return 11;
                    case 84: return 11;
                    case 85: return 11;
                    case 86: return 11;
                    case 87: return 11;
                    case 88: return 11;
                    case 89: return 11;
                    case 90: return 11;
                    case 97: return 11;
                    case 98: return 11;
                    case 99: return 11;
                    case 100: return 11;
                    case 101: return 11;
                    case 102: return 11;
                    case 103: return 11;
                    case 104: return 11;
                    case 105: return 11;
                    case 106: return 11;
                    case 107: return 11;
                    case 108: return 11;
                    case 109: return 11;
                    case 110: return 11;
                    case 111: return 11;
                    case 112: return 11;
                    case 113: return 11;
                    case 114: return 11;
                    case 115: return 11;
                    case 116: return 11;
                    case 117: return 11;
                    case 118: return 11;
                    case 119: return 11;
                    case 120: return 11;
                    case 121: return 11;
                    case 122: return 11;
                    default: return -1;
                }
            case 12:
                switch (c)
                {
                    case 65: return 11;
                    case 66: return 11;
                    case 67: return 11;
                    case 68: return 11;
                    case 69: return 11;
                    case 70: return 11;
                    case 71: return 11;
                    case 72: return 11;
                    case 73: return 11;
                    case 74: return 11;
                    case 75: return 11;
                    case 76: return 11;
                    case 77: return 11;
                    case 78: return 11;
                    case 79: return 11;
                    case 80: return 11;
                    case 81: return 11;
                    case 82: return 11;
                    case 83: return 11;
                    case 84: return 11;
                    case 85: return 11;
                    case 86: return 11;
                    case 87: return 11;
                    case 88: return 11;
                    case 89: return 11;
                    case 90: return 11;
                    case 97: return 11;
                    case 98: return 11;
                    case 99: return 11;
                    case 100: return 11;
                    case 101: return 11;
                    case 102: return 11;
                    case 103: return 11;
                    case 104: return 11;
                    case 105: return 11;
                    case 106: return 11;
                    case 107: return 11;
                    case 108: return 11;
                    case 109: return 11;
                    case 110: return 11;
                    case 111: return 11;
                    case 112: return 11;
                    case 113: return 11;
                    case 114: return 13;
                    case 115: return 11;
                    case 116: return 11;
                    case 117: return 11;
                    case 118: return 11;
                    case 119: return 11;
                    case 120: return 11;
                    case 121: return 11;
                    case 122: return 11;
                    default: return -1;
                }
            case 13:
                switch (c)
                {
                    case 65: return 11;
                    case 66: return 11;
                    case 67: return 11;
                    case 68: return 11;
                    case 69: return 11;
                    case 70: return 11;
                    case 71: return 11;
                    case 72: return 11;
                    case 73: return 11;
                    case 74: return 11;
                    case 75: return 11;
                    case 76: return 11;
                    case 77: return 11;
                    case 78: return 11;
                    case 79: return 11;
                    case 80: return 11;
                    case 81: return 11;
                    case 82: return 11;
                    case 83: return 11;
                    case 84: return 11;
                    case 85: return 11;
                    case 86: return 11;
                    case 87: return 11;
                    case 88: return 11;
                    case 89: return 11;
                    case 90: return 11;
                    case 97: return 11;
                    case 98: return 11;
                    case 99: return 11;
                    case 100: return 11;
                    case 101: return 11;
                    case 102: return 11;
                    case 103: return 11;
                    case 104: return 11;
                    case 105: return 14;
                    case 106: return 11;
                    case 107: return 11;
                    case 108: return 11;
                    case 109: return 11;
                    case 110: return 11;
                    case 111: return 11;
                    case 112: return 11;
                    case 113: return 11;
                    case 114: return 11;
                    case 115: return 11;
                    case 116: return 11;
                    case 117: return 11;
                    case 118: return 11;
                    case 119: return 11;
                    case 120: return 11;
                    case 121: return 11;
                    case 122: return 11;
                    default: return -1;
                }
            case 14:
                switch (c)
                {
                    case 65: return 11;
                    case 66: return 11;
                    case 67: return 11;
                    case 68: return 11;
                    case 69: return 11;
                    case 70: return 11;
                    case 71: return 11;
                    case 72: return 11;
                    case 73: return 11;
                    case 74: return 11;
                    case 75: return 11;
                    case 76: return 11;
                    case 77: return 11;
                    case 78: return 11;
                    case 79: return 11;
                    case 80: return 11;
                    case 81: return 11;
                    case 82: return 11;
                    case 83: return 11;
                    case 84: return 11;
                    case 85: return 11;
                    case 86: return 11;
                    case 87: return 11;
                    case 88: return 11;
                    case 89: return 11;
                    case 90: return 11;
                    case 97: return 11;
                    case 98: return 11;
                    case 99: return 11;
                    case 100: return 11;
                    case 101: return 11;
                    case 102: return 11;
                    case 103: return 11;
                    case 104: return 11;
                    case 105: return 11;
                    case 106: return 11;
                    case 107: return 11;
                    case 108: return 11;
                    case 109: return 11;
                    case 110: return 15;
                    case 111: return 11;
                    case 112: return 11;
                    case 113: return 11;
                    case 114: return 11;
                    case 115: return 11;
                    case 116: return 11;
                    case 117: return 11;
                    case 118: return 11;
                    case 119: return 11;
                    case 120: return 11;
                    case 121: return 11;
                    case 122: return 11;
                    default: return -1;
                }
            case 15:
                switch (c)
                {
                    case 65: return 11;
                    case 66: return 11;
                    case 67: return 11;
                    case 68: return 11;
                    case 69: return 11;
                    case 70: return 11;
                    case 71: return 11;
                    case 72: return 11;
                    case 73: return 11;
                    case 74: return 11;
                    case 75: return 11;
                    case 76: return 11;
                    case 77: return 11;
                    case 78: return 11;
                    case 79: return 11;
                    case 80: return 11;
                    case 81: return 11;
                    case 82: return 11;
                    case 83: return 11;
                    case 84: return 11;
                    case 85: return 11;
                    case 86: return 11;
                    case 87: return 11;
                    case 88: return 11;
                    case 89: return 11;
                    case 90: return 11;
                    case 97: return 11;
                    case 98: return 11;
                    case 99: return 11;
                    case 100: return 11;
                    case 101: return 11;
                    case 102: return 11;
                    case 103: return 11;
                    case 104: return 11;
                    case 105: return 11;
                    case 106: return 11;
                    case 107: return 11;
                    case 108: return 11;
                    case 109: return 11;
                    case 110: return 11;
                    case 111: return 11;
                    case 112: return 11;
                    case 113: return 11;
                    case 114: return 11;
                    case 115: return 11;
                    case 116: return 16;
                    case 117: return 11;
                    case 118: return 11;
                    case 119: return 11;
                    case 120: return 11;
                    case 121: return 11;
                    case 122: return 11;
                    default: return -1;
                }
            case 16:
                switch (c)
                {
                    case 65: return 11;
                    case 66: return 11;
                    case 67: return 11;
                    case 68: return 11;
                    case 69: return 11;
                    case 70: return 11;
                    case 71: return 11;
                    case 72: return 11;
                    case 73: return 11;
                    case 74: return 11;
                    case 75: return 11;
                    case 76: return 11;
                    case 77: return 11;
                    case 78: return 11;
                    case 79: return 11;
                    case 80: return 11;
                    case 81: return 11;
                    case 82: return 11;
                    case 83: return 11;
                    case 84: return 11;
                    case 85: return 11;
                    case 86: return 11;
                    case 87: return 11;
                    case 88: return 11;
                    case 89: return 11;
                    case 90: return 11;
                    case 97: return 11;
                    case 98: return 11;
                    case 99: return 11;
                    case 100: return 11;
                    case 101: return 11;
                    case 102: return 11;
                    case 103: return 11;
                    case 104: return 11;
                    case 105: return 11;
                    case 106: return 11;
                    case 107: return 11;
                    case 108: return 11;
                    case 109: return 11;
                    case 110: return 11;
                    case 111: return 11;
                    case 112: return 11;
                    case 113: return 11;
                    case 114: return 11;
                    case 115: return 11;
                    case 116: return 11;
                    case 117: return 11;
                    case 118: return 11;
                    case 119: return 11;
                    case 120: return 11;
                    case 121: return 11;
                    case 122: return 11;
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
