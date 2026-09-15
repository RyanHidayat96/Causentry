package defpackage;

import android.os.Process;
import android.view.View;
import com.bpjstku.domain.podcast.model.PodcastVideoList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getSessionStateCallback implements Function1 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ Camera2ImplConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ PodcastVideoList TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ getSessionStateCallback(Camera2ImplConfigBuilder camera2ImplConfigBuilder, PodcastVideoList podcastVideoList) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2ImplConfigBuilder;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = podcastVideoList;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 7375954;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int iMyPid = Process.myPid();
        TuitionPaymentFragmentbindingInflater1 = iMyPid;
        return iMyPid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Camera2ImplConfigBuilder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
    }
}
