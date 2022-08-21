public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        int len = 0;
        for (int i=0 ; i<strs[0].length() ; i++){
            int ok=1;
            for (int j=0 ; j<strs.length ; j++){
                if (len>=strs[j].length() || strs[j].charAt(len)!=strs[0].charAt(len)){
                    ok=0;
                    break;
                }
            }
            if (ok==1){
                len++;
            }else{
                break;
            }
        }
        return strs[0].substring(0,len);
    }
}
