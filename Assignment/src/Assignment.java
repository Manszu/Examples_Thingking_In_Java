class Letter {
	char c;
}

	

class Tank{
	int level;
}
public class Assignment {
	static void f(Letter y) {
		y.c= 'z';
	}
	public static void main(String[] args){
	Tank t1= new Tank();
	Tank t2= new Tank();
	t1.level=9;
	t2.level=50;
	System.out.println("1: t1.level " +t1.level+ "t2.level: " +t2.level);
	t1=t2; //t1 now points to t2
	System.out.println("2: t1.level " +t1.level+ "t2.level: " +t2.level);;
	t1.level =27;
	System.out.println("3: t1.level " +t1.level + "t2.level " +t2.level);
	Letter x= new Letter();
	x.c= 'a' ; 
	System.out.println("1 : x.c: " +x.c);
	f(x);//changing the object outside f
	
	
	}
}
