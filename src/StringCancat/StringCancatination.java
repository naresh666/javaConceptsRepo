package StringCancat;

public class StringCancatination {
	public static void main(String[] args) {
		int a=100,b=200;
		String c="hello",d="World";
		System.out.println(a+b);	//300
		System.out.println(c+d);	//helloWorld
		System.out.println(c+"   "+d);	//hello  World
		System.out.println(a+b+c+d);	//300helloWorld
		System.out.println(a+b+" "+c+"  "+d);  //300 hello World
		System.out.println(c+d+a+b); //here string concatenation occurred 
									//  output is..: helloWorld100200
		System.out.println(c+" "+d+" "+a+b); //here output is..: hello World 100200
		System.out.println(c+" "+d+" "+(a+b)); //here output is..: hello World 300
		
	}

}
