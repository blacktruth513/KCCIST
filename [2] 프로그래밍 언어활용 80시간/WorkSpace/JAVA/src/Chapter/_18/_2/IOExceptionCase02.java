package Chapter._18._2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase02 {

	public static void main(String[] args) {

		Path file = Paths.get("c:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
//		writer = Files.newBufferedWriter(file);	//IOException �߻� ����
//		writer.write('A');						//IOException �߻� ����
//		writer.write('B');						//IOException �߻� ����

		if (writer != null) {
//			writer.close();						//IOException �߻� ����
		}
	}

}
