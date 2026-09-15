package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/res/ResourceIdCache;", "", "<init>", "()V", "Landroid/content/res/Resources;", "p0", "", "p1", "Landroid/util/TypedValue;", "resolveResourcePath", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "", "clear", "Landroidx/collection/MutableIntObjectMap;", "resIdPathMap", "Landroidx/collection/MutableIntObjectMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResourceIdCache {
    public static final int $stable = 8;
    private final MutableIntObjectMap<TypedValue> resIdPathMap = new MutableIntObjectMap<>(0, 1, null);

    public final TypedValue resolveResourcePath(Resources p0, int p1) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = this.resIdPathMap.get(p1);
            if (typedValue == null) {
                typedValue = new TypedValue();
                p0.getValue(p1, typedValue, true);
                this.resIdPathMap.put(p1, typedValue);
            }
        }
        return typedValue;
    }

    public final void clear() {
        synchronized (this) {
            this.resIdPathMap.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
