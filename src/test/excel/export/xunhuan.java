package test.excel.export;

public class xunhuan {
public static void main(String args[]){
	Long time1=System.currentTimeMillis();
	test1();
	Long time2=System.currentTimeMillis();
	System.out.println("test1-----"+(time2-time1));
	Long time3=System.currentTimeMillis();
	test2();
	Long time4=System.currentTimeMillis();
	System.out.println("test2-----"+(time4-time3));
	
	
}

private static void test2() {
	int []a=new int[9999999];
	for(int i=0;i<a.length;i++){
		a[i]=i;
	}
	
}

private static void test1() {
	int []a=new int[9999999];
	for(int i=0;i<a.length;i+=3){
		a[i]=i;
		a[i+1]=i+1;
		a[i+2]=i+2;
	}
}
}
