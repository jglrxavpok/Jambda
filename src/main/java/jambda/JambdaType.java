package jambda;

public class JambdaType {

    public static final JambdaType ANY = new JambdaType("Any");
    private final String name;

    public JambdaType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
