package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompatCallbackStubApi21 {
    public final List<Mask> TuitionPaymentFragmentbindingInflater1;
    public final List<binderDied<Integer, Integer>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final List<binderDied<MediaControllerCompatApi23, Path>> b;

    public MediaControllerCompatCallbackStubApi21(List<Mask> list) {
        this.TuitionPaymentFragmentbindingInflater1 = list;
        this.b = new ArrayList(list.size());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.b.add(list.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(list.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1());
        }
    }
}
