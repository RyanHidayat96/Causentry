package defpackage;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LLifecycleCamera;", "", "<init>", "()V", "", "p0", "LgetContentPaddingRight$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)LgetContentPaddingRight$b;"}, k = 1, mv = {2, 3, 0})
public final class LifecycleCamera {
    public static final LifecycleCamera INSTANCE = new LifecycleCamera();

    private LifecycleCamera() {
    }

    @JvmStatic
    public static final getContentPaddingRight.b TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        getContentPaddingRight.b bVarB = getContentPaddingRight.b(p0);
        Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
        return bVarB;
    }
}
