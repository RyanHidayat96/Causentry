package androidx.core.flagging;

import android.os.flagging.AconfigPackage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompatApi36Impl;", "Landroidx/core/flagging/AconfigPackageCompat;", "Landroid/os/flagging/AconfigPackage;", "p0", "<init>", "(Landroid/os/flagging/AconfigPackage;)V", "", "", "p1", "getBooleanFlagValue", "(Ljava/lang/String;Z)Z", "aconfigPackageImpl", "Landroid/os/flagging/AconfigPackage;"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class AconfigPackageCompatApi36Impl implements AconfigPackageCompat {
    private final AconfigPackage aconfigPackageImpl;

    public AconfigPackageCompatApi36Impl(AconfigPackage aconfigPackage) {
        Intrinsics.checkNotNullParameter(aconfigPackage, "");
        this.aconfigPackageImpl = aconfigPackage;
    }

    @Override // androidx.core.flagging.AconfigPackageCompat
    public final boolean getBooleanFlagValue(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.aconfigPackageImpl.getBooleanFlagValue(p0, p1);
    }
}
