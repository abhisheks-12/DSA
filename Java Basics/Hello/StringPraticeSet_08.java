public class StringPraticeSet_08 {
    public static void main(String[]args){
        // 1. Convert string into lowercase
        String firstName = "Abhishek";
        firstName = firstName.toLowerCase();
        System.out.println(firstName);

        //2.Replace spaces with underscore
        String userName = "Bruce Wayne";
        userName = userName.replace(" ","_");
        System.out.println(userName);


        //3.String format replace name
        String letter = String.format("Hello my name %s",firstName);
        System.out.println(letter);


        //4. Detect double and triple spaces of string
        String checkSpaces = "You either die a hero or live  long enough to see yourself become the   villain";
        System.out.println(checkSpaces.indexOf("  "));
        System.out.println(checkSpaces.indexOf("    "));

        //5 format string using  escape sequence character
        letter = "Hello my name is \n\t Abhishek";
        System.out.println(letter);

    }
    
}
