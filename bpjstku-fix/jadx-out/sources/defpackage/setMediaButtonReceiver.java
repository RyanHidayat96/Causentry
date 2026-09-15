package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class setMediaButtonReceiver {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("ch", "size", "w", "style", "fFamily", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("shapes");

    static getMaxVolume TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonReader jsonReader, previous previousVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        String strINotificationSideChannel = null;
        String strINotificationSideChannel2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char cCharAt = 0;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                cCharAt = jsonReader.INotificationSideChannel().charAt(0);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                d = jsonReader.d();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                d2 = jsonReader.d();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 4) {
                strINotificationSideChannel2 = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 5) {
                jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                while (jsonReader.asInterface()) {
                    if (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1) == 0) {
                        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        while (jsonReader.asInterface()) {
                            arrayList.add((MediaSessionCompat) setPlaybackToLocal.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar));
                        }
                        jsonReader.b();
                    } else {
                        jsonReader.cancelAll();
                        jsonReader.onTransact();
                    }
                }
                jsonReader.TuitionPaymentFragmentbindingInflater1();
            } else {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        return new getMaxVolume(arrayList, cCharAt, d, d2, strINotificationSideChannel, strINotificationSideChannel2);
    }
}
