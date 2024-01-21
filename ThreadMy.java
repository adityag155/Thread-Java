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
for(int i=1;i<=7;i++)
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

class ThreadMy
{
public static void main(String args[])
{
new MyThread("One");
new MyThread("Two");
}
}

/*
O/P:
One:1
Two:1
One:2
Two:2
One:3
Two:3
One:4
Two:4
One:5
Two:5
One:6
Two:6
One:7
Two:7
*/