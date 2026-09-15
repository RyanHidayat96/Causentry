package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class MediaSessionCompatCallback {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("k");

    static <T> List<onSkipToNext<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader jsonReader, previous previousVar, float f, onPrepareFromUri<T> onpreparefromuri) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.cancel() != JsonReader.Token.STRING) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            while (jsonReader.asInterface()) {
                if (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3) == 0) {
                    if (jsonReader.cancel() == JsonReader.Token.BEGIN_ARRAY) {
                        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if (jsonReader.cancel() == JsonReader.Token.NUMBER) {
                            arrayList.add(MediaSessionCompat1.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar, f, onpreparefromuri, false));
                        } else {
                            while (jsonReader.asInterface()) {
                                arrayList.add(MediaSessionCompat1.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar, f, onpreparefromuri, true));
                            }
                        }
                        jsonReader.b();
                    } else {
                        arrayList.add(MediaSessionCompat1.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar, f, onpreparefromuri, false));
                    }
                } else {
                    jsonReader.onTransact();
                }
            }
            jsonReader.TuitionPaymentFragmentbindingInflater1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
            return arrayList;
        }
        onSetCaptioningEnabled.b("Lottie doesn't support expressions.");
        previousVar.notify.add("Lottie doesn't support expressions.");
        return arrayList;
    }

    public static <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<? extends onSkipToNext<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            onSkipToNext<T> onskiptonext = list.get(i2);
            i2++;
            onSkipToNext<T> onskiptonext2 = list.get(i2);
            onskiptonext.TuitionPaymentFragmentbindingInflater1 = Float.valueOf(onskiptonext2.asInterface);
            if (onskiptonext.b == null && onskiptonext2.d != null) {
                onskiptonext.b = onskiptonext2.d;
                if (onskiptonext instanceof postToHandler) {
                    ((postToHandler) onskiptonext).b();
                }
            }
        }
        onSkipToNext<T> onskiptonext3 = list.get(i);
        if ((onskiptonext3.d == null || onskiptonext3.b == null) && list.size() > 1) {
            list.remove(onskiptonext3);
        }
    }
}
