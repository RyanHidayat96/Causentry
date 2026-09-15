package defpackage;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes7.dex */
public final class TextureViewImplementation11 {

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends Fragment {
        private lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private Bundle TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Object b;

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            TransformExperimental transformExperimental = null;
            accesssetAnchoredZoomModep accesssetanchoredzoommodep = transformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            TransformExperimental transformExperimental = null;
            accesssetAnchoredZoomModep accesssetanchoredzoommodep = transformExperimental.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
            throw null;
        }

        public void onEventMainThread(getTimeDelta gettimedelta) {
            if (gettimedelta != null) {
                Object obj = gettimedelta.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.executePendingTransactions();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            throw null;
        }
    }
}
