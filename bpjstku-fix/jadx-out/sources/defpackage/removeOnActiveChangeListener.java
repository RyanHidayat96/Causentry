package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class removeOnActiveChangeListener {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("a");
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("fc", "sc", "sw", "t");

    public static MediaControllerCompatApi21CallbackProxy TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader jsonReader, previous previousVar) throws IOException {
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        MediaControllerCompatApi21CallbackProxy mediaControllerCompatApi21CallbackProxy = null;
        while (jsonReader.asInterface()) {
            if (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1) != 0) {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            } else {
                jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                getPlaybackType getplaybacktype = null;
                getPlaybackType getplaybacktype2 = null;
                getVolumeControl getvolumecontrol = null;
                getVolumeControl getvolumecontrol2 = null;
                while (jsonReader.asInterface()) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                        getplaybacktype = new getPlaybackType(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setMetadata.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                        getplaybacktype2 = new getPlaybackType(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setMetadata.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        getvolumecontrol = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 3) {
                        jsonReader.cancelAll();
                        jsonReader.onTransact();
                    } else {
                        getvolumecontrol2 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    }
                }
                jsonReader.TuitionPaymentFragmentbindingInflater1();
                mediaControllerCompatApi21CallbackProxy = new MediaControllerCompatApi21CallbackProxy(getplaybacktype, getplaybacktype2, getvolumecontrol, getvolumecontrol2);
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        return mediaControllerCompatApi21CallbackProxy == null ? new MediaControllerCompatApi21CallbackProxy(null, null, null, null) : mediaControllerCompatApi21CallbackProxy;
    }
}
