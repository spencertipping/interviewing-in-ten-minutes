pulic int fizz_buzz() {         // "pulic" -- eh; "int" ... ????
int count = 0;                  // count of what?; also, indent!
while (true) {                  // forever? why?
int count2 = count              // "count2"?
while (count2 > 0) {            // modulus! modulus!
count2 = count2 - 3;
}
int count3 = count;             // ok, this is just silly
while (count3 > 0) {
count3 = count3 - 5;
}
//check for divisibility
if (count2 == 0) {
if (count3 == 0) {
System.out.println("fizzbuzz");
}
else                            // missing open brace, not good
System.out.println("fizz");
}
else
if count3 == 0 {
System.out.println("buzz")
}
else {
System.out.println(count)
}
}
}