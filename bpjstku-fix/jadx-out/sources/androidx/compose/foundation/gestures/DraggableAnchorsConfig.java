package androidx.compose.foundation.gestures;

import androidx.collection.MutableObjectFloatMap;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u00020\u0007*\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "", "p0", "", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_AT, "(Ljava/lang/Object;F)V", "Landroidx/collection/MutableObjectFloatMap;", "anchors", "Landroidx/collection/MutableObjectFloatMap;", "getAnchors$foundation_release", "()Landroidx/collection/MutableObjectFloatMap;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final MutableObjectFloatMap<T> anchors = new MutableObjectFloatMap<>(0, 1, null);

    public final MutableObjectFloatMap<T> getAnchors$foundation_release() {
        return this.anchors;
    }

    public final void at(T t, float f) {
        this.anchors.set(t, f);
    }
}
