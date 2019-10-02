class ArrayParameter2{
	public static void main(String args[]){
		int c[]={1,10,100,1000};
		int j;
		System.out.println("Array c before calling elementMultiply");
		for(j=0;j<c.length;j++)
			System.out.print(c[j]+" ");
		System.out.println();
		elementMultiply(c[2]);
		System.out.println("Array c after calling elementMultiply");
		for(j=0;j<c.length;j++)
			System.out.print(c[j]+" ");
		System.out.println();
	}
	
	static void elementMultiply(int d){
		d=2*d;
		System.out.println("d="+d);
	}
}