package com.valerie.util;

/**
 * Created by valerie on 15/3/30
 */
public class UnicodeUtil {
    private static String PREFIX = "\\u";

    public static String toUnicode(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(char2Ascii(chars[i]));
        }
        return sb.toString();
    }

    private static String char2Ascii(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(PREFIX);
        int code = (c >> 8);
        String tmp = Integer.toHexString(code);
        if (tmp.length() == 1) {
            sb.append("0");
        }
        sb.append(tmp);
        code = (c & 0xFF);
        tmp = Integer.toHexString(code);
        if (tmp.length() == 1) {
            sb.append("0");
        }
        sb.append(tmp);
        return sb.toString();
    }

    public static String stringToUnicode(String theString, boolean escapeSpace) {
        int len = theString.length();
        int bufLen = len * 2;
        if (bufLen < 0) {
            bufLen = Integer.MAX_VALUE;
        }
        StringBuffer outBuffer = new StringBuffer(bufLen);

        for (int x = 0; x < len; x++) {
            char aChar = theString.charAt(x);
            // Handle common case first, selecting largest block that
            // avoids the specials below
            if ((aChar > 61) && (aChar < 127)) {
                if (aChar == '\\') {
                    outBuffer.append('\\');
                    outBuffer.append('\\');
                    continue;
                }
                outBuffer.append(aChar);
                continue;
            }
            switch (aChar) {
                case ' ':
                    if (x == 0 || escapeSpace) outBuffer.append('\\');
                    outBuffer.append(' ');
                    break;
                case '\t':
                    outBuffer.append('\\');
                    outBuffer.append('t');
                    break;
                case '\n':
                    outBuffer.append('\\');
                    outBuffer.append('n');
                    break;
                case '\r':
                    outBuffer.append('\\');
                    outBuffer.append('r');
                    break;
                case '\f':
                    outBuffer.append('\\');
                    outBuffer.append('f');
                    break;
                case '=': // Fall through
                case ':': // Fall through
                case '#': // Fall through
                case '!':
                    outBuffer.append('\\');
                    outBuffer.append(aChar);
                    break;
                default:
                    if ((aChar < 0x0020) || (aChar > 0x007e)) {
                        outBuffer.append('\\');
                        outBuffer.append('u');
                        outBuffer.append(toHex((aChar >> 12) & 0xF));
                        outBuffer.append(toHex((aChar >> 8) & 0xF));
                        outBuffer.append(toHex((aChar >> 4) & 0xF));
                        outBuffer.append(toHex(aChar & 0xF));
                    } else {
                        outBuffer.append(aChar);
                    }
            }
        }
        return outBuffer.toString();
    }

    private static char toHex(int nibble) {
        return hexDigit[(nibble & 0xF)];
    }

    /** A table of hex digits */
    private static final char[] hexDigit = {
            '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'
    };

    public static void main(String[] args) {
        String ahha = "哈 哈哈哈房和第三方和第三 方";
        String unicode = UnicodeUtil.toUnicode(ahha);
        System.out.println(unicode);
        String unicode1 = UnicodeUtil.stringToUnicode(ahha, false);
        System.out.println(unicode1);
        String unicode2 = UnicodeUtil.stringToUnicode(ahha, true);
        System.out.println(unicode2);
    }
}
