package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes4.dex */
public class MiddleOutStrategy implements StackTraceTrimmingStrategy {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    private final int trimmedSize;

    public MiddleOutStrategy(int i) {
        this.trimmedSize = i;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.trimmedSize;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 9986615;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        b = iMaxMemory;
        return iMaxMemory;
    }
}
