package home.java.learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		List<String> arg = new ArrayList<String>();
		arg.add("spring");
		arg.add("boot");
		arg.add("batch");
		arg.add("jdbc");
		arg.add("aop");
		arg.add("another");
//		arg.sort((o1, o2) -> o1.compareTo(String.valueOf(o2.compareTo(o1))));
		List<String> colletedList = arg.stream().filter(str ->str.startsWith("a")).collect(Collectors.toList());
		colletedList.stream().forEach(System.out::println);
		System.out.println("================================");
		List<String> startsWithA = new ArrayList<>();
		for(String str : arg){
			System.out.println("String from list "+str);
			if(str.startsWith("a")){

				startsWithA.add(str);
			}
		}
		for(String str : startsWithA){
			System.out.println(str);
		}

		SpringApplication.run(Application.class, args);
	}

}
