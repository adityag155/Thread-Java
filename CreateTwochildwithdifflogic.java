class ThreadLogic1 implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
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
for(int i=1;i<=5;i++)
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
Thread t1, t2;
MyThread(String tname1, String tname2)
{
t1=new Thread(new ThreadLogic1(),tname1);
t2=new Thread(new ThreadLogic2(),tname2);

t1.start();
t2.start();
}
}

class CreateTwochildwithdifflogic
{
public static void main(String args[])
{
new MyThread("One","Two");
}
}