import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/*
 * 22.3** (Counting the keywords in Java source code) Write a program that reads a Java
source-code file and reports the number of keywords (including null , true , and
false ) in the file. Pass the Java file name from the command line.
(Hint: Create a set to store all the Java keywords.)
 */

public class CountingTheKeywordsInJava_22_3 {

	static final String keywords[] = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
			"class", "const", "continue", "default", "do", "double", "else", "extends", "false", "final", "finally",
			"float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
			"new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
			"super", "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "void",
			"volatile", "while" };

	static final Set<String> setOfKeywords = new TreeSet<String>(Arrays.asList(keywords));

	public static void main(String[] args) {
		if (!args[0].isEmpty() && args[0].endsWith(".java")) {
			File javaFile = new File(args[0]);
			int countOfKeywords = 0;
			try {
				BufferedReader br = new BufferedReader(new FileReader(javaFile));
				String str = null;
				StringTokenizer tokens = null;
				Set<String> setOfKeywordsFound = new TreeSet<String>();
				Set<String> setOfTokensFound = new TreeSet<String>();

				while ((str = br.readLine()) != null) {
					tokens = new StringTokenizer(str, " .,:;()[]{}");
					String nextToken = tokens.nextToken();
					System.out.println(nextToken);

					if (nextToken != null) {
						setOfTokensFound.add(nextToken);
					}
				}
				br.close();

				for (String nextToken : setOfTokensFound) {
					if (setOfKeywords.contains(nextToken)) {
						setOfKeywordsFound.add(nextToken);
						countOfKeywords++;
					}
				}
				System.out.println("\n" + countOfKeywords + " Keywords are found: ");
				for (String keyword : setOfKeywordsFound) {
					System.out.println(keyword);
				}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} else {
			System.out.println("Please specify the java input file for reading the keywords in it, for running this program.");
		}
	}
}
