package cn.tedu.interf;

public abstract class Teacher  implements Job{
}
interface Job{
	void ready();
	void teach();
}