class A
{
	public void show(){
		System.out.println("Class 'A' method called");
	}
}

class B extends A{
	public void display(){
		System.out.println("Class 'B' method called");
	}
}

class inheritanceDemo{
	public static void main(String args[]){
		B obj = new B();
		obj.show();
		obj.display();
		
	}
}

