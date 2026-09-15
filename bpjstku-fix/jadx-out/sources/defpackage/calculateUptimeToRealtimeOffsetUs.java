package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class calculateUptimeToRealtimeOffsetUs {
    final List<Boolean> TuitionPaymentFragmentbindingInflater1;
    final List<createImageAnalysis> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public List<? extends Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final List<List<Annotation>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String asBinder;
    private final Set<String> asInterface;
    final List<String> b;

    public calculateUptimeToRealtimeOffsetUs(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.asBinder = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CollectionsKt.emptyList();
        this.b = new ArrayList();
        this.asInterface = new HashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
        this.TuitionPaymentFragmentbindingInflater1 = new ArrayList();
    }

    public final void b(String str, createImageAnalysis createimageanalysis, List<? extends Annotation> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!this.asInterface.add(str)) {
            StringBuilder sb = new StringBuilder("Element with name '");
            sb.append(str);
            sb.append("' is already registered in ");
            sb.append(this.asBinder);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        this.b.add(str);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(createimageanalysis);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(list);
        this.TuitionPaymentFragmentbindingInflater1.add(Boolean.FALSE);
    }
}
