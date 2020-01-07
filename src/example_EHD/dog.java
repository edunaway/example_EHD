package example_EHD;

public class dog {

	private String name;
	private int age;
	
	public dog() {
		name= "null";
		age= 0; 
	}//end empty-argument constructor
	
	/**
	 * 
	 * @param name
	 * @param age
	 */
	
	public dog(String name, int age) {
		this.name = name;
		this.age = age;
	}//end preferred constructor 

	/**
	 * this method returns a string that represents the dog's bark 
	 * 
	 * @return
	 */
	
	public String bark() {
		return"Bark, bark, bark!!!"; 
	}//end bark
	
	//getters/setters/toString
	
	public String getName() {
		return name;
	}// end get name 
	
	public void setName(String name) {
		this.name = name;
	}// end set name
	
	public int getAge() {
		return age;
	}// end get age
	
	public void setAge(int age) {
		this.age = age;
	}// end set name

	@Override
	public String toString() {
		return "dog [name=" + name + ", age=" + age + "]";
	}//end toString
	
	
	
	
	
	
}
