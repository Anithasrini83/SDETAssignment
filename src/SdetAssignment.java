public class SdetAssignment {


    public static void main(String[] args) {
        //String str="FiServ Batch2 @ Pune5 & Chennai9 Learning Core JAVA!!";
        //    Write a Java Program to find the Number of Upper Case alphabets, Number of LowerCase alphabets
        //    Number of Digits, Number of Special Characters
        String str="FiServ Batch2 @ Pune5 & Chennai9 Learning Core JAVA!!!";
        int alphabet=0;
        int lc=0;
        int di=0;
        int spclchar=0;
        char[] ch=str.toCharArray();
        for(char st:ch){
            if(st>='A' && st<='Z'){
                alphabet++;
            }else if(st>='a' && st<='z'){
                lc++;

            }else if(Character.isDigit(st)){
                di++;

            }else if(!Character.isWhitespace(st)){
                spclchar++;
            }
        }
        System.out.println("Capital Letters Count"+" - "+alphabet);
        System.out.println("LowerCaseCount"+"-"+lc);
        System.out.println("Digit"+"-"+ di);
        System.out.println("SpecialCharacter"+"-"+spclchar);
    }

}
