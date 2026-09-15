package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class setPlaybackState implements onPrepareFromUri<Float> {
    public static final setPlaybackState TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new setPlaybackState();

    private setPlaybackState() {
    }

    @Override // defpackage.onPrepareFromUri
    public final /* synthetic */ Float TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader) * f);
    }
}
