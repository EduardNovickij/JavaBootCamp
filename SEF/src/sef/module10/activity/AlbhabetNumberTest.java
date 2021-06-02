package sef.module10.activity;
//Needs to be completed
//Code that generates output synchronized from 2 threads
//First thread prints a number from 1-26 and the other prints alphabets
//against those numbers 

public class AlbhabetNumberTest {
	public static void main(String[] args)
	{
		Generator obj = new Generator();
		
		//1 - Create objects of both the thread classes and pass obj as a parameter to them 
		NumGenerator thread1 = new NumGenerator(obj);
		AlphaGenerator thread2 = new AlphaGenerator(obj);
		
		//2 - Start both the threads
		thread1.start();
		thread2.start();
		}
	}

class NumGenerator extends Thread
{
	public Generator obj;
	public NumGenerator(Generator obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		//3 - Run a loop from 1-26 (say i is the variable) and
		//call printNumber passing i as its parameter
		for(int i = 1; i<=26;i++){
			obj.printNumber(i);
		}
	}
}  

class AlphaGenerator extends Thread
{
	public Generator obj;
	public AlphaGenerator(Generator obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		
		//4 - Run a loop from A-Z (say c is the variable) and
		//call printAlbhabet passing c as its parameter
		for(char c ='A';c<='Z';c++){
			obj.printAlphabet(c);
		}
	
	}
}

class Generator {
	boolean numPrinted = false;
	public synchronized void printNumber(int number)
	{
		//5 - Check if numPrinted is true, then call wait()
		if(numPrinted){
			try {
				wait();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

		//6 - print the number here
		System.out.println(number);
		
		//7 - numPrinted should be assigned true here
		numPrinted=true;
		
		//8 - Notify the waiting thread
		notifyAll();
	}
	public synchronized void printAlphabet(char alphabet)
	{
		//9 - Check if numPrinted is false, then call wait()
		if(!numPrinted){
			try {
				wait();
			}
			catch(Exception a){
				System.out.println(a.getMessage());
			}
		}

		//10 - print the alphabet here
		System.out.println(alphabet);
		
		//11 - numPrinted should be assigned true here
		numPrinted=false;

		//12 - Notify the waiting thread
		notifyAll();
	}
} 