package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class sendSessionEvent {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("k", "x", "y");

    public static MediaControllerCompatTransportControlsApi23 TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader jsonReader, previous previousVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.cancel() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            while (jsonReader.asInterface()) {
                arrayList.add(new postToHandler(previousVar, MediaSessionCompat1.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), onMediaButtonEvent.TuitionPaymentFragmentbindingInflater1, jsonReader.cancel() == JsonReader.Token.BEGIN_OBJECT)));
            }
            jsonReader.b();
            MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
        } else {
            arrayList.add(new onSkipToNext(MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2())));
        }
        return new MediaControllerCompatTransportControlsApi23(arrayList);
    }

    static MediaControllerCompatApi21<PointF, PointF> TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader, previous previousVar) throws IOException {
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        MediaControllerCompatTransportControlsApi23 mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        getVolumeControl getvolumecontrol = null;
        boolean z = false;
        getVolumeControl getvolumecontrol2 = null;
        while (jsonReader.cancel() != JsonReader.Token.END_OBJECT) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 1) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                    if (jsonReader.cancel() == JsonReader.Token.STRING) {
                        jsonReader.onTransact();
                        z = true;
                    } else {
                        getvolumecontrol = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    }
                } else {
                    jsonReader.cancelAll();
                    jsonReader.onTransact();
                }
            } else if (jsonReader.cancel() == JsonReader.Token.STRING) {
                jsonReader.onTransact();
                z = true;
            } else {
                getvolumecontrol2 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        if (z) {
            onSetCaptioningEnabled.b("Lottie doesn't support expressions.");
            previousVar.notify.add("Lottie doesn't support expressions.");
        }
        return mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1 : new MediaControllerCompatTransportControlsApi24(getvolumecontrol2, getvolumecontrol);
    }
}
