package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class setSessionActivity {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("p", "k");

    static getLegacyAudioStream b(JsonReader jsonReader, previous previousVar) throws IOException {
        Path.FillType fillType = Path.FillType.WINDING;
        String strINotificationSideChannel = null;
        GradientType gradientType = null;
        skipToNext skiptonext = null;
        setRating setrating = null;
        MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase = null;
        MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase2 = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b)) {
                case 0:
                    strINotificationSideChannel = jsonReader.INotificationSideChannel();
                    break;
                case 1:
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int iG = -1;
                    while (jsonReader.asInterface()) {
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                            iG = jsonReader.g();
                        } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 1) {
                            jsonReader.cancelAll();
                            jsonReader.onTransact();
                        } else {
                            skiptonext = new skipToNext(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, new setRatingType(iG)));
                        }
                    }
                    jsonReader.TuitionPaymentFragmentbindingInflater1();
                    break;
                case 2:
                    setrating = new setRating(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setQueueTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    break;
                case 3:
                    gradientType = jsonReader.g() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    mediaControllerCompatTransportControlsBase = new MediaControllerCompatTransportControlsBase(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), onCommand.b));
                    break;
                case 5:
                    mediaControllerCompatTransportControlsBase2 = new MediaControllerCompatTransportControlsBase(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), onCommand.b));
                    break;
                case 6:
                    fillType = jsonReader.g() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zAsBinder = jsonReader.asBinder();
                    break;
                default:
                    jsonReader.cancelAll();
                    jsonReader.onTransact();
                    break;
            }
        }
        return new getLegacyAudioStream(strINotificationSideChannel, gradientType, fillType, skiptonext, setrating, mediaControllerCompatTransportControlsBase, mediaControllerCompatTransportControlsBase2, zAsBinder);
    }
}
