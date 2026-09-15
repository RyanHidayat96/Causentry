package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class registerCallback implements getPlaybackInfo, binderDied.b {
    private final prepare TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final binderDied<?, Path> f1339a;
    private final String b;
    private final Path TuitionPaymentFragmentbindingInflater1 = new Path();
    private setShuffleMode d = new setShuffleMode();

    public registerCallback(prepare prepareVar, fromMediaSession frommediasession, addOnActiveChangeListener addonactivechangelistener) {
        this.b = addonactivechangelistener.TuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = addonactivechangelistener.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = prepareVar;
        binderDied<MediaControllerCompatApi23, Path> binderdiedTuitionPaymentFragmentbindingInflater1 = addonactivechangelistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        this.f1339a = binderdiedTuitionPaymentFragmentbindingInflater1;
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        for (int i = 0; i < list.size(); i++) {
            setRepeatMode setrepeatmode = list.get(i);
            if (setrepeatmode instanceof isSessionReady) {
                isSessionReady issessionready = (isSessionReady) setrepeatmode;
                if (issessionready.g == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(issessionready);
                    issessionready.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
                }
            }
        }
    }

    @Override // defpackage.getPlaybackInfo
    public final Path TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        this.TuitionPaymentFragmentbindingInflater1.reset();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        this.TuitionPaymentFragmentbindingInflater1.set(this.f1339a.asInterface());
        this.TuitionPaymentFragmentbindingInflater1.setFillType(Path.FillType.EVEN_ODD);
        this.d.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.b;
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invalidateSelf();
    }
}
