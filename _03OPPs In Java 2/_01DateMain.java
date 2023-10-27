class _01DateMain{
	public static void main(String[] args){
		_01Date d1 = new _01Date();
		d1.display();
		_01Date d2 = new _01Date(9,4,2000);
		d2.display();
		d2.display('-');
		_01Date d3 = new _01Date(d2);
		d3.display();
	}
}