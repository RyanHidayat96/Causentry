package androidx.core.flagging;

import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.os.flagging.AconfigStorageReadException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/core/flagging/Flags;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Flags {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final Map<String, AconfigPackage> aconfigCache;
    private static final Set<String> missingPackageCache;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/core/flagging/Flags$Companion;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "getBooleanFlagValue", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "Landroid/os/flagging/AconfigPackage;", "aconfigCache", "Ljava/util/Map;", "", "missingPackageCache", "Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ boolean getBooleanFlagValue$default(Companion companion, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.getBooleanFlagValue(str, str2, z);
        }

        @JvmStatic
        public final boolean getBooleanFlagValue(String p0, String p1, boolean p2) {
            AconfigPackage aconfigPackage;
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (Build.VERSION.SDK_INT < 36) {
                return p2;
            }
            Map map = Flags.aconfigCache;
            Intrinsics.checkNotNull(map);
            Set set = Flags.missingPackageCache;
            Intrinsics.checkNotNull(set);
            if (map.containsKey(p0)) {
                aconfigPackage = (AconfigPackage) map.get(p0);
            } else if (set.contains(p0)) {
                aconfigPackage = null;
            } else {
                try {
                    AconfigPackage aconfigPackageLoad = AconfigPackage.load(p0);
                    map.put(p0, aconfigPackageLoad);
                    Unit unit = Unit.INSTANCE;
                    aconfigPackage = aconfigPackageLoad;
                } catch (AconfigStorageReadException unused) {
                    set.add(p0);
                    aconfigPackage = null;
                }
            }
            return aconfigPackage != null ? aconfigPackage.getBooleanFlagValue(p1, p2) : p2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean getBooleanFlagValue(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return getBooleanFlagValue$default(this, str, str2, false, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        aconfigCache = Build.VERSION.SDK_INT >= 36 ? new ConcurrentHashMap() : null;
        missingPackageCache = Build.VERSION.SDK_INT >= 36 ? new CopyOnWriteArraySet() : null;
    }

    @JvmStatic
    public static final boolean getBooleanFlagValue(String str, String str2) {
        return INSTANCE.getBooleanFlagValue(str, str2);
    }

    @JvmStatic
    public static final boolean getBooleanFlagValue(String str, String str2, boolean z) {
        return INSTANCE.getBooleanFlagValue(str, str2, z);
    }
}
