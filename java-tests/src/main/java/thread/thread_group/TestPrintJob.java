package thread.thread_group;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPrintJob {

	public static void main(String[] args) {
		PrintJob [] jobs= {new PrintJob("A"),
				new PrintJob("B"),
				new PrintJob("C"),
				new PrintJob("D"),
				new PrintJob("E")};
		
		ExecutorService service= Executors.newFixedThreadPool(3);
		for (PrintJob printJob : jobs) {
			service.submit(printJob);
		}
		service.shutdown();
	}
}
