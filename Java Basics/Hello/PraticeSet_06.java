public class PraticeSet_06 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        //        Evaluate expression
                float ans = 7/4f*9/2f;  // -> 7.875
        
        
        //        write java program to encrypt a grade by adding 8 to it and decrypt it to show correct grade
                System.out.print("Enter your number: ");
                int numUserWantEncrypt = scn.nextInt();
                String tempEncryptedNumber  = numUserWantEncrypt + "8";
                System.out.println("Encrypted Number : "+tempEncryptedNumber);
                int convertEncryptedNumber = Integer.parseInt(tempEncryptedNumber);
                int decryptedNumber =  convertEncryptedNumber/ 10;
                System.out.println("Decrypted Number : "+decryptedNumber);
        
        //       Problem 3
        
                System.out.print("Enter your number : ");
                int num = scn.nextInt();
                int givenNumber = 65;
                System.out.println(givenNumber > num);
               
    }
}
