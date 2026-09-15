package com.tbuonomo.viewpagerdotsindicator.attacher;

import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher$setup$1;
import defpackage.MediaSpecOutputFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Attachable", "Adapter", "", "TuitionPaymentFragmentbindingInflater1", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DotsIndicatorAttacher$setup$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ BaseDotsIndicator $baseDotsIndicator;

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        TuitionPaymentFragmentbindingInflater1();
        return Unit.INSTANCE;
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        final BaseDotsIndicator baseDotsIndicator = this.$baseDotsIndicator;
        baseDotsIndicator.post(new Runnable() { // from class: OutputOptionsOutputOptionsInternal
            @Override // java.lang.Runnable
            public final void run() {
                DotsIndicatorAttacher$setup$1.b(baseDotsIndicator);
            }
        });
    }

    public static /* synthetic */ void b(BaseDotsIndicator baseDotsIndicator) {
        Intrinsics.checkNotNullParameter(baseDotsIndicator, "");
        if (baseDotsIndicator.pager != null) {
            baseDotsIndicator.post(new MediaSpecOutputFormat(baseDotsIndicator));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicatorAttacher$setup$1(BaseDotsIndicator baseDotsIndicator) {
        super(0);
        this.$baseDotsIndicator = baseDotsIndicator;
    }
}
