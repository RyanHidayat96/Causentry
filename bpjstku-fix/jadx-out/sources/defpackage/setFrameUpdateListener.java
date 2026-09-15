package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class setFrameUpdateListener extends lambdanew1androidxcameraviewPreviewView {
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setFrameUpdateListener(updateDisplayRotationIfNeeded updatedisplayrotationifneeded, boolean z) {
        super(updatedisplayrotationifneeded);
        Intrinsics.checkNotNullParameter(updatedisplayrotationifneeded, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.lambdanew1androidxcameraviewPreviewView
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(str);
        }
    }
}
