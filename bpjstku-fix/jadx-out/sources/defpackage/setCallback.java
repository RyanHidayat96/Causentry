package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class setCallback {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "p", "s", "hd", "d");

    static MediaControllerCompatApi21TransportControls b(JsonReader jsonReader, previous previousVar, int i) throws IOException {
        boolean z = i == 3;
        boolean zAsBinder = false;
        String strINotificationSideChannel = null;
        MediaControllerCompatApi21<PointF, PointF> mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase = null;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sendSessionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                mediaControllerCompatTransportControlsBase = new MediaControllerCompatTransportControlsBase(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), onCommand.b));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                zAsBinder = jsonReader.asBinder();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 4) {
                z = jsonReader.g() == 3;
            } else {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            }
        }
        return new MediaControllerCompatApi21TransportControls(strINotificationSideChannel, mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3, mediaControllerCompatTransportControlsBase, z, zAsBinder);
    }
}
