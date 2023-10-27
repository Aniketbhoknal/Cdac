class _07Student{
	private int id;
	private float percent;
	_07Student(){};
	_07Student(int id, int percent){
		this.id = id;
		this.percent = percent;
	}
	void grade(){
		if(percent >= 90 && percent <= 100){
			System.out.println("Execelent!!!!");
		}else if(percent >= 80 && percent <= 90){
			System.out.println("Very Good");
		}else if(percent >= 70 && percent <= 80){
			System.out.println("Good");
		}else if(percent >= 60 && percent <= 70){
			System.out.println("Average");
		}else if(percent >= 40 && percent <= 60){
			System.out.println("Pass");
		}else if(percent < 60){
			System.out.println("Fail");
		}else{
			System.out.println("Please Enter Valid Percent");
		}
	}
	
}