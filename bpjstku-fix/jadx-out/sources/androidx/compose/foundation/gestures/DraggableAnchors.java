package androidx.compose.foundation.gestures;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ3\u0010\r\u001a\u00020\f2\"\u0010\u0004\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H&¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchors;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "closestAnchor", "(F)Ljava/lang/Object;", "", "p1", "(FZ)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "hasAnchorFor", "(Ljava/lang/Object;)Z", "maxAnchor", "()F", "minAnchor", "positionOf", "(Ljava/lang/Object;)F", "", "getSize", "()I", "size"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DraggableAnchors<T> {
    T closestAnchor(float p0);

    T closestAnchor(float p0, boolean p1);

    void forEach(Function2<? super T, ? super Float, Unit> p0);

    int getSize();

    boolean hasAnchorFor(T p0);

    float maxAnchor();

    float minAnchor();

    float positionOf(T p0);
}
