package org.example.builder;

import org.example.model.Address;

public interface IBuilder<T> {
    T build();
}
