/*
 Write a complete Java program called Meta whose output is the text that would be the source code of a Java program named Hello that prints "Hello, world!" as its output:

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
 */


package cs.practiceit;

public class Meta {

	public static void main(String[] args) {
		System.out.println("public class Hello {\n    public static void main(String[] args) {\n        System.out.println(\"Hello, world!\");\n    }\n}");
    

	}

}
