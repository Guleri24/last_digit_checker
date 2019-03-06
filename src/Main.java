public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x,int y,int z){
        if((x>9&&x<1001)&&(y>9&&y<1001)&&(z>9&&z<1001)){
        x=x%10;
        y=y%10;
        z=z%10;
         if((x==y)||(y==z)||(z==x)||(x==y&&y==z&&x==z)){
            return true;}
  else{ return false; }
            
        }
        return false;}
public static boolean isValid(int i){
    if(i>9&&i<1001){
        return true;
    }
    return false;
}
}
