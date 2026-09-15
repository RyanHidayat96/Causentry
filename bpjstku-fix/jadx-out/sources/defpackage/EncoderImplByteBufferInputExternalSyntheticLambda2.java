package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplByteBufferInputExternalSyntheticLambda2 {
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2((Class<?>) Throwable.class, -1);
    private static final lambdaremoveObserver8androidxcameravideointernalencoderEncoderImplByteBufferInput b;

    static {
        notifySurfaceUpdate notifysurfaceupdate;
        try {
            notifysurfaceupdate = EncoderImplByteBufferInputExternalSyntheticLambda7.b() ? notifySurfaceUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : lambdaacquireBuffer3androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } catch (Throwable unused) {
            notifysurfaceupdate = notifySurfaceUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        b = notifysurfaceupdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2) {
        Object objM8024constructorimpl;
        if (e2 instanceof isProblematicEncodeSize) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(((isProblematicEncodeSize) e2).TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8030isFailureimpl(objM8024constructorimpl)) {
                objM8024constructorimpl = null;
            }
            return (E) objM8024constructorimpl;
        }
        return (E) b.TuitionPaymentFragmentbindingInflater1(e2.getClass()).invoke(e2);
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements Function1 {
        public static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return null;
        }

        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Throwable th) {
        Object objM8024constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Throwable th2 = (Throwable) function1.invoke(th);
            if (!Intrinsics.areEqual(th.getMessage(), th2.getMessage()) && !Intrinsics.areEqual(th2.getMessage(), th.toString())) {
                th2 = null;
            }
            objM8024constructorimpl = Result.m8024constructorimpl(th2);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th3));
        }
        return (Throwable) (Result.m8030isFailureimpl(objM8024constructorimpl) ? null : objM8024constructorimpl);
    }

    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<?> cls, int i) {
        Object objM8024constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.INSTANCE;
            int i2 = 0;
            do {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } while (cls != null);
            objM8024constructorimpl = Result.m8024constructorimpl(Integer.valueOf(i2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8030isFailureimpl(objM8024constructorimpl)) {
            objM8024constructorimpl = Integer.valueOf(i);
        }
        return ((Number) objM8024constructorimpl).intValue();
    }

    public static /* synthetic */ Throwable b(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(new Object[0]);
        Intrinsics.checkNotNull(objNewInstance, "");
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    public static /* synthetic */ Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th);
        Intrinsics.checkNotNull(objNewInstance, "");
        return (Throwable) objNewInstance;
    }

    public static /* synthetic */ Throwable TuitionPaymentFragmentbindingInflater1(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage());
        Intrinsics.checkNotNull(objNewInstance, "");
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    public static /* synthetic */ Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault1(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage(), th);
        Intrinsics.checkNotNull(objNewInstance, "");
        return (Throwable) objNewInstance;
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class cls) {
        Object next;
        Function1 function1;
        Pair pair;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2 == TuitionPaymentFragmentspecialinlinedviewModeldefault2((Class<?>) cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    final Function1 function2 = new Function1() { // from class: EncoderImplInternalState
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EncoderImplByteBufferInputExternalSyntheticLambda2.b(constructor, (Throwable) obj);
                        }
                    };
                    pair = TuplesKt.to(new Function1() { // from class: EncoderImplByteBufferInputExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function2, (Throwable) obj);
                        }
                    }, 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (Intrinsics.areEqual(cls2, String.class)) {
                        final Function1 function3 = new Function1() { // from class: EncoderImplByteBufferInputExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1(constructor, (Throwable) obj);
                            }
                        };
                        pair = TuplesKt.to(new Function1() { // from class: EncoderImplByteBufferInputExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function3, (Throwable) obj);
                            }
                        }, 2);
                    } else if (Intrinsics.areEqual(cls2, Throwable.class)) {
                        final Function1 function4 = new Function1() { // from class: EncoderImplMediaCodecCallback
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(constructor, (Throwable) obj);
                            }
                        };
                        pair = TuplesKt.to(new Function1() { // from class: EncoderImplByteBufferInputExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function4, (Throwable) obj);
                            }
                        }, 1);
                    } else {
                        pair = TuplesKt.to(null, -1);
                    }
                } else if (length2 == 2) {
                    if (Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) {
                        final Function1 function5 = new Function1() { // from class: EncoderImplByteBufferInputExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(constructor, (Throwable) obj);
                            }
                        };
                        pair = TuplesKt.to(new Function1() { // from class: EncoderImplByteBufferInputExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function5, (Throwable) obj);
                            }
                        }, 3);
                    } else {
                        pair = TuplesKt.to(null, -1);
                    }
                } else {
                    pair = TuplesKt.to(null, -1);
                }
                arrayList.add(pair);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).getSecond()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).getSecond()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair2 = (Pair) next;
            if (pair2 != null && (function1 = (Function1) pair2.getFirst()) != null) {
                return function1;
            }
        }
        return tuitionPaymentFragmentbindingInflater1;
    }
}
