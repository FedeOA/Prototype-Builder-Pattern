package org.example.prototype;

public interface IPrototype<T extends IPrototype> extends Cloneable {

    T clone();
    T deepClone();
}
