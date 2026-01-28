class ClassNotFoundDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.fake.UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred");
        }
    }
}

//NoClassDefFoundError is a runtime Error in Java that occurs when the 
// Java Virtual Machine (JVM) is unable to find the definition of a class at runtime, 
// even though that class was present at compile time.

//When does NoClassDefFoundError occur?
// NoClassDefFoundError occurs under the following conditions:

// A class was successfully compiled
// The corresponding .class file is missing, deleted, or not available in the classpath at runtime
// The JVM tries to load that class during execution