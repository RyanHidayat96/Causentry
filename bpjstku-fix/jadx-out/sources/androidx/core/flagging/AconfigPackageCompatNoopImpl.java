package androidx.core.flagging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompatNoopImpl;", "Landroidx/core/flagging/AconfigPackageCompat;", "<init>", "()V", "", "p0", "", "p1", "getBooleanFlagValue", "(Ljava/lang/String;Z)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class AconfigPackageCompatNoopImpl implements AconfigPackageCompat {
    @Override // androidx.core.flagging.AconfigPackageCompat
    public final boolean getBooleanFlagValue(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p1;
    }
}
