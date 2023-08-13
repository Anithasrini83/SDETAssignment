public class SDET {

    public static void main(String[] args) {
        //String str="FiServ Batch2 @ Pune5 & Chennai9 Learning Core JAVA!!";
        //    Write a Java Program to find the Number of Upper Case alphabets, Number of LowerCase alphabets
        //    Number of Digits, Number of Special Characters

        String str="FiServ Batch2 @ Pune5 & Chennai9 Learning Core JAVA!!";

      int upperCase=0;
      int lowerCase=0;
      int digit=0;
      int splch=0;
      String special_Characters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
      char[] ch=str.toCharArray();
      for(char uc:ch){
          if(uc>='A' && uc<='Z'){
              upperCase++;
          }
      }
        System.out.println("UppercaseCount"+upperCase);


      for(int di:ch){
          if(Character.isDigit(di)){
              digit++;
          }
      }
        System.out.println("Digital"+digit);


      for(char lc:ch){
          if(lc>='a' && lc<='z'){
              lowerCase++;

          }
      }
        System.out.println("lowercase count"+lowerCase);

        /*char[] spch=str.toCharArray();
       for(int i=0;i<spch.length;i++){
           if(str.contains(Character.toString(special_Characters.charAt(i)))){
               splch++;
           }
       }*/

        System.out.println("Special Character count"+splch);
    }


}
