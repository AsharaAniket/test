abstract class A{
	abstract void show();
}

class abstractionDemo extends A{
	void show(){
		System.out.println("show method");
	}
	public static void main(String args[]){
		A obj = new AbstractionDemo();
		obj.show();
	}	
}
	
