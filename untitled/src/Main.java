public class Main {
    public static void main(String[] args) {
// if there are 2 identic texts in the console, so that means singletons reused twice, else 2 different singleton were created.
        AssignmentSinglton singleton = AssignmentSinglton.getInstance("1st Singlton");
        AssignmentSinglton anotherSingleton = AssignmentSinglton.getInstance("2nd singleton");
        System.out.println(singleton.sometext);
        System.out.println(anotherSingleton.sometext);
    }
}