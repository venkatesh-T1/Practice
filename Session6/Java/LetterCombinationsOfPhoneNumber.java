https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {
    
    void phone(String digits, List<String> res, String mappings[], String curr, int index)
    {
        if(index==digits.length())
        {
            res.add(curr);
            return;
        }
        
        int digit=digits.charAt(index)-'2';
        String val=mappings[digit];
        
        for(int i=0; i<val.length(); i++)
        {
            phone(digits, res, mappings, curr+val.charAt(i), index+1);
        }
        
    }
    
    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();
        if(digits.length()==0)
        {
            return res;
        }
        
        String mappings[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        phone(digits, res, mappings, "", 0);
        
        return res;
        
    }
}