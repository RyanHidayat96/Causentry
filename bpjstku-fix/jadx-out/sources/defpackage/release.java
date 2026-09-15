package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class release {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("k");

    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    public static createCallback b(JsonReader jsonReader, previous previousVar) throws IOException {
        getVolumeControl getvolumecontrol;
        boolean z = jsonReader.cancel() == JsonReader.Token.BEGIN_OBJECT;
        if (z) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        getVolumeControl getvolumecontrol2 = null;
        MediaControllerCompatTransportControlsApi23 mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        MediaControllerCompatApi21<PointF, PointF> mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        MediaControllerCompatTransportControlsApi21 mediaControllerCompatTransportControlsApi21 = null;
        getVolumeControl getvolumecontrol3 = null;
        getVolumeControl getvolumecontrol4 = null;
        setRating setrating = null;
        getVolumeControl getvolumecontrol5 = null;
        getVolumeControl getvolumecontrol6 = null;
        while (jsonReader.asInterface()) {
            switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1)) {
                case 0:
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    while (jsonReader.asInterface()) {
                        if (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b) == 0) {
                            mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sendSessionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar);
                        } else {
                            jsonReader.cancelAll();
                            jsonReader.onTransact();
                        }
                    }
                    jsonReader.TuitionPaymentFragmentbindingInflater1();
                    continue;
                case 1:
                    mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sendSessionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
                    continue;
                case 2:
                    mediaControllerCompatTransportControlsApi21 = new MediaControllerCompatTransportControlsApi21((List<onSkipToNext<onStop>>) MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, onPlay.b));
                    continue;
                case 3:
                    onSetCaptioningEnabled.b("Lottie doesn't support 3D layers.");
                    previousVar.notify.add("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    setrating = new setRating(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setQueueTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    continue;
                case 6:
                    getvolumecontrol5 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    continue;
                case 7:
                    getvolumecontrol6 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    continue;
                case 8:
                    getvolumecontrol3 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    continue;
                case 9:
                    getvolumecontrol4 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    continue;
                default:
                    jsonReader.cancelAll();
                    jsonReader.onTransact();
                    continue;
            }
            getVolumeControl getvolumecontrol7 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            if (getvolumecontrol7.TuitionPaymentFragmentspecialinlinedviewModeldefault3().isEmpty()) {
                getvolumecontrol = getvolumecontrol7;
                getvolumecontrol7.TuitionPaymentFragmentspecialinlinedviewModeldefault3().add(new onSkipToNext<>(previousVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(previousVar.TuitionPaymentFragmentbindingInflater1)));
            } else {
                getvolumecontrol = getvolumecontrol7;
                if (getvolumecontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(0).d == null) {
                    getvolumecontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3().set(0, new onSkipToNext<>(previousVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(previousVar.TuitionPaymentFragmentbindingInflater1)));
                }
            }
            getvolumecontrol2 = getvolumecontrol;
        }
        if (z) {
            jsonReader.TuitionPaymentFragmentbindingInflater1();
        }
        MediaControllerCompatTransportControlsApi23 mediaControllerCompatTransportControlsApi23 = (mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || (mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(0).d.equals(0.0f, 0.0f))) ? null : mediaControllerCompatTransportControlsApi23TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        MediaControllerCompatApi21<PointF, PointF> mediaControllerCompatApi21 = (mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || (!(mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof MediaControllerCompatTransportControlsApi24) && mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(0).d.equals(0.0f, 0.0f))) ? null : mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getVolumeControl getvolumecontrol8 = (getvolumecontrol2 == null || (getvolumecontrol2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && getvolumecontrol2.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(0).d.floatValue() == 0.0f)) ? null : getvolumecontrol2;
        if (mediaControllerCompatTransportControlsApi21 == null) {
            mediaControllerCompatTransportControlsApi21 = null;
        } else if (mediaControllerCompatTransportControlsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            onStop onstop = mediaControllerCompatTransportControlsApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(0).d;
            if (onstop.b == 1.0f && onstop.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1.0f) {
                mediaControllerCompatTransportControlsApi21 = null;
            }
        }
        return new createCallback(mediaControllerCompatTransportControlsApi23, mediaControllerCompatApi21, mediaControllerCompatTransportControlsApi21, getvolumecontrol8, setrating, getvolumecontrol5, getvolumecontrol6, (getvolumecontrol3 == null || (getvolumecontrol3.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && getvolumecontrol3.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(0).d.floatValue() == 0.0f)) ? null : getvolumecontrol3, (getvolumecontrol4 == null || (getvolumecontrol4.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && getvolumecontrol4.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get(0).d.floatValue() == 0.0f)) ? null : getvolumecontrol4);
    }
}
