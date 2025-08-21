public class validParenthisis {

    public static void validparenthisis(String str){
        int cnt = 0;

        for(int i=0; i<str.length();i++){
            
            if( str.charAt(i) == '('){
                cnt++;
            }
            else if( str.charAt(i) == ')'){
                cnt--;
            }
        }

        if(cnt==0){
            System.out.print("valid");
        }
        else{
            System.out.print("Invalid");
        }
    }
    public static void main(String args[]){
         String str = "())";
         validparenthisis(str);
    }
}
