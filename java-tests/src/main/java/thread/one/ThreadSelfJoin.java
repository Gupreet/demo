package thread.one;

public class ThreadSelfJoin {

public static void main(String[] args) throws InterruptedException {
Thread.currentThread().join();	
}
}
