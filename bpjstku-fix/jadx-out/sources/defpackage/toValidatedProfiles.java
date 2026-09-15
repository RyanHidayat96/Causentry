package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class toValidatedProfiles {
    public static WildcardType TuitionPaymentFragmentspecialinlinedviewModeldefault3(Type type) {
        Type[] upperBounds;
        if (type instanceof WildcardType) {
            upperBounds = ((WildcardType) type).getUpperBounds();
        } else {
            upperBounds = new Type[]{type};
        }
        return new checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(upperBounds, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static WildcardType TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type) {
        Type[] lowerBounds;
        if (type instanceof WildcardType) {
            lowerBounds = ((WildcardType) type).getLowerBounds();
        } else {
            lowerBounds = new Type[]{type};
        }
        return new checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(new Type[]{Object.class}, lowerBounds);
    }

    public static Class<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                return (Class) ((ParameterizedType) type).getRawType();
            }
            if (type instanceof GenericArrayType) {
                return Array.newInstance(TuitionPaymentFragmentspecialinlinedviewModeldefault2(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            } else {
                String name = type == null ? "null" : type.getClass().getName();
                StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (Class) type;
    }

    public static Type TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Class<?> cls) {
        if (!Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        Type typeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(type, cls, checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(type, cls, Collection.class));
        if (typeTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof WildcardType) {
            typeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((WildcardType) typeTuitionPaymentFragmentspecialinlinedviewModeldefault1).getUpperBounds()[0];
        }
        if (typeTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ParameterizedType) {
            return ((ParameterizedType) typeTuitionPaymentFragmentspecialinlinedviewModeldefault1).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        while (type != type2) {
            if (type instanceof Class) {
                if (type2 instanceof GenericArrayType) {
                    type = ((Class) type).getComponentType();
                    type2 = ((GenericArrayType) type2).getGenericComponentType();
                } else {
                    return type.equals(type2);
                }
            } else {
                if (type instanceof ParameterizedType) {
                    if (!(type2 instanceof ParameterizedType)) {
                        return false;
                    }
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                    if (parameterizedType instanceof checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        actualTypeArguments = ((checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2) parameterizedType).TuitionPaymentFragmentbindingInflater1;
                    } else {
                        actualTypeArguments = parameterizedType.getActualTypeArguments();
                    }
                    if (parameterizedType2 instanceof checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        actualTypeArguments2 = ((checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2) parameterizedType2).TuitionPaymentFragmentbindingInflater1;
                    } else {
                        actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                    }
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault1(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
                }
                if (type instanceof GenericArrayType) {
                    if (type2 instanceof Class) {
                        Class<?> componentType = ((Class) type2).getComponentType();
                        type2 = ((GenericArrayType) type).getGenericComponentType();
                        type = componentType;
                    } else {
                        if (!(type2 instanceof GenericArrayType)) {
                            return false;
                        }
                        type = ((GenericArrayType) type).getGenericComponentType();
                        type2 = ((GenericArrayType) type2).getGenericComponentType();
                    }
                } else {
                    if (type instanceof WildcardType) {
                        if (!(type2 instanceof WildcardType)) {
                            return false;
                        }
                        WildcardType wildcardType = (WildcardType) type;
                        WildcardType wildcardType2 = (WildcardType) type2;
                        return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                    }
                    if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                        return false;
                    }
                    TypeVariable typeVariable = (TypeVariable) type;
                    TypeVariable typeVariable2 = (TypeVariable) type2;
                    return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
                }
            }
        }
        return true;
    }
}
