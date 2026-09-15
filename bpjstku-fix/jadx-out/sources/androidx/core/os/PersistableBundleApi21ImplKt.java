package androidx.core.os;

import android.os.PersistableBundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "<init>", "()V", "Landroid/os/PersistableBundle;", "p0", "", "p1", "p2", "", "putValue", "(Landroid/os/PersistableBundle;Ljava/lang/String;Ljava/lang/Object;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class PersistableBundleApi21ImplKt {
    public static final PersistableBundleApi21ImplKt INSTANCE = new PersistableBundleApi21ImplKt();

    private PersistableBundleApi21ImplKt() {
    }

    @JvmStatic
    public static final void putValue(PersistableBundle p0, String p1, Object p2) {
        if (p2 == null) {
            p0.putString(p1, null);
            return;
        }
        if (p2 instanceof Boolean) {
            p0.putBoolean(p1, ((Boolean) p2).booleanValue());
            return;
        }
        if (p2 instanceof Double) {
            p0.putDouble(p1, ((Number) p2).doubleValue());
            return;
        }
        if (p2 instanceof Integer) {
            p0.putInt(p1, ((Number) p2).intValue());
            return;
        }
        if (p2 instanceof Long) {
            p0.putLong(p1, ((Number) p2).longValue());
            return;
        }
        if (p2 instanceof String) {
            p0.putString(p1, (String) p2);
            return;
        }
        if (p2 instanceof PersistableBundle) {
            p0.putPersistableBundle(p1, (PersistableBundle) p2);
            return;
        }
        if (p2 instanceof boolean[]) {
            p0.putBooleanArray(p1, (boolean[]) p2);
            return;
        }
        if (p2 instanceof double[]) {
            p0.putDoubleArray(p1, (double[]) p2);
            return;
        }
        if (p2 instanceof int[]) {
            p0.putIntArray(p1, (int[]) p2);
            return;
        }
        if (p2 instanceof long[]) {
            p0.putLongArray(p1, (long[]) p2);
            return;
        }
        if (p2 instanceof Object[]) {
            Class<?> componentType = p2.getClass().getComponentType();
            Intrinsics.checkNotNull(componentType);
            if (String.class.isAssignableFrom(componentType)) {
                Intrinsics.checkNotNull(p2, "");
                p0.putStringArray(p1, (String[]) p2);
                return;
            }
            String canonicalName = componentType.getCanonicalName();
            StringBuilder sb = new StringBuilder("Unsupported value array type ");
            sb.append(canonicalName);
            sb.append(" for key \"");
            sb.append(p1);
            sb.append(Typography.quote);
            throw new IllegalArgumentException(sb.toString());
        }
        String canonicalName2 = p2.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder("Unsupported value type ");
        sb2.append(canonicalName2);
        sb2.append(" for key \"");
        sb2.append(p1);
        sb2.append(Typography.quote);
        throw new IllegalArgumentException(sb2.toString());
    }
}
