package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Lifecycle;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class getResolutionSelector {
    private final getOnePixelShiftEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final Map<Lifecycle, RequestManager> b = new HashMap();

    getResolutionSelector(getOnePixelShiftEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    final RequestManager b(Context context, Glide glide, final Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        RequestManager requestManager = this.b.get(lifecycle);
        if (requestManager != null) {
            return requestManager;
        }
        getBackpressureStrategy getbackpressurestrategy = new getBackpressureStrategy(lifecycle);
        RequestManager requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(glide, getbackpressurestrategy, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(fragmentManager), context);
        this.b.put(lifecycle, requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        getbackpressurestrategy.TuitionPaymentFragmentbindingInflater1(new getDefaultConfig() { // from class: getResolutionSelector.3
            @Override // defpackage.getDefaultConfig
            public final void onStart() {
            }

            @Override // defpackage.getDefaultConfig
            public final void onStop() {
            }

            @Override // defpackage.getDefaultConfig
            public final void onDestroy() {
                getResolutionSelector.this.b.remove(lifecycle);
            }
        });
        if (z) {
            requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2.onStart();
        }
        return requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getUseCaseConfigBuilder {
        private final FragmentManager TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(FragmentManager fragmentManager) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentManager;
        }
    }
}
