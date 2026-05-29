class Solution {
    public boolean isPalindrome(String s) {
        int l=0 , r=s.length()-1;
        while(l<r)
        {
            char c1 = s.charAt(l);
            if(!Character.isLetter(c1) &&!Character.isDigit(c1))
            {
                l++;
                continue;
            }
            if(Character.isLetter(c1))
            c1=Character.toUpperCase(c1);  
            
            char c2 = s.charAt(r); 
            if(!Character.isLetter(c2)&&!Character.isDigit(c2))
            {
                r--;
                continue;
            }
            if(Character.isLetter(c2))
            c2=Character.toUpperCase(c2);  
            System.out.println(c1);
          System.out.println(c2);

            if(c1!=c2)
            return false;
            l++;
            r--;
        }
       
        return true;
    }
}
