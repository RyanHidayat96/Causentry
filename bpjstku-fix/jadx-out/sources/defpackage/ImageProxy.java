package defpackage;

import com.datadog.android.api.InternalLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageProxy {
    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, byte[] bArr2, int i, int i2, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        if (i + i2 <= bArr2.length) {
            if (i2 <= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, i, i2);
                return true;
            }
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Cannot copy ByteArray, src doesn't have enough data";
                }
            }, null, false, null);
            return false;
        }
        internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot copy ByteArray, dest doesn't have enough space";
            }
        }, null, false, null);
        return false;
    }
}
