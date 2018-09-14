package trabalhoFinal;

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
                    case 40: return 2;
                    case 41: return 3;
                    case 43: return 4;
                    case 45: return 5;
                    case 47: return 6;
                    case 48: return 7;
                    case 49: return 7;
                    case 50: return 7;
                    case 51: return 7;
                    case 52: return 7;
                    case 53: return 7;
                    case 54: return 7;
                    case 55: return 7;
                    case 56: return 7;
                    case 57: return 7;
                    case 59: return 8;
                    case 60: return 9;
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
                    case 123: return 12;
                    case 125: return 13;
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
            case 6:
                switch (c)
                {
                    case 42: return 14;
                    default: return -1;
                }
            case 7:
                switch (c)
                {
                    case 48: return 7;
                    case 49: return 7;
                    case 50: return 7;
                    case 51: return 7;
                    case 52: return 7;
                    case 53: return 7;
                    case 54: return 7;
                    case 55: return 7;
                    case 56: return 7;
                    case 57: return 7;
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
            case 14:
                switch (c)
                {
                    case 9: return 14;
                    case 10: return 14;
                    case 13: return 14;
                    case 32: return 14;
                    case 33: return 14;
                    case 34: return 14;
                    case 35: return 14;
                    case 36: return 14;
                    case 37: return 14;
                    case 38: return 14;
                    case 39: return 14;
                    case 40: return 14;
                    case 41: return 14;
                    case 42: return 15;
                    case 43: return 14;
                    case 44: return 14;
                    case 45: return 14;
                    case 46: return 14;
                    case 47: return 14;
                    case 48: return 14;
                    case 49: return 14;
                    case 50: return 14;
                    case 51: return 14;
                    case 52: return 14;
                    case 53: return 14;
                    case 54: return 14;
                    case 55: return 14;
                    case 56: return 14;
                    case 57: return 14;
                    case 58: return 14;
                    case 59: return 14;
                    case 60: return 14;
                    case 61: return 14;
                    case 62: return 14;
                    case 63: return 14;
                    case 64: return 14;
                    case 65: return 14;
                    case 66: return 14;
                    case 67: return 14;
                    case 68: return 14;
                    case 69: return 14;
                    case 70: return 14;
                    case 71: return 14;
                    case 72: return 14;
                    case 73: return 14;
                    case 74: return 14;
                    case 75: return 14;
                    case 76: return 14;
                    case 77: return 14;
                    case 78: return 14;
                    case 79: return 14;
                    case 80: return 14;
                    case 81: return 14;
                    case 82: return 14;
                    case 83: return 14;
                    case 84: return 14;
                    case 85: return 14;
                    case 86: return 14;
                    case 87: return 14;
                    case 88: return 14;
                    case 89: return 14;
                    case 90: return 14;
                    case 91: return 14;
                    case 92: return 14;
                    case 93: return 14;
                    case 94: return 14;
                    case 95: return 14;
                    case 96: return 14;
                    case 97: return 14;
                    case 98: return 14;
                    case 99: return 14;
                    case 100: return 14;
                    case 101: return 14;
                    case 102: return 14;
                    case 103: return 14;
                    case 104: return 14;
                    case 105: return 14;
                    case 106: return 14;
                    case 107: return 14;
                    case 108: return 14;
                    case 109: return 14;
                    case 110: return 14;
                    case 111: return 14;
                    case 112: return 14;
                    case 113: return 14;
                    case 114: return 14;
                    case 115: return 14;
                    case 116: return 14;
                    case 117: return 14;
                    case 118: return 14;
                    case 119: return 14;
                    case 120: return 14;
                    case 121: return 14;
                    case 122: return 14;
                    case 123: return 14;
                    case 124: return 14;
                    case 125: return 14;
                    case 126: return 14;
                    case 161: return 14;
                    case 162: return 14;
                    case 163: return 14;
                    case 164: return 14;
                    case 165: return 14;
                    case 166: return 14;
                    case 167: return 14;
                    case 168: return 14;
                    case 169: return 14;
                    case 170: return 14;
                    case 171: return 14;
                    case 172: return 14;
                    case 173: return 14;
                    case 174: return 14;
                    case 175: return 14;
                    case 176: return 14;
                    case 177: return 14;
                    case 178: return 14;
                    case 179: return 14;
                    case 180: return 14;
                    case 181: return 14;
                    case 182: return 14;
                    case 183: return 14;
                    case 184: return 14;
                    case 185: return 14;
                    case 186: return 14;
                    case 187: return 14;
                    case 188: return 14;
                    case 189: return 14;
                    case 190: return 14;
                    case 191: return 14;
                    case 192: return 14;
                    case 193: return 14;
                    case 194: return 14;
                    case 195: return 14;
                    case 196: return 14;
                    case 197: return 14;
                    case 198: return 14;
                    case 199: return 14;
                    case 200: return 14;
                    case 201: return 14;
                    case 202: return 14;
                    case 203: return 14;
                    case 204: return 14;
                    case 205: return 14;
                    case 206: return 14;
                    case 207: return 14;
                    case 208: return 14;
                    case 209: return 14;
                    case 210: return 14;
                    case 211: return 14;
                    case 212: return 14;
                    case 213: return 14;
                    case 214: return 14;
                    case 215: return 14;
                    case 216: return 14;
                    case 217: return 14;
                    case 218: return 14;
                    case 219: return 14;
                    case 220: return 14;
                    case 221: return 14;
                    case 222: return 14;
                    case 223: return 14;
                    case 224: return 14;
                    case 225: return 14;
                    case 226: return 14;
                    case 227: return 14;
                    case 228: return 14;
                    case 229: return 14;
                    case 230: return 14;
                    case 231: return 14;
                    case 232: return 14;
                    case 233: return 14;
                    case 234: return 14;
                    case 235: return 14;
                    case 236: return 14;
                    case 237: return 14;
                    case 238: return 14;
                    case 239: return 14;
                    case 240: return 14;
                    case 241: return 14;
                    case 242: return 14;
                    case 243: return 14;
                    case 244: return 14;
                    case 245: return 14;
                    case 246: return 14;
                    case 247: return 14;
                    case 248: return 14;
                    case 249: return 14;
                    case 250: return 14;
                    case 251: return 14;
                    case 252: return 14;
                    case 253: return 14;
                    case 254: return 14;
                    case 255: return 14;
                    default: return -1;
                }
            case 15:
                switch (c)
                {
                    case 47: return 16;
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
