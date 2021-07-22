package com.test10;

interface WriteLog{
	void write();
}
class FileLog implements WriteLog{
	@Override
	public void write() {	
		System.out.println("FileLog");
	}	
}
class WriteManager{
	WriteLog o;
	WriteManager(WriteLog o){
		this.o = o;
	}
	void execute() {
		o.write();
	}
}
public class Test1 {
	public static void main(String[] args) {
		WriteManager w = new WriteManager(new FileLog());
		w.execute();
	}
}
