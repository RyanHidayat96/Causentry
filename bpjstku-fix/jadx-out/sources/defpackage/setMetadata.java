package defpackage;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class setMetadata implements onPrepareFromUri<Integer> {
    public static final setMetadata TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new setMetadata();

    private setMetadata() {
    }

    @Override // defpackage.onPrepareFromUri
    public final /* synthetic */ Integer TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.cancel() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        double d = jsonReader.d();
        double d2 = jsonReader.d();
        double d3 = jsonReader.d();
        double d4 = jsonReader.d();
        if (z) {
            jsonReader.b();
        }
        if (d <= 1.0d && d2 <= 1.0d && d3 <= 1.0d) {
            d *= 255.0d;
            d2 *= 255.0d;
            d3 *= 255.0d;
            if (d4 <= 1.0d) {
                d4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d4, (int) d, (int) d2, (int) d3));
    }
}
