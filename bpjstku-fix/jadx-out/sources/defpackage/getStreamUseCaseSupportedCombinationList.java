package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.queueing.model.request.AntrianOnlineUrlRequest;
import com.bpjstku.data.queueing.model.request.GetDataAntrianRequest;
import com.bpjstku.data.queueing.model.request.QuotaBookingRequest;
import com.bpjstku.data.queueing.model.response.AntrianOnlineUrlResponse;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.queueing.model.response.InsertAntrianResponse;
import com.bpjstku.data.queueing.model.response.NearestOfficeResponse;
import com.bpjstku.data.queueing.model.response.QuotaBookingResponse;
import com.bpjstku.domain.user.model.User;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getStreamUseCaseSupportedCombinationList extends ViewModel {
    public final acquireBuffer TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<InsertAntrianResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<GetDataAntrianResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trackPipAnimationHintView f988a;
    public final PreferenceManager asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<QuotaBookingResponse>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> b;
    public final MutableLiveData<VirtualCameraAdapter1<NearestOfficeResponse>> d;
    private final registerlambda1 g;
    private static final byte[] $$c = {91, -17, 90, 37};
    private static final int $$f = 35;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {33, -59, 107, -108, 13, -1, -62, 62, 5, 7, -1, -10, 2, 3, -6, 18, 0, 1, -18, -50, 52, 19, 7, -10, -10, -52, 20, 51, 7, -10, -10, -15, 19, 14, 5, -16, 14, -77, 18, -16, 18, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -65, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, 52, 14, -9, 15, -2, -5, -4, -53, 63, -2, -6, 17, -16, 18, -8, -3, 15, -68, 67, -3, -10, 3, 3, 15, -68, 52, 16, -6, -58, 64, 3, -10, 2, 8, -61, 77, 1, -22, 16};
    private static final int $$e = 239;
    private static final byte[] $$a = {46, 126, -84, 108, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 221;
    private static int onTransact = 0;
    private static int notify = 1;
    private static int cancelAll = -83722401;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i5 | i3;
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = ~(i8 | i9);
        int i11 = ~i5;
        int i12 = i10 | (~(i11 | i4));
        int i13 = ~(i9 | i5);
        int i14 = i12 | i13;
        int i15 = (~(i4 | i11 | i3)) | i13;
        int i16 = i5 + i3 + i6 + (1881146393 * i) + ((-1035018111) * i2);
        int i17 = i16 * i16;
        int i18 = ((i5 * (-1924067824)) - 304087040) + ((-1924067824) * i3) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i6) + (1612709888 * i) + ((-182452224) * i2) + ((-1611137024) * i17);
        int i19 = (i5 * (-928100048)) + 945860906 + (i3 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * 189) + (i6 * (-928100237)) + (i * (-1331189957)) + (i2 * 1329932787) + (i17 * 1550319616);
        int i20 = i18 + (i19 * i19 * 1690828800);
        if (i20 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i20 == 2) {
            return b(objArr);
        }
        if (i20 == 3) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i20 != 4) {
            return i20 != 5 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : asBinder(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 53 - r7
            int r9 = r9 * 52
            int r9 = r9 + 4
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = defpackage.getStreamUseCaseSupportedCombinationList.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r8 = r8 + r9
            int r8 = r8 + (-10)
            int r9 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getStreamUseCaseSupportedCombinationList.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = defpackage.getStreamUseCaseSupportedCombinationList.$$d
            int r1 = r7 + 1
            int r5 = 99 - r5
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r5 = r7
            r3 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L1f:
            r4 = r0[r6]
            int r3 = r3 + 1
        L23:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getStreamUseCaseSupportedCombinationList.f(byte, int, short, java.lang.Object[]):void");
    }

    public getStreamUseCaseSupportedCombinationList(trackPipAnimationHintView trackpipanimationhintview, registerlambda1 registerlambda1Var, PreferenceManager preferenceManager, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(trackpipanimationhintview, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.f988a = trackpipanimationhintview;
        this.g = registerlambda1Var;
        this.asBinder = preferenceManager;
        this.TuitionPaymentFragmentbindingInflater1 = acquirebuffer;
        this.d = new MutableLiveData<>();
        this.asInterface = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new MutableLiveData<>();
        this.b = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MutableLiveData<>();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter("IP", "");
        MutableLiveData<VirtualCameraAdapter1<QuotaBookingResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getstreamusecasesupportedcombinationlist.f988a.b(new QuotaBookingRequest(null, str, "IP", 1, null))));
        final Function1 function1 = new Function1() { // from class: setTargetConfigs
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (QuotaBookingResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: MeteringRepeatingSessionExternalSyntheticLambda1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr2 = {function1, obj};
                getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1169772334, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1169772334, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr2);
            }
        };
        final Function1 function2 = new Function1() { // from class: cancelRequests
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ProcessingCaptureSession
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = notify + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 123;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(cancelAll)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 3291, 31 - View.MeasureSpec.getMode(0), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16777867 + Color.rgb(0, 0, 0), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -450685997, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i8 = $11 + 73;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $10 + 49;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i12 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr4[i11] = cArr2[0];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getTrimmedLength(""), Color.alpha(0) + 651, 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), -450685997, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getMode(0), 651 - (Process.myTid() >> 22), TextUtils.getCapsMode("", 0, 0) + 44, -450685997, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MutableLiveData<VirtualCameraAdapter1<GetDataAntrianResponse>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.f988a.b(str, new GetDataAntrianRequest(str2))));
        final Function1 function1 = new Function1() { // from class: LensFacingUtil
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (GetDataAntrianResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: MeteringRepeatingSession
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr = {function1, obj};
                getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 106660057, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -106660055, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr);
            }
        };
        final Function1 function2 = new Function1() { // from class: ImageCaptureOptionUnpacker
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj};
                return (Unit) getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2018021466, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2018021469, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getCameraSelectorLensFacing
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentbindingInflater1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = notify + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AntrianOnlineUrlRequest antrianOnlineUrlRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(antrianOnlineUrlRequest, "");
        MutableLiveData<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        Object obj = null;
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.f988a.b(antrianOnlineUrlRequest)));
        final Function1 function1 = new Function1() { // from class: getSessionProcessorSurfaceList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (AntrianOnlineUrlResponse) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: getCaptureType
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                getStreamUseCaseSupportedCombinationList.asBinder(function1, obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: MeteringRepeatingSessionSurfaceResetCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getPreviewStabilizationSupportedCombinationList
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                getStreamUseCaseSupportedCombinationList.notify(function2, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = notify + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AntrianOnlineUrlRequest antrianOnlineUrlRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(antrianOnlineUrlRequest, "");
        MutableLiveData<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.f988a.b(antrianOnlineUrlRequest)));
        final Function1 function1 = new Function1() { // from class: lambdagetProperPreviewSize1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (AntrianOnlineUrlResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getProperPreviewSize
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                getStreamUseCaseSupportedCombinationList.b(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getMeteringRepeatingSize
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: lambdacreateSessionConfig0androidxcameracamera2internalMeteringRepeatingSession
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr = {function2, obj};
                getStreamUseCaseSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 879347004, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -879346999, requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i2 = notify + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    public final User TuitionPaymentFragmentbindingInflater1() {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = notify + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
            int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28;
            byte b = $$a[80];
            Object[] objArr2 = new Object[1];
            c((byte) 52, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, minimumFlingVelocity, scrollDefaultDelay, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(true, 160 - (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 23, (ViewConfiguration.getFadingEdgeLength() >> 16) + 10, new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, (ViewConfiguration.getWindowTouchSlop() >> 8) + 164, 15 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.getTrimmedLength("") + 9, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int i4 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
            int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b2, bArr[37], b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i4, i5, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                int iRed = Color.red(0) + 921;
                int i6 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b3 = bArr2[33];
                byte b4 = bArr2[37];
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, iRed, i6, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i7 = 1694280052 + ((~(1744682367 | iElapsedRealtime)) * (-301)) + (((~((-1643163965) | iElapsedRealtime)) | (~((~iElapsedRealtime) | 130915679))) * (-301)) + (((~(iElapsedRealtime | (-130915680))) | (-1643163965)) * 301) + 1388690219;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(true, 160 - View.combineMeasuredStates(0, 0), View.resolveSize(0, 0) + 26, (ViewConfiguration.getScrollBarSize() >> 8) + 19, new char[]{17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, TextUtils.indexOf("", "", 0, 0) + 167, 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 6 - (Process.myTid() >> 22), new char[]{65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i10 = onTransact + 45;
                    notify = i10 % 128;
                    int i11 = i10 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i12 = onTransact + 117;
                    notify = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            e(true, Color.rgb(0, 0, 0) + 16777375, 17 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 15 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(true, 163 - Color.argb(0, 0, 0, 0), 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, new char[]{65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1388690219};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[16];
                short s = b5;
                Object[] objArr13 = new Object[1];
                f(b5, s, (byte) (s | 37), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f(bArr3[106], (short) ($$e & 53), bArr3[20], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[33];
                    byte b7 = bArr4[37];
                    Object[] objArr16 = new Object[1];
                    c(b6, b7, b7, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, iCombineMeasuredStates, iLastIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 160, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (-16777206) - Color.rgb(0, 0, 0), new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(false, 165 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 16, 9 - KeyEvent.getDeadChar(0, 0), new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                        int maxKeyCode = 921 - (KeyEvent.getMaxKeyCode() >> 16);
                        int scrollBarSize2 = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b8, bArr5[37], b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, maxKeyCode, scrollBarSize2, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
                        int iGreen = Color.green(0) + 921;
                        int iRgb = (-16777188) - Color.rgb(0, 0, 0);
                        byte b9 = $$a[80];
                        Object[] objArr20 = new Object[1];
                        c((byte) 52, b9, b9, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iGreen, iRgb, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i14 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i15 = ~elapsedCpuTime;
        int i16 = i14 + 1397312369 + (((~((-495846217) | i15)) | 1278233427) * (-602)) + (((~(elapsedCpuTime | (-495846217))) | 201327424 | (~(1572752219 | i15))) * (-301)) + ((~(i15 | 1278233427)) * 301);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
        return this.g.asBinder();
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        super.onCleared();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte b = $$a[80];
            Object[] objArr2 = new Object[1];
            c((byte) 52, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionGroup, threadPriority, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(true, 160 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 23, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, (-16777052) - Color.rgb(0, 0, 0), 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 9, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i3 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 921;
            int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b2, bArr[37], b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i3, iMakeMeasureSpec, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 921;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[33];
                byte b4 = bArr2[37];
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop, touchSlop, maximumDrawingCacheSize, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i4}, (String[]) objArr7[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i5 = ((2106421723 + (((~((-1691279174) | iElapsedRealtime)) | 80629572) * 576)) + (((~((~iElapsedRealtime) | (-1610649602))) | 2170898) * 576)) - 1080612330;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(true, 208 - AndroidCharacter.getMirror('0'), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, new char[]{17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 166, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19, 6 - Color.blue(0), new char[]{65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i8 = onTransact + 73;
                notify = i8 % 128;
                if (i8 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if ((!(applicationContext instanceof ContextWrapper)) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i9 = notify + 3;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    applicationContext = null;
                }
            }
            Object[] objArr10 = new Object[1];
            e(true, 159 - View.resolveSize(0, 0), (Process.myTid() >> 22) + 16, 15 - Color.alpha(0), new char[]{3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(true, 163 - ExpandableListView.getPackedPositionGroup(0L), 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -278605546};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[16];
                Object[] objArr13 = new Object[1];
                f(b5, (short) (b5 | 89), (byte) 49, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f(bArr3[17], (short) ($$e & 922), bArr3[16], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int modifierMetaStateMask = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int gidForName = Process.getGidForName("") + 29;
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[33];
                    byte b7 = bArr4[37];
                    Object[] objArr15 = new Object[1];
                    c(b6, b7, b7, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, modifierMetaStateMask, gidForName, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(true, 159 - ExpandableListView.getPackedPositionChild(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(false, TextUtils.lastIndexOf("", '0') + 165, (Process.myPid() >> 22) + 15, KeyEvent.getDeadChar(0, 0) + 9, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
                        int threadPriority2 = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[80];
                        Object[] objArr18 = new Object[1];
                        c(b8, bArr5[37], b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, threadPriority2, iMakeMeasureSpec2, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0);
                        int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0');
                        byte b9 = $$a[80];
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, b9, b9, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop2, iLastIndexOf, iIndexOf, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                int i11 = onTransact + 69;
                notify = i11 % 128;
                if (i11 % 2 == 0) {
                    arrayList.add(strArr[i2]);
                    i2 += 10;
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[3])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i13}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i14 = ~iIdentityHashCode;
        int i15 = i12 + (((~(i14 | 1681722232)) | (~((-92357412) | i14)) | 25182211) * (-397)) + 749035043 + ((iIdentityHashCode | 1639729243) * 397);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr20[0])[0] = i17 ^ (i17 << 5);
        int i18 = notify + 103;
        onTransact = i18 % 128;
        int i19 = i18 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1.isDisposed()) {
            return;
        }
        int i20 = onTransact + 11;
        notify = i20 % 128;
        int i21 = i20 % 2;
        this.TuitionPaymentFragmentbindingInflater1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, Throwable th) {
        int i = 2 % 2;
        int i2 = notify + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 119;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 31;
        notify = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = notify + 95;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, InsertAntrianResponse insertAntrianResponse) {
        int i = 2 % 2;
        int i2 = notify + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<InsertAntrianResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(insertAntrianResponse));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 49;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = notify + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 37;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = notify + 13;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            int i3 = 68 / 0;
        } else {
            function1.invoke(obj);
        }
        int i4 = onTransact + 93;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, AntrianOnlineUrlResponse antrianOnlineUrlResponse) {
        String urlAntrianOnline;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 83;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            MutableLiveData<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(antrianOnlineUrlResponse));
            urlAntrianOnline = antrianOnlineUrlResponse.getUrlAntrianOnline();
            int i4 = 69 / 0;
            if (urlAntrianOnline == null) {
                i = notify + 65;
                onTransact = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                urlAntrianOnline = "";
            }
        } else {
            MutableLiveData<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> mutableLiveData2 = getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(antrianOnlineUrlResponse));
            urlAntrianOnline = antrianOnlineUrlResponse.getUrlAntrianOnline();
            if (urlAntrianOnline == null) {
                i = notify + 65;
                onTransact = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                urlAntrianOnline = "";
            }
        }
        Intrinsics.checkNotNullParameter(urlAntrianOnline, "");
        getstreamusecasesupportedcombinationlist.asBinder.saveString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", urlAntrianOnline);
        Unit unit = Unit.INSTANCE;
        int i5 = notify + 91;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        notify = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 115;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 11;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getstreamusecasesupportedcombinationlist.b);
            unit = Unit.INSTANCE;
            int i3 = 89 / 0;
        } else {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getstreamusecasesupportedcombinationlist.b);
            unit = Unit.INSTANCE;
        }
        int i4 = notify + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = notify + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = notify + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = notify + 111;
        onTransact = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        function1.invoke(obj);
        int i3 = onTransact + 45;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, AntrianOnlineUrlResponse antrianOnlineUrlResponse) {
        int i = 2 % 2;
        int i2 = notify + 59;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            MutableLiveData<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.b;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(antrianOnlineUrlResponse));
            antrianOnlineUrlResponse.getUrlAntrianOnline();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> mutableLiveData2 = getstreamusecasesupportedcombinationlist.b;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(antrianOnlineUrlResponse));
        String urlAntrianOnline = antrianOnlineUrlResponse.getUrlAntrianOnline();
        if (urlAntrianOnline == null) {
            int i3 = notify + 121;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            urlAntrianOnline = "";
        }
        String ret = antrianOnlineUrlResponse.getRet();
        if (ret == null) {
            int i5 = onTransact;
            int i6 = i5 + 95;
            notify = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 81;
            notify = i8 % 128;
            int i9 = i8 % 2;
            ret = "";
        }
        String message = antrianOnlineUrlResponse.getMessage();
        if (message == null) {
            message = "";
        }
        Intrinsics.checkNotNullParameter(urlAntrianOnline, "");
        Intrinsics.checkNotNullParameter(ret, "");
        Intrinsics.checkNotNullParameter(message, "");
        getstreamusecasesupportedcombinationlist.asBinder.saveString("ANTRIAN_ONLINE_URL", urlAntrianOnline);
        getstreamusecasesupportedcombinationlist.asBinder.saveString("STATUS_ANTRIAN_ONLINE_URL", ret);
        getstreamusecasesupportedcombinationlist.asBinder.saveString("ANTRIAN_ONLINE_MESSAGE", message);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, Throwable th) {
        int i = 2 % 2;
        int i2 = notify + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 73;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, Throwable th) {
        int i = 2 % 2;
        int i2 = notify + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getstreamusecasesupportedcombinationlist.asInterface);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getstreamusecasesupportedcombinationlist.asInterface);
        Unit unit2 = Unit.INSTANCE;
        int i3 = notify + 45;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 61;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 75;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, GetDataAntrianResponse getDataAntrianResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        notify = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<GetDataAntrianResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(getDataAntrianResponse));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 71;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, QuotaBookingResponse quotaBookingResponse) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 17;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            MutableLiveData<VirtualCameraAdapter1<QuotaBookingResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.asInterface;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(quotaBookingResponse));
            unit = Unit.INSTANCE;
            int i3 = 38 / 0;
        } else {
            MutableLiveData<VirtualCameraAdapter1<QuotaBookingResponse>> mutableLiveData2 = getstreamusecasesupportedcombinationlist.asInterface;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(quotaBookingResponse));
            unit = Unit.INSTANCE;
        }
        int i4 = onTransact + 39;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void g(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            int i3 = 46 / 0;
        } else {
            function1.invoke(obj);
        }
        int i4 = notify + 121;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 103;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            throw null;
        }
        function1.invoke(obj);
        int i3 = onTransact + 111;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = notify + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 7;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit a(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, Throwable th) {
        int i = 2 % 2;
        int i2 = notify + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getstreamusecasesupportedcombinationlist.d);
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        notify = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = notify + 35;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) objArr[0];
        NearestOfficeResponse nearestOfficeResponse = (NearestOfficeResponse) objArr[1];
        int i = 2 % 2;
        int i2 = notify + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<VirtualCameraAdapter1<NearestOfficeResponse>> mutableLiveData = getstreamusecasesupportedcombinationlist.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(nearestOfficeResponse));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 99;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void INotificationSideChannel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            throw null;
        }
        function1.invoke(obj);
        int i3 = onTransact + 61;
        notify = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void notify(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        notify = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = notify + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1169772334, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1169772334, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{function1, obj});
    }

    public static /* synthetic */ void d(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 879347004, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -879346999, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{function1, obj});
    }

    public static /* synthetic */ Unit b(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, Throwable th) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -2018021466, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 2018021469, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{getstreamusecasesupportedcombinationlist, th});
    }

    public static /* synthetic */ void a(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 106660057, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -106660055, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{function1, obj});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, NearestOfficeResponse nearestOfficeResponse) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1130398758, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1130398754, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{getstreamusecasesupportedcombinationlist, nearestOfficeResponse});
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -179444067, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 179444068, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{getstreamusecasesupportedcombinationlist, str});
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = 120 - r7
            byte[] r0 = defpackage.getStreamUseCaseSupportedCombinationList.$$c
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getStreamUseCaseSupportedCombinationList.$$g(int, int, short):java.lang.String");
    }
}
