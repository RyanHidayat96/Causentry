package defpackage;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class onFastForward {
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("nm", "mm", "hd");

    static MergePaths b(JsonReader jsonReader) throws IOException {
        String strINotificationSideChannel = null;
        boolean zAsBinder = false;
        MergePaths.MergePathsMode mergePathsModeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                strINotificationSideChannel = jsonReader.INotificationSideChannel();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                mergePathsModeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MergePaths.MergePathsMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader.g());
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                zAsBinder = jsonReader.asBinder();
            } else {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            }
        }
        return new MergePaths(strINotificationSideChannel, mergePathsModeTuitionPaymentFragmentspecialinlinedviewModeldefault3, zAsBinder);
    }
}
