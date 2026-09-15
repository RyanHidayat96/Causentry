package defpackage;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013"}, d2 = {"LlambdatakePicture2androidxcameracoreImageCapture;", "LgetJpegQualityInternal;", "LgetSupportedEffectTargets;", "p0", "<init>", "(LgetSupportedEffectTargets;)V", "", "", "p1", "p2", "", "p3", "", "b", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Throwable;)J", "Ljava/util/concurrent/ConcurrentHashMap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/concurrent/ConcurrentHashMap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetSupportedEffectTargets;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class lambdatakePicture2androidxcameracoreImageCapture implements getJpegQualityInternal {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, Long> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final getSupportedEffectTargets TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final long TuitionPaymentFragmentbindingInflater1 = TimeUnit.MINUTES.toMillis(1);

    public lambdatakePicture2androidxcameracoreImageCapture(getSupportedEffectTargets getsupportedeffecttargets) {
        Intrinsics.checkNotNullParameter(getsupportedeffecttargets, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedeffecttargets;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ConcurrentHashMap<>();
    }

    @Override // defpackage.getJpegQualityInternal
    public final long b(String p0, int p1, Integer p2, Throwable p3) {
        long jMin;
        Long lPutIfAbsent;
        Intrinsics.checkNotNullParameter(p0, "");
        ConcurrentHashMap<String, Long> concurrentHashMap = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Long lValueOf = concurrentHashMap.get(p0);
        if (lValueOf == null && (lPutIfAbsent = concurrentHashMap.putIfAbsent(p0, (lValueOf = Long.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)))) != null) {
            lValueOf = lPutIfAbsent;
        }
        Long l = lValueOf;
        if (p1 <= 0 || p3 != null || p2 == null || p2.intValue() != 202) {
            Intrinsics.checkNotNullExpressionValue(l, "");
            jMin = p3 instanceof IOException ? TuitionPaymentFragmentbindingInflater1 : Math.min(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, MathKt.roundToLong(l.longValue() * 1.1d));
        } else {
            Intrinsics.checkNotNullExpressionValue(l, "");
            jMin = Math.max(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, MathKt.roundToLong(l.longValue() * 0.9d));
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(p0, Long.valueOf(jMin));
        return jMin;
    }
}
