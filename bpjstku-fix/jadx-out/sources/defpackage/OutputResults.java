package defpackage;

import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher$setup$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OutputResults<Attachable, Adapter> {
    public abstract BaseDotsIndicator.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Attachable attachable, Adapter adapter);

    public abstract Adapter TuitionPaymentFragmentspecialinlinedviewModeldefault3(Attachable attachable);

    public abstract void b(Attachable attachable, Adapter adapter, Function0<Unit> function0);

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseDotsIndicator baseDotsIndicator, Attachable attachable) {
        Intrinsics.checkNotNullParameter(baseDotsIndicator, "");
        Adapter adapterTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(attachable);
        if (adapterTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        b(attachable, adapterTuitionPaymentFragmentspecialinlinedviewModeldefault3, new DotsIndicatorAttacher$setup$1(baseDotsIndicator));
        baseDotsIndicator.setPager(TuitionPaymentFragmentspecialinlinedviewModeldefault2(attachable, adapterTuitionPaymentFragmentspecialinlinedviewModeldefault3));
        if (baseDotsIndicator.pager != null) {
            baseDotsIndicator.post(new MediaSpecOutputFormat(baseDotsIndicator));
        }
    }
}
