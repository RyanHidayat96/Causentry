package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0083\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bf\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00121\b\u0002\u0010\u000b\u001a+\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR=\u0010\u0011\u001a+\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00070\t¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0011\u0010%\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u001e\u0010$"}, d2 = {"LadjustCropRectForProblematicEncodeSize;", "R", "", "p0", "LisAvc;", "p1", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "Lkotlin/coroutines/CoroutineContext;", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/Object;LisAvc;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CancellableContinuationImpl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lkotlinx/coroutines/CancellableContinuationImpl;Ljava/lang/Throwable;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/Object;", "b", "LisAvc;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Throwable;", "()Z", "asInterface"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class adjustCropRectForProblematicEncodeSize<R> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final isAvc TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final R b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final Throwable TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function3<Throwable, R, CoroutineContext, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX WARN: Multi-variable type inference failed */
    private adjustCropRectForProblematicEncodeSize(R r, isAvc isavc, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Object obj, Throwable th) {
        this.b = r;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isavc;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj;
        this.TuitionPaymentFragmentbindingInflater1 = th;
    }

    public /* synthetic */ adjustCropRectForProblematicEncodeSize(Object obj, isAvc isavc, Function3 function3, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : isavc, (i & 4) != 0 ? null : function3, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    public final boolean b() {
        return this.TuitionPaymentFragmentbindingInflater1 != null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CancellableContinuationImpl<?> p0, Throwable p1) throws Throwable {
        isAvc isavc = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (isavc != null) {
            CancellableContinuationImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), -1044552076, getTextOn.TuitionPaymentFragmentbindingInflater1(), new Object[]{p0, isavc, p1}, 1044552079, getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1());
        }
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (function3 != null) {
            p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function3, p1, this.b);
        }
    }

    public static /* synthetic */ adjustCropRectForProblematicEncodeSize TuitionPaymentFragmentspecialinlinedviewModeldefault3(adjustCropRectForProblematicEncodeSize adjustcroprectforproblematicencodesize, Object obj, isAvc isavc, Function3 function3, Object obj2, Throwable th, int i) {
        if ((i & 1) != 0) {
            obj = adjustcroprectforproblematicencodesize.b;
        }
        Object obj3 = obj;
        if ((i & 2) != 0) {
            isavc = adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        isAvc isavc2 = isavc;
        if ((i & 4) != 0) {
            function3 = adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Function3 function4 = function3;
        if ((i & 8) != 0) {
            obj2 = adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = adjustcroprectforproblematicencodesize.TuitionPaymentFragmentbindingInflater1;
        }
        return new adjustCropRectForProblematicEncodeSize(obj3, isavc2, function4, obj4, th);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof adjustCropRectForProblematicEncodeSize)) {
            return false;
        }
        adjustCropRectForProblematicEncodeSize adjustcroprectforproblematicencodesize = (adjustCropRectForProblematicEncodeSize) p0;
        return Intrinsics.areEqual(this.b, adjustcroprectforproblematicencodesize.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, adjustcroprectforproblematicencodesize.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, adjustcroprectforproblematicencodesize.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        R r = this.b;
        int iHashCode = r == null ? 0 : r.hashCode();
        isAvc isavc = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode2 = isavc == null ? 0 : isavc.hashCode();
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode3 = function3 == null ? 0 : function3.hashCode();
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode4 = obj == null ? 0 : obj.hashCode();
        Throwable th = this.TuitionPaymentFragmentbindingInflater1;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("adjustCropRectForProblematicEncodeSize(b=");
        sb.append(this.b);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(')');
        return sb.toString();
    }
}
