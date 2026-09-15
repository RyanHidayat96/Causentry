package defpackage;

import androidx.p002lifecycle.ViewModel;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class isStateValid extends ViewModel {
    public final isProblematicVideoQuality<TwilightManager> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public ToolbarActionBarToolbarMenuCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final acquireBuffer b = new acquireBuffer();

    public isStateValid() {
        isProblematicVideoQuality<TwilightManager> isproblematicvideoqualityTuitionPaymentFragmentbindingInflater1 = isProblematicVideoQuality.TuitionPaymentFragmentbindingInflater1();
        Intrinsics.checkNotNullExpressionValue(isproblematicvideoqualityTuitionPaymentFragmentbindingInflater1, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isproblematicvideoqualityTuitionPaymentFragmentbindingInflater1;
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isStateValid isstatevalid, Throwable th) throws IOException {
        if (!isstatevalid.b.isDisposed()) {
            isstatevalid.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }
        getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isStateValid isstatevalid, TwilightManager twilightManager) {
        isstatevalid.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(twilightManager);
        return Unit.INSTANCE;
    }
}
