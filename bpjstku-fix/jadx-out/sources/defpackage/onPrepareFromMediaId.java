package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class onPrepareFromMediaId {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "ind", "ks", "hd");

    static addOnActiveChangeListener b(JsonReader jsonReader, previous previousVar) throws IOException {
        String strINotificationSideChannel = null;
        int iG = 0;
        boolean zAsBinder = false;
        skipToPrevious skiptoprevious = null;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                iG = jsonReader.g();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                skiptoprevious = new skipToPrevious(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), onPlayFromUri.b));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                zAsBinder = jsonReader.asBinder();
            } else {
                jsonReader.onTransact();
            }
        }
        return new addOnActiveChangeListener(strINotificationSideChannel, iG, skiptoprevious, zAsBinder);
    }
}
