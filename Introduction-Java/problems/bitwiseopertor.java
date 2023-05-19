class BitwiseOperator{
    public static void main(String[]args){
        System.out.println("hello world");


                // input 
                /*
                1. d = a ^ a
                2. e = c ^ b
                3. f = a & b
                4. g = c | (a ^ a)
                5. h = ~e
                */

                int a = 4; // binary value - 100
                int b = 8; // ---- 1000
                int c = 2 ;  // ---------- 10

                int d = a ^ a; 
                int e = c ^ b;
                int f = a & b;
                int g = c | (a ^ a);
                int h = ~e;

                System.out.println(d);
                System.out.println(e);
                System.out.println(f);
                System.out.println(g);
                System.out.println(h);
                

    }
}