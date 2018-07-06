package exam.stream;

//import java.util.List;
//import java.io.File;
import java.io.IOException;
//import java.nio.charset.Charset;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Arrays;
//import java.util.stream.*;

public class streamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		List<Member> list = Arrays.asList(
				new Member ("aaa", 0, 20),
				new Member ("bbb", 1, 30),
				new Member ("ccc", 1, 40),
				new Member ("ddd", 1, 50),
				new Member ("eee", 0, 60)
		);
		*/
		/*
		Path path = Paths.get("src/exam/stream");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
		stream.close();
		*/
		
		/*
		Path path = Paths.get("src/exam/stream/data01.txt");				 
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		
		Stream<Member> memberStream;
		stream.map(stream, memberStream);
		
		//stream.forEach(System.out::println);
		//stream.close();
		//System.out.println("===========");
		
		double avg = memberStream()
		//double avg = list.stream()
			.mapToInt(mem -> mem.getAge())			
			//.mapToInt(Member::getAge())
			.average()
			.getAsDouble();
		
		System.out.println("average =" + avg);
		memberStream.close();
		
		//Stream<Member> memberStream = list.stream();
 
		 */
	} 
}
