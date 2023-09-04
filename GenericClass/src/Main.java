public class Main {
    public static void main(String[] args)
    {
        Character[] charArray={'J','A','V','A'};
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray ={"Java","C#","C++"};

        Student[] students = {new Student("John"),new Student("Don"),new Student("Mike")};

        PrintGenericClass<Character> printChar = new PrintGenericClass<Character>();
        PrintGenericClass<String> printString = new PrintGenericClass<String>();
        PrintGenericClass<Integer> printInt = new PrintGenericClass<Integer>();
        PrintGenericClass<Student> printStudent = new PrintGenericClass<Student>();

        printStudent.Print(students);
        printString.Print(stringArray);
        printChar.Print(charArray);
        printInt.Print(intArray);
    }
}