class MyThread implements Runnable
{
Thread t;
MyThread(String tname)
{
t=new Thread(this, tname);
t.start();
}

public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(t.getName()+":"+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}

class ThreadProgram
{
public static void main(String args[])
{
new MyThread("One");
new MyThread("Two");
}
}
