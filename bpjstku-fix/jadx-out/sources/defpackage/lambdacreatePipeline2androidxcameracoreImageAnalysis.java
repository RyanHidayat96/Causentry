package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class lambdacreatePipeline2androidxcameracoreImageAnalysis extends Fragment {
    Fragment TuitionPaymentFragmentbindingInflater1;
    final notifyOnImageCloseListeners TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getUseCaseConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    RequestManager TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Set<lambdacreatePipeline2androidxcameracoreImageAnalysis> b;
    private lambdacreatePipeline2androidxcameracoreImageAnalysis d;

    public lambdacreatePipeline2androidxcameracoreImageAnalysis() {
        this(new notifyOnImageCloseListeners());
    }

    private lambdacreatePipeline2androidxcameracoreImageAnalysis(notifyOnImageCloseListeners notifyonimagecloselisteners) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.b = new HashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = notifyonimagecloselisteners;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        FragmentManager fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            Context context2 = getContext();
            lambdacreatePipeline2androidxcameracoreImageAnalysis lambdacreatepipeline2androidxcameracoreimageanalysis = this.d;
            if (lambdacreatepipeline2androidxcameracoreimageanalysis != null) {
                lambdacreatepipeline2androidxcameracoreimageanalysis.b.remove(this);
                this.d = null;
            }
            getOnePixelShiftEnabled getonepixelshiftenabled = Glide.b(context2).g;
            lambdacreatePipeline2androidxcameracoreImageAnalysis lambdacreatepipeline2androidxcameracoreimageanalysis2 = getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(fragmentManager);
            if (lambdacreatepipeline2androidxcameracoreimageanalysis2 == null && (lambdacreatepipeline2androidxcameracoreimageanalysis2 = (lambdacreatePipeline2androidxcameracoreImageAnalysis) fragmentManager.findFragmentByTag("com.bumptech.glide.manager")) == null) {
                lambdacreatepipeline2androidxcameracoreimageanalysis2 = new lambdacreatePipeline2androidxcameracoreImageAnalysis();
                lambdacreatepipeline2androidxcameracoreimageanalysis2.TuitionPaymentFragmentbindingInflater1 = null;
                getonepixelshiftenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(fragmentManager, lambdacreatepipeline2androidxcameracoreimageanalysis2);
                fragmentManager.beginTransaction().add(lambdacreatepipeline2androidxcameracoreimageanalysis2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                getonepixelshiftenabled.b.obtainMessage(2, fragmentManager).sendToTarget();
            }
            this.d = lambdacreatepipeline2androidxcameracoreimageanalysis2;
            if (equals(lambdacreatepipeline2androidxcameracoreimageanalysis2)) {
                return;
            }
            this.d.b.add(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.TuitionPaymentFragmentbindingInflater1 = null;
        lambdacreatePipeline2androidxcameracoreImageAnalysis lambdacreatepipeline2androidxcameracoreimageanalysis = this.d;
        if (lambdacreatepipeline2androidxcameracoreimageanalysis != null) {
            lambdacreatepipeline2androidxcameracoreimageanalysis.b.remove(this);
            this.d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        lambdacreatePipeline2androidxcameracoreImageAnalysis lambdacreatepipeline2androidxcameracoreimageanalysis = this.d;
        if (lambdacreatepipeline2androidxcameracoreimageanalysis != null) {
            lambdacreatepipeline2androidxcameracoreimageanalysis.b.remove(this);
            this.d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.TuitionPaymentFragmentbindingInflater1;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes5.dex */
    class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getUseCaseConfigBuilder {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(lambdacreatePipeline2androidxcameracoreImageAnalysis.this);
            sb.append("}");
            return sb.toString();
        }
    }
}
