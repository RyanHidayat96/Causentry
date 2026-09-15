package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
abstract class getAudioStats<T> {
    abstract T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException, InstantiationException, InvocationTargetException;

    getAudioStats() {
    }

    public static <T> getAudioStats<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(final Class<?> cls) {
        try {
            final Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new getAudioStats<T>() { // from class: getAudioStats.3
                @Override // defpackage.getAudioStats
                public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    return (T) declaredConstructor.newInstance(null);
                }

                public final String toString() {
                    return cls.getName();
                }
            };
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                final Object obj = declaredField.get(null);
                final Method method = cls2.getMethod("allocateInstance", Class.class);
                return new getAudioStats<T>() { // from class: getAudioStats.5
                    @Override // defpackage.getAudioStats
                    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException, InvocationTargetException {
                        return (T) method.invoke(obj, cls);
                    }

                    public final String toString() {
                        return cls.getName();
                    }
                };
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                try {
                    try {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        final int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new getAudioStats<T>() { // from class: getAudioStats.2
                            @Override // defpackage.getAudioStats
                            public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException, InvocationTargetException {
                                return (T) declaredMethod2.invoke(null, cls, Integer.valueOf(iIntValue));
                            }

                            public final String toString() {
                                return cls.getName();
                            }
                        };
                    } catch (Exception unused3) {
                        StringBuilder sb = new StringBuilder("cannot construct instances of ");
                        sb.append(cls.getName());
                        throw new IllegalArgumentException(sb.toString());
                    }
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (NoSuchMethodException unused5) {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new getAudioStats<T>() { // from class: getAudioStats.4
                        @Override // defpackage.getAudioStats
                        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException, InvocationTargetException {
                            return (T) declaredMethod3.invoke(null, cls, Object.class);
                        }

                        public final String toString() {
                            return cls.getName();
                        }
                    };
                } catch (InvocationTargetException e2) {
                    throw checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(e2);
                }
            } catch (IllegalAccessException unused6) {
                throw new AssertionError();
            }
        }
    }
}
