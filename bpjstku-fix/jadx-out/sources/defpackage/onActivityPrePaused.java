package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.asik.AsikRepository;
import com.bpjstku.data.asik.model.request.AccountBankRequest;
import com.bpjstku.data.asik.model.request.AsikDocumentRequest;
import com.bpjstku.data.asik.model.request.AsikFirstStepRequest;
import com.bpjstku.data.asik.model.request.AsikListFamilyRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjRequest;
import com.bpjstku.data.asik.model.request.AsikRequest;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessBegin;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly;
import com.bpjstku.data.asik.model.request.AsikVerificationStepRequest;
import com.bpjstku.data.asik.model.request.CheckSubmissionRequest;
import com.bpjstku.data.asik.model.request.OtpByEmailRequest;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.data.asik.model.request.VerifyOtpAsikRequest;
import com.bpjstku.data.asik.model.response.AccountBankItem;
import com.bpjstku.data.asik.model.response.AddressPostalCodeItem;
import com.bpjstku.data.asik.model.response.AsikItem;
import com.bpjstku.data.asik.model.response.AsikListFamilyItem;
import com.bpjstku.data.asik.model.response.AsikListKpjItem;
import com.bpjstku.data.asik.model.response.AsikListKpjMobileItem;
import com.bpjstku.data.asik.model.response.AsikVerifivationLivenessOnlyResponse;
import com.bpjstku.data.asik.model.response.OtpRequestItem;
import com.bpjstku.data.asik.model.response.SubmissionRequestItem;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.domain.asik.model.Asik;
import com.bpjstku.domain.asik.model.AsikListKpj;
import com.bpjstku.domain.asik.model.AsikListKpjMobile;
import com.bpjstku.domain.asik.model.OtpAsik;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.google.android.gms.internal.measurement.zzdm;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class onActivityPrePaused implements InterfaceC0833y {
    private static int $10 = 0;
    private static int $11 = 1;
    private final PreferenceManager TuitionPaymentFragmentbindingInflater1;
    private final AsikRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String b;
    private static final byte[] $$a = {22, 102, 43, -6, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 43;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -5768352170940582915L;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i5)) | i8;
        int i10 = ~i3;
        int i11 = ~(i10 | i2);
        int i12 = i8 | i11 | (~(i10 | i5));
        int i13 = (~((~i5) | i10)) | i8 | i11;
        int i14 = i2 + i3 + i4 + ((-369695973) * i6) + (1794320298 * i);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i2) + 1478230016 + (776760710 * i3) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i4) + (217841664 * i6) + ((-410517504) * i) + ((-175177728) * i15);
        int i17 = ((i2 * 1872133577) - 2052485254) + (i3 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i4 * 1872134975) + (i6 * (-1328892763)) + (i * (-1296121642)) + (i15 * (-1691287552));
        switch (i16 + (i17 * i17 * (-1729036288))) {
            case 1:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 2:
                return b(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 5:
                return g(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return d(objArr);
            case 8:
                return a(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                onActivityPrePaused onactivityprepaused = (onActivityPrePaused) objArr[0];
                OtpByEmailRequest otpByEmailRequest = (OtpByEmailRequest) objArr[1];
                int i18 = 2 % 2;
                Intrinsics.checkNotNullParameter(otpByEmailRequest, "");
                deriveCodec<OtpRequestItem> derivecodecPostOtpByEmailRequest = onactivityprepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postOtpByEmailRequest(otpByEmailRequest);
                final Function1 function1 = new Function1() { // from class: vExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int iB = zzdm.b();
                        int iB2 = zzdm.b();
                        int iB3 = zzdm.b();
                        return (OtpAsik) onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{(OtpRequestItem) obj}, -355100586, 355100591, iB2, iB, iB3);
                    }
                };
                readableMs readablems = new readableMs() { // from class: x
                    @Override // defpackage.readableMs
                    public final Object apply(Object obj) {
                        return onActivityPrePaused.b(function1, obj);
                    }
                };
                share.b(readablems, "mapper is null");
                Api23Impl api23Impl = new Api23Impl(derivecodecPostOtpByEmailRequest, readablems);
                Intrinsics.checkNotNullExpressionValue(api23Impl, "");
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                g = i19 % 128;
                int i20 = i19 % 2;
                return api23Impl;
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r7 = r7 + 1
            byte[] r0 = defpackage.onActivityPrePaused.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onActivityPrePaused.c(byte, int, short, java.lang.Object[]):void");
    }

    public onActivityPrePaused(AsikRepository asikRepository, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(asikRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = asikRepository;
        this.TuitionPaymentFragmentbindingInflater1 = preferenceManager;
        this.b = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<Asik> b(AsikRequest asikRequest, final AsikDocumentRequest asikDocumentRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikRequest, "");
        Intrinsics.checkNotNullParameter(asikDocumentRequest, "");
        deriveCodec<AsikItem> derivecodecInsertAsik = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.insertAsik(asikRequest);
        final Function1 function1 = new Function1() { // from class: vExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asikDocumentRequest, this, (AsikItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onScanResult
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.cancelAll(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        SingleFlatMap singleFlatMap = new SingleFlatMap(derivecodecInsertAsik, readablems);
        final Function1 function2 = new Function1() { // from class: onScanFailed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iB = zzdm.b();
                int iB2 = zzdm.b();
                int iB3 = zzdm.b();
                return (Asik) onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{(BaseItem) obj}, -1790405965, 1790405965, iB2, iB, iB3);
            }
        };
        readableMs readablems2 = new readableMs() { // from class: w
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function2, obj);
            }
        };
        share.b(readablems2, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(singleFlatMap, readablems2);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
        return api23Impl;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 5;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 4;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Drawable.resolveOpacity(0, 0)), 2624 - View.MeasureSpec.getSize(0), 12 - ImageFormat.getBitsPerPixel(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39422), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 482, 36 - ImageFormat.getBitsPerPixel(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 23;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 39422), 481 - TextUtils.getOffsetAfter("", 0), TextUtils.getCapsMode("", 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        onActivityPrePaused onactivityprepaused = (onActivityPrePaused) objArr[0];
        OtpByPhoneRequest otpByPhoneRequest = (OtpByPhoneRequest) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otpByPhoneRequest, "");
        deriveCodec<OtpRequestItem> derivecodecPostOtpByPhoneRequest = onactivityprepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2.postOtpByPhoneRequest(otpByPhoneRequest);
        final Function1 function1 = new Function1() { // from class: onAccessibilityServicesStateChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentbindingInflater1((OtpRequestItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: tExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostOtpByPhoneRequest, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = g + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<BaseItem> b(VerifyOtpAsikRequest verifyOtpAsikRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(verifyOtpAsikRequest, "");
        deriveCodec<BaseItem> derivecodecVerifyOtpAsikByEmailRequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyOtpAsikByEmailRequest(verifyOtpAsikRequest);
        final Function1 function1 = new Function1() { // from class: vExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: vExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtpAsikByEmailRequest, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerifyOtpAsikRequest verifyOtpAsikRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(verifyOtpAsikRequest, "");
        deriveCodec<BaseItem> derivecodecVerifyOtpAsikByPhoneRequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyOtpAsikByPhoneRequest(verifyOtpAsikRequest);
        final Function1 function1 = new Function1() { // from class: tExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iB = zzdm.b();
                int iB2 = zzdm.b();
                int iB3 = zzdm.b();
                return (BaseItem) onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{(BaseItem) obj}, 141344151, -141344142, iB2, iB, iB3);
            }
        };
        readableMs readablems = new readableMs() { // from class: vExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyOtpAsikByPhoneRequest, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = g + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<SubmissionCheckItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckSubmissionRequest checkSubmissionRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(checkSubmissionRequest, "");
        deriveCodec<SubmissionRequestItem> derivecodecCheckSubmissionAsik = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.checkSubmissionAsik(checkSubmissionRequest);
        final Function1 function1 = new Function1() { // from class: t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1((SubmissionRequestItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                Object[] objArr = {function1, obj};
                int iB = zzdm.b();
                return (SubmissionCheckItem) onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), objArr, 371695581, -371695574, zzdm.b(), iB, zzdm.b());
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckSubmissionAsik, readablems);
        final Function1 function2 = new Function1() { // from class: onScreenCaptured
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (SubmissionCheckItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: tExternalSyntheticLambda1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                onActivityPrePaused.g(function2, obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return currentsystemtimens;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<List<AsikListKpj>> TuitionPaymentFragmentbindingInflater1(AsikListKpjRequest asikListKpjRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikListKpjRequest, "");
        deriveCodec<List<AsikListKpjItem>> listKpj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getListKpj(asikListKpjRequest);
        final Function1 function1 = new Function1() { // from class: onActivityPostStarted
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentbindingInflater1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onActivityPreSaveInstanceState
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(listKpj, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        g = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<List<AsikListFamilyItem>> TuitionPaymentFragmentbindingInflater1(AsikListFamilyRequest asikListFamilyRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikListFamilyRequest, "");
        deriveCodec<List<AsikListFamilyItem>> listFamily = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getListFamily(asikListFamilyRequest);
        final Function1 function1 = new Function1() { // from class: vExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: vExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(listFamily, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = g + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikFirstStepRequest asikFirstStepRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikFirstStepRequest, "");
        deriveCodec<BaseItem> derivecodecVerifyAsikFirstStep = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyAsikFirstStep(asikFirstStepRequest);
        final Function1 function1 = new Function1() { // from class: onActivityPostStopped
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onActivityPreStarted
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.onTransact(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyAsikFirstStep, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        g = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(AsikVerificationStepRequest asikVerificationStepRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikVerificationStepRequest, "");
        deriveCodec<BaseItem> derivecodecVerifyAsikSecondStep = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyAsikSecondStep(asikVerificationStepRequest);
        final Function1 function1 = new Function1() { // from class: onActivityPreStopped
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.asInterface((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: qExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.INotificationSideChannelStub(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyAsikSecondStep, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return api23Impl;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        onActivityPrePaused onactivityprepaused = (onActivityPrePaused) objArr[0];
        AsikVerificationStepRequest asikVerificationStepRequest = (AsikVerificationStepRequest) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikVerificationStepRequest, "");
        deriveCodec<BaseItem> derivecodecVerifyAsikFifthStep = onactivityprepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyAsikFifthStep(asikVerificationStepRequest);
        final Function1 function1 = new Function1() { // from class: vExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentbindingInflater1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: vExternalSyntheticLambda10
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                Object[] objArr2 = {function1, obj};
                int iB = zzdm.b();
                return (BaseItem) onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), objArr2, 2066645201, -2066645193, zzdm.b(), iB, zzdm.b());
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyAsikFifthStep, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = g + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<BaseItem> TuitionPaymentFragmentbindingInflater1(AsikVerificationStepRequest asikVerificationStepRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikVerificationStepRequest, "");
        deriveCodec<BaseItem> derivecodecVerifyAsikFourStep = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyAsikFourStep(asikVerificationStepRequest);
        final Function1 function1 = new Function1() { // from class: tExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.b((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: accept
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.INotificationSideChannel(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyAsikFourStep, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        g = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    @Override // defpackage.InterfaceC0833y
    public final SubmissionCheckItem TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) this.TuitionPaymentFragmentbindingInflater1.getObject("ASIK_TRANSACTION_ID", SubmissionCheckItem.class);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
        return submissionCheckItem;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<AccountBankItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(AccountBankRequest accountBankRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountBankRequest, "");
        deriveCodec<AccountBankItem> accountBank = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAccountBank(accountBankRequest);
        final Function1 function1 = new Function1() { // from class: onConnectionStateChange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2((AccountBankItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onActivityPreCreated
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(accountBank, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentbindingInflater1(final Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        deriveCodec derivecodecB = deriveCodec.b(new scaleBitrate() { // from class: vExternalSyntheticLambda5
            @Override // defpackage.scaleBitrate
            public final void subscribe(BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider) {
                onActivityPrePaused.b(context, backupHdrProfileEncoderProfilesProvider);
            }
        });
        appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
        share.b(appendbackupvideoprofileB, "scheduler is null");
        SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(derivecodecB, appendbackupvideoprofileB);
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "");
        int i2 = g + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return singleSubscribeOn;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArr2;
        int i = 0;
        onActivityPrePaused onactivityprepaused = (onActivityPrePaused) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
            int defaultSize = View.getDefaultSize(0, 0) + 651;
            int modifierMetaStateMask = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) 52, bArr[5], bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, defaultSize, modifierMetaStateMask, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{6791, 14715, 23908, 29005, 38213, 43312, 52528, 57709, 1297, 22814, 32182, 37316, 46587, 51650, 60888, 446, 9659, 31110, 40348, 45440, 54393, 59490}, View.MeasureSpec.getMode(0) + 9203, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{6787, 6155, 8069, 7445, 4241, 5638, 5508, 2867, 3723, 3086, 896, 281, 1155, 14854, 14733}, 641 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 651;
            int iIndexOf = 43 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr2 = $$a;
            byte b = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b, b, bArr2[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, iResolveSizeAndState, iIndexOf, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = g + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 651;
                int iResolveOpacity = 44 - Drawable.resolveOpacity(0, 0);
                byte b2 = $$a[7];
                Object[] objArr7 = new Object[1];
                c((byte) 37, b2, b2, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollDefaultDelay, iResolveOpacity, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i7 = ((int[]) objArr8[2])[0];
            int i8 = ((int[]) objArr8[0])[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i9 = ~startElapsedRealtime;
            int i10 = (-975331267) + ((939321343 | startElapsedRealtime) * (-676)) + (((~(925425997 | i9)) | (-939321344)) * 676) + (((~(startElapsedRealtime | (-13895347))) | (~(i9 | 921995187)) | 17326156) * 676) + 448961872;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr2[3])[0] = i12 ^ (i12 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.combineMeasuredStates(0, 0), 1610 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 448961872, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 650;
                    int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr10 = new Object[1];
                    c(b3, b3, bArr3[5], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, i13, iLastIndexOf, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 695, 98 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63405), 793 - Color.red(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 84), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int iBlue = Color.blue(0) + 651;
                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 44;
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((byte) 37, b4, b4, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iBlue, iResolveOpacity2, -1595579076, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    e(new char[]{6791, 14715, 23908, 29005, 38213, 43312, 52528, 57709, 1297, 22814, 32182, 37316, 46587, 51650, 60888, 446, 9659, 31110, 40348, 45440, 54393, 59490}, 9204 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr13);
                    Class<?> cls2 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    e(new char[]{6787, 6155, 8069, 7445, 4241, 5638, 5508, 2867, 3723, 3086, 896, 281, 1155, 14854, 14733}, (ViewConfiguration.getEdgeSlop() >> 16) + 641, objArr14);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                        int iResolveOpacity3 = 44 - Drawable.resolveOpacity(0, 0);
                        byte[] bArr4 = $$a;
                        byte b5 = bArr4[7];
                        Object[] objArr15 = new Object[1];
                        c(b5, b5, bArr4[5], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyTid, i14, iResolveOpacity3, -873460649, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iBlue2 = Color.blue(0) + 651;
                        int iArgb = Color.argb(0, 0, 0, 0) + 44;
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, bArr5[5], bArr5[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(absoluteGravity, iBlue2, iArgb, -459846511, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr2 = objArr11;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr2[0])[0];
        int i16 = ((int[]) objArr2[2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[1];
            if (strArr != null) {
                while (i < strArr.length) {
                    int i17 = g + 5;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                    if (i17 % 2 != 0) {
                        arrayList.add(strArr[i]);
                    } else {
                        arrayList.add(strArr[i]);
                        i++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        Object[] objArr17 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i18 = ((int[]) objArr2[3])[0];
        int i19 = ((int[]) objArr2[2])[0];
        int i20 = ((int[]) objArr2[0])[0];
        int iNextInt = new Random().nextInt();
        int i21 = ~((-67248545) | iNextInt);
        int i22 = ~iNextInt;
        int i23 = i18 + 1142053825 + ((i21 | (~(936377838 | i22))) * 920) + (((~((-872560105) | i22)) | 67248544) * 920) + (((~(iNextInt | 936377838)) | (~((-67248545) | i22)) | (~((-805311561) | iNextInt))) * 920);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr17[3])[0] = i25 ^ (i25 << 5);
        deriveCodec<List<AddressPostalCodeItem>> derivecodecAddressPostalCode = onactivityprepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addressPostalCode();
        final Function1 function1 = new Function1() { // from class: tExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: vExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.INotificationSideChannelStubProxy(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecAddressPostalCode, readablems);
        int i26 = ((int[]) objArr17[3])[0];
        int i27 = i26 * i26;
        int i28 = -(565443754 * i26);
        int i29 = (i27 & i28) + (i27 | i28);
        int i30 = -(i26 * (-1930601618));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        int i32 = (i31 & 589308048) + (589308048 | i31);
        int i33 = i32 >> 17;
        int i34 = ((i33 & (-65535)) + (i33 | (-65535))) / 32768;
        int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
        int i36 = (i32 & i35) + (i35 | i32);
        int i37 = i32 >> 29;
        int i38 = -(i36 ^ (((((i37 | (-15)) << 1) - (i37 ^ (-15))) / 8) + 1));
        int i39 = (i38 & 3) + (i38 | 3);
        int i40 = i39 >> 17;
        int i41 = ((i40 ^ (-65535)) + ((i40 & (-65535)) << 1)) / 32768;
        Intrinsics.checkNotNullExpressionValue(api23Impl, "12|17|11|map(...)".substring(25920 / (((-((((i41 | 1) << 1) - (i41 ^ 1)) + 1)) & i39) * 960)));
        return api23Impl;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<List<AsikListKpjMobile>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikListKpjMobileRequest asikListKpjMobileRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikListKpjMobileRequest, "");
        deriveCodec<List<AsikListKpjMobileItem>> listKpjMobile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getListKpjMobile(asikListKpjMobileRequest);
        final Function1 function1 = new Function1() { // from class: tExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iB = zzdm.b();
                int iB2 = zzdm.b();
                int iB3 = zzdm.b();
                return (List) onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{(List) obj}, 577714579, -577714577, iB2, iB, iB3);
            }
        };
        readableMs readablems = new readableMs() { // from class: u
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.notify(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(listKpjMobile, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        g = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<AsikVerifivationLivenessOnlyResponse> TuitionPaymentFragmentbindingInflater1(AsikVerificationLivenessOnly asikVerificationLivenessOnly) throws Throwable {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikVerificationLivenessOnly, "");
        String email = asikVerificationLivenessOnly.getEmail();
        String transactionId = asikVerificationLivenessOnly.getTransactionId();
        String flData = asikVerificationLivenessOnly.getFlData();
        if (flData != null) {
            int i2 = g + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, flData, this.b);
                throw null;
            }
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, flData, this.b);
        } else {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }
        String brand = asikVerificationLivenessOnly.getBrand();
        String deviceId = asikVerificationLivenessOnly.getDeviceId();
        String model = asikVerificationLivenessOnly.getModel();
        String sdk = asikVerificationLivenessOnly.getSdk();
        String manufacture = asikVerificationLivenessOnly.getManufacture();
        String file = asikVerificationLivenessOnly.getFile();
        String signature = asikVerificationLivenessOnly.getSignature();
        if (signature != null) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, signature, this.b);
        } else {
            int i3 = g + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
        String transactionIdSdk = asikVerificationLivenessOnly.getTransactionIdSdk();
        String scoreLiveness = asikVerificationLivenessOnly.getScoreLiveness();
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = scoreLiveness != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scoreLiveness, this.b) : null;
        String scoreManipulation = asikVerificationLivenessOnly.getScoreManipulation();
        deriveCodec<AsikVerifivationLivenessOnlyResponse> derivecodecVerifyAsikLivenessOnly = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyAsikLivenessOnly(new AsikVerificationLivenessOnly(email, transactionId, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, brand, deviceId, model, sdk, manufacture, file, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, transactionIdSdk, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, scoreManipulation != null ? Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, scoreManipulation, this.b) : null, asikVerificationLivenessOnly.getLongitude(), asikVerificationLivenessOnly.getLatitude(), asikVerificationLivenessOnly.getLocality()));
        final Function1 function1 = new Function1() { // from class: onActivityPreResumed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iB = zzdm.b();
                int iB2 = zzdm.b();
                int iB3 = zzdm.b();
                return (AsikVerifivationLivenessOnlyResponse) onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{(AsikVerifivationLivenessOnlyResponse) obj}, -143571580, 143571586, iB2, iB, iB3);
            }
        };
        readableMs readablems = new readableMs() { // from class: s
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyAsikLivenessOnly, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<AsikVerifivationLivenessOnlyResponse> b(AsikVerificationLivenessBegin asikVerificationLivenessBegin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikVerificationLivenessBegin, "");
        String email = asikVerificationLivenessBegin.getEmail();
        String transactionId = asikVerificationLivenessBegin.getTransactionId();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String signature = asikVerificationLivenessBegin.getSignature();
        Intrinsics.checkNotNull(signature);
        deriveCodec<AsikVerifivationLivenessOnlyResponse> derivecodecVerifyAsikLivenessBegin = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.verifyAsikLivenessBegin(new AsikVerificationLivenessBegin(email, transactionId, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion, signature, this.b)));
        final Function1 function1 = new Function1() { // from class: v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPrePaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3((AsikVerifivationLivenessOnlyResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: tExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPrePaused.getInterfaceDescriptor(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecVerifyAsikLivenessBegin, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<AsikListKpjItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (AsikListKpjItem asikListKpjItem : list2) {
            Intrinsics.checkNotNullParameter(asikListKpjItem, "");
            arrayList.add(new AsikListKpj(asikListKpjItem.getKpj(), asikListKpjItem.getKodeSegmen(), asikListKpjItem.getFlagShow()));
            int i2 = g + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 2;
            }
        }
        return arrayList;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        OtpRequestItem otpRequestItem = (OtpRequestItem) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(otpRequestItem, "");
        ActivityViewModelLazyKt activityViewModelLazyKt = ActivityViewModelLazyKt.INSTANCE;
        OtpAsik otpAsikInvoke = ActivityViewModelLazyKt.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(otpRequestItem);
        int i4 = g + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return otpAsikInvoke;
        }
        throw null;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 == 0) {
            return (List) function1.invoke(obj);
        }
        List list = (List) function1.invoke(obj);
        int i4 = 11 / 0;
        return list;
    }

    public static /* synthetic */ AsikVerifivationLivenessOnlyResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse) {
        int i = 2 % 2;
        int i2 = g + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(asikVerifivationLivenessOnlyResponse, "");
        if (i3 == 0) {
            return onCharacteristicWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asikVerifivationLivenessOnlyResponse);
        }
        onCharacteristicWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asikVerifivationLivenessOnlyResponse);
        throw null;
    }

    public static /* synthetic */ Asik TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Asik asik = (Asik) function1.invoke(obj);
        int i4 = g + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return asik;
    }

    public static /* synthetic */ OtpAsik b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        OtpAsik otpAsik = (OtpAsik) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return otpAsik;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(Context context, BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(backupHdrProfileEncoderProfilesProvider, "");
        try {
            Object objNextValue = new JSONTokener(VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, "address.json")).nextValue();
            Intrinsics.checkNotNull(objNextValue, "");
            JSONArray jSONArray = (JSONArray) objNextValue;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            int i2 = g + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            for (int i4 = 0; i4 < length; i4++) {
                String string = jSONArray.getJSONObject(i4).getString("code");
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = jSONArray.getJSONObject(i4).getString("name");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList.add(new CodeNamePair(string, string2));
            }
            backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            g = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e2) {
            backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentbindingInflater1(e2);
        }
    }

    public static /* synthetic */ AccountBankItem TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        AccountBankItem accountBankItem = (AccountBankItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return accountBankItem;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = g + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    public static /* synthetic */ OtpAsik asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 == 0) {
            return (OtpAsik) function1.invoke(obj);
        }
        OtpAsik otpAsik = (OtpAsik) function1.invoke(obj);
        int i4 = 26 / 0;
        return otpAsik;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        int i = 2 % 2;
        int i2 = g + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            return list;
        }
        Intrinsics.checkNotNullParameter(list, "");
        throw null;
    }

    public static /* synthetic */ void g(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044 A[PHI: r1 r3 r4
  0x0044: PHI (r1v8 java.lang.String) = (r1v5 java.lang.String), (r1v10 java.lang.String) binds: [B:8:0x0040, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r3v11 java.lang.Boolean) = (r3v0 java.lang.Boolean), (r3v12 java.lang.Boolean) binds: [B:8:0x0040, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:8:0x0040, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[PHI: r1 r3
  0x0042: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v10 java.lang.String) binds: [B:8:0x0040, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r3v1 java.lang.Boolean) = (r3v0 java.lang.Boolean), (r3v12 java.lang.Boolean) binds: [B:8:0x0040, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ SubmissionCheckItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(SubmissionRequestItem submissionRequestItem) {
        String strB;
        Boolean status;
        String message;
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = g + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(submissionRequestItem, "");
        if (i3 != 0) {
            Intrinsics.checkNotNullParameter(submissionRequestItem, "");
            strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            status = submissionRequestItem.getStatus();
            message = submissionRequestItem.getMessage();
            int i4 = 44 / 0;
            if (message == null) {
                str = "";
            } else {
                str = message;
            }
        } else {
            Intrinsics.checkNotNullParameter(submissionRequestItem, "");
            strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            status = submissionRequestItem.getStatus();
            message = submissionRequestItem.getMessage();
            if (message == null) {
                str = "";
            } else {
                str = message;
            }
        }
        Boolean bool = status;
        String transactionId = submissionRequestItem.getTransactionId();
        String str4 = transactionId == null ? "" : transactionId;
        String statusCode = submissionRequestItem.getStatusCode();
        if (statusCode == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            g = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        } else {
            str2 = statusCode;
        }
        String branchOfficeChannelName = submissionRequestItem.getBranchOfficeChannelName();
        String str5 = branchOfficeChannelName == null ? "" : branchOfficeChannelName;
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String signature = submissionRequestItem.getSignature();
        if (signature == null) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            g = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str3 = signature;
        }
        return new SubmissionCheckItem(bool, str, str4, str2, str5, companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str3, strB));
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) {
        int i = 2 % 2;
        int i2 = g + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return list;
    }

    public static /* synthetic */ BaseItem asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 == 0) {
            throw null;
        }
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        g = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onActivityPrePaused onactivityprepaused, SubmissionCheckItem submissionCheckItem) {
        int i = 2 % 2;
        int i2 = g + 17;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        if (submissionCheckItem != null) {
            int i5 = i3 + 69;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                onactivityprepaused.TuitionPaymentFragmentbindingInflater1.saveObject("ASIK_TRANSACTION_ID", submissionCheckItem);
                int i6 = 89 / 0;
            } else {
                onactivityprepaused.TuitionPaymentFragmentbindingInflater1.saveObject("ASIK_TRANSACTION_ID", submissionCheckItem);
            }
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            g = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AsikVerifivationLivenessOnlyResponse a(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 == 0) {
            throw null;
        }
        AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse = (AsikVerifivationLivenessOnlyResponse) function1.invoke(obj);
        int i4 = g + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return asikVerifivationLivenessOnlyResponse;
    }

    public static /* synthetic */ List d(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = g + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return list;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentbindingInflater1(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        g = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    public static /* synthetic */ BaseItem INotificationSideChannel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        g = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = g + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseItem, "");
            int i3 = 72 / 0;
        } else {
            Intrinsics.checkNotNullParameter(baseItem, "");
        }
        return baseItem;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        SubmissionCheckItem submissionCheckItem = (SubmissionCheckItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return submissionCheckItem;
    }

    public static /* synthetic */ OtpAsik TuitionPaymentFragmentbindingInflater1(OtpRequestItem otpRequestItem) {
        int i = 2 % 2;
        int i2 = g + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(otpRequestItem, "");
        if (i3 == 0) {
            ActivityViewModelLazyKt activityViewModelLazyKt = ActivityViewModelLazyKt.INSTANCE;
            return ActivityViewModelLazyKt.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(otpRequestItem);
        }
        ActivityViewModelLazyKt activityViewModelLazyKt2 = ActivityViewModelLazyKt.INSTANCE;
        ActivityViewModelLazyKt.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(otpRequestItem);
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        BaseItem baseItem = (BaseItem) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        if (i3 != 0) {
            onServicesDiscovered onservicesdiscovered = onServicesDiscovered.INSTANCE;
            return onServicesDiscovered.TuitionPaymentFragmentbindingInflater1().invoke(baseItem);
        }
        onServicesDiscovered onservicesdiscovered2 = onServicesDiscovered.INSTANCE;
        onServicesDiscovered.TuitionPaymentFragmentbindingInflater1().invoke(baseItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AccountBankItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(AccountBankItem accountBankItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accountBankItem, "");
        int i4 = g + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return accountBankItem;
    }

    public static /* synthetic */ List notify(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = g + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public static /* synthetic */ BaseItem onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = g + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return baseItem;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = g + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = g + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return baseItem;
        }
        throw null;
    }

    public static /* synthetic */ BaseItem b(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseItem, "");
            return baseItem;
        }
        Intrinsics.checkNotNullParameter(baseItem, "");
        throw null;
    }

    public static /* synthetic */ generateBackupProfile cancelAll(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = g + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        generateBackupProfile generatebackupprofile = (generateBackupProfile) function1.invoke(obj);
        int i4 = g + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return generatebackupprofile;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        BaseItem baseItem;
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = g + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 != 0) {
            baseItem = (BaseItem) function1.invoke(obj);
            int i4 = 75 / 0;
        } else {
            baseItem = (BaseItem) function1.invoke(obj);
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        g = i5 % 128;
        int i6 = i5 % 2;
        return baseItem;
    }

    public static /* synthetic */ List INotificationSideChannelStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = g + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse = (AsikVerifivationLivenessOnlyResponse) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(asikVerifivationLivenessOnlyResponse, "");
        AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onCharacteristicWrite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asikVerifivationLivenessOnlyResponse);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return asikVerifivationLivenessOnlyResponseTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ BaseItem asInterface(BaseItem baseItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(baseItem, "");
            int i3 = 12 / 0;
        } else {
            Intrinsics.checkNotNullParameter(baseItem, "");
        }
        return baseItem;
    }

    public static /* synthetic */ BaseItem INotificationSideChannelStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseItem baseItem = (BaseItem) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return baseItem;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        BaseItem baseItem = (BaseItem) objArr[0];
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        g = i4 % 128;
        int i5 = i4 % 2;
        return baseItem;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        List list = (List) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<AsikListKpjMobileItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (AsikListKpjMobileItem asikListKpjMobileItem : list2) {
            Intrinsics.checkNotNullParameter(asikListKpjMobileItem, "");
            arrayList.add(new AsikListKpjMobile(asikListKpjMobileItem.getKpj(), asikListKpjMobileItem.getKodeSegmen(), asikListKpjMobileItem.getKodeTk(), asikListKpjMobileItem.getFlagShow()));
            int i2 = g + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
        }
        return arrayList;
    }

    public static /* synthetic */ generateBackupProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikDocumentRequest asikDocumentRequest, onActivityPrePaused onactivityprepaused, AsikItem asikItem) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(asikItem, "");
        getContentPaddingRight.b bVarB = getContentPaddingRight.b("AsikInsertSignature");
        Intrinsics.checkExpressionValueIsNotNull(bVarB, "");
        bVarB.TuitionPaymentFragmentbindingInflater1(String.valueOf(asikItem.getRequestSignature()), new Object[0]);
        getContentPaddingRight.b bVarB2 = getContentPaddingRight.b("AsikInsertClientId");
        Intrinsics.checkExpressionValueIsNotNull(bVarB2, "");
        bVarB2.TuitionPaymentFragmentbindingInflater1(String.valueOf(asikItem.getClientId()), new Object[0]);
        deriveCodec<BaseItem> derivecodecDocumentAsik = onactivityprepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2.documentAsik(new AsikDocumentRequest(asikItem.getSubmissionCode(), asikItem.getOfficeCode(), asikDocumentRequest.getFile()));
        int i2 = g + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return derivecodecDocumentAsik;
    }

    public static /* synthetic */ AsikVerifivationLivenessOnlyResponse getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse = (AsikVerifivationLivenessOnlyResponse) function1.invoke(obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return asikVerifivationLivenessOnlyResponse;
    }

    public static /* synthetic */ OtpAsik TuitionPaymentFragmentspecialinlinedviewModeldefault1(OtpRequestItem otpRequestItem) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (OtpAsik) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{otpRequestItem}, -355100586, 355100591, iB2, iB, iB3);
    }

    public static /* synthetic */ SubmissionCheckItem cancel(Function1 function1, Object obj) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (SubmissionCheckItem) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{function1, obj}, 371695581, -371695574, iB2, iB, iB3);
    }

    public static /* synthetic */ Asik TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseItem baseItem) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (Asik) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{baseItem}, -1790405965, 1790405965, iB2, iB, iB3);
    }

    public static /* synthetic */ BaseItem RemoteActionCompatParcelizer(Function1 function1, Object obj) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (BaseItem) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{function1, obj}, 2066645201, -2066645193, iB2, iB, iB3);
    }

    public static /* synthetic */ AsikVerifivationLivenessOnlyResponse TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikVerifivationLivenessOnlyResponse asikVerifivationLivenessOnlyResponse) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (AsikVerifivationLivenessOnlyResponse) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{asikVerifivationLivenessOnlyResponse}, -143571580, 143571586, iB2, iB, iB3);
    }

    public static /* synthetic */ BaseItem g(BaseItem baseItem) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (BaseItem) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{baseItem}, 141344151, -141344142, iB2, iB, iB3);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (List) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{list}, 577714579, -577714577, iB2, iB, iB3);
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<List<AddressPostalCodeItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (deriveCodec) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{this, context}, 1095015498, -1095015495, iB2, iB, iB3);
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<OtpAsik> b(OtpByEmailRequest otpByEmailRequest) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (deriveCodec) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{this, otpByEmailRequest}, -873044517, 873044527, iB2, iB, iB3);
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<OtpAsik> b(OtpByPhoneRequest otpByPhoneRequest) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (deriveCodec) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{this, otpByPhoneRequest}, -1470882974, 1470882978, iB2, iB, iB3);
    }

    @Override // defpackage.InterfaceC0833y
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikVerificationStepRequest asikVerificationStepRequest) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        int iB3 = zzdm.b();
        return (deriveCodec) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzdm.b(), new Object[]{this, asikVerificationStepRequest}, 44790755, -44790754, iB2, iB, iB3);
    }
}
