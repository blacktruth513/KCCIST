package com.test13;
interface WriteLog { void write(); }
class FileLog implements WriteLog {
	public void write() { System.out.println("File Log"); }
}
class DatabaseLog implements WriteLog {
	public void write() { System.out.println("Database Log"); }
}
class WriteManager {
	WriteLog w;
	WriteManager(WriteLog w){
		this.w = w;
	}
	public void execute() {
		w.write();
	}
}
public class Test1 {
	public static void main(String[] args) {
		WriteManager o = new WriteManager(new FileLog());
		o.execute();
		WriteManager o2 = new WriteManager(new DatabaseLog());
		o2.execute();
		
	}
}
