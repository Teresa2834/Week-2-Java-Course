
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 5A) While loop that prints even numbers from 0 - 100
int x = 0; 
while (x <= 100){
System.out.print(x + " ");
x += 2; 
	if (x % 10 == 0) {
	System.out.println("");	
	}
	
}
System.out.println("");
System.out.println("End of loop 5A");
System.out.println("");
		
// 5B) While loop that prints every 3rd number going backwards from 100 to 0		
int i = 100; 
while (i >= 0) {
	System.out.print(i + " ");
	i -= 3; 
	if (i % 5 == 0) {
		System.out.println("");	
		}
}
	System.out.println("");
	System.out.println("End of loop 5B");
	System.out.println("");

// 5C) For loop that prints every other number from 1-100
for (int d = 1; d < 100; d = d + 2) {
	System.out.print(d + " "); 
		if (d % 7 == 0)
			System.out.println("");
	}
	System.out.println("");
	System.out.println("End of loop 5C");
	System.out.println("");

//5D) For loop that prints numbers, "Hello", "World", and "Hello World"
for (int t = 0; t <= 100; t++) 
 {
	if (t % 3 == 0)
		System.out.print("Hello ");
	if (t % 5 == 0)
		System.out.print("World, ");
	if (t % 10 == 0)
		System.out.println("");	
	if (t % 3 != 0 && t % 5 != 0)
		System.out.print(t + ", ");
 }

	System.out.println("End of loop 5D");
	
  
	}

}
