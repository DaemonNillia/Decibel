package core;

import java.util.ArrayList;

@FunctionalInterface
public interface BuiltInFunction {
    public Data<?> call(ArrayList<?> args);
}