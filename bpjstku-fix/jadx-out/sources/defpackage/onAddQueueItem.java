package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class onAddQueueItem {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "p", "s", "r", "hd");

    static MediaControllerCompatApi23TransportControls TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader, previous previousVar) throws IOException {
        String strINotificationSideChannel = null;
        MediaControllerCompatApi21<PointF, PointF> mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase = null;
        getVolumeControl getvolumecontrolTuitionPaymentFragmentbindingInflater1 = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sendSessionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                mediaControllerCompatTransportControlsBase = new MediaControllerCompatTransportControlsBase(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), onCommand.b));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                getvolumecontrolTuitionPaymentFragmentbindingInflater1 = setActive.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 4) {
                zAsBinder = jsonReader.asBinder();
            } else {
                jsonReader.onTransact();
            }
        }
        return new MediaControllerCompatApi23TransportControls(strINotificationSideChannel, mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3, mediaControllerCompatTransportControlsBase, getvolumecontrolTuitionPaymentFragmentbindingInflater1, zAsBinder);
    }
}
