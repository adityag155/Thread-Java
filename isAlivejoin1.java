class MyThread implements Runnable
{
Thread t;
MyThread(String tname)
{
t=new Thread(this,tname);
t.start();
}

public void run()
{
for(int i=1;i<4;i++)
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

class isAlivejoin1
{
public static void main(String args[])
{
MyThread m1=new MyThread("One");
MyThread m2=new MyThread("Two");
MyThread m3=new MyThread("Three");

System.out.println(m1.t.isAlive());
System.out.println(m2.t.isAlive());
System.out.println(m3.t.isAlive());

try
{
m1.t.join();
m2.t.join();
m3.t.join();
}
catch(InterruptedException ie)
{}
System.out.println(m1.t.isAlive());
System.out.println(m2.t.isAlive());
System.out.println(m3.t.isAlive());
}
}

/*
O/P:
true
true
true
Two:1
One:1
Three:1
Three:2
Two:2
One:2
Two:3
Three:3
One:3
false
false
false
*/