package com.bpjstku.data.danasiaga;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.danasiaga.model.request.CheckEligiblePinangRequest;
import com.bpjstku.data.danasiaga.model.request.EligibleIctMenuRequest;
import com.bpjstku.data.danasiaga.model.response.CheckEligiblePinangResponse;
import com.bpjstku.data.danasiaga.model.response.EligibleIctMenuResponse;
import com.bpjstku.data.danasiaga.remote.DanaSiagaApi;
import defpackage.Api23Impl;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2InteropExtender;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.deriveCodec;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.onCaptureSessionEnd;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/danasiaga/DanaSiagaDataStore;", "Lcom/bpjstku/data/danasiaga/DanaSiagaRepository;", "Lcom/bpjstku/data/danasiaga/remote/DanaSiagaApi;", "p0", "<init>", "(Lcom/bpjstku/data/danasiaga/remote/DanaSiagaApi;)V", "Lcom/bpjstku/data/danasiaga/model/request/CheckEligiblePinangRequest;", "LderiveCodec;", "Lcom/bpjstku/data/danasiaga/model/response/CheckEligiblePinangResponse;", "checkEligiblePinang", "(Lcom/bpjstku/data/danasiaga/model/request/CheckEligiblePinangRequest;)LderiveCodec;", "Lcom/bpjstku/data/danasiaga/model/request/EligibleIctMenuRequest;", "Lcom/bpjstku/data/danasiaga/model/response/EligibleIctMenuResponse;", "ictEligibleMenu", "(Lcom/bpjstku/data/danasiaga/model/request/EligibleIctMenuRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/danasiaga/remote/DanaSiagaApi;", "getWebService", "()Lcom/bpjstku/data/danasiaga/remote/DanaSiagaApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DanaSiagaDataStore implements DanaSiagaRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final DanaSiagaApi webService;

    public DanaSiagaDataStore(DanaSiagaApi danaSiagaApi) {
        Intrinsics.checkNotNullParameter(danaSiagaApi, "");
        this.webService = danaSiagaApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7593getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final DanaSiagaApi m7594getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.danasiaga.DanaSiagaRepository
    public final deriveCodec<CheckEligiblePinangResponse> checkEligiblePinang(CheckEligiblePinangRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CheckEligiblePinangResponse>> derivecodecCheckEligiblePinang = m7594getWebService().checkEligiblePinang(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckEligiblePinang, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DanaSiagaDataStore.checkEligiblePinang$lambda$1((CheckEligiblePinangResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda3
            private static final byte[] $$c = {104, 27, -72, 120};
            private static final int $$f = 85;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {49, 89, 41, 48, -27, -9, 11, -10, 20, 27, -24, 18, -28, 14, 0};
            private static final int $$e = 14;
            private static final byte[] $$a = {57, -50, -56, -93, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 80;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f384a = 1;
            private static char b = 34012;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 60420;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 29220;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 17180;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 * 52
                    int r5 = 56 - r5
                    byte[] r0 = com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda3.$$a
                    int r7 = r7 * 52
                    int r1 = 53 - r7
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    byte[] r1 = new byte[r1]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r0 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L2a
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L28:
                    r3 = r0[r5]
                L2a:
                    int r3 = -r3
                    int r5 = r5 + 1
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda3.c(int, short, int, java.lang.Object[]):void");
            }

            private static void e(short s, short s2, byte b2, Object[] objArr) {
                int i = (b2 * 31) + 67;
                int i2 = s * 11;
                int i3 = 14 - (s2 * 11);
                byte[] bArr = $$d;
                byte[] bArr2 = new byte[12 - i2];
                int i4 = 11 - i2;
                int i5 = -1;
                if (bArr == null) {
                    i = i3 + (-i) + 3;
                    i3 = i3;
                }
                while (true) {
                    int i6 = i3 + 1;
                    i5++;
                    bArr2[i5] = (byte) i;
                    if (i5 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i = i + (-bArr[i6]) + 3;
                        i3 = i6;
                    }
                }
            }

            private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        int i4 = 58224;
                        int i5 = 0;
                        while (i5 < 16) {
                            char c = cArr3[1];
                            char c2 = cArr3[i3];
                            int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                            int i7 = c2 >>> 5;
                            try {
                                Object[] objArr2 = new Object[4];
                                objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                objArr2[2] = Integer.valueOf(i7);
                                objArr2[1] = Integer.valueOf(i6);
                                objArr2[i3] = Integer.valueOf(c);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cArgb = (char) (47773 - Color.argb(i3, i3, i3, i3));
                                    int i8 = 469 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12;
                                    Class[] clsArr = new Class[4];
                                    clsArr[i3] = Integer.TYPE;
                                    clsArr[1] = Integer.TYPE;
                                    clsArr[2] = Integer.TYPE;
                                    clsArr[3] = Integer.TYPE;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, i8, i9, -2007001706, false, "o", clsArr);
                                }
                                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                cArr3[1] = cCharValue;
                                int i10 = i5;
                                Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47772), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 467, 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i4 -= 40503;
                                i5 = i10 + 1;
                                int i11 = $10 + 27;
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                                i3 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                        cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                        Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2322, (Process.myTid() >> 22) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        objArr[0] = new String(cArr2, 0, i);
                        int i13 = $10 + 71;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        return;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0206  */
            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (37567 - TextUtils.indexOf("", "", 0, 0));
                    int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iCombineMeasuredStates = 14 - View.combineMeasuredStates(0, 0);
                    byte b2 = $$a[5];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    c(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iCombineMeasuredStates, -477065106, false, (String) objArr2[0], null);
                }
                Object obj2 = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                d(new char[]{51211, 52870, 63901, 48825, 27811, 49369, 2397, 3093, 12655, 60424, 33350, 46843, 19828, 39805, 2286, 31995, 56339, 25398, 43113, 32456, 20741, 52708, 11331, 25110}, KeyEvent.keyCodeFromString("") + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                d(new char[]{12932, 12907, 50954, 37634, 52779, 12763, 4579, 48644, 65253, 36742, 34465, 57272, 53887, 61020, 14785, 22771, 44406, 35949}, 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 37567);
                    int iIndexOf2 = 624 - TextUtils.indexOf((CharSequence) "", '0');
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 15;
                    byte[] bArr = $$a;
                    byte b4 = bArr[5];
                    byte b5 = bArr[7];
                    Object[] objArr5 = new Object[1];
                    c(b4, b5, b5, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iIndexOf2, iIndexOf3, -976899241, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 37567);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 625;
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14;
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr6 = new Object[1];
                        c(b6, b7, b7, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, iResolveSizeAndState, scrollBarFadeDuration, -973632554, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i2 = ((int[]) objArr7[2])[0];
                    int i3 = ((int[]) objArr7[0])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i3};
                    int iNextInt = new Random().nextInt(1697859709);
                    int i4 = 395515016 + (((~((-769077994) | iNextInt)) | 752095753 | (~((-1054660128) | iNextInt))) * (-880));
                    int i5 = (~((-769077994) | (~iNextInt))) | 1054660127;
                    int i6 = ~(iNextInt | 769077993);
                    int i7 = i4 + ((i5 | i6) * (-880)) + (i6 * 880) + 1005539569;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
                    objArr = new Object[]{iArr, new int[1], new int[]{i2}, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    d(new char[]{41106, 50034, 42477, 26996, 29789, 44409, 52468, 25439, 43929, 2504, 3398, 39873, 9866, 34215, 46233, 2098, 23271, 27677, 712, 57120, 62567, 13131, 48364, 44084, 7546, 6056, 32597, 33074}, 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    d(new char[]{38271, 22741, 21974, 33827, 44552, 3343, 5048, 59981, 63868, 28900, 46832, 4151, 26319, 42827, 25626, 5745, 34205, 4364, 58896, 6659}, 18 - ((Process.getThreadPriority(0) + 20) >> 6), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i10 = f384a + 47;
                            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                            if (i10 % 2 != 0) {
                                ((ContextWrapper) applicationContext).getBaseContext();
                                obj2.hashCode();
                                throw null;
                            }
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    d(new char[]{27865, 44470, 52882, 12262, 26557, 44218, 40164, 20089, 7944, 6544, 35224, 35016, 55244, 43679, 40622, 35570, 22193, 58930}, 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    d(new char[]{36832, 6937, 31650, 65277, 26139, 3197, 35040, 3943, 49601, 11340, 40856, 51238, 22022, 64551, 54804, 22136, 26160, 11085}, 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr12 = new Object[1];
                    d(new char[]{48108, 540, 16884, 3581, 28633, 11246, 16180, 38157, 51059, 55887, 33557, 34926, 18855, 3106, 31077, 42784, 20456, 164, 477, 47970, 3550, 11908, 46682, 3136, 36921, 38729, 35513, 18325, 37209, 13173, 3818, 37393, 46733, 1369, 8116, 13486, 56717, 23864, 14727, 15070, 23073, 37266, 30370, 55429, 38495, 49536, 47243, 38922, 58870, 14502, 36498, 29490, 23440, 4251, 18413, 30796, 53548, 63549, 57465, 62075, 26643, 18674, 48478, 59578, 3606, 43198}, 64 - Drawable.resolveOpacity(0, 0), objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    d(new char[]{9556, 57482, 21498, 28516, 15734, 34943, 7401, 50022, 2440, 35772, 35266, 59836, 26061, 2591, 26645, 9474, 59190, 30165, 33232, 33723, 61638, 2695, 48324, 37478, 53802, 20885, 6661, 40378, 26070, 10559, 25604, 45190, 48543, 38720, 21470, 43549, 10291, 760, 13904, 22594, 55366, 49347, 59211, 55113, 14726, 11564, 2736, 54793, 41241, 35681, 9408, 10092, 50566, 27419, 13131, 42241, 45652, 39047, 37534, 22200, 57642, 31533, 42293, 14238, 64875, 37247}, Color.rgb(0, 0, 0) + 16777280, objArr13);
                    String[] strArr2 = {str, (String) objArr13[0]};
                    int i11 = TuitionPaymentFragmentbindingInflater1 + 29;
                    f384a = i11 % 128;
                    int i12 = i11 % 2;
                    try {
                        Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1005539569};
                        byte[] bArr2 = $$d;
                        byte b8 = bArr2[14];
                        byte b9 = b8;
                        Object[] objArr15 = new Object[1];
                        e(b9, (byte) (b9 + 1), b8, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        byte b10 = bArr2[14];
                        byte b11 = (byte) (b10 + 1);
                        byte b12 = b10;
                        Object[] objArr16 = new Object[1];
                        e(b11, b12, (byte) (b12 + 1), objArr16);
                        Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                        int i13 = ((int[]) objArr17[0])[0];
                        int i14 = ((int[]) objArr17[2])[0];
                        if (applicationContext != null) {
                            int i15 = TuitionPaymentFragmentbindingInflater1 + 47;
                            f384a = i15 % 128;
                            int i16 = i15 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
                                int iKeyCodeFromString = 625 - KeyEvent.keyCodeFromString("");
                                int iResolveSize = 14 - View.resolveSize(0, 0);
                                byte b13 = $$a[7];
                                byte b14 = b13;
                                Object[] objArr18 = new Object[1];
                                c(b13, b14, b14, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, iKeyCodeFromString, iResolveSize, -973632554, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                            try {
                                Object[] objArr19 = new Object[1];
                                d(new char[]{51211, 52870, 63901, 48825, 27811, 49369, 2397, 3093, 12655, 60424, 33350, 46843, 19828, 39805, 2286, 31995, 56339, 25398, 43113, 32456, 20741, 52708, 11331, 25110}, ExpandableListView.getPackedPositionType(0L) + 22, objArr19);
                                Class<?> cls5 = Class.forName((String) objArr19[0]);
                                Object[] objArr20 = new Object[1];
                                d(new char[]{12932, 12907, 50954, 37634, 52779, 12763, 4579, 48644, 65253, 36742, 34465, 57272, 53887, 61020, 14785, 22771, 44406, 35949}, 15 - (Process.myPid() >> 22), objArr20);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char scrollBarSize = (char) (37567 - (ViewConfiguration.getScrollBarSize() >> 8));
                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 625;
                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 14;
                                    byte[] bArr3 = $$a;
                                    byte b15 = bArr3[5];
                                    byte b16 = bArr3[7];
                                    Object[] objArr21 = new Object[1];
                                    c(b15, b16, b16, objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, jumpTapTimeout, windowTouchSlop, -976899241, false, (String) objArr21[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char offsetBefore = (char) (37567 - TextUtils.getOffsetBefore("", 0));
                                    int packedPositionGroup = 625 - ExpandableListView.getPackedPositionGroup(0L);
                                    int i17 = 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    byte b17 = $$a[5];
                                    byte b18 = b17;
                                    Object[] objArr22 = new Object[1];
                                    c(b17, b18, b18, objArr22);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, packedPositionGroup, i17, -477065106, false, (String) objArr22[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr17;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 == null) {
                        throw null;
                    }
                    int i18 = TuitionPaymentFragmentbindingInflater1 + 77;
                    f384a = i18 % 128;
                    for (int i19 = i18 % 2 != 0 ? 0 : 1; i19 < strArr3.length; i19++) {
                        arrayList.add(strArr3[i19]);
                    }
                    throw null;
                }
                int i20 = f384a + 11;
                TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = ((int[]) objArr[1])[0];
                int i23 = ((int[]) objArr[2])[0];
                int i24 = ((int[]) objArr[0])[0];
                String[] strArr4 = (String[]) objArr[3];
                int iNextInt2 = new Random().nextInt(1890309456);
                int i25 = i22 + (((~((-715345839) | iNextInt2)) | 681789092) * (-283)) + 1496522836 + ((~(iNextInt2 | (-33556747))) * 283);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr[1])[0] = i27 ^ (i27 << 5);
                Object[] objArr23 = {new int[]{i24}, new int[1], new int[]{i23}, strArr4};
                int i28 = TuitionPaymentFragmentbindingInflater1 + 113;
                f384a = i28 % 128;
                int i29 = i28 % 2;
                return DanaSiagaDataStore.checkEligiblePinang$lambda$2(function1, obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, short r7, byte r8) {
                /*
                    int r8 = r8 * 3
                    int r8 = 3 - r8
                    int r6 = r6 * 3
                    int r0 = r6 + 1
                    int r7 = r7 * 3
                    int r7 = 108 - r7
                    byte[] r1 = com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda3.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L17
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    int r8 = r8 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L25:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2d:
                    int r8 = -r8
                    int r7 = r7 + r8
                    r8 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda3.$$g(byte, short, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckEligiblePinangResponse checkEligiblePinang$lambda$2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CheckEligiblePinangResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckEligiblePinangResponse checkEligiblePinang$lambda$1(CheckEligiblePinangResponse checkEligiblePinangResponse) {
        Intrinsics.checkNotNullParameter(checkEligiblePinangResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        String strIsEligible = checkEligiblePinangResponse.isEligible();
        if (strIsEligible != null) {
            checkEligiblePinangResponse.setEligible(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strIsEligible, strB));
        }
        return checkEligiblePinangResponse;
    }

    @Override // com.bpjstku.data.danasiaga.DanaSiagaRepository
    public final deriveCodec<EligibleIctMenuResponse> ictEligibleMenu(EligibleIctMenuRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<EligibleIctMenuResponse>> derivecodecIctEligibleMenu = m7594getWebService().ictEligibleMenu(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecIctEligibleMenu, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda0
            private static final byte[] $$c = {119, -102, -34, -3};
            private static final int $$d = 187;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {106, -22, 107, 95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 63;
            private static int b = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {532898960, -77193031, -793532356, 467991088, 1028389593, -1662206318, -689322828, -1621644395, -420420260, 559987712, -821972814, -2053754385, 668423257, 608738291, 350485972, -1952748463, -1508482234, -1247596527};

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = 84 - r7
                    byte[] r0 = com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda0.$$a
                    int r6 = r6 * 3
                    int r6 = 4 - r6
                    int r5 = r5 * 3
                    int r1 = 53 - r5
                    byte[] r1 = new byte[r1]
                    int r5 = 52 - r5
                    r2 = 0
                    if (r0 != 0) goto L19
                    r3 = r7
                    r4 = r2
                    r7 = r5
                    goto L2b
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L29
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L29:
                    r3 = r0[r6]
                L2b:
                    int r7 = r7 + r3
                    int r6 = r6 + 1
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda0.c(byte, int, short, java.lang.Object[]):void");
            }

            private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i3 = -1870535734;
                long j = 0;
                int i4 = 1;
                int i5 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i5] = Integer.valueOf(iArr2[i6]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i5;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(i5, i5) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == j ? 0 : -1)) + 1), (Process.myTid() >> 22) + 3291, 31 - TextUtils.indexOf("", "", i5, i5), 1948206109, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i6++;
                            i3 = -1870535734;
                            j = 0;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (iArr5 != null) {
                    int i7 = $10;
                    int i8 = i7 + 119;
                    $11 = i8 % 128;
                    int i9 = 2;
                    int i10 = i8 % 2;
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i11 = i7 + 119;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 2 / 2;
                    }
                    int i13 = 0;
                    while (i13 < length3) {
                        int i14 = $11 + 43;
                        $10 = i14 % 128;
                        if (i14 % i9 != 0) {
                            Object[] objArr3 = new Object[i4];
                            objArr3[0] = Integer.valueOf(iArr5[i13]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + i4), TextUtils.indexOf("", "", 0, 0) + 3291, 30 - TextUtils.indexOf((CharSequence) "", '0', 0), 1948206109, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i13 %= 0;
                        } else {
                            length3 = length3;
                            Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 3290 - ExpandableListView.getPackedPositionChild(0L), ExpandableListView.getPackedPositionGroup(0L) + 31, 1948206109, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE});
                            }
                            iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            i13++;
                        }
                        length3 = length3;
                        i9 = 2;
                        i4 = 1;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                int i15 = 2;
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i16 = $10 + 29;
                    $11 = i16 % 128;
                    int i17 = i16 % i15;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i18 = 17;
                    for (int i19 = 1; i18 > i19; i19 = 1) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i18];
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getOffsetAfter("", 0), Color.alpha(0) + 2559, Color.rgb(0, 0, 0) + 16777245, 683220507, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i18--;
                    }
                    int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr6 = {sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ExpandableListView.getPackedPositionChild(0L) + 349, 25 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -30507727, false, "G", new Class[]{Object.class});
                        }
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                        cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                        cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                        cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                        cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                        sessionConfigValidatingBuilder.b += 2;
                        i15 = 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int iIntValue;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, 19 - Drawable.resolveOpacity(0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr = new Object[1];
                a(new int[]{1759447660, 1535059680, 543224776, -649063110, 1593979011, -1091029550, 65331519, -867250804, -1320923529, 175614564, 1490815026, -1901947336, 415553979, 522983157}, 22 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(new int[]{759162433, 222081555, -1037946606, -1891453587, -1949884307, 1942435291, -1139130437, -1144645716, 1435198124, -623885009}, (Process.myTid() >> 22) + 15, objArr2);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = -783;
                long j2 = -1;
                long j3 = 400521997567507378L ^ j2;
                int i3 = i2;
                long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j2;
                long j4 = (((long) 784) * 400521997567507378L) + (((long) (-782)) * 1696735177174451609L) + ((j2 ^ 1696735177174451609L) * j) + (j * (((j3 | jIdentityHashCode) | 1696735177174451609L) ^ j2)) + (((long) 783) * (((jIdentityHashCode | 1696735177174451609L) ^ j2) | j3));
                int i4 = 0;
                try {
                    while (i4 != 10) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16815052), (ViewConfiguration.getTapTimeout() >> 16) + 59, 18 - View.resolveSizeAndState(0, 0, 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                        b = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = 0;
                        long j5 = jLongValue;
                        while (true) {
                            for (int i9 = 0; i9 != 8; i9++) {
                                int i10 = b + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                                int i11 = i10 % 2;
                                i5 = (((((int) (j5 >> i9)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                            }
                            if (i8 != 0) {
                                break;
                            }
                            i8++;
                            j5 = j4;
                        }
                        int i12 = i3;
                        if (i5 == i12) {
                            return DanaSiagaDataStore.ictEligibleMenu$lambda$3((EligibleIctMenuResponse) obj);
                        }
                        int i13 = b + 17;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                        if (i13 % 2 == 0) {
                            i4 += 16;
                            jLongValue &= 1024;
                        } else {
                            jLongValue -= 1024;
                            i4++;
                        }
                        i3 = i12;
                    }
                    Object[] objArr3 = {1271959030};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46037), TextUtils.indexOf((CharSequence) "", '0') + 1135, Drawable.resolveOpacity(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 2101933692, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int iBlue = 1031 - Color.blue(0);
                        int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        c(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, iBlue, maximumDrawingCacheSize, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((Process.getThreadPriority(0) + 20) >> 6) + 45993), 1117 - TextUtils.getTrimmedLength(""), 17 - ((Process.getThreadPriority(0) + 20) >> 6)), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
                    if (((int[]) objArr6[3])[0] != ((int[]) objArr6[1])[0]) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[0];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                            throw null;
                        }
                        throw null;
                    }
                    return DanaSiagaDataStore.ictEligibleMenu$lambda$3((EligibleIctMenuResponse) obj);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
                Object[] objArr7 = new Object[1];
                a(new int[]{1949508339, 106662398, 1399720143, 1772680066, 768358862, -1451170625, 1177620619, 809726445, 1534298516, 1808628133}, 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                a(new int[]{-1083557813, 538548084, 1397764805, -1160860314, -883430318, 1684954668, 253204933, 1776377227, -875518472, -691238642}, 15 - TextUtils.lastIndexOf("", '0', 0), objArr8);
                iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r6, short r7, short r8) {
                /*
                    int r6 = r6 * 4
                    int r6 = r6 + 4
                    int r7 = r7 * 3
                    int r0 = 1 - r7
                    int r8 = r8 * 56
                    int r8 = r8 + 66
                    byte[] r1 = com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda0.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r1 != 0) goto L19
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2d
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L27:
                    r3 = r1[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r3
                    r3 = r5
                L2d:
                    int r6 = -r6
                    int r8 = r8 + 1
                    int r6 = r6 + r3
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda0.$$e(int, short, short):java.lang.String");
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.danasiaga.DanaSiagaDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return DanaSiagaDataStore.ictEligibleMenu$lambda$4(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EligibleIctMenuResponse ictEligibleMenu$lambda$4(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (EligibleIctMenuResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EligibleIctMenuResponse ictEligibleMenu$lambda$3(EligibleIctMenuResponse eligibleIctMenuResponse) {
        Intrinsics.checkNotNullParameter(eligibleIctMenuResponse, "");
        return eligibleIctMenuResponse;
    }
}
