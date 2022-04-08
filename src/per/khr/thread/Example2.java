package per.khr.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Example2 {
	
//	------------------------------------------------------------
//	ThreadPoolExecutor �����ڿ��� ���� �ִ� �� �˾ƺ���...
	
//	1. ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue workQueue)
//	2. ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue workQueue, RejectedExecutionHandler handler)
//	3. ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue workQueue, ThreadFactory threadFactory)
//	4. ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler)
//	���� �ִ�...
//	�⺻������ corePoolSize�� ������ Ǯ�� �⺻ ������� �� ���� �����带 Ǯ�� ������ ���� ��������...���� ���̶�� �����ϸ� �ǽð�
//	maximumPoolSize�� ������ Ǯ�� ���� �� �ִ� �ִ����� ������ ������� �����ϸ� �� ���̴�.. ����� max size�� �Ѿ�� RejectedExecutionException�� �߻��Ѵ�..
//	keepAliveTime�� �����尡 �󸶳� ������ �� ������ ���� ���̰�...
//	timuUnit�� TimeUnit.SECONDS �̷� ������ keepAliveTime�� ���� �ð� �����̰�...
//	workQueue�� corePoolSize�� �Ѿ�� �����带 queueing ó���ϱ� ���� ��� �ȴ�...
	
	
//	------------------------------------------------------------
	BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(1);
	
	ThreadPoolExecutor tpe = new ThreadPoolExecutor(100, 150, 100, TimeUnit.SECONDS, blockingQueue);
	
	for(int i = 0; i < 100; i++) {
		System.out.println("123");
	}
	
//	class Task implements Runnable {
//		@Override
//		public void run() {
//			for(int i = 0; i < 5; i++) {
//				System.out.println("���� ������� ..." + Thread.currentThread().getName());
//			}
//		}
//	}
}
