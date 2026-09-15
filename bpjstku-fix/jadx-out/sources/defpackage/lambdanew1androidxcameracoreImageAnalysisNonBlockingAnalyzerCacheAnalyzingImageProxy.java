package defpackage;

import com.datadog.android.core.configuration.BackPressureMitigation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Llambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;", "", "", "p0", "Lkotlin/Function0;", "", "p1", "Lkotlin/Function1;", "p2", "Lcom/datadog/android/core/configuration/BackPressureMitigation;", "p3", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/core/configuration/BackPressureMitigation;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/core/configuration/BackPressureMitigation;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "I", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final BackPressureMitigation b;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Function1<Object, Unit> TuitionPaymentFragmentbindingInflater1;

    public lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy(Function0<Unit> function0, Function1<Object, Unit> function1, BackPressureMitigation backPressureMitigation) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(backPressureMitigation, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1024;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function0;
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.b = backPressureMitigation;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy)) {
            return false;
        }
        lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy = (lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy) p0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy.TuitionPaymentFragmentbindingInflater1) && this.b == lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy.b;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Function0<Unit> function0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Function1<Object, Unit> function1 = this.TuitionPaymentFragmentbindingInflater1;
        BackPressureMitigation backPressureMitigation = this.b;
        StringBuilder sb = new StringBuilder("lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(i);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(function0);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(function1);
        sb.append(", b=");
        sb.append(backPressureMitigation);
        sb.append(")");
        return sb.toString();
    }
}
