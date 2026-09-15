package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class onPlayFromMediaId {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "c", "o", "tr", "hd");

    static MediaControllerCompatApi24 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader, previous previousVar) throws IOException {
        String strINotificationSideChannel = null;
        getVolumeControl getvolumecontrol = null;
        getVolumeControl getvolumecontrol2 = null;
        createCallback createcallbackB = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                getvolumecontrol = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                getvolumecontrol2 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                createcallbackB = release.b(jsonReader, previousVar);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 4) {
                zAsBinder = jsonReader.asBinder();
            } else {
                jsonReader.onTransact();
            }
        }
        return new MediaControllerCompatApi24(strINotificationSideChannel, getvolumecontrol, getvolumecontrol2, createcallbackB, zAsBinder);
    }
}
