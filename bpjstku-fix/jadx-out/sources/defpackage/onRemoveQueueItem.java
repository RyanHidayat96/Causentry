package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class onRemoveQueueItem {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("s", "e", "o", "nm", "m", "hd");

    static ShapeTrimPath TuitionPaymentFragmentspecialinlinedviewModeldefault2(JsonReader jsonReader, previous previousVar) throws IOException {
        String strINotificationSideChannel = null;
        ShapeTrimPath.Type typeB = null;
        getVolumeControl getvolumecontrol = null;
        getVolumeControl getvolumecontrol2 = null;
        getVolumeControl getvolumecontrol3 = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                getvolumecontrol = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                getvolumecontrol2 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                getvolumecontrol3 = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 4) {
                typeB = ShapeTrimPath.Type.b(jsonReader.g());
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 5) {
                zAsBinder = jsonReader.asBinder();
            } else {
                jsonReader.onTransact();
            }
        }
        return new ShapeTrimPath(strINotificationSideChannel, typeB, getvolumecontrol, getvolumecontrol2, getvolumecontrol3, zAsBinder);
    }
}
