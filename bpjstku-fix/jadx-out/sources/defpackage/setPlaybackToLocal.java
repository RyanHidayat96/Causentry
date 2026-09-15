package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class setPlaybackToLocal {
    private static JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    static toLegacyStreamType TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader, previous previousVar) throws IOException {
        toLegacyStreamType tolegacystreamtypeB;
        String strINotificationSideChannel;
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        byte b = 2;
        int iG = 2;
        while (true) {
            tolegacystreamtypeB = null;
            if (!jsonReader.asInterface()) {
                strINotificationSideChannel = null;
                break;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
                break;
            }
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                iG = jsonReader.g();
            } else {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            }
        }
        if (strINotificationSideChannel == null) {
            return null;
        }
        strINotificationSideChannel.hashCode();
        switch (strINotificationSideChannel.hashCode()) {
            case 3239:
                if (!strINotificationSideChannel.equals("el")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3270:
                if (!strINotificationSideChannel.equals("fl")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3295:
                if (!strINotificationSideChannel.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                if (!strINotificationSideChannel.equals("gr")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3308:
                if (!strINotificationSideChannel.equals("gs")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 3488:
                if (!strINotificationSideChannel.equals("mm")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 3633:
                if (!strINotificationSideChannel.equals("rc")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 3646:
                if (!strINotificationSideChannel.equals("rp")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 3669:
                if (!strINotificationSideChannel.equals("sh")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 3679:
                if (!strINotificationSideChannel.equals("sr")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 3681:
                if (!strINotificationSideChannel.equals(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE)) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 3705:
                if (!strINotificationSideChannel.equals("tm")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 3710:
                if (!strINotificationSideChannel.equals("tr")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                tolegacystreamtypeB = setCallback.b(jsonReader, previousVar, iG);
                break;
            case 1:
                tolegacystreamtypeB = onPlayFromSearch.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar);
                break;
            case 2:
                tolegacystreamtypeB = setSessionActivity.b(jsonReader, previousVar);
                break;
            case 3:
                tolegacystreamtypeB = onPause.TuitionPaymentFragmentbindingInflater1(jsonReader, previousVar);
                break;
            case 4:
                tolegacystreamtypeB = setQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar);
                break;
            case 5:
                tolegacystreamtypeB = onFastForward.b(jsonReader);
                onSetCaptioningEnabled.b("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                previousVar.notify.add("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                tolegacystreamtypeB = onAddQueueItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
                break;
            case 7:
                tolegacystreamtypeB = onPlayFromMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
                break;
            case 8:
                tolegacystreamtypeB = onPrepareFromMediaId.b(jsonReader, previousVar);
                break;
            case 9:
                tolegacystreamtypeB = onCustomAction.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, previousVar);
                break;
            case 10:
                tolegacystreamtypeB = onPrepareFromSearch.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader, previousVar);
                break;
            case 11:
                tolegacystreamtypeB = onRemoveQueueItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2(jsonReader, previousVar);
                break;
            case 12:
                tolegacystreamtypeB = release.b(jsonReader, previousVar);
                break;
            default:
                onSetCaptioningEnabled.b("Unknown shape type ".concat(String.valueOf(strINotificationSideChannel)));
                break;
        }
        while (jsonReader.asInterface()) {
            jsonReader.onTransact();
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        return tolegacystreamtypeB;
    }
}
