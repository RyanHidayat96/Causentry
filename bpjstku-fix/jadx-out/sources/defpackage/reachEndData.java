package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class reachEndData {
    private static final String TuitionPaymentFragmentbindingInflater1;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final StackTraceElement TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        Object objM8024constructorimpl;
        Object objM8024constructorimpl2;
        new MediaBrowserCompat();
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer.b);
        sb.append('.');
        sb.append("_BOUNDARY");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new StackTraceElement(sb.toString(), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (String) (Result.m8027exceptionOrNullimpl(objM8024constructorimpl) == null ? objM8024constructorimpl : "kotlin.coroutines.jvm.internal.BaseContinuationImpl");
        try {
            Result.Companion companion3 = Result.INSTANCE;
            objM8024constructorimpl2 = Result.m8024constructorimpl(Class.forName("reachEndData").getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM8024constructorimpl2 = Result.m8024constructorimpl(ResultKt.createFailure(th2));
        }
        TuitionPaymentFragmentbindingInflater1 = (String) (Result.m8027exceptionOrNullimpl(objM8024constructorimpl2) == null ? objM8024constructorimpl2 : "reachEndData");
    }

    public static final <E extends Throwable> E TuitionPaymentFragmentspecialinlinedviewModeldefault2(E e2) {
        E e3;
        StackTraceElement stackTraceElement;
        if (!scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault1() || (e3 = (E) EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2)) == null) {
            return e2;
        }
        StackTraceElement[] stackTrace = e3.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i = length2 - 1;
            if (Intrinsics.areEqual(TuitionPaymentFragmentbindingInflater1, stackTrace[length2].getClassName())) {
                break;
            }
            if (i < 0) {
                length2 = -1;
                break;
            }
            length2 = i;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(stackTrace, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i2 = (length - length2) - (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1 ? 0 : length - iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                stackTraceElement = stackTrace[((length2 + 1) + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    public static final <E extends Throwable> E b(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && Intrinsics.areEqual(e3.getClass(), e2.getClass())) {
            for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                if (StringsKt.startsWith$default(stackTraceElement.getClassName(), IconCompatParcelizer.b, false, 2, (Object) null)) {
                    return e3;
                }
            }
        }
        return e2;
    }

    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final /* synthetic */ Throwable TuitionPaymentFragmentbindingInflater1(Throwable th, CoroutineStackFrame coroutineStackFrame) {
        Pair pair;
        StackTraceElement[] stackTraceElementArr;
        Throwable cause = th.getCause();
        int i = 0;
        if (cause != null && Intrinsics.areEqual(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    pair = TuplesKt.to(th, new StackTraceElement[0]);
                    break;
                }
                if (StringsKt.startsWith$default(stackTrace[i2].getClassName(), IconCompatParcelizer.b, false, 2, (Object) null)) {
                    pair = TuplesKt.to(cause, stackTrace);
                    break;
                }
                i2++;
            }
        } else {
            pair = TuplesKt.to(th, new StackTraceElement[0]);
        }
        Throwable th2 = (Throwable) pair.component1();
        StackTraceElement[] stackTraceElementArr2 = (StackTraceElement[]) pair.component2();
        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncoderImplByteBufferInputExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            ArrayDeque arrayDeque = new ArrayDeque();
            StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayDeque.add(stackTraceElement);
            }
            while (true) {
                if (!(coroutineStackFrame instanceof CoroutineStackFrame)) {
                    coroutineStackFrame = null;
                }
                if (coroutineStackFrame == null || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                    break;
                }
                StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
                if (stackTraceElement2 != null) {
                    arrayDeque.add(stackTraceElement2);
                }
            }
            if (!arrayDeque.isEmpty()) {
                if (th2 != th) {
                    int length2 = stackTraceElementArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            i3 = -1;
                            break;
                        }
                        if (StringsKt.startsWith$default(stackTraceElementArr2[i3].getClassName(), IconCompatParcelizer.b, false, 2, (Object) null)) {
                            break;
                        }
                        i3++;
                    }
                    int i4 = i3 + 1;
                    int length3 = stackTraceElementArr2.length - 1;
                    if (i4 <= length3) {
                        while (true) {
                            StackTraceElement stackTraceElement3 = stackTraceElementArr2[length3];
                            StackTraceElement stackTraceElement4 = (StackTraceElement) arrayDeque.getLast();
                            if (stackTraceElement3.getLineNumber() == stackTraceElement4.getLineNumber() && Intrinsics.areEqual(stackTraceElement3.getMethodName(), stackTraceElement4.getMethodName()) && Intrinsics.areEqual(stackTraceElement3.getFileName(), stackTraceElement4.getFileName()) && Intrinsics.areEqual(stackTraceElement3.getClassName(), stackTraceElement4.getClassName())) {
                                arrayDeque.removeLast();
                            }
                            arrayDeque.addFirst(stackTraceElementArr2[length3]);
                            if (length3 == i4) {
                                break;
                            }
                            length3--;
                        }
                    }
                }
                arrayDeque.addFirst(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                StackTraceElement[] stackTrace2 = th2.getStackTrace();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(stackTrace2, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != -1) {
                    StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[arrayDeque.size() + iTuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    for (int i5 = 0; i5 < iTuitionPaymentFragmentspecialinlinedviewModeldefault1; i5++) {
                        stackTraceElementArr3[i5] = stackTrace2[i5];
                    }
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        stackTraceElementArr3[i + iTuitionPaymentFragmentspecialinlinedviewModeldefault1] = (StackTraceElement) it.next();
                        i++;
                    }
                    stackTraceElementArr = stackTraceElementArr3;
                } else {
                    stackTraceElementArr = (StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]);
                }
                thTuitionPaymentFragmentspecialinlinedviewModeldefault1.setStackTrace(stackTraceElementArr);
                return thTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        }
        return th;
    }
}
