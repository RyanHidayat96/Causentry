package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class getPrescribedStreamFormat {
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Object();
    private volatile Logger TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String b;

    public getPrescribedStreamFormat(Class<?> cls) {
        this.b = cls.getName();
    }

    public final Logger TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Logger logger = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (logger != null) {
            return logger;
        }
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Logger logger2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.b);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = logger3;
            return logger3;
        }
    }
}
