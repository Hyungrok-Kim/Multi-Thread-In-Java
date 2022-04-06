package per.khr.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example1 {

	private ExecutorService executorService = null;

	public Example1() {
		this.executorService = Executors.newCachedThreadPool();
//		this.executorService = Executors.newFixedThreadPool(100);
//		this.executorService = Executors.newSingleThreadExecutor();
	}
	
	public void runTask() {
		Future future = executorService.submit(new Task()); // ���� Future ��ü�� ������ ����� ���� �� �� ���� ���� ����...
		
		try {
			System.out.println(future.get()); // future.get() �Ǵ� future.isDone()�� ���� �Ǹ� Thread lock�� �ɷ����� ��ǻ� �񵿱� �۾��� �������� ����
			System.out.println(future.isDone()); // �����尡 ���������� ����Ǿ����� return 
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class Task implements Callable<Object> {

		@Override
		public Object call() throws Exception {
			System.out.println("�� �̸��� ���� : " + Thread.currentThread().getName());
			
			return null;
		}
		
	}
	
}

