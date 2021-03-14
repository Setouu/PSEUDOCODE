////Assignment 6, from a page about singlton provided in the moodle.

public final class AssignmentSinglton {
    // I am using the constant  to  initialize the instance as described in the page
    private final static AssignmentSinglton assignmentSinglton = new AssignmentSinglton();

    //for example
    private static AssignmentSinglton someinstance;
    public String sometext;

    // Also, I can use static block to initialize  another instance of the class
//	private static AssignmentSinglton assignmentSinglton2;

    private AssignmentSinglton(String text) {
        // Wrote this part of the code for slow initialization
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.sometext = text;
    }

    // no-argument constructor with modifier "private"
    public AssignmentSinglton() {

    }


    // Only one instance in the class, and we can return it: also it can be called globally

//    public static AssignmentSinglton getInstance() {
//      return assignmentSinglton;
//   }

    public static AssignmentSinglton getInstance(String text) {
        if (someinstance == null) {
            someinstance = new AssignmentSinglton(text);
        }
        return someinstance;
    }
}