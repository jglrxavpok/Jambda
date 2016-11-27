package jambda;

import java.util.StringJoiner;

public class JambdaTupleType extends JambdaType {
    private final JambdaType componentType;
    private final int length;

    public JambdaTupleType(JambdaType componentType, int length) {
        super(createName(componentType, length));
        this.componentType = componentType;
        this.length = length;
    }

    private static String createName(JambdaType type, int length) {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < length; i++) {
            joiner.add(type.getName());
        }
        return joiner.toString();
    }

    public JambdaType getComponentType() {
        return componentType;
    }

    public int getLength() {
        return length;
    }
}
