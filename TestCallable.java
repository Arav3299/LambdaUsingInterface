package assignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		
		Callable callable = ()-> {
			int n=0;
			for (int i=0;i<100;i++){
				n+=i;
				
			}
			return n;
		};
		 
		FutureTask<Object>[] randomNumberTasks = new FutureTask[5];
		//ArrayList<Integer> arrayList = new ArrayList<Integer>();
		randomNumberTasks[0] = new FutureTask(callable);
		Thread thread = new Thread(randomNumberTasks[0]);
		thread.start();
		
		System.out.println(randomNumberTasks[0].get());
		
		
		
		
		
	}
}
