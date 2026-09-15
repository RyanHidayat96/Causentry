package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class setPlaybackToRemote {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("fFamily", "fName", "fStyle", "ascent");

    static MediaControllerCompatMediaControllerImplApi21ExtraCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader) throws IOException {
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        String strINotificationSideChannel = null;
        String strINotificationSideChannel2 = null;
        float fD = 0.0f;
        String strINotificationSideChannel3 = null;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                strINotificationSideChannel3 = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                strINotificationSideChannel2 = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                fD = (float) jsonReader.d();
            } else {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        return new MediaControllerCompatMediaControllerImplApi21ExtraCallback(strINotificationSideChannel, strINotificationSideChannel3, strINotificationSideChannel2, fD);
    }
}
