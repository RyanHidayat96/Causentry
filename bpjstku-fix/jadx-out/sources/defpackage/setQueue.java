package defpackage;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class setQueue {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("p", "k");
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("n", "v");

    static MediaControllerCompatApi21PlaybackInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1(JsonReader jsonReader, previous previousVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        float fD = 0.0f;
        String strINotificationSideChannel = null;
        GradientType gradientType = null;
        skipToNext skiptonext = null;
        setRating setrating = null;
        MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase = null;
        MediaControllerCompatTransportControlsBase mediaControllerCompatTransportControlsBase2 = null;
        getVolumeControl getvolumecontrolTuitionPaymentFragmentbindingInflater1 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        getVolumeControl getvolumecontrol = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                case 0:
                    strINotificationSideChannel = jsonReader.INotificationSideChannel();
                    continue;
                case 1:
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int iG = -1;
                    while (jsonReader.asInterface()) {
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0) {
                            skipToNext skiptonext2 = skiptonext;
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 1) {
                                jsonReader.cancelAll();
                                jsonReader.onTransact();
                                skiptonext = skiptonext2;
                            } else {
                                skiptonext = new skipToNext(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, new setRatingType(iG)));
                                iG = iG;
                            }
                        } else {
                            iG = jsonReader.g();
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
                    getvolumecontrolTuitionPaymentFragmentbindingInflater1 = setActive.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                    continue;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.g() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.g() - 1];
                    break;
                case 9:
                    fD = (float) jsonReader.d();
                    break;
                case 10:
                    zAsBinder = jsonReader.asBinder();
                    continue;
                case 11:
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    while (jsonReader.asInterface()) {
                        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        String strINotificationSideChannel2 = null;
                        getVolumeControl getvolumecontrolTuitionPaymentFragmentbindingInflater2 = null;
                        while (jsonReader.asInterface()) {
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                                getVolumeControl getvolumecontrol2 = getvolumecontrol;
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 1) {
                                    getvolumecontrolTuitionPaymentFragmentbindingInflater2 = setActive.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                                } else {
                                    jsonReader.cancelAll();
                                    jsonReader.onTransact();
                                }
                                getvolumecontrol = getvolumecontrol2;
                            } else {
                                strINotificationSideChannel2 = jsonReader.INotificationSideChannel();
                            }
                        }
                        getVolumeControl getvolumecontrol3 = getvolumecontrol;
                        jsonReader.TuitionPaymentFragmentbindingInflater1();
                        if (strINotificationSideChannel2.equals("o")) {
                            getvolumecontrol = getvolumecontrolTuitionPaymentFragmentbindingInflater2;
                        } else {
                            if (strINotificationSideChannel2.equals("d") || strINotificationSideChannel2.equals("g")) {
                                previousVar.f1325a = true;
                                arrayList.add(getvolumecontrolTuitionPaymentFragmentbindingInflater2);
                            }
                            getvolumecontrol = getvolumecontrol3;
                        }
                    }
                    getVolumeControl getvolumecontrol4 = getvolumecontrol;
                    jsonReader.b();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    getvolumecontrol = getvolumecontrol4;
                    continue;
                default:
                    jsonReader.cancelAll();
                    jsonReader.onTransact();
                    continue;
            }
            strINotificationSideChannel = strINotificationSideChannel;
        }
        return new MediaControllerCompatApi21PlaybackInfo(strINotificationSideChannel, gradientType, skiptonext, setrating, mediaControllerCompatTransportControlsBase, mediaControllerCompatTransportControlsBase2, getvolumecontrolTuitionPaymentFragmentbindingInflater1, lineCapType, lineJoinType, fD, arrayList, getvolumecontrol, zAsBinder);
    }
}
