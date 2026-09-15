package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class DeviceProperties implements EncoderProfilesProvider {
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, barcodeFormat, i, i2, null);
    }

    /* JADX INFO: renamed from: DeviceProperties$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // defpackage.EncoderProfilesProvider
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        EncoderProfilesProvider completedsuccessfully;
        switch (AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault3[barcodeFormat.ordinal()]) {
            case 1:
                completedsuccessfully = new completedSuccessfully();
                break;
            case 2:
                completedsuccessfully = new putTag();
                break;
            case 3:
                completedsuccessfully = new LiveDataObservableResult();
                break;
            case 4:
                completedsuccessfully = new setError();
                break;
            case 5:
                completedsuccessfully = new getSessionStateCallbacks();
                break;
            case 6:
                completedsuccessfully = new LiveDataObservableExternalSyntheticLambda1();
                break;
            case 7:
                completedsuccessfully = new disable();
                break;
            case 8:
                completedsuccessfully = new Code128Writer();
                break;
            case 9:
                completedsuccessfully = new MetadataHolderService();
                break;
            case 10:
                completedsuccessfully = new QuirkSettingsHolderObserverToConsumerAdapter();
                break;
            case 11:
                completedsuccessfully = new LiveDataObservableExternalSyntheticLambda3();
                break;
            case 12:
                completedsuccessfully = new getMaxResolution();
                break;
            case 13:
                completedsuccessfully = new EncoderProfilesProvider1();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return completedsuccessfully.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, barcodeFormat, i, i2, map);
    }
}
