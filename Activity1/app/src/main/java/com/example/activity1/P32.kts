package com.example.activity1

/*
Raymundo Romero Arenas
ID: A00570654
Mobiles - Group 1
Teacher: Alejandro Fernández
Friday, February 21, 2020
*/

/* P32 */

/*
Algorithm:
Euclidian Algorithm: GCD(a,b) = GCD(b, a mod b)
1) If b is different from 0, then we perform GCD of b and a module b
2) Keep performing step 1 until b equals to 0. Then return a
*/

/* Code */
fun GCD(a: Int, b: Int): Int{
    if(b == 0){
        return a                //2)
    } else {
        return GCD(b, a%b)   //1)
    }
}

/*Problem test case*/
println(GCD(36,63))  //9

/*Personal test cases*/
println(GCD(15,20))  //5
println(GCD(80,60))  //20