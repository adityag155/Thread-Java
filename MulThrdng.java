class MyClass implements Runnable
{
Thread t;
MyClass(String tname)
{
t=new Thread(this,tname);
t.start();
}
public void run()
{
for(int i=1;i<=4;i++)
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

class MulThrdng
{
public static void main(String args[])
{
new MyThread("One");
new MyThread("Two");
new MyThread("Three");
new MyThread("Four");
}
}