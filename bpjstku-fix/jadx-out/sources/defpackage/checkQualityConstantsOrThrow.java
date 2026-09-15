package defpackage;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class checkQualityConstantsOrThrow {
    private static final Class<? extends Annotation> b;
    public static final Set<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Collections.emptySet();
    public static final Type[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Type[0];

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class cls;
        try {
            cls = Class.forName("kotlin.Metadata");
            try {
                Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
            } catch (ClassNotFoundException unused) {
            }
        } catch (ClassNotFoundException unused2) {
            cls = null;
        }
        b = cls;
    }

    public static Set<? extends Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault2(AnnotatedElement annotatedElement) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotatedElement.getAnnotations()) {
            if (annotation.annotationType().isAnnotationPresent(getQualitySelector.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static RuntimeException TuitionPaymentFragmentbindingInflater1(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new TuitionPaymentFragmentspecialinlinedviewModeldefault3(b((Type) cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (!(type instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
            }
        } else if (type instanceof GenericArrayType) {
            if (!(type instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(((GenericArrayType) type).getGenericComponentType());
            }
        } else if ((type instanceof WildcardType) && !(type instanceof TuitionPaymentFragmentbindingInflater1)) {
            WildcardType wildcardType = (WildcardType) type;
            return new TuitionPaymentFragmentbindingInflater1(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static Type TuitionPaymentFragmentbindingInflater1(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    throw new IllegalArgumentException();
                }
                return upperBounds[0];
            }
        }
        return type;
    }

    public static Type TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Class<?> cls, Type type2) {
        return TuitionPaymentFragmentbindingInflater1(type, cls, type2, new LinkedHashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.reflect.Type] */
    private static Type TuitionPaymentFragmentbindingInflater1(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        Type typeTuitionPaymentFragmentbindingInflater1;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = b(type, cls, (TypeVariable<?>) typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(type, cls, componentType, collection);
                return componentType == typeTuitionPaymentFragmentbindingInflater2 ? cls2 : new TuitionPaymentFragmentspecialinlinedviewModeldefault3(typeTuitionPaymentFragmentbindingInflater2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(type, cls, genericComponentType, collection);
            return genericComponentType == typeTuitionPaymentFragmentbindingInflater3 ? genericArrayType : new TuitionPaymentFragmentspecialinlinedviewModeldefault3(typeTuitionPaymentFragmentbindingInflater3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeTuitionPaymentFragmentbindingInflater4 = TuitionPaymentFragmentbindingInflater1(type, cls, ownerType, collection);
            boolean z = typeTuitionPaymentFragmentbindingInflater4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeTuitionPaymentFragmentbindingInflater5 = TuitionPaymentFragmentbindingInflater1(type, cls, actualTypeArguments[i], collection);
                if (typeTuitionPaymentFragmentbindingInflater5 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeTuitionPaymentFragmentbindingInflater5;
                }
            }
            return z ? new TuitionPaymentFragmentspecialinlinedviewModeldefault2(typeTuitionPaymentFragmentbindingInflater4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            type2 = (WildcardType) type2;
            Type[] lowerBounds = type2.getLowerBounds();
            Type[] upperBounds = type2.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeTuitionPaymentFragmentbindingInflater6 = TuitionPaymentFragmentbindingInflater1(type, cls, lowerBounds[0], collection);
                if (typeTuitionPaymentFragmentbindingInflater6 != lowerBounds[0]) {
                    return toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault1(typeTuitionPaymentFragmentbindingInflater6);
                }
            } else if (upperBounds.length == 1 && (typeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(type, cls, upperBounds[0], collection)) != upperBounds[0]) {
                return toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault3(typeTuitionPaymentFragmentbindingInflater1);
            }
        }
        return type2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[LOOP:2: B:18:0x0034->B:28:0x0051, LOOP_START, PHI: r5
  0x0034: PHI (r5v2 java.lang.Class<?>) = (r5v1 java.lang.Class<?>), (r5v4 java.lang.Class<?>) binds: [B:17:0x0032, B:28:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[LOOP:2: B:18:0x0034->B:28:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0049 A[SYNTHETIC] */
    public static Type TuitionPaymentFragmentbindingInflater1(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Class<?> cls3 = interfaces[i];
                        if (cls3 == cls2) {
                            return cls.getGenericInterfaces()[i];
                        }
                        if (cls2.isAssignableFrom(cls3)) {
                            genericSuperclass = cls.getGenericInterfaces()[i];
                            superclass = interfaces[i];
                        } else {
                            i++;
                        }
                    } else {
                        if (!cls.isInterface()) {
                            while (cls != Object.class) {
                                superclass = cls.getSuperclass();
                                if (superclass == cls2) {
                                    return cls.getGenericSuperclass();
                                }
                                if (cls2.isAssignableFrom(superclass)) {
                                    genericSuperclass = cls.getGenericSuperclass();
                                } else {
                                    cls = superclass;
                                }
                            }
                        }
                        return cls2;
                    }
                }
            } else {
                if (!cls.isInterface()) {
                    while (cls != Object.class) {
                        superclass = cls.getSuperclass();
                        if (superclass == cls2) {
                            return cls.getGenericSuperclass();
                        }
                        if (cls2.isAssignableFrom(superclass)) {
                            genericSuperclass = cls.getGenericSuperclass();
                        } else {
                            cls = superclass;
                        }
                    }
                }
                return cls2;
            }
            Type type2 = genericSuperclass;
            cls = superclass;
            type = type2;
        }
        return type;
    }

    static int b(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            StringBuilder sb = new StringBuilder("Unexpected primitive ");
            sb.append(type);
            sb.append(". Use the boxed type.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ParameterizedType {
        public final Type[] TuitionPaymentFragmentbindingInflater1;
        private final Type TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Type TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type) != enclosingClass) {
                        StringBuilder sb = new StringBuilder("unexpected owner type for ");
                        sb.append(type2);
                        sb.append(": ");
                        sb.append(type);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (enclosingClass != null) {
                    StringBuilder sb2 = new StringBuilder("unexpected owner type for ");
                    sb2.append(type2);
                    sb2.append(": null");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = type == null ? null : checkQualityConstantsOrThrow.b(type);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = checkQualityConstantsOrThrow.b(type2);
            this.TuitionPaymentFragmentbindingInflater1 = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.TuitionPaymentFragmentbindingInflater1;
                if (i >= typeArr2.length) {
                    return;
                }
                checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(typeArr2[i]);
                Type[] typeArr3 = this.TuitionPaymentFragmentbindingInflater1;
                typeArr3[i] = checkQualityConstantsOrThrow.b(typeArr3[i]);
                i++;
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.TuitionPaymentFragmentbindingInflater1.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, (ParameterizedType) obj);
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.TuitionPaymentFragmentbindingInflater1) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) ^ checkQualityConstantsOrThrow.b((Object) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((this.TuitionPaymentFragmentbindingInflater1.length + 1) * 30);
            sb.append(checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (this.TuitionPaymentFragmentbindingInflater1.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1[0]));
            for (int i = 1; i < this.TuitionPaymentFragmentbindingInflater1.length; i++) {
                sb.append(", ");
                sb.append(checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements GenericArrayType {
        private final Type TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Type type) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = checkQualityConstantsOrThrow.b(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, (GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return sb.toString();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements WildcardType {
        private final Type TuitionPaymentFragmentbindingInflater1;
        private final Type b;

        public TuitionPaymentFragmentbindingInflater1(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length == 1) {
                checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.TuitionPaymentFragmentbindingInflater1 = checkQualityConstantsOrThrow.b(typeArr2[0]);
                this.b = Object.class;
                return;
            }
            checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(typeArr[0]);
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.b = checkQualityConstantsOrThrow.b(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.b};
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.TuitionPaymentFragmentbindingInflater1;
            return type != null ? new Type[]{type} : checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, (WildcardType) obj);
        }

        public final int hashCode() {
            Type type = this.TuitionPaymentFragmentbindingInflater1;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.b.hashCode() + 31);
        }

        public final String toString() {
            if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1));
                return sb.toString();
            }
            if (this.b == Object.class) {
                return "?";
            }
            StringBuilder sb2 = new StringBuilder("? extends ");
            sb2.append(checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b));
            return sb2.toString();
        }
    }

    public static String TuitionPaymentFragmentbindingInflater1(Type type, Set<? extends Annotation> set) {
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append(set.isEmpty() ? " (with no annotations)" : " annotated ".concat(String.valueOf(set)));
        return sb.toString();
    }

    public static AutoValue_RecordingStats<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CapabilitiesByQuality capabilitiesByQuality, Type type, Class<?> cls) {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        AutoValue_VideoSpec autoValue_VideoSpec = (AutoValue_VideoSpec) cls.getAnnotation(AutoValue_VideoSpec.class);
        if (autoValue_VideoSpec == null || !autoValue_VideoSpec.TuitionPaymentFragmentbindingInflater1()) {
            return null;
        }
        String name = cls.getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name.replace("$", "_"));
        sb.append("JsonAdapter");
        try {
            try {
                Class<?> cls2 = Class.forName(sb.toString(), true, cls.getClassLoader());
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(CapabilitiesByQuality.class, Type[].class);
                        objArr = new Object[]{capabilitiesByQuality, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(CapabilitiesByQuality.class);
                        objArr = new Object[]{capabilitiesByQuality};
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                AutoValue_RecordingStats<?> autoValue_RecordingStats = (AutoValue_RecordingStats) declaredConstructor.newInstance(objArr);
                return autoValue_RecordingStats instanceof getEncoderProfiles ? autoValue_RecordingStats : new getEncoderProfiles(autoValue_RecordingStats);
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for ".concat(String.valueOf(cls)), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for ".concat(String.valueOf(cls)), e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for ".concat(String.valueOf(cls)), e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for ".concat(String.valueOf(cls)), e5);
        } catch (InvocationTargetException e6) {
            throw TuitionPaymentFragmentbindingInflater1(e6);
        }
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Class<?> cls) {
        Class<? extends Annotation> cls2 = b;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static JsonDataException b(String str, String str2, JsonReader jsonReader) {
        String str3;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getStreamState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader.g, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jsonReader.TuitionPaymentFragmentbindingInflater1);
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", str, strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return new JsonDataException(str3);
    }

    private static Type b(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
        if (cls2 != null) {
            Type typeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(type, cls, cls2);
            if (typeTuitionPaymentFragmentbindingInflater1 instanceof ParameterizedType) {
                return ((ParameterizedType) typeTuitionPaymentFragmentbindingInflater1).getActualTypeArguments()[TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls2.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static JsonDataException TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, JsonReader jsonReader) {
        String str3;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getStreamState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader.g, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jsonReader.TuitionPaymentFragmentbindingInflater1);
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", str, strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return new JsonDataException(str3);
    }
}
