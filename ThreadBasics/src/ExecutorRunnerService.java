import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Task extends Thread{
	private int id;
	
	public Task(int id) {
		// TODO Auto-generated constructor stub
	    this.id = id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("starting task"+id);
		for (int i=0;i<=10;i++) {
			System.out.print("running task"+id+" ");
		}
		System.out.println("finished task"+id);
	}
}


public class ExecutorRunnerService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
		executorService.shutdown();
	}

}
