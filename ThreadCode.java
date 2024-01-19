class MyThread implements Runnable
{
Thread t;
boolean b=true;
long cnt=0;
MyThread(int p)
{
t=new Thread(this);
t.start();
}
public void run()
{
while(b)
cnt++;
}
}

class ThreadCode
{
public static void main(String args[])
{

MyThread m1=new MyThread(3);
MyThread m2=new MyThread(8);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
m1.b=false;
m2.b=false;
System.out.println(m1.cnt);
System.out.println(m2.cnt);
}
}

/*
O/P:
142674306
143171908
*/