package java8;

interface EvenOdd
{
	void printEvenodd(int n);
}
interface Arithmatic
{
	int operation(int a,int b);
}
interface Add
{
	int Addtion();
	
}
public class Evenoddusinglambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EvenOdd Obj = (n -> {
        	if(n%2 !=0)
        		System.out.println(n+" is odd ");
        	else
        		System.out.println(n+" is even ");
        	
        }
	};
	
	
    Obj.PrintEvenOdd(5);
    Obj.PrintEvenOdd(2);
    Arithmatic addtion = (a, b) ->(a+b);
    System.out.println("Addtion ="+ addtion.operation(5, 6));
    Arithmatic substraction =(a,b) ->(a-b);
    System.out.println("substration ="+substration.operation(5, 6));
    
	}
}