class Teste{
    public static void main(String[] a){
	System.out.println(new A().Start(10));
	
    }
}


class A{  
    public int Start(int var){
		
		return 999 ;
    }
}

class B{
	int aux01 ;
	
	public boolean Funcao(){
		A a ;
		int t ;
		B b ;
		
		b = new B();
		a = new A();

		t = a.Start(1) ;
		
		return true;
	}
}