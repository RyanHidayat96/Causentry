package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\tJB\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\u000e\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\r\u0012\u0004\u0012\u00028\u00010\fH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Interval", "", "<init>", "()V", "", "p0", "getContentType", "(I)Ljava/lang/Object;", "getKey", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "p1", "withInterval", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "getItemCount", "()I", "itemCount"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {
    public static final int $stable = 0;

    public abstract IntervalList<Interval> getIntervals();

    public final int getItemCount() {
        return getIntervals().getSize();
    }

    public final <T> T withInterval(int p0, Function2<? super Integer, ? super Interval, ? extends T> p1) {
        IntervalList.Interval<Interval> interval = getIntervals().get(p0);
        return p1.invoke(Integer.valueOf(p0 - interval.getStartIndex()), interval.getValue());
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R'\u0010\u0007\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R'\u0010\t\u001a\u0015\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "getKey", "()Lkotlin/jvm/functions/Function1;", "key", "getType", "type"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Interval {
        default Function1<Integer, Object> getKey() {
            return null;
        }

        default Function1<Integer, Object> getType() {
            return new Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval$type$1
                public final Void invoke(int i) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            };
        }
    }

    public final Object getKey(int p0) {
        Object objInvoke;
        IntervalList.Interval<Interval> interval = getIntervals().get(p0);
        int startIndex = interval.getStartIndex();
        Function1<Integer, Object> key = interval.getValue().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(p0 - startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(p0) : objInvoke;
    }

    public final Object getContentType(int p0) {
        IntervalList.Interval<Interval> interval = getIntervals().get(p0);
        return interval.getValue().getType().invoke(Integer.valueOf(p0 - interval.getStartIndex()));
    }
}
