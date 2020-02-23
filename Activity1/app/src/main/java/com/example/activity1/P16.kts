package com.example.activity1

/*
Raymundo Romero Arenas
ID: A00570654
Mobiles - Group 1
Teacher: Alejandro Fernández
Friday, February 21, 2020
*/

/* P16 */

/*
Algorithm:
1) Get the size of the initial string
2) Declare an empty string where the output will be printed
3) Declare an array with an initial space to store the shifted string
4) Shift the initial string one index to the right to associate the letters correctly with their position
5) If a letter is in an index multiple of the 'nth' number declared, then we don't add it to the output
6) Traverse the shifted string and add its letters to the final output
7) Print the string with the dropped letters
*/

/* Code */
fun drop(nth: Int, chain: String): String {
    val size = chain.length                             //1)
    var cambio = ""                                     //2)
    var shift = " "                                     //3)
    for(i in 0 until size){
        shift = shift + chain[i]                        //4)
    }
    for(j in 0 until size+1){
        if(j % nth != 0){                               //5)
            cambio = cambio + shift[j]                  //6)
        }
    }
    return cambio                                       //7)
}

/*Problem test case*/
println(drop(3,"abcdefghijk"))  //"abdeghjk"

/*Personal test cases*/
println(drop(2,"Raymundo"))     //"Ryud"
println(drop(4,"Tecnologico"))  //"Tecoloico"