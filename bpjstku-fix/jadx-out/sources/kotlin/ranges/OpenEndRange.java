package kotlin.ranges;

import androidx.exifinterface.media.ExifInterface;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b"}, d2 = {"Lkotlin/ranges/OpenEndRange;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "contains", "(Ljava/lang/Comparable;)Z", "isEmpty", "()Z", "getStart", "()Ljava/lang/Comparable;", "start", "getEndExclusive", "endExclusive"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OpenEndRange<T extends Comparable<? super T>> {
    boolean contains(T p0);

    T getEndExclusive();

    T getStart();

    boolean isEmpty();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends Comparable<? super T>> boolean contains(OpenEndRange<T> openEndRange, T t) {
            Intrinsics.checkNotNullParameter(t, "");
            return t.compareTo(openEndRange.getStart()) >= 0 && t.compareTo(openEndRange.getEndExclusive()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(OpenEndRange<T> openEndRange) {
            return openEndRange.getStart().compareTo(openEndRange.getEndExclusive()) >= 0;
        }
    }
}
