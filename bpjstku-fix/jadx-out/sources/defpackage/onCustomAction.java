package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class onCustomAction {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "sy", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "p", "r", "or", "os", "ir", "is", "hd");

    static PolystarShape TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader, previous previousVar) throws IOException {
        String strINotificationSideChannel = null;
        PolystarShape.Type typeB = null;
        getVolumeControl getvolumecontrol = null;
        MediaControllerCompatApi21<PointF, PointF> mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        getVolumeControl getvolumecontrol2 = null;
        getVolumeControl getvolumecontrolTuitionPaymentFragmentbindingInflater1 = null;
        getVolumeControl getvolumecontrolTuitionPaymentFragmentbindingInflater2 = null;
        getVolumeControl getvolumecontrol3 = null;
        getVolumeControl getvolumecontrol4 = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b)) {
                case 0:
                    strINotificationSideChannel = jsonReader.INotificationSideChannel();
                    break;
                case 1:
                    typeB = PolystarShape.Type.b(jsonReader.g());
                    break;
                case 2:
                    getvolumecontrol = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    break;
                case 3:
                    mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sendSessionEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
                    break;
                case 4:
                    getvolumecontrol2 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    break;
                case 5:
                    getvolumecontrolTuitionPaymentFragmentbindingInflater2 = setActive.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                    break;
                case 6:
                    getvolumecontrol4 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    break;
                case 7:
                    getvolumecontrolTuitionPaymentFragmentbindingInflater1 = setActive.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                    break;
                case 8:
                    getvolumecontrol3 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    break;
                case 9:
                    zAsBinder = jsonReader.asBinder();
                    break;
                default:
                    jsonReader.cancelAll();
                    jsonReader.onTransact();
                    break;
            }
        }
        return new PolystarShape(strINotificationSideChannel, typeB, getvolumecontrol, mediaControllerCompatApi21TuitionPaymentFragmentspecialinlinedviewModeldefault3, getvolumecontrol2, getvolumecontrolTuitionPaymentFragmentbindingInflater1, getvolumecontrolTuitionPaymentFragmentbindingInflater2, getvolumecontrol3, getvolumecontrol4, zAsBinder);
    }
}
