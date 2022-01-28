package hello;

import java.util.concurrent.locks.*;
public class Lock_unlock {

	public static void main(String[] args) {
		ReentrantLock r=new ReentrantLock();
		r.lock();
		r.unlock();
		System.out.println(r.isLocked());
		

	}

}
