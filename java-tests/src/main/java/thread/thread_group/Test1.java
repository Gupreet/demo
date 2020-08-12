package thread.thread_group;

public class Test1 {
public static void main(String[] args) {
/*	System.out.println(Thread.currentThread().getThreadGroup().getName());
	System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
*/	
	//System group contains several system level threads : Finalizer(garbageCollector),RefrenceHandler, SignalDispatcher, AttachListener

      ThreadGroup g1 = new ThreadGroup("First Group");
      System.out.println(g1.getParent().getName());
      ThreadGroup g2 = new ThreadGroup(g1,"Second Group");
      System.out.println(g2.getParent().getName());

}
}
