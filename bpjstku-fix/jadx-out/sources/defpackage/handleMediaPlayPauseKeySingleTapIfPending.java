package defpackage;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class handleMediaPlayPauseKeySingleTapIfPending {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("id", "layers", "w", "h", "p", "u");
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("list");
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("cm", "tm", "dr");

    public static previous b(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<getMaxVolume> sparseArrayCompat = new SparseArrayCompat<>();
        previous previousVar = new previous();
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        float fD = 0.0f;
        int iG = 0;
        int iG2 = 0;
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        while (jsonReader.asInterface()) {
            float f3 = fD;
            switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b)) {
                case 0:
                    iG = jsonReader.g();
                    fD = f3;
                    break;
                case 1:
                    iG2 = jsonReader.g();
                    fD = f3;
                    fD3 = fD3;
                    break;
                case 2:
                    fD2 = (float) jsonReader.d();
                    fD = f3;
                    fD3 = fD3;
                    break;
                case 3:
                    fD = f3;
                    fD3 = ((float) jsonReader.d()) - 0.01f;
                    arrayList3 = arrayList3;
                    break;
                case 4:
                    fD3 = fD3;
                    fD = (float) jsonReader.d();
                    fD3 = fD3;
                    break;
                case 5:
                    arrayList = arrayList3;
                    i = iG2;
                    f = fD2;
                    f2 = fD3;
                    i2 = iG;
                    String[] strArrSplit = jsonReader.INotificationSideChannel().split("\\.");
                    if (!onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]))) {
                        onSetCaptioningEnabled.b("Lottie only supports bodymovin >= 4.4.0");
                        previousVar.notify.add("Lottie only supports bodymovin >= 4.4.0");
                    }
                    iG = i2;
                    fD = f3;
                    fD2 = f;
                    arrayList3 = arrayList;
                    fD3 = f2;
                    iG2 = i;
                    break;
                case 6:
                    arrayList = arrayList3;
                    i = iG2;
                    f = fD2;
                    f2 = fD3;
                    i2 = iG;
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i5 = 0;
                    while (jsonReader.asInterface()) {
                        Layer layerTuitionPaymentFragmentbindingInflater1 = MediaSessionCompat2.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                        if (layerTuitionPaymentFragmentbindingInflater1.asInterface == Layer.LayerType.IMAGE) {
                            i5++;
                        }
                        arrayList2.add(layerTuitionPaymentFragmentbindingInflater1);
                        longSparseArray.put(layerTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, layerTuitionPaymentFragmentbindingInflater1);
                        if (i5 > 4) {
                            StringBuilder sb = new StringBuilder("You have ");
                            sb.append(i5);
                            sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            onSetCaptioningEnabled.b(sb.toString());
                        }
                    }
                    jsonReader.b();
                    iG = i2;
                    fD = f3;
                    fD2 = f;
                    arrayList3 = arrayList;
                    fD3 = f2;
                    iG2 = i;
                    break;
                case 7:
                    f = fD2;
                    f2 = fD3;
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    while (jsonReader.asInterface()) {
                        ArrayList arrayList4 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        String strINotificationSideChannel = null;
                        String strINotificationSideChannel2 = null;
                        String strINotificationSideChannel3 = null;
                        int iG3 = 0;
                        int iG4 = 0;
                        while (jsonReader.asInterface()) {
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0) {
                                ArrayList arrayList5 = arrayList3;
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 1) {
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                                        iG3 = jsonReader.g();
                                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                                        iG4 = jsonReader.g();
                                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 4) {
                                        strINotificationSideChannel2 = jsonReader.INotificationSideChannel();
                                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 5) {
                                        strINotificationSideChannel3 = jsonReader.INotificationSideChannel();
                                    } else {
                                        jsonReader.cancelAll();
                                        jsonReader.onTransact();
                                        i3 = iG;
                                        i4 = iG2;
                                    }
                                    arrayList3 = arrayList5;
                                } else {
                                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    while (jsonReader.asInterface()) {
                                        Layer layerTuitionPaymentFragmentbindingInflater2 = MediaSessionCompat2.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                                        longSparseArray2.put(layerTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1, layerTuitionPaymentFragmentbindingInflater2);
                                        arrayList4.add(layerTuitionPaymentFragmentbindingInflater2);
                                        iG = iG;
                                        iG2 = iG2;
                                    }
                                    i3 = iG;
                                    i4 = iG2;
                                    jsonReader.b();
                                }
                                iG = i3;
                                arrayList3 = arrayList5;
                                iG2 = i4;
                            } else {
                                strINotificationSideChannel = jsonReader.INotificationSideChannel();
                            }
                        }
                        ArrayList arrayList6 = arrayList3;
                        int i6 = iG;
                        int i7 = iG2;
                        jsonReader.TuitionPaymentFragmentbindingInflater1();
                        if (strINotificationSideChannel2 != null) {
                            prepareFromMediaId preparefrommediaid = new prepareFromMediaId(iG3, iG4, strINotificationSideChannel, strINotificationSideChannel2, strINotificationSideChannel3);
                            map2.put(preparefrommediaid.TuitionPaymentFragmentspecialinlinedviewModeldefault2, preparefrommediaid);
                        } else {
                            map.put(strINotificationSideChannel, arrayList4);
                        }
                        iG = i6;
                        arrayList3 = arrayList6;
                        iG2 = i7;
                    }
                    arrayList = arrayList3;
                    i2 = iG;
                    i = iG2;
                    jsonReader.b();
                    iG = i2;
                    fD = f3;
                    fD2 = f;
                    arrayList3 = arrayList;
                    fD3 = f2;
                    iG2 = i;
                    break;
                case 8:
                    f = fD2;
                    f2 = fD3;
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    while (jsonReader.asInterface()) {
                        if (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1) == 0) {
                            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            while (jsonReader.asInterface()) {
                                MediaControllerCompatMediaControllerImplApi21ExtraCallback mediaControllerCompatMediaControllerImplApi21ExtraCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setPlaybackToRemote.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
                                map3.put(mediaControllerCompatMediaControllerImplApi21ExtraCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, mediaControllerCompatMediaControllerImplApi21ExtraCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                            jsonReader.b();
                        } else {
                            jsonReader.cancelAll();
                            jsonReader.onTransact();
                        }
                    }
                    jsonReader.TuitionPaymentFragmentbindingInflater1();
                    arrayList = arrayList3;
                    i2 = iG;
                    i = iG2;
                    iG = i2;
                    fD = f3;
                    fD2 = f;
                    arrayList3 = arrayList;
                    fD3 = f2;
                    iG2 = i;
                    break;
                case 9:
                    f = fD2;
                    f2 = fD3;
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    while (jsonReader.asInterface()) {
                        getMaxVolume getmaxvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setMediaButtonReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, previousVar);
                        sparseArrayCompat.put(getmaxvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode(), getmaxvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                    jsonReader.b();
                    arrayList = arrayList3;
                    i2 = iG;
                    i = iG2;
                    iG = i2;
                    fD = f3;
                    fD2 = f;
                    arrayList3 = arrayList;
                    fD3 = f2;
                    iG2 = i;
                    break;
                case 10:
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    while (jsonReader.asInterface()) {
                        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        String strINotificationSideChannel4 = null;
                        float fD4 = 0.0f;
                        float fD5 = 0.0f;
                        while (jsonReader.asInterface()) {
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                                float f4 = fD3;
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 1) {
                                    fD4 = (float) jsonReader.d();
                                } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 2) {
                                    fD5 = (float) jsonReader.d();
                                } else {
                                    jsonReader.cancelAll();
                                    jsonReader.onTransact();
                                    fD3 = f4;
                                }
                                fD3 = f4;
                                fD2 = fD2;
                            } else {
                                strINotificationSideChannel4 = jsonReader.INotificationSideChannel();
                            }
                        }
                        jsonReader.TuitionPaymentFragmentbindingInflater1();
                        arrayList3.add(new getCurrentVolume(strINotificationSideChannel4, fD4, fD5));
                        fD2 = fD2;
                        fD3 = fD3;
                    }
                    f = fD2;
                    f2 = fD3;
                    jsonReader.b();
                    arrayList = arrayList3;
                    i2 = iG;
                    i = iG2;
                    iG = i2;
                    fD = f3;
                    fD2 = f;
                    arrayList3 = arrayList;
                    fD3 = f2;
                    iG2 = i;
                    break;
                default:
                    arrayList = arrayList3;
                    i = iG2;
                    f = fD2;
                    f2 = fD3;
                    i2 = iG;
                    jsonReader.cancelAll();
                    jsonReader.onTransact();
                    iG = i2;
                    fD = f3;
                    fD2 = f;
                    arrayList3 = arrayList;
                    fD3 = f2;
                    iG2 = i;
                    break;
            }
        }
        previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Rect(0, 0, (int) (iG * fTuitionPaymentFragmentspecialinlinedviewModeldefault2), (int) (iG2 * fTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        previousVar.onTransact = fD2;
        previousVar.TuitionPaymentFragmentbindingInflater1 = fD3;
        previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fD;
        previousVar.d = arrayList2;
        previousVar.asBinder = longSparseArray;
        previousVar.cancel = map;
        previousVar.g = map2;
        previousVar.b = sparseArrayCompat;
        previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map3;
        previousVar.asInterface = arrayList3;
        return previousVar;
    }
}
