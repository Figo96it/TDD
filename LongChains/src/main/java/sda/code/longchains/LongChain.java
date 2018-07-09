package sda.code.longchains;

public class LongChain {


    public int longest(String str) {
        if(str==null || str.isEmpty()){
            return 0;
        }

        int len=1,maxlen=1;
        char last=str.charAt(0);
        for(int i=1;i<str.length();++i){
            if(str.charAt(i)==last){
                len++;
            }
            if(maxlen<=len){
                maxlen=len;
            }
            if(str.charAt(i)!=last){
                len=1;
            }
            last=str.charAt(i);
        }
        return maxlen;
    }
}
