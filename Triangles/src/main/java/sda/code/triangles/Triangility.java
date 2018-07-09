package sda.code.triangles;

public class Triangility {
    public boolean check(int a, int b, int c) {
        if(a>0 && b>0 && c>0){
            if(a-c<b && b-c<a && c-a<b){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
