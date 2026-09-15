package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class onCommand implements onPrepareFromUri<PointF> {
    public static final onCommand b = new onCommand();

    private onCommand() {
    }

    @Override // defpackage.onPrepareFromUri
    public final /* synthetic */ PointF TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token tokenCancel = jsonReader.cancel();
        if (tokenCancel == JsonReader.Token.BEGIN_ARRAY) {
            return MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, f);
        }
        if (tokenCancel == JsonReader.Token.BEGIN_OBJECT) {
            return MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, f);
        }
        if (tokenCancel == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.d()) * f, ((float) jsonReader.d()) * f);
            while (jsonReader.asInterface()) {
                jsonReader.onTransact();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(tokenCancel)));
    }
}
