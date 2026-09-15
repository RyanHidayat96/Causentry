package defpackage;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LresetMinLogLevel;", "", "<init>", "()V", "LrecalculateTransformMatrixAndCropRect;", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LrecalculateTransformMatrixAndCropRect;Ljava/lang/String;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LrecalculateTransformMatrixAndCropRect;Ljava/lang/String;)J", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class resetMinLogLevel {
    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(recalculateTransformMatrixAndCropRect p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Map<String, Object> map = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("session-replay");
        if (map == null) {
            return false;
        }
        Object obj = map.get(p1);
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map2 != null ? map2.get("has_replay") : null;
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static long TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateTransformMatrixAndCropRect p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Map<String, Object> map = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get("session-replay");
        if (map == null) {
            return 0L;
        }
        Object obj = map.get(p1);
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map2 != null ? map2.get("records_count") : null;
        Long l = obj2 instanceof Long ? (Long) obj2 : null;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
