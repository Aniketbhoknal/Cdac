class _03Box{
	private int height , width , depth ;
	_03Box(){
	}
	_03Box(int height , int width , int depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	_03Box(_03Box b){
		height = b.height;
		width = b.width;
		depth = b.depth;
	}
	void calVolume(){
		System.out.println("Volume of Box: "+(height*width*depth));
	}
}