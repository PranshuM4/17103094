package com.company;



class Question2
{
    public static void main(String[] args)
    {
        int number = -1;
        byte b = (byte)number;
        int i = b;
        char r = (char)b, r_1 = (char)i;
        int final_num = r;
        System.out.println("Initial integer: "+ number); // -1
        System.out.println("Byte: "+ b + " " + i + " " + r_1); // -1
        System.out.println("Character: "+ r); // a rectangle char
        System.out.println("Final integer: "+ final_num); // 65535
    }
}

// Explanation:
// Int to byte: byte in java is signed. So range of bit is
// -2^7 to 2^7 +1. Thus -1 will remain -1. 2^8 is added or subtracted
// every time until the number falls into range.

// Byte to char: The byte is first converted to int and then the
// int is converted to char.

// char to int: int is 32 bits. char consists of 16 bits. therefore the
// result is 2^16 - value of char
\