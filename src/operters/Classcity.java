package operters;

public class Classcity {
	public String name;
	public long population;
	public void display()
	{
		System.out.println("city name:"+name);
		System.out.println("population:"+population);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classcity metro1,metro2;
        
       metro1=new Classcity();
       metro2=new Classcity();
       
       metro1.name="Mumbai";
       metro1.population=34254156;
       System.out.println("Detaills of metro city 1:");
       metro1.display();
       
       metro2.name="pune";
       metro2.population=45367268;
       System.out.println("Detalls of metro city 2:");
       metro2.display();
	}

}
