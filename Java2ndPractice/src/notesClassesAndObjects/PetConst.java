package notesClassesAndObjects;

public class PetConst {
	
	private String name;
	private int age;
	private String animal;
	
	public PetConst(String name,String animal,int age)
	{
		name =name;
		age=age;
		animal=animal;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAnimal(String animal)
	{
		this.animal=animal;
	}
	
	public String getAnimal()
	{
		return animal;
	}
	
	public void setName(String name)
	{
		this.name=name;
	
	}
	public String getName()
	{
		return name;
	}

	public static void main(String[] args) {
		

	}

}
