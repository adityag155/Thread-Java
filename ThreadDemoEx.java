class ThreadLogic1 implements Runnable
{
public void run()
{
for(int i=1;i<=4;i++)
{
System.out.println(Thread.currentThread().getName()+":"+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}

class ThreadLogic2 implements Runnable
{
public void run()
{
for(int i=5;i<8;i++)
{
System.out.println(Thread.currentThread().getName()+":"+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}

class MyThread
{
Thread t1,t2;
MyThread(String tname1, String tname2)
{
t1=new Thread(new ThreadLogic1(),tname1);
t2=new Thread(new ThreadLogic2(),tname2);

t1.start();
t2.start();
}
}

class ThreadDemoEx
{
public static void main(String args[])
{
new MyThread("One","Two");
}
}

/*
O/P:
Two:5
One:1
One:2
Two:6
One:3
Two:7
One:4
*/