package defpackage;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"LgetPreviewTargetSize;", "", "LcreateImageAnalysis;", "p0", "Lkotlin/Function2;", "", "", "p1", "<init>", "(LcreateImageAnalysis;Lkotlin/jvm/functions/Function2;)V", "TuitionPaymentFragmentbindingInflater1", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function2;", "", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "[J", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getPreviewTargetSize {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final long[] b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final Function2<createImageAnalysis, Integer, Boolean> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final b b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f968a = new long[0];

    /* JADX WARN: Multi-variable type inference failed */
    public getPreviewTargetSize(createImageAnalysis createimageanalysis, Function2<? super createImageAnalysis, ? super Integer, Boolean> function2) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = createimageanalysis;
        this.TuitionPaymentFragmentbindingInflater1 = function2;
        int tuitionPaymentFragmentspecialinlinedviewModeldefault2 = createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 64) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2 != 64 ? (-1) << tuitionPaymentFragmentspecialinlinedviewModeldefault2 : 0L;
            this.b = f968a;
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0L;
        long[] jArr = new long[(tuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1) >>> 6];
        if ((tuitionPaymentFragmentspecialinlinedviewModeldefault2 & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        this.b = jArr;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"LgetPreviewTargetSize$b;", "", "<init>", "()V", "", "a", "[J", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
