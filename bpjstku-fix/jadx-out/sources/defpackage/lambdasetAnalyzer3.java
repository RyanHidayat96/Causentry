package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class lambdasetAnalyzer3 implements ImageAnalysis {
    private ImageAnalysis.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Context b;

    @Override // defpackage.getDefaultConfig
    public final void onDestroy() {
    }

    lambdasetAnalyzer3(Context context, ImageAnalysis.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        this.b = context.getApplicationContext();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.getDefaultConfig
    public final void onStart() {
        onMergeConfig onmergeconfigTuitionPaymentFragmentbindingInflater1 = onMergeConfig.TuitionPaymentFragmentbindingInflater1(this.b);
        ImageAnalysis.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (onmergeconfigTuitionPaymentFragmentbindingInflater1) {
            onmergeconfigTuitionPaymentFragmentbindingInflater1.b.add(tuitionPaymentFragmentbindingInflater1);
            if (!onmergeconfigTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && !onmergeconfigTuitionPaymentFragmentbindingInflater1.b.isEmpty()) {
                onmergeconfigTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onmergeconfigTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }
    }

    @Override // defpackage.getDefaultConfig
    public final void onStop() {
        onMergeConfig onmergeconfigTuitionPaymentFragmentbindingInflater1 = onMergeConfig.TuitionPaymentFragmentbindingInflater1(this.b);
        ImageAnalysis.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (onmergeconfigTuitionPaymentFragmentbindingInflater1) {
            onmergeconfigTuitionPaymentFragmentbindingInflater1.b.remove(tuitionPaymentFragmentbindingInflater1);
            if (onmergeconfigTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && onmergeconfigTuitionPaymentFragmentbindingInflater1.b.isEmpty()) {
                onmergeconfigTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                onmergeconfigTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            }
        }
    }
}
