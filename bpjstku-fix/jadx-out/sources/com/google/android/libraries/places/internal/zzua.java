package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
final class zzua implements zztz {
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x002e A[RETURN] */
    @Override // com.google.android.libraries.places.internal.zztz
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i2 = 3;
        boolean z = false;
        while (i2 < stackTrace.length) {
            if (stackTrace[i2].getClassName().equals(name)) {
                z = true;
            } else {
                if (z) {
                    if (i2 != -1) {
                        return stackTrace[i2];
                    }
                    return null;
                }
                z = false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 != -1) {
            return stackTrace[i2];
        }
        return null;
    }

    zzua() {
    }
}
