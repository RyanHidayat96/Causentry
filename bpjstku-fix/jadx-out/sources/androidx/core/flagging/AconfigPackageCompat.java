package androidx.core.flagging;

import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.os.flagging.AconfigStorageReadException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompat;", "", "", "p0", "", "p1", "getBooleanFlagValue", "(Ljava/lang/String;Z)Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AconfigPackageCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean getBooleanFlagValue(String p0, boolean p1);

    @JvmStatic
    static AconfigPackageCompat load(String str) throws AconfigStorageReadException {
        return INSTANCE.load(str);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompat$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/core/flagging/AconfigPackageCompat;", "load", "(Ljava/lang/String;)Landroidx/core/flagging/AconfigPackageCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: android.os.flagging.AconfigStorageReadException */
        @JvmStatic
        public final AconfigPackageCompat load(String p0) throws AconfigStorageReadException {
            Intrinsics.checkNotNullParameter(p0, "");
            if (Build.VERSION.SDK_INT >= 36) {
                try {
                    AconfigPackage aconfigPackageLoad = AconfigPackage.load(p0);
                    Intrinsics.checkNotNullExpressionValue(aconfigPackageLoad, "");
                    return new AconfigPackageCompatApi36Impl(aconfigPackageLoad);
                } catch (AconfigStorageReadException e2) {
                    if (e2.getErrorCode() == 2) {
                        return new AconfigPackageCompatNoopImpl();
                    }
                    throw e2;
                }
            }
            return new AconfigPackageCompatNoopImpl();
        }
    }
}
