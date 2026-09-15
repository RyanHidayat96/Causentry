package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class isSessionReady implements setRepeatMode, binderDied.b {
    public final binderDied<?, Float> TuitionPaymentFragmentbindingInflater1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final binderDied<?, Float> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final List<binderDied.b> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
    public final binderDied<?, Float> b;
    private final String d;
    final ShapeTrimPath.Type g;

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
    }

    public isSessionReady(fromMediaSession frommediasession, ShapeTrimPath shapeTrimPath) throws Throwable {
        this.d = shapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = shapeTrimPath.TuitionPaymentFragmentbindingInflater1;
        this.g = shapeTrimPath.f365a;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater1 = shapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentbindingInflater1 = binderdiedTuitionPaymentFragmentbindingInflater1;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater2 = shapeTrimPath.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = binderdiedTuitionPaymentFragmentbindingInflater2;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater3 = shapeTrimPath.b.TuitionPaymentFragmentbindingInflater1();
        this.b = binderdiedTuitionPaymentFragmentbindingInflater3;
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater2);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater3);
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        binderdiedTuitionPaymentFragmentbindingInflater3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i++) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.d;
    }
}
