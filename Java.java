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
void nothing2() {}
// static keyword
class StaticTest {
static int i=47;
}
//there is one piece of storage for StaticTest.i
StaticTest st1= new StaticTest();
StaticTest st2= new StaticTest(); //st1.i and st2.i have the same value of 47 since they refer to the same piece of memory
StaticTest.i++; // You can also refer directly to class The operator adds one to the variable. At this point, both st1.i and st2.i will have the value 48.
//static methods
class Incrementable {
	static void increment() {StaticTest.i++; }
}

Incrementable sf= new Incrementable();
sf.increment();
Incrementable.increment();
// compiling
javac HelloDate.javac
java HelloDate


	




