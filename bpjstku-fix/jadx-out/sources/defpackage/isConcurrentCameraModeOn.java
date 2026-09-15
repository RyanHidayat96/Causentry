package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class isConcurrentCameraModeOn {
    public static final String b(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        InputStream inputStream2 = inputStream;
        try {
            try {
                String strJoinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.readLines(new BufferedReader(new InputStreamReader(inputStream, "utf-8"))), "\n", null, null, 0, null, null, 62, null);
                CloseableKt.closeFinally(inputStream2, null);
                return strJoinToString$default;
            } catch (Exception unused) {
                throw new RuntimeException("Can't parse HTML file.");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream2, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        isHighResolutionDisabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = Class.forName("io.reactivex.internal.operators.observable.ObservableSampleWithObservable$TuitionPaymentFragmentspecialinlinedviewModeldefault2").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault3");
    }
}
