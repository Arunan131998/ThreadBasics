//NEW;
//RUNNABLE;
//RUNNING;
//BLOCKED/WAITING;
//TERMINATED/DEAD;


// Thread.yield()
// Thread.wait()

class Task1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("starting task 1");
		for (int i=0;i<=10;i++) {
			System.out.println("running task1");
		}
		System.out.println("finished task1");
	}
}

class Task2 implements Runnable {
	public void run() {
		System.out.println("starting task2");
		for (int i=0;i<=10;i++) {
			System.out.println("running task2");
		}
		System.out.println("finished task2");
	}
}


public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Task1 aThread1 = new Task1();
        Task2 aTask2 = new Task2();
        Thread aThread2 = new Thread(aTask2);
        aThread2.setPriority(10);
        aThread1.start();
        aThread2.start();
        
        
        try {
        	aThread1.join();
        	aThread2.join();
        }
        catch(Exception e) {
        	System.out.println("Interrupted");
        }
        
        System.out.println("task3 started");
        for (int i=0;i<=10;i++) {
			System.out.println("running task3");
		}
		System.out.println("finished task3");
        
        }
	}

