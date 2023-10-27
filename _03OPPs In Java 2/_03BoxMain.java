class _03BoxMain{
	public static void main(String[] args){
		_03Box b1 = new _03Box();
		b1.calVolume();
		_03Box b2 = new _03Box(4,2,5);
		b2.calVolume();
		_03Box b3 = new _03Box(b2);
		b3.calVolume(); 
	}
}