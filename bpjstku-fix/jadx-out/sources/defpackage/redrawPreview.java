package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class redrawPreview extends lambdanew1androidxcameraviewPreviewView {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final PreviewStreamStateObserver2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public redrawPreview(updateDisplayRotationIfNeeded updatedisplayrotationifneeded, PreviewStreamStateObserver2 previewStreamStateObserver2) {
        super(updatedisplayrotationifneeded);
        Intrinsics.checkNotNullParameter(updatedisplayrotationifneeded, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        this.b = previewStreamStateObserver2;
    }

    @Override // defpackage.lambdanew1androidxcameraviewPreviewView
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3--;
    }

    @Override // defpackage.lambdanew1androidxcameraviewPreviewView
    public final void b() {
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
    }

    @Override // defpackage.lambdanew1androidxcameraviewPreviewView
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentbindingInflater1 = false;
        Intrinsics.checkNotNullParameter("\n", "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b("\n");
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g;
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(str);
        }
    }

    @Override // defpackage.lambdanew1androidxcameraviewPreviewView
    public final void TuitionPaymentFragmentbindingInflater1() {
        if (!this.TuitionPaymentFragmentbindingInflater1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = false;
        }
    }

    @Override // defpackage.lambdanew1androidxcameraviewPreviewView
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(' ');
    }
}
