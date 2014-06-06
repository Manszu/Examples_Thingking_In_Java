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
// Example of a class with some fields
class DataOnly {
int i;
double d;
boolean b;
}

data.i=47;
//It is pssible also that your object might containt other objects that contain data you'd like to modify
myPlane.leftTank.capacity=100;
//Methods
objectName.methodName(arg 1, arg 2, arg 3);
int x= a.f();
//argument listt
int storage(string s) {
return s.length() *2;
}
//method return number of bytes in string
int storage (String s){
	return s.length() *2;
}
//return objects
boolean flag() {return true;}
double naturalLogBase() {return 2.718; }
void nothing() {return; }
void nothing2() {}'


