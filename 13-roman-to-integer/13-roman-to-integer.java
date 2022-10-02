class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] x = new char[s.length()];
        HashMap<Character, Integer> symbols = new HashMap<Character, Integer>();
        symbols.put('I',1);
        symbols.put('V',5);
        symbols.put('X',10);
        symbols.put('L',50);
        symbols.put('C',100);
        symbols.put('D',500);
        symbols.put('M',1000);
        
        for(int i = 0; i < s.length(); i++) {
            if(!(i+1 == s.length()) && s.charAt(i) == 'I' && ((s.charAt(i+1) =='V')||(s.charAt(i+1) =='X')) ){
                sum += symbols.get(s.charAt(++i)) - 1;
            }
            else if (!(i+1 == s.length()) && s.charAt(i) == 'X' && ((s.charAt(i+1) =='L')||(s.charAt(i+1) =='C')) ){
                sum += symbols.get(s.charAt(++i)) - 10;
            }
            else if (!(i+1 == s.length()) && s.charAt(i) == 'C' && ((s.charAt(i+1) =='D')||(s.charAt(i+1) =='M')) ){
                sum += symbols.get(s.charAt(++i)) - 100;
            }
            else{
                sum += symbols.get(s.charAt(i));
            }
        }
        return sum;
    }
}