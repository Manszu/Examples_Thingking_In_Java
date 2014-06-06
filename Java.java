//create a reference, not an object
String s; 
//always initialize a reference when you create it
String s = "asdf";
String s = new String("asdf");
//wrapper class
char c= 's';
Character ch= new Character(c);
//Java autoboxing
Character ch= 'x';
char c= ch;
//Scoping
{ 	int x=12;
//Only x available
{	int q=96;
//Both x&x available
}
//only x avalilable
}
// Hidding-  illegal
{
int x=12;
{ int x=96; //Illegal
}
}
// Scope of objects
{
String s= new String ("a string");
} end of scope - reference s vanishes, the String object is still ocuppying a memory
//Classes
class ATypeName {/*class body goes here*/}
ATypeName a= new ATypeName();
