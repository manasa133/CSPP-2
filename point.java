class point {
	private int x,y;
	// point(){
		
	// }

	// point(int p, int q){
	// 	x=p;
	// 	y=q;
	// }
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	double distance(point p){
		System.out.println("x-- "+ x);
		System.out.println("p x-- "+ p.getX());

		return 0.0;
	}
	double distance(point p,point q){
		System.out.println("x-- "+ q.getX());
		System.out.println("p x-- "+ p.getX());

		return 0.0;
	}
	public static void main(String[] args) {
		point p1 =new point(1,2);
		point p2 = new point(3,4);
		p1.distance(p2);
		p2.distance(p1);
		new point().distance(p1,p2);
	}
}