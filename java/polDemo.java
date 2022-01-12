class A{ 
	public void display(){
		System.out.println("Default argument method");
		}
	public void display(String str){
		System.out.println("1 argument method");
		System.out.println("String is:-" +str);
		}
}

class polDemo{
	public static void main(String arge[]){
		A obj = new A();
		obj.display();
		obj.display("Demo");
	}
}
