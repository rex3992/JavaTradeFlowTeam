package Java_Prgms1;

public class Parent_Child_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new B();
		a.method1();
		a.method2();
		B b= new B();
		b.method1();
		b.method2();
		b.method3();

	}
	
	interface A{
		public void method1();
		public void method2();
	}
	public static class B implements A{
		B(){
			
		}
		public void method1(){
			System.out.println("B Method1");
		}
		public void method2(){
			System.out.println("B Method2");
		}
		public void method3(){
			System.out.println("B Method3");
		}
	}

}
