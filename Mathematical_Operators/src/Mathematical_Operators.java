
import java.util.*;
public class Mathematical_Operators {

	public static void main(String[] args) {
		//create a seeded random number generator:
		Random rand= new Random(47);
		int i, j, k;
		//choose value from 1 to 100:
		j=rand.nextInt(100) +1;
		k=rand.nextInt(100) +1;
		System.out.println("j : " +j);
		System.out.println("k :" +k);
		i= j+k;
		i= j-k;
		i= k/j;
		i= k*j;
		i=k%j;
		j %= k;
		// Floating poin number tests:
		float u,v,w; //Applies to doubles, too
		v= rand.nextFloat();
		System.out.println ("v: " +v);
		w=rand.nextFloat();
		System.out.println("w: " +w);
		Integer n1= new Integer (47);
		Integer n2= new Integer (47);
		System.out.println(n1.equals(n2));
		
	}

}
