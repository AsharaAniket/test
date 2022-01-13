class Box{
 
 	var length;
 	var breadth;
 	var height;
 	var volume;
 	
 	double calculateVolume() { 
 		return(length*breadth*height)
 	}
 	Box() { 
 	 	length = 1.0;
 	 	breadth = 2.0;
 	 	height = 3.0; 	 	
 	}
 	 
 	void setData(var input_lenght, var input_breadth, var input_height) {
 	length = input_length;
 	breadth = input_breadth;
 	height = input_height; 	 
 	}
 	double getVolume(void) {
 	volume = calculateVolume();
 	println("Volume of Box:" + volume);
 	return volume;
 	}	
  pull try
}
