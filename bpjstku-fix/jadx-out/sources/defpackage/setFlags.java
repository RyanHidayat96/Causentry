package defpackage;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class setFlags implements onPrepareFromUri<DocumentData> {
    public static final setFlags TuitionPaymentFragmentbindingInflater1 = new setFlags();
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private setFlags() {
    }

    @Override // defpackage.onPrepareFromUri
    public final /* bridge */ /* synthetic */ DocumentData TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        DocumentData.Justification justification2 = justification;
        String strINotificationSideChannel = null;
        String strINotificationSideChannel2 = null;
        float fD = 0.0f;
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        float fD4 = 0.0f;
        int iG = 0;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        boolean zAsBinder = true;
        while (jsonReader.asInterface()) {
            switch (jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                case 0:
                    strINotificationSideChannel = jsonReader.INotificationSideChannel();
                    break;
                case 1:
                    strINotificationSideChannel2 = jsonReader.INotificationSideChannel();
                    break;
                case 2:
                    fD = (float) jsonReader.d();
                    break;
                case 3:
                    int iG2 = jsonReader.g();
                    if (iG2 > DocumentData.Justification.CENTER.ordinal() || iG2 < 0) {
                        justification2 = DocumentData.Justification.CENTER;
                    } else {
                        justification2 = DocumentData.Justification.values()[iG2];
                    }
                    break;
                case 4:
                    iG = jsonReader.g();
                    break;
                case 5:
                    fD2 = (float) jsonReader.d();
                    break;
                case 6:
                    fD3 = (float) jsonReader.d();
                    break;
                case 7:
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader);
                    break;
                case 8:
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jsonReader);
                    break;
                case 9:
                    fD4 = (float) jsonReader.d();
                    break;
                case 10:
                    zAsBinder = jsonReader.asBinder();
                    break;
                default:
                    jsonReader.cancelAll();
                    jsonReader.onTransact();
                    break;
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        return new DocumentData(strINotificationSideChannel, strINotificationSideChannel2, fD, justification2, iG, fD2, fD3, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, fD4, zAsBinder);
    }
}
