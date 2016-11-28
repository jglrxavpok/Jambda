package jambda;

import java.util.StringJoiner;

public class JambdaTupleType extends JambdaType {
    private final JambdaType[] componentTypes;
    private final int length;

    public JambdaTupleType(JambdaType... componentTypes) {
        super(createName(componentTypes));
        this.componentTypes = componentTypes;
        this.length = componentTypes.length;
    }

    private static String createName(JambdaType... types) {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < types.length; i++) {
            joiner.add(types[i].getName());
        }
        return joiner.toString();
    }

    public JambdaType[] getComponentTypes() {
        return componentTypes;
    }

    public int getLength() {
        return length;
    }
}
