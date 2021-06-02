package sef.module10.sample;
//Needs to be completed
//1 - extend from Thread class
class MyThread {
	
	int count;
	MyThread(int count) {
		this.count=count;
	}

	//2 - Override run method
	{
		
		for (int i = 0; i < count; i++) {
			System.out.println("Thread Name  :"
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}


