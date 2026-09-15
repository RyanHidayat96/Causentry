package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class FieldAttributes {
    private final Field field;

    public FieldAttributes(Field field) {
        this.field = (Field) Objects.requireNonNull(field);
    }

    public final Class<?> getDeclaringClass() {
        return this.field.getDeclaringClass();
    }

    public final String getName() {
        return this.field.getName();
    }

    public final Type getDeclaredType() {
        return this.field.getGenericType();
    }

    public final Class<?> getDeclaredClass() {
        return this.field.getType();
    }

    public final <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.field.getAnnotation(cls);
    }

    public final Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.field.getAnnotations());
    }

    public final boolean hasModifier(int i) {
        return (i & this.field.getModifiers()) != 0;
    }

    public final String toString() {
        return this.field.toString();
    }
}
