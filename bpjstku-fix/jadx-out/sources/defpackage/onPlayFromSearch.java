package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class onPlayFromSearch {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "c", "o", "fillEnabled", "r", "hd");

    static MediaControllerCompatApi24TransportControls TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader jsonReader, previous previousVar) throws IOException {
        String strINotificationSideChannel = null;
        getPlaybackType getplaybacktype = null;
        setRating setrating = null;
        boolean zAsBinder = false;
        boolean zAsBinder2 = false;
        int iG = 1;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                getplaybacktype = new getPlaybackType(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setMetadata.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                setrating = new setRating(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setQueueTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                zAsBinder = jsonReader.asBinder();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 4) {
                iG = jsonReader.g();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 5) {
                zAsBinder2 = jsonReader.asBinder();
            } else {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            }
        }
        return new MediaControllerCompatApi24TransportControls(strINotificationSideChannel, zAsBinder, iG == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, getplaybacktype, setrating, zAsBinder2);
    }
}
