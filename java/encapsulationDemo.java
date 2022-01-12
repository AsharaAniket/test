class Demo{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}

class encapsulationDemo{
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.setName("Demo");
		System.out.println(obj.getName());
	}
}
