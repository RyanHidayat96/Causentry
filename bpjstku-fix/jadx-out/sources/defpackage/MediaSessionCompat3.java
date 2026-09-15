package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class MediaSessionCompat3 {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("x", "y");

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader jsonReader) throws IOException {
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iD = (int) (jsonReader.d() * 255.0d);
        int iD2 = (int) (jsonReader.d() * 255.0d);
        int iD3 = (int) (jsonReader.d() * 255.0d);
        while (jsonReader.asInterface()) {
            jsonReader.onTransact();
        }
        jsonReader.b();
        return Color.argb(255, iD, iD2, iD3);
    }

    static List<PointF> TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        while (jsonReader.cancel() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            arrayList.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, f));
            jsonReader.b();
        }
        jsonReader.b();
        return arrayList;
    }

    /* JADX INFO: renamed from: MediaSessionCompat3$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static PointF TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonReader jsonReader, float f) throws IOException {
        int i = AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault2[jsonReader.cancel().ordinal()];
        if (i == 1) {
            float fD = (float) jsonReader.d();
            float fD2 = (float) jsonReader.d();
            while (jsonReader.asInterface()) {
                jsonReader.onTransact();
            }
            return new PointF(fD * f, fD2 * f);
        }
        if (i == 2) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            float fD3 = (float) jsonReader.d();
            float fD4 = (float) jsonReader.d();
            while (jsonReader.cancel() != JsonReader.Token.END_ARRAY) {
                jsonReader.onTransact();
            }
            jsonReader.b();
            return new PointF(fD3 * f, fD4 * f);
        }
        if (i != 3) {
            StringBuilder sb = new StringBuilder("Unknown point starts with ");
            sb.append(jsonReader.cancel());
            throw new IllegalArgumentException(sb.toString());
        }
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0.0f;
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0.0f;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader);
            } else {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        return new PointF(fTuitionPaymentFragmentspecialinlinedviewModeldefault2 * f, fTuitionPaymentFragmentspecialinlinedviewModeldefault3 * f);
    }

    static float TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenCancel = jsonReader.cancel();
        int i = AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault2[tokenCancel.ordinal()];
        if (i == 1) {
            return (float) jsonReader.d();
        }
        if (i == 2) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            float fD = (float) jsonReader.d();
            while (jsonReader.asInterface()) {
                jsonReader.onTransact();
            }
            jsonReader.b();
            return fD;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(tokenCancel)));
    }
}
