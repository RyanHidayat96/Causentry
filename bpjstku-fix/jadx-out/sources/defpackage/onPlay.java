package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class onPlay implements onPrepareFromUri<onStop> {
    public static final onPlay b = new onPlay();

    private onPlay() {
    }

    @Override // defpackage.onPrepareFromUri
    public final /* synthetic */ onStop TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.cancel() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        float fD = (float) jsonReader.d();
        float fD2 = (float) jsonReader.d();
        while (jsonReader.asInterface()) {
            jsonReader.onTransact();
        }
        if (z) {
            jsonReader.b();
        }
        return new onStop((fD / 100.0f) * f, (fD2 / 100.0f) * f);
    }
}
