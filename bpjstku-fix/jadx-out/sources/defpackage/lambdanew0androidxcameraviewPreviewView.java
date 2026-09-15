package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class lambdanew0androidxcameraviewPreviewView {
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        Object objM8024constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "");
            objM8024constructorimpl = Result.m8024constructorimpl(StringsKt.toIntOrNull(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8030isFailureimpl(objM8024constructorimpl)) {
            objM8024constructorimpl = null;
        }
        Integer num = (Integer) objM8024constructorimpl;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = num != null ? num.intValue() : 2097152;
    }
}
