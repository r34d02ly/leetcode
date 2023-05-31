import java.util.*;

public class RomanToInteger {

    /**
     *     Example 1:
     *     Input: s = "III"
     *     Output: 3
     *     Explanation: III = 3.
     *
     *     Example 2:
     *     Input: s = "LVIII"
     *     Output: 58
     *     Explanation: L = 50, V= 5, III = 3.
     *
     *     Example 3:
     *     Input: s = "MCMXCIV"
     *     Output: 1994
     *     Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     *     IV
     *     IX
     *     XL
     *     XC
     *     CD
     *     CM
     * */


    String[] testS = {"III", "LVIII", "MCMXCIV", "IV", "IX", "XI", "XL", "XC", "XCIV", "CDXLIV",
                       "XCIX", "CD", "CM", "CMXCIX", "CXCIX", "CLI", "CLV", "CXLV", "DLV", "XCM",
                       "DXIV", "DLXV", "DXLIV", "DCCLIII", "MCXI", "MDCLXXV", "MDLVI", "MMMCMXCIV"};

    String[] testS2 = {"LVIII"};

    public int romanToInt01(String s) {

        System.out.println(s);

        // 초기화
        int rtn = 0;
        Map<String, Integer> romanMap = new LinkedHashMap<>(){{
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};

        for(String k : romanMap.keySet()) {
            int matchCnt = 0;
            if(s.contains(k)) {
                matchCnt = s.length() - s.replace(k, "").length();
                if(k.length() > 1) {
                    matchCnt /= matchCnt;
                }
                rtn += (romanMap.get(k) * matchCnt);
                s = s.replace(k,"");
            }
        }

        return rtn;
    }


    public int romanToInt02(String s) {
        // LVIII
        String[] a1 = {"IV", "IX", "XL", "XC", "CD", "CM", "I", "V", "X", "L", "C", "D", "M"};
        int[] a2 =    {4,     9,    40,   90,   400,  900,  1,   5,   10, 50, 100, 500, 1000};
        int rtn = 0;

        for(int i = 0; i < a1.length; i++) {
            int matchCnt = 0;
            String a1str = a1[i];
            int a2str = a2[i];
            if(s.contains(a1str)) {
                System.out.println(a1str);
                matchCnt = (a1str.length() > 1) ? 1 : s.length() - s.replace(a1str, "").length();
                System.out.println(String.valueOf(matchCnt));
                rtn += (a2str * matchCnt);
                s = s.replace(a1str,"");
            }
        }
        return rtn;
    }

    public int romanToInt03(String s) {
        System.out.println(s);

        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {

            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (3 * num > ans) ans += num;
            else ans -= num;
        }
        return ans;
    }

    public void methodTest() {
        for(String s : testS) {
            //System.out.println(romanToInt01(s));
            //System.out.println(romanToInt02(s));
            System.out.println(romanToInt03(s));
            System.out.println("=================");
        }
    }


}

