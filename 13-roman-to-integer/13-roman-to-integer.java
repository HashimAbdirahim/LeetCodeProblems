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
        
        for (int i = 0; i < s.length(); i++){
            x[i] = s.charAt(i);
        }
        for(int i = 0; i < x.length; i++) {
            if(!(i+1 == x.length) && x[i] == 'I' && ((x[i+1] =='V')||(x[i+1] =='X')) ){
                sum += symbols.get(x[++i]) - 1;
            }
            else if (!(i+1 == x.length) && x[i] == 'X' && ((x[i+1] =='L')||(x[i+1] =='C')) ){
                sum += symbols.get(x[++i]) - 10;
            }
            else if (!(i+1 == x.length) && x[i] == 'C' && ((x[i+1] =='D')||(x[i+1] =='M')) ){
                sum += symbols.get(x[++i]) - 100;
            }
            else{
                sum += symbols.get(x[i]);
            }
        }
        return sum;
    }
}