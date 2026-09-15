package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompat2 {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE, "w", "h", "ip", "op", "tm", "cl", "hd");
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("d", "a");
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm");

    /* JADX WARN: Code duplicated, block: B:111:0x0238  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    public static Layer TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, previous previousVar) throws IOException {
        String str;
        float f;
        long j;
        byte b2;
        byte b3;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        float f2 = 1.0f;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        String strINotificationSideChannel = "UNSET";
        Layer.MatteType matteType2 = matteType;
        float fD = 1.0f;
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        long jG = -1;
        Layer.LayerType layerType = null;
        String strINotificationSideChannel2 = null;
        createCallback createcallbackB = null;
        int iG = 0;
        int iG2 = 0;
        int color = 0;
        int iG3 = 0;
        int iG4 = 0;
        MediaControllerCompatApi21Callback mediaControllerCompatApi21Callback = null;
        MediaControllerCompatApi21CallbackProxy mediaControllerCompatApi21CallbackProxyTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        getVolumeControl getvolumecontrol = null;
        boolean zAsBinder = false;
        long jG2 = 0;
        float fD4 = 0.0f;
        String strINotificationSideChannel3 = null;
        while (jsonReader.asInterface()) {
            switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                case 0:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    strINotificationSideChannel = jsonReader.INotificationSideChannel();
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 1:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    jG2 = jsonReader.g();
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 2:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    strINotificationSideChannel2 = jsonReader.INotificationSideChannel();
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 3:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    j = jG2;
                    f = f2;
                    int iG5 = jsonReader.g();
                    if (iG5 < Layer.LayerType.UNKNOWN.ordinal()) {
                        layerType = Layer.LayerType.values()[iG5];
                    } else {
                        layerType = Layer.LayerType.UNKNOWN;
                    }
                    jG2 = j;
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 4:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    jG = jsonReader.g();
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 5:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    iG = (int) (jsonReader.g() * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 6:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    iG2 = (int) (jsonReader.g() * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 7:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    color = Color.parseColor(jsonReader.INotificationSideChannel());
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 8:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    createcallbackB = release.b(jsonReader, previousVar);
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 9:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    f = f2;
                    matteType2 = Layer.MatteType.values()[jsonReader.g()];
                    previousVar.INotificationSideChannel++;
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 10:
                    fValueOf2 = fValueOf2;
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    while (jsonReader.asInterface()) {
                        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        Mask.MaskMode maskMode = null;
                        skipToPrevious skiptoprevious = null;
                        setRating setrating = null;
                        boolean zAsBinder2 = false;
                        while (jsonReader.asInterface()) {
                            String strA = jsonReader.a();
                            strA.hashCode();
                            int iHashCode = strA.hashCode();
                            strINotificationSideChannel3 = strINotificationSideChannel3;
                            jG2 = jG2;
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strA.equals("mode")) {
                                            b2 = 3;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strA.equals("inv")) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strA.equals(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT)) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strA.equals("o")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                            if (b2 != 0) {
                                if (b2 == 1) {
                                    skiptoprevious = new skipToPrevious(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), onPlayFromUri.b));
                                } else if (b2 == 2) {
                                    zAsBinder2 = jsonReader.asBinder();
                                } else if (b2 == 3) {
                                    String strINotificationSideChannel4 = jsonReader.INotificationSideChannel();
                                    strINotificationSideChannel4.hashCode();
                                    int iHashCode2 = strINotificationSideChannel4.hashCode();
                                    if (iHashCode2 != 97) {
                                        if (iHashCode2 != 105) {
                                            if (iHashCode2 != 110) {
                                                if (iHashCode2 == 115 && strINotificationSideChannel4.equals("s")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                            } else if (strINotificationSideChannel4.equals("n")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                        } else if (strINotificationSideChannel4.equals("i")) {
                                            b3 = 1;
                                        } else {
                                            b3 = -1;
                                        }
                                    } else if (strINotificationSideChannel4.equals("a")) {
                                        b3 = 0;
                                    } else {
                                        b3 = -1;
                                    }
                                    if (b3 == 0) {
                                        maskMode = Mask.MaskMode.MASK_MODE_ADD;
                                    } else if (b3 == 1) {
                                        onSetCaptioningEnabled.b("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                        previousVar.notify.add("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                        maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                                    } else if (b3 == 2) {
                                        maskMode = Mask.MaskMode.MASK_MODE_NONE;
                                    } else if (b3 == 3) {
                                        maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Unknown mask mode ");
                                        sb.append(strA);
                                        sb.append(". Defaulting to Add.");
                                        onSetCaptioningEnabled.b(sb.toString());
                                        maskMode = Mask.MaskMode.MASK_MODE_ADD;
                                    }
                                } else {
                                    jsonReader.onTransact();
                                }
                                f2 = 1.0f;
                            } else {
                                setrating = new setRating(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, 1.0f, setQueueTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                f2 = 1.0f;
                            }
                        }
                        jsonReader.TuitionPaymentFragmentbindingInflater1();
                        arrayList.add(new Mask(maskMode, skiptoprevious, setrating, zAsBinder2));
                        f2 = f2;
                        strINotificationSideChannel3 = strINotificationSideChannel3;
                    }
                    str = strINotificationSideChannel3;
                    j = jG2;
                    f = f2;
                    previousVar.INotificationSideChannel += arrayList.size();
                    jsonReader.b();
                    jG2 = j;
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 11:
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    while (jsonReader.asInterface()) {
                        toLegacyStreamType tolegacystreamtypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setPlaybackToLocal.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
                        if (tolegacystreamtypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                            arrayList2.add(tolegacystreamtypeTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    }
                    jsonReader.b();
                    str = strINotificationSideChannel3;
                    j = jG2;
                    f = f2;
                    jG2 = j;
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 12:
                    fValueOf2 = fValueOf2;
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    while (jsonReader.asInterface()) {
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                            mediaControllerCompatApi21Callback = new MediaControllerCompatApi21Callback(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, f2, setFlags.TuitionPaymentFragmentbindingInflater1));
                        } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            if (jsonReader.asInterface()) {
                                mediaControllerCompatApi21CallbackProxyTuitionPaymentFragmentspecialinlinedviewModeldefault1 = removeOnActiveChangeListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar);
                            }
                            while (jsonReader.asInterface()) {
                                jsonReader.onTransact();
                            }
                            jsonReader.b();
                        } else {
                            jsonReader.cancelAll();
                            jsonReader.onTransact();
                        }
                    }
                    jsonReader.TuitionPaymentFragmentbindingInflater1();
                    str = strINotificationSideChannel3;
                    f = f2;
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 13:
                    jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.asInterface()) {
                        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        while (jsonReader.asInterface()) {
                            if (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b) == 0) {
                                arrayList3.add(jsonReader.INotificationSideChannel());
                            } else {
                                jsonReader.cancelAll();
                                jsonReader.onTransact();
                            }
                        }
                        jsonReader.TuitionPaymentFragmentbindingInflater1();
                    }
                    jsonReader.b();
                    String strConcat = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3));
                    onSetCaptioningEnabled.b(strConcat);
                    previousVar.notify.add(strConcat);
                    str = strINotificationSideChannel3;
                    j = jG2;
                    f = f2;
                    jG2 = j;
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
                case 14:
                    fD = (float) jsonReader.d();
                    fValueOf2 = fValueOf2;
                    break;
                case 15:
                    fD3 = (float) jsonReader.d();
                    fValueOf2 = fValueOf2;
                    break;
                case 16:
                    iG3 = (int) (jsonReader.g() * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    break;
                case 17:
                    iG4 = (int) (jsonReader.g() * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    break;
                case 18:
                    fD2 = (float) jsonReader.d();
                    fValueOf2 = fValueOf2;
                    break;
                case 19:
                    fD4 = (float) jsonReader.d();
                    break;
                case 20:
                    getvolumecontrol = new getVolumeControl(MediaSessionCompatCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar, f2, setPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    break;
                case 21:
                    strINotificationSideChannel3 = jsonReader.INotificationSideChannel();
                    break;
                case 22:
                    zAsBinder = jsonReader.asBinder();
                    break;
                default:
                    str = strINotificationSideChannel3;
                    fValueOf2 = fValueOf2;
                    j = jG2;
                    f = f2;
                    jsonReader.cancelAll();
                    jsonReader.onTransact();
                    jG2 = j;
                    f2 = f;
                    fValueOf2 = fValueOf2;
                    strINotificationSideChannel3 = str;
                    break;
            }
        }
        String str2 = strINotificationSideChannel3;
        Float f3 = fValueOf2;
        long j2 = jG2;
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        float f4 = fD2 / fD;
        float f5 = fD4 / fD;
        ArrayList arrayList4 = new ArrayList();
        if (f4 > 0.0f) {
            arrayList4.add(new onSkipToNext(previousVar, f3, f3, null, 0.0f, Float.valueOf(f4)));
        }
        if (f5 <= 0.0f) {
            f5 = previousVar.TuitionPaymentFragmentbindingInflater1;
        }
        arrayList4.add(new onSkipToNext(previousVar, fValueOf, fValueOf, null, f4, Float.valueOf(f5)));
        arrayList4.add(new onSkipToNext(previousVar, f3, f3, null, f5, Float.valueOf(Float.MAX_VALUE)));
        if (strINotificationSideChannel.endsWith(".ai") || "ai".equals(str2)) {
            onSetCaptioningEnabled.b("Convert your Illustrator layers to shape layers.");
            previousVar.notify.add("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList2, previousVar, strINotificationSideChannel, j2, layerType, jG, strINotificationSideChannel2, arrayList, createcallbackB, iG, iG2, color, fD, fD3, iG3, iG4, mediaControllerCompatApi21Callback, mediaControllerCompatApi21CallbackProxyTuitionPaymentFragmentspecialinlinedviewModeldefault1, arrayList4, matteType2, getvolumecontrol, zAsBinder);
    }

    public static Layer TuitionPaymentFragmentspecialinlinedviewModeldefault2(previous previousVar) {
        Rect rect = previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return new Layer(Collections.emptyList(), previousVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new createCallback(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false);
    }
}
