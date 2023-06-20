package June8th;

public class MyProgram5_PrePostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x ; 
//		x = 10;
//		x++; 
//		
//		System.out.println(x);
//		
//		x += 4;
//		
//		System.out.println(x);
//		x--; //post fix
//		
//		System.out.println(x);
//		--x;//prefix
//		System.out.println(x);
		
		int x = 5;
		int y = ++x; // //y takes update x value (pre fix)
		System.out.println("the x is " + x);
		System.out.println("the y is " + y);
		
		int z = 5;
		int w = z++;//w takes z value before it gets incremented (post fix)
		System.out.println("the z is " + z );
		System.out.println("the w is " + w);
		
		
				

	}

}
