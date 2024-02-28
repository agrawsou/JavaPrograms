package practicePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;

public class EnumSetConcept {
	
	enum Lang{
		JAVA,
		CSHARP,
		JAVASCRIPT,
		PYTHON,
		RUBY
	}

	public static void main(String[] args) {
		
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);

		EnumSet<Lang> langsNew = EnumSet.range(Lang.JAVA, Lang.PYTHON);
		System.out.println(langsNew);
		
		ArrayList<String> names = (ArrayList<String>) Arrays.asList("Naveen","Tom","Lisa","Steve");
		System.out.println(names);
	}

}
