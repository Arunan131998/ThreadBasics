import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
	
	
	private String name;
	public CallableTask(String name) {
		// TODO Auto-generated constructor stub
	    this.name = name;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "name: " + name;
	}
}


public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<String> result = executor.submit(new CallableTask("Monkey D Luffy"));
		System.out.println(" Monkey D Luffy Executed");
		
		System.out.println(result.get());
		
		System.out.println("Main method completed");
		executor.shutdown();

	}

}
