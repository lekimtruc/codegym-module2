package lession19.bt4;

public class Main {
    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] inValidClassName = new String[]{"M0318G", "P0323A"};
    public static void main(String[] args) {
        ClassNameValidate classNameValidate = new ClassNameValidate();

        for (String name: validClassName) {
            boolean isValid = classNameValidate.validate(name);
            System.out.println("Class name: " +name + " is valid: " +isValid);
        }

        for (String name: inValidClassName) {
            boolean isValid = classNameValidate.validate(name);
            System.out.println("Class name: " +name + " is valid: " +isValid);
        }
    }

}
