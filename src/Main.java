// Write a function that receives a and returns
// `boolean` whether it's a palindrome. `String`

//logic
// function reads string
// reverses string
// if reverse string == original string than its true
// if not false

public class Main {
        public static boolean isPal(String str){
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            // Compare the reversed string to the original string
            return str.equals(sb.toString());
        }
    public static void main(String[] args) {
        System.out.println(Main.isPal("gag"));
    }
    }
// notes

//constructors are also methods.
// they are called to create objects and arguments
// can be passed to them
// in java system.out.println must be inside a method.
// all statments in java must be inside methods as well.
// remember statments are commands like 'for' or 'assign'
