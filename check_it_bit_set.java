package Bit_Manipulation;



public class check_i_th_bit_set {
    public static void main(String[] args) {
        // Check the i th bit is set(1) or not
        int a = 13;
        int i = 2;
        boolean x = false;
        // We will use left shift operator to check for set in i th position

        // In your case, a is an integer, so a && (1 << i) doesn’t make sense because && expects boolean operands.
        if((a & (1<<i)) != 0)
        {
            x = true;
        }
        System.out.println(x);
    }
}

// Ikkada left shift operator vadithe 1 anedi aa i th position ki velliddi 
// Appude and operator vadatam valla 1 & 1 = 1 avvadam valla adi zero value avvadu  


// What i written logic for this code
// int x = 0;
//         int pos = 0;
//         boolean y = false;
//         while (a > 0 && pos == i) {
//             x = a / 10;
//             if(x ==1)
//             {
//                 y = true;
//             }
//             pos++;
//         }
