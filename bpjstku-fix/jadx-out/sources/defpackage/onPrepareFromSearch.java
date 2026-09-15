package defpackage;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class onPrepareFromSearch {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("n", "v");

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    static ShapeStroke TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader jsonReader, previous previousVar) throws IOException {
        byte b2;
        ArrayList arrayList = new ArrayList();
        float fD = 0.0f;
        String strINotificationSideChannel = null;
        getVolumeControl getvolumecontrol = null;
        getPlaybackType getplaybacktype = null;
        setRating setrating = null;
        getVolumeControl getvolumecontrolTuitionPaymentFragmentbindingInflater1 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            int i = 1;
            switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                case 0:
                    strINotificationSideChannel = jsonReader.INotificationSideChannel();
                    break;
                case 1:
                    getplaybacktype = new getPlaybackType(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setMetadata.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    break;
                case 2:
                    getvolumecontrolTuitionPaymentFragmentbindingInflater1 = setActive.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                    break;
                case 3:
                    setrating = new setRating(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setQueueTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.g() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.g() - 1];
                    break;
                case 6:
                    fD = (float) jsonReader.d();
                    break;
                case 7:
                    zAsBinder = jsonReader.asBinder();
                    break;
                case 8:
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    while (jsonReader.asInterface()) {
                        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        String strINotificationSideChannel2 = null;
                        getVolumeControl getvolumecontrolTuitionPaymentFragmentbindingInflater2 = null;
                        while (jsonReader.asInterface()) {
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b);
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                                strINotificationSideChannel2 = jsonReader.INotificationSideChannel();
                            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == i) {
                                getvolumecontrolTuitionPaymentFragmentbindingInflater2 = setActive.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                            } else {
                                jsonReader.cancelAll();
                                jsonReader.onTransact();
                            }
                        }
                        jsonReader.TuitionPaymentFragmentbindingInflater1();
                        strINotificationSideChannel2.hashCode();
                        int iHashCode = strINotificationSideChannel2.hashCode();
                        getVolumeControl getvolumecontrol2 = getvolumecontrol;
                        if (iHashCode != 100) {
                            if (iHashCode != 103) {
                                if (iHashCode == 111 && strINotificationSideChannel2.equals("o")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strINotificationSideChannel2.equals("g")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                        } else if (strINotificationSideChannel2.equals("d")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        i = 1;
                        if (b2 == 0 || b2 == 1) {
                            previousVar.f1325a = true;
                            arrayList.add(getvolumecontrolTuitionPaymentFragmentbindingInflater2);
                        } else {
                            getvolumecontrol = b2 != 2 ? getvolumecontrol2 : getvolumecontrolTuitionPaymentFragmentbindingInflater2;
                        }
                    }
                    int i2 = i;
                    getVolumeControl getvolumecontrol3 = getvolumecontrol;
                    jsonReader.b();
                    if (arrayList.size() == i2) {
                        arrayList.add(arrayList.get(0));
                    }
                    getvolumecontrol = getvolumecontrol3;
                    break;
                default:
                    jsonReader.onTransact();
                    break;
            }
        }
        return new ShapeStroke(strINotificationSideChannel, getvolumecontrol, arrayList, getplaybacktype, setrating, getvolumecontrolTuitionPaymentFragmentbindingInflater1, lineCapType, lineJoinType, fD, zAsBinder);
    }
}
