package per.khr.thread;

public class main {

	public static void main(String[] args) {
//		-----------------------------------------------
//						example 1
//		ExecutorService�� �̿��� Thread ����
		
//		# ���� ���丮 �޼ҵ�(Static Factory Method) 
//		1. Executors.newCachedThreadPool()
//		2. Executors.newFixedThreadPool(Num n) 
//		3. Executors.newSingleThreadExecutor()
		
		Example1 ex1 = new Example1();
		for(int i = 0; i < 3; i++) {
			ex1.runTask(); // ���÷� ������ 3�� �����غ���...
		}
		
		
//		# ThreadPoolExecutor
		
//		-----------------------------------------------
		
		
		
		
		
		
	}

}
