package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class onPause {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "hd", "it");

    static MediaSessionCompat TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, previous previousVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strINotificationSideChannel = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                zAsBinder = jsonReader.asBinder();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                while (jsonReader.asInterface()) {
                    toLegacyStreamType tolegacystreamtypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setPlaybackToLocal.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
                    if (tolegacystreamtypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        arrayList.add(tolegacystreamtypeTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                jsonReader.b();
            } else {
                jsonReader.onTransact();
            }
        }
        return new MediaSessionCompat(strINotificationSideChannel, arrayList, zAsBinder);
    }
}
