package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.report.ReportRepository;
import com.bpjstku.data.report.model.request.DataCorrectionRequest;
import com.bpjstku.data.report.model.request.NearestHealthcareRequest;
import com.bpjstku.data.report.model.request.PreloadDataRequest;
import com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest;
import com.bpjstku.data.report.model.request.ReportWorkAccidentRequest;
import com.bpjstku.data.report.model.response.HealthcareItem;
import com.bpjstku.data.report.model.response.PreloadDataResponse;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.report.model.Healthcare;
import com.google.android.gms.measurement.internal.zznf;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetActiveChannelp implements ComposePredictiveBackHandlerlaunchNewGesture11 {
    private final ReportRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {112, 19, -59, 97};
    private static final int $$f = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {88, 99, -94, -58, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 104;
    private static final byte[] $$a = {55, -47, -47, 67, -6, 24, -18, 26, -71, 67, -6, 18, -67, 72, 3, -4, -59, 40, 3, -4, -6, 47, 2, 9, -12, 22, -1, 8, -2, 14, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
    private static final int $$b = 239;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f250a = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {47498, 47507, 47550, 47430, 47496, 47494, 47501, 47490, 47503, 47502, 47505, 47488, 47463, 47500, 47493, 47504, 47499, 47489, 47462, 47458, 47551, 47456, 47547, 47492, 47460, 47495};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719732;
    private static boolean b = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~((~i6) | i8);
        int i10 = i6 | i8;
        int i11 = i2 + i4 + i3 + ((-189913888) * i) + ((-1809372279) * i5);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i2) - 1671495680) + (10634006 * i4) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i3) + (952107008 * i) + (1092222976 * i5) + ((-70844416) * i12);
        int i14 = (i2 * 986545540) + 223666697 + (i4 * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i3 * 986544659) + (i * 1843362976) + (i5 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 4
            int r7 = r7 + 4
            int r5 = r5 + 105
            byte[] r1 = defpackage.accessgetActiveChannelp.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-3)
            int r7 = r7 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.accessgetActiveChannelp.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.accessgetActiveChannelp.$$d
            int r8 = r8 * 52
            int r1 = 53 - r8
            int r7 = r7 + 4
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.accessgetActiveChannelp.d(int, byte, byte, java.lang.Object[]):void");
    }

    public accessgetActiveChannelp(ReportRepository reportRepository) {
        Intrinsics.checkNotNullParameter(reportRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = reportRepository;
    }

    @Override // defpackage.ComposePredictiveBackHandlerlaunchNewGesture11
    public final deriveCodec<List<Healthcare>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(NearestHealthcareRequest nearestHealthcareRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nearestHealthcareRequest, "");
        deriveCodec<List<HealthcareItem>> nearestHealthcare = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getNearestHealthcare(nearestHealthcareRequest);
        final Function1 function1 = new Function1() { // from class: isBackEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return accessgetActiveChannelp.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getCurrentOnBack
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                Object[] objArr = {function1, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return (List) accessgetActiveChannelp.TuitionPaymentFragmentbindingInflater1(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 364129442, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -364129442, objArr, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(nearestHealthcare, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = f250a + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    @Override // defpackage.ComposePredictiveBackHandlerlaunchNewGesture11
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(DataCorrectionRequest dataCorrectionRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dataCorrectionRequest, "");
        deriveCodec<BaseItem> derivecodecPostDataCorrection = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.postDataCorrection(new DataCorrectionRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getEmail(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getActualTkkAmount(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getSavedTkkAmount(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getKpj(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getMsisdn(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getFullName(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getNik(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), dataCorrectionRequest.getTkAmountStatus(), dataCorrectionRequest.getMembershipStatus(), dataCorrectionRequest.getWageStatus(), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getActualWage(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, dataCorrectionRequest.getSavedWage(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
        final Function1 function1 = new Function1() { // from class: setCurrentOnBackCompleted
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return accessgetActiveChannelp.b((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComposePredictiveBackHandler
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return accessgetActiveChannelp.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostDataCorrection, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asInterface + 55;
        f250a = i2 % 128;
        if (i2 % 2 != 0) {
            return api23Impl;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        accessgetActiveChannelp accessgetactivechannelp = (accessgetActiveChannelp) objArr[0];
        ReportWorkAccidentRequest reportWorkAccidentRequest = (ReportWorkAccidentRequest) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reportWorkAccidentRequest, "");
        deriveCodec<BaseItem> derivecodecReportWorkAccident = accessgetactivechannelp.TuitionPaymentFragmentspecialinlinedviewModeldefault3.reportWorkAccident(reportWorkAccidentRequest);
        final Function1 function1 = new Function1() { // from class: launchNewGesture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return accessgetActiveChannelp.TuitionPaymentFragmentbindingInflater1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: setBackEnabled
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return accessgetActiveChannelp.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecReportWorkAccident, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = f250a + 81;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return api23Impl;
        }
        throw null;
    }

    @Override // defpackage.ComposePredictiveBackHandlerlaunchNewGesture11
    public final deriveCodec<BaseModel> TuitionPaymentFragmentbindingInflater1(ReportUnregisteredCompanyRequest reportUnregisteredCompanyRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reportUnregisteredCompanyRequest, "");
        deriveCodec<BaseItem> derivecodecReportUnregisteredCompany = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.reportUnregisteredCompany(reportUnregisteredCompanyRequest);
        final Function1 function1 = new Function1() { // from class: getScope
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return (BaseModel) accessgetActiveChannelp.TuitionPaymentFragmentbindingInflater1(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -717803115, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 717803117, new Object[]{(BaseItem) obj}, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        };
        readableMs readablems = new readableMs() { // from class: LocalActivityKt
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return accessgetActiveChannelp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecReportUnregisteredCompany, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = asInterface + 17;
        f250a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return api23Impl;
    }

    @Override // defpackage.ComposePredictiveBackHandlerlaunchNewGesture11
    public final deriveCodec<PreloadDataResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PreloadDataRequest preloadDataRequest) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(preloadDataRequest, "");
        deriveCodec<PreloadDataResponse> derivecodecPostPreloadData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.postPreloadData(new PreloadDataRequest(preloadDataRequest.getEmail(), preloadDataRequest.getKodeSegmen(), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, preloadDataRequest.getKpj(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, preloadDataRequest.getChecksum(), ComposePredictiveBackHandlerlaunchNewGesture1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
        final Function1 function1 = new Function1() { // from class: getCurrentOnBackCompleted
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return accessgetActiveChannelp.TuitionPaymentFragmentspecialinlinedviewModeldefault3((PreloadDataResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComposeBackHandlerExternalSyntheticLambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return accessgetActiveChannelp.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostPreloadData, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = f250a + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        int i3 = 0;
        if (cArr3 != null) {
            int i4 = $11 + 73;
            int i5 = i4 % 128;
            $10 = i5;
            int i6 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = i5 + 91;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 4;
            }
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31339), TextUtils.getTrimmedLength("") + 2994, 17 - (Process.myPid() >> 22), 1182129903, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 123;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.blue(0) + 43325), (ViewConfiguration.getScrollBarSize() >> 8) + 253, (-16777194) - Color.rgb(0, 0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        char c = '0';
        int i12 = 33603;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", c, 0) + i12), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3084, 26 - ExpandableListView.getPackedPositionGroup(0L), -2146875848, false, $$g(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                c = '0';
                i12 = 33603;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i13 = 0;
        if (!(!b)) {
            int i14 = $11 + 39;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33603), 3085 - KeyEvent.getDeadChar(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 27, -2146875848, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i15 = $11 + 31;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f250a + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseModel baseModel = (BaseModel) function1.invoke(obj);
        int i4 = f250a + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return baseModel;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        BaseItem baseItem = (BaseItem) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        BaseModel baseModel = new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
        int i2 = asInterface + 17;
        f250a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
        return baseModel;
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        f250a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseModel baseModel = (BaseModel) function1.invoke(obj);
        int i4 = asInterface + 123;
        f250a = i4 % 128;
        int i5 = i4 % 2;
        return baseModel;
    }

    public static /* synthetic */ BaseModel b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        f250a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        BaseModel baseModel = (BaseModel) function1.invoke(obj);
        int i4 = asInterface + 39;
        f250a = i4 % 128;
        int i5 = i4 % 2;
        return baseModel;
    }

    public static /* synthetic */ BaseModel b(BaseItem baseItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        BaseModel baseModel = new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
        int i2 = asInterface + 77;
        f250a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
        return baseModel;
    }

    public static /* synthetic */ PreloadDataResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreloadDataResponse preloadDataResponse) {
        int i = 2 % 2;
        int i2 = f250a + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(preloadDataResponse, "");
        if (i3 == 0) {
            return ComposePredictiveBackHandlercurrentOnBack1.TuitionPaymentFragmentbindingInflater1(preloadDataResponse);
        }
        ComposePredictiveBackHandlercurrentOnBack1.TuitionPaymentFragmentbindingInflater1(preloadDataResponse);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ PreloadDataResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f250a + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        PreloadDataResponse preloadDataResponse = (PreloadDataResponse) function1.invoke(obj);
        int i4 = asInterface + 79;
        f250a = i4 % 128;
        int i5 = i4 % 2;
        return preloadDataResponse;
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(BaseItem baseItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        BaseModel baseModel = new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
        int i2 = f250a + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return baseModel;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        int i2 = f250a + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            int i4 = asInterface + 63;
            f250a = i4 % 128;
            if (i4 % 2 == 0) {
                arrayList.add(ComposePredictiveBackHandlercurrentOnBack1.b((HealthcareItem) it.next()));
                throw null;
            }
            arrayList.add(ComposePredictiveBackHandlercurrentOnBack1.b((HealthcareItem) it.next()));
        }
        return arrayList;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = f250a + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = asInterface + 91;
        f250a = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseItem baseItem) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (BaseModel) TuitionPaymentFragmentbindingInflater1(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -717803115, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 717803117, new Object[]{baseItem}, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (List) TuitionPaymentFragmentbindingInflater1(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 364129442, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -364129442, new Object[]{function1, obj}, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.ComposePredictiveBackHandlerlaunchNewGesture11
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReportWorkAccidentRequest reportWorkAccidentRequest) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (deriveCodec) TuitionPaymentFragmentbindingInflater1(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 259520151, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -259520150, new Object[]{this, reportWorkAccidentRequest}, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x043e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0417 A[PHI: r5
  0x0417: PHI (r5v130 int) = (r5v129 int), (r5v148 int) binds: [B:54:0x0415, B:51:0x0409] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0455  */
    /* JADX WARN: Code duplicated, block: B:62:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0503 A[Catch: all -> 0x085d, TryCatch #1 {all -> 0x085d, blocks: (B:64:0x04ed, B:66:0x0503, B:67:0x0546, B:78:0x05ae, B:80:0x05bb, B:81:0x05fb, B:83:0x0618, B:85:0x0669), top: B:127:0x04ed }] */
    public static int b(List list) throws Throwable {
        Class<?> cls;
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Method method;
        Method method2;
        int i9;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i15 = 2;
        int i16 = 2 % 2;
        Method[] methodArr = new Method[1];
        byte[] bArr = $$a;
        Object[] objArr2 = new Object[1];
        c(bArr[36], (byte) (-bArr[48]), bArr[38], objArr2);
        int i17 = 0;
        Class<?> cls2 = Class.forName((String) objArr2[0]);
        byte b2 = bArr[38];
        byte b3 = b2;
        Object[] objArr3 = new Object[1];
        c(b2, b3, (byte) (b3 | 23), objArr3);
        String str = (String) objArr3[0];
        Class<?>[] clsArr = new Class[3];
        int i18 = asInterface;
        int i19 = (i18 ^ 77) + ((i18 & 77) << 1);
        f250a = i19 % 128;
        if (i19 % 2 == 0) {
            clsArr[0] = KeyManager[].class;
            clsArr[0] = TrustManager[].class;
            Object[] objArr4 = new Object[1];
            c(bArr[36], (byte) (-bArr[35]), bArr[7], objArr4);
            cls = Class.forName((String) objArr4[0]);
            c = 4;
        } else {
            clsArr[0] = KeyManager[].class;
            clsArr[1] = TrustManager[].class;
            Object[] objArr5 = new Object[1];
            c(bArr[36], (byte) (-bArr[35]), bArr[7], objArr5);
            cls = Class.forName((String) objArr5[0]);
            c = 2;
        }
        clsArr[c] = cls;
        methodArr[0] = cls2.getMethod(str, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
            int i20 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr2 = $$d;
            Object[] objArr6 = new Object[1];
            d(bArr2[10], (byte) (-bArr2[5]), bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, absoluteGravity, i20, 1814927978, false, (String) objArr6[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getThreadPriority(0) + 20) >> 6), Drawable.resolveOpacity(0, 0) + 2823, 21 - TextUtils.indexOf((CharSequence) "", '0', 0))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i21 = 0;
            while (i21 < length) {
                int i22 = f250a;
                int i23 = i22 + 109;
                asInterface = i23 % 128;
                if (i23 % i15 != 0) {
                    method2 = declaredMethods[i21];
                    int i24 = 98 / i17;
                } else {
                    method2 = declaredMethods[i21];
                }
                int i25 = (i22 ^ 67) + ((i22 & 67) << 1);
                asInterface = i25 % 128;
                if (i25 % i15 != 0) {
                    try {
                        i9 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1));
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        i10 = (755 >>> i9) << 2013265920;
                        i11 = ~i9;
                        i12 = 91;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i9 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1));
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i26 = i9 * 755;
                    i10 = (i26 & (-94878)) + (i26 | (-94878));
                    i11 = ~i9;
                    i12 = 126;
                }
                int i27 = ~((i11 ^ i12) | (i11 & i12));
                int i28 = ~i9;
                int i29 = (~((i28 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i28 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) | i27;
                int i30 = ~((i12 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i12 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i31 = (-754) * ((i29 ^ i30) | (i29 & i30));
                int i32 = (i10 & i31) + (i10 | i31);
                int i33 = ~i9;
                int i34 = ~((i33 ^ i12) | (i33 & i12) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                int i35 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i36 = (i35 ^ i9) | (i9 & i35);
                int i37 = ~((i36 ^ i12) | (i36 & i12));
                int i38 = (i32 - (~(-(-(((i34 ^ i37) | (i37 & i34)) * (-754)))))) - 1;
                int i39 = ((i33 ^ i35) | (i35 & i33)) * 754;
                Object[] objArr7 = new Object[1];
                e(null, null, (i38 & i39) + (i38 | i39), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr7);
                Class<?> cls3 = Class.forName((String) objArr7[i17]);
                int i40 = asInterface + 63;
                f250a = i40 % 128;
                int i41 = i40 % i15;
                Object[] objArr8 = new Object[1];
                e(null, null, 127 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)))), new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr8);
                Object[] objArr9 = new Object[1];
                objArr9[i17] = Integer.valueOf(((Integer) cls3.getMethod((String) objArr8[i17], null).invoke(method2, null)).intValue());
                int offsetAfter = TextUtils.getOffsetAfter("", i17);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i42 = (offsetAfter * 165) - 20701;
                int i43 = f250a;
                int i44 = i43 + 19;
                asInterface = i44 % 128;
                if (i44 % i15 != 0) {
                    int i45 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i46 = ~((i45 ^ 127) | (i45 & 127));
                    i13 = i42 * ((-328) << ((offsetAfter ^ i46) | (i46 & offsetAfter))) * (164 << ((offsetAfter ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (offsetAfter & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                } else {
                    int i47 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i48 = ~((i47 ^ 127) | (i47 & 127));
                    int i49 = (i42 - (~(((offsetAfter ^ i48) | (i48 & offsetAfter)) * (-328)))) - 1;
                    int i50 = ((offsetAfter ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (offsetAfter & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 164;
                    i13 = ((i49 | i50) << 1) - (i50 ^ i49);
                }
                int i51 = ~((~offsetAfter) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                int i52 = i43 + 109;
                asInterface = i52 % 128;
                int i53 = i52 % i15;
                int i54 = (~(((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i51;
                int i55 = offsetAfter | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i56 = ~((i55 & 127) | (i55 ^ 127));
                int i57 = i13 + (164 * ((i54 & i56) | (i54 ^ i56)));
                Object[] objArr10 = new Object[1];
                e(null, null, i57, new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr10);
                Class<?> cls4 = Class.forName((String) objArr10[0]);
                int i58 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i59 = f250a;
                int i60 = (i59 & 45) + (i59 | 45);
                asInterface = i60 % 128;
                int i61 = i60 % i15;
                int i62 = -i58;
                Object[] objArr11 = new Object[1];
                e(null, null, ((127 | i62) << 1) - (i62 ^ 127), new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr11);
                if (!(!((Boolean) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, objArr9)).booleanValue())) {
                    Class cls5 = Long.TYPE;
                    int edgeSlop = ViewConfiguration.getEdgeSlop();
                    int i63 = asInterface + 87;
                    f250a = i63 % 128;
                    int i64 = i63 % i15;
                    Object[] objArr12 = new Object[1];
                    e(null, null, (edgeSlop >> 16) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr12);
                    Class<?> cls6 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(null, null, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr13);
                    if (cls5.equals(cls6.getMethod((String) objArr13[0], null).invoke(method2, null))) {
                        int i65 = f250a + 61;
                        asInterface = i65 % 128;
                        int i66 = i65 % i15;
                        int i67 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i68 = i67 * (-501);
                        int i69 = (i68 ^ 63881) + ((i68 & 63881) << 1);
                        int i70 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i71 = ~((i67 ^ 127) | (i67 & 127));
                        int i72 = ((i70 & i71) | (i70 ^ i71)) * (-502);
                        int i73 = ((i69 | i72) << 1) - (i72 ^ i69);
                        int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i75 = (~((i74 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i74) | i67)) * (-502);
                        int i76 = (i73 ^ i75) + ((i75 & i73) << 1);
                        int i77 = ~i67;
                        int i78 = ~((i77 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i77 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i79 = ((i78 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i78)) * TypedValues.PositionType.TYPE_DRAWPATH;
                        Object[] objArr14 = new Object[1];
                        e(null, null, ((i76 | i79) << 1) - (i79 ^ i76), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr14);
                        Class<?> cls7 = Class.forName((String) objArr14[0]);
                        int i80 = -View.getDefaultSize(0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i81 = i80 * 371;
                        int i82 = (i81 & 47117) + (i81 | 47117);
                        int i83 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i84 = ~(((-128) ^ i83) | ((-128) & i83));
                        int i85 = ~i80;
                        int i86 = ~((i85 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i85 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i87 = -(-(((i84 ^ i86) | (i86 & i84)) * (-370)));
                        int i88 = (i82 ^ i87) + ((i87 & i82) << 1);
                        int i89 = ~i80;
                        int i90 = ~((i89 & i83) | (i89 ^ i83));
                        int i91 = ~((-128) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                        Object[] objArr15 = new Object[1];
                        e(null, null, ((i88 - (~(-(-((((i90 & i91) | (i90 ^ i91)) | (~((i80 ^ 127) | (i80 & 127)))) * (-370)))))) - 1) + ((~(i80 | 127)) * 370), new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr15);
                        Object[] objArr16 = (Object[]) cls7.getMethod((String) objArr15[0], null).invoke(method2, null);
                        if (objArr16.length == 2) {
                            int i92 = asInterface;
                            int i93 = (i92 ^ 97) + ((i92 & 97) << 1);
                            f250a = i93 % 128;
                            if (i93 % 2 == 0) {
                                i14 = 0;
                                if (Long.TYPE.equals(objArr16[0])) {
                                    int i94 = -Color.red(i14);
                                    objArr = new Object[1];
                                    e(null, null, (i94 ^ 127) + ((i94 & 127) << 1), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr);
                                    if (Class.forName((String) objArr[0]).equals(objArr16[1])) {
                                        int i95 = asInterface;
                                        int i96 = (i95 ^ 61) + ((i95 & 61) << 1);
                                        f250a = i96 % 128;
                                        int i97 = i96 % 2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 2823;
                                            int i98 = 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            byte[] bArr3 = $$d;
                                            Object[] objArr17 = new Object[1];
                                            d(bArr3[10], (byte) (-bArr3[5]), bArr3[7], objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, offsetAfter2, i98, 1814927978, false, (String) objArr17[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                            int scrollDefaultDelay = 2823 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int defaultSize = 22 - View.getDefaultSize(0, 0);
                                            byte[] bArr4 = $$d;
                                            Object[] objArr18 = new Object[1];
                                            d(bArr4[10], (byte) (-bArr4[5]), bArr4[7], objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, scrollDefaultDelay, defaultSize, 1814927978, false, (String) objArr18[0], null);
                                        }
                                        try {
                                            Object[] objArr19 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823;
                                                int iAlpha = 22 - Color.alpha(0);
                                                byte[] bArr5 = $$d;
                                                byte b4 = bArr5[7];
                                                Object[] objArr20 = new Object[1];
                                                d(b4, (byte) (b4 | 51), bArr5[5], objArr20);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, keyRepeatDelay, iAlpha, -2137287382, false, (String) objArr20[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr19)).longValue();
                                            break;
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                i14 = 0;
                                if (Long.TYPE.equals(objArr16[0])) {
                                    int i99 = -Color.red(i14);
                                    objArr = new Object[1];
                                    e(null, null, (i99 ^ 127) + ((i99 & 127) << 1), new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr);
                                    if (Class.forName((String) objArr[0]).equals(objArr16[1])) {
                                        int i910 = asInterface;
                                        int i911 = (i910 ^ 61) + ((i910 & 61) << 1);
                                        f250a = i911 % 128;
                                        int i912 = i911 % 2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                            int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 2823;
                                            int i913 = 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            byte[] bArr6 = $$d;
                                            Object[] objArr110 = new Object[1];
                                            d(bArr6[10], (byte) (-bArr6[5]), bArr6[7], objArr110);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode2, offsetAfter3, i913, 1814927978, false, (String) objArr110[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                            int scrollDefaultDelay2 = 2823 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int defaultSize2 = 22 - View.getDefaultSize(0, 0);
                                            byte[] bArr7 = $$d;
                                            Object[] objArr111 = new Object[1];
                                            d(bArr7[10], (byte) (-bArr7[5]), bArr7[7], objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf2, scrollDefaultDelay2, defaultSize2, 1814927978, false, (String) objArr111[0], null);
                                        }
                                        Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2823;
                                            int iAlpha2 = 22 - Color.alpha(0);
                                            byte[] bArr8 = $$d;
                                            byte b5 = bArr8[7];
                                            Object[] objArr21 = new Object[1];
                                            d(b5, (byte) (b5 | 51), bArr8[5], objArr21);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, keyRepeatDelay2, iAlpha2, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i21++;
                i15 = 2;
                i17 = 0;
                j = 0;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 2823;
            int i100 = 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr9 = $$d;
            Object[] objArr22 = new Object[1];
            d(bArr9[10], (byte) (-bArr9[5]), bArr9[7], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, deadChar, i100, 1814927978, false, (String) objArr22[0], null);
        }
        Object[] objArr23 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cAlpha = (char) Color.alpha(0);
            int i101 = 2823 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int edgeSlop2 = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr10 = $$d;
            Object[] objArr24 = new Object[1];
            d((byte) (bArr10[19] - 1), (byte) 51, bArr10[5], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, i101, edgeSlop2, 1025296417, false, (String) objArr24[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr23);
        Object[] objArr25 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 37658);
            int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 2720;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 20;
            byte[] bArr11 = $$d;
            Object[] objArr26 = new Object[1];
            d((byte) (bArr11[19] - 1), (byte) 51, bArr11[5], objArr26);
            i = 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionChild, edgeSlop3, iLastIndexOf, -1568796068, false, (String) objArr26[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        } else {
            i = 0;
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr25)).longValue();
        long j2 = 323580083;
        long j3 = (((long) (-665)) * j2) + (((long) 334) * jLongValue);
        long j4 = -1;
        long j5 = j2 ^ j4;
        long j6 = 333;
        long jMyPid = Process.myPid();
        long j7 = jMyPid ^ j4;
        long j8 = j3 + (((long) (-333)) * j5) + ((((j5 | j7) ^ j4) | ((jLongValue | jMyPid) ^ j4)) * j6) + (j6 * (((j7 | jLongValue) ^ j4) | ((jMyPid | j5) ^ j4))) + ((long) (-2133985928));
        int i102 = f250a + 53;
        asInterface = i102 % 128;
        int i103 = i102 % 2;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i104 = ((int) (j8 >> 32)) & (617020010 + (((~((~iMaxMemory) | 1417024235)) | (-1440716650)) * (-235)) + (((~(1417024235 | iMaxMemory)) | (-1440716650)) * (-470)) + (((~(iMaxMemory | (-25789697))) | 2097282) * 235));
        int i105 = (int) j8;
        int i106 = asInterface;
        int i107 = (i106 ^ 35) + ((i106 & 35) << 1);
        f250a = i107 % 128;
        if (i107 % 2 == 0) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i108 = ~elapsedCpuTime;
            int i109 = i105 & ((-1972008908) + (((~(851916892 | i108)) | (~(585309517 | i108))) * (-867)) + (((~(851916892 | elapsedCpuTime)) | (-854015326) | (~(585309517 | elapsedCpuTime))) * (-1734)) + (((~(elapsedCpuTime | (-268705809))) | (~(i108 | 854015325)) | (~((-2098434) | elapsedCpuTime))) * 867));
            i2 = (i104 & i109) | (i104 ^ i109);
            i3 = i2 * 76;
        } else {
            int iMyTid = Process.myTid();
            int i110 = (-69481195) + (((~((-24339720) | iMyTid)) | (-1412886691)) * 672);
            int i111 = ~iMyTid;
            int i112 = i105 & (i110 + (((~(iMyTid | (-1412886691))) | (~(24339719 | i111))) * (-672)) + (((~(1412886690 | i111)) | 21038341) * 672));
            i2 = (i104 & i112) | (i104 ^ i112);
            i3 = i2 >>> 24;
        }
        int i113 = i2 & ViewCompat.MEASURED_SIZE_MASK;
        if (i3 != 0) {
            int i114 = f250a + 61;
            asInterface = i114 % 128;
            i4 = 2;
            int i115 = i114 % 2;
            i5 = 1;
        } else {
            i4 = 2;
            i5 = i;
        }
        if (i5 != 0) {
            int i116 = asInterface + 41;
            f250a = i116 % 128;
            if (i116 % i4 == 0) {
                int i117 = 4 % i4;
            }
            i = 1;
        }
        list.add((i5 == 0 || i113 >= 1 || (method = methodArr[i113]) == null) ? null : method.toString());
        int i118 = asInterface;
        int i119 = ((i118 | 7) << 1) - (i118 ^ 7);
        f250a = i119 % 128;
        int i120 = i119 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i121 = i120 == 0 ? -53120 : -4980;
        int i122 = asInterface;
        int i123 = ((i122 | 47) << 1) - (i122 ^ 47);
        f250a = i123 % 128;
        if (i123 % 2 == 0) {
            i6 = i121 * (832 >> i3);
            int i124 = ~i3;
            int i125 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            i7 = (i124 & i125) | (i124 ^ i125);
        } else {
            int i126 = -(-(832 * i3));
            i6 = ((i121 & i126) << 1) + (i121 ^ i126);
            int i127 = ~i3;
            int i128 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            i7 = (i127 & i128) | (i127 ^ i128);
        }
        int i129 = ((i122 | 89) << 1) - (i122 ^ 89);
        f250a = i129 % 128;
        int i130 = i129 % 2;
        int i131 = ~i7;
        int i132 = i3 ^ 6;
        if (i130 == 0) {
            int i133 = i132 | (i3 & 6);
            i8 = i6 * ((-831) >> (i131 | (~((i133 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i133 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))));
        } else {
            int i134 = i132 | (i3 & 6);
            int i135 = ~((i134 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i134 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
            int i136 = (-831) * ((i131 & i135) | (i131 ^ i135));
            i8 = ((i6 | i136) << 1) - (i6 ^ i136);
        }
        int i137 = ~i3;
        int i138 = (i137 & 6) | (i137 ^ 6);
        int i139 = (-1662) * (~((i138 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i138 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)));
        int i140 = (i8 ^ i139) + ((i8 & i139) << 1);
        int i141 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        int i142 = ~((i141 & (-7)) | ((-7) ^ i141));
        int i143 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ 6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & 6));
        int i144 = -(-(((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i3) | (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) | (i142 & i143) | (i142 ^ i143)) * 831));
        return ((i140 & i144) + (i144 | i140)) * i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r7 = 68 - r7
            int r8 = r8 + 4
            byte[] r0 = defpackage.accessgetActiveChannelp.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L28:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.accessgetActiveChannelp.$$g(short, byte, int):java.lang.String");
    }
}
