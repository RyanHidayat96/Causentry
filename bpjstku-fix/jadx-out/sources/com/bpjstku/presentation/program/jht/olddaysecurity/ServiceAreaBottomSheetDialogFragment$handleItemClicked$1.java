package com.bpjstku.presentation.program.jht.olddaysecurity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import com.bpjstku.domain.general.model.CodeNamePair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.getUseCount;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.program.jht.olddaysecurity.ServiceAreaBottomSheetDialogFragment$handleItemClicked$1", f = "ServiceAreaBottomSheetDialogFragment.kt", i = {}, l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", n = {}, s = {})
public final class ServiceAreaBottomSheetDialogFragment$handleItemClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CodeNamePair $data;
    int label;
    final /* synthetic */ getUseCount this$0;
    private static final byte[] $$c = {19, 78, 114, 113};
    private static final int $$f = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {80, -8, 43, 65, -11, 3, 64, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, 14, 4, 2, -17, 15, 56, -67, 14, -7, -1, -4, 16, 3, -11, 2, 9, -2, 3, 58, -20, -43, 2, 9, -2, 3, 19, -26, 13, 4, -18, 16, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 66};
    private static final int $$e = 84;
    private static final byte[] $$a = {23, -73, 107, 5, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 25;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {63316, 2377, 2933, 3441, 3858, 262, 829, 1381, 1994, 6628, 7087, 7584, 8084, 4524, 5053, 5214, 5752, 10308, 10781, 11276, 11838, 8228, 50351, 15028, 14479, 16012, 15601, 13045, 12482, 14054, 13375, 10761, 10258, 11896, 11387, 8781, 8275, 45565, 20448, 19932, 19416, 18875, 18351, 17812, 17356, 16749, 24398, 23896, 23412, 22789, 22293, 21780, 21243, 20682, 28359, 27820, 27315, 26784, 26254, 25698, 25191, 24653, 32314, 46832, 18676, 19141, 19671, 20158, 16551, 17035, 17580, 18035, 22593, 23115, 23612, 24104, 20504, 21019, 22004, 22492, 27087, 34056, 31505, 31024, 32565, 32004, 29524, 29039, 30578, 30101, 27630, 27013, 28637, 28105, 25596, 25083, 26113, 12952, 52359, 52912, 51369, 51917, 50370, 50921, 49398, 49705, 56370, 56886, 55391, 55914, 54388, 54889, 53658};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5078698724637626254L;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.ServiceAreaBottomSheetDialogFragment$handleItemClicked$1.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.ServiceAreaBottomSheetDialogFragment$handleItemClicked$1.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 8
            int r0 = 53 - r6
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.ServiceAreaBottomSheetDialogFragment$handleItemClicked$1.$$d
            int r8 = r8 * 44
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.ServiceAreaBottomSheetDialogFragment$handleItemClicked$1.d(byte, short, short, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 49;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2187, TextUtils.getTrimmedLength("") + 40, 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 3011 - TextUtils.indexOf("", "", 0, 0), 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - Process.getGidForName("")), Process.getGidForName("") + 3377, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i8 = $10 + 53;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 36505), 3376 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 16 - ImageFormat.getBitsPerPixel(0), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = i3 + 71;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i3 + 101;
            b = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (function1 != null) {
                function1.invoke(this.$data);
            }
            this.label = 1;
            if (AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(300L, this) == coroutine_suspended) {
                int i8 = b + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                int i9 = i8 % 2;
                return coroutine_suspended;
            }
        }
        this.this$0.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0245  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        getUseCount getusecount = this.this$0;
        CodeNamePair codeNamePair = this.$data;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31533);
            int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[37];
            byte b3 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, i2, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(KeyEvent.keyCodeFromString(""), (Process.myTid() >> 22) + 22, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 18089), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, (char) (TextUtils.getTrimmedLength("") + 30038), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
            int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
            int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte b4 = $$a[37];
            Object[] objArr5 = new Object[1];
            a(b4, (byte) 52, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionType, fadingEdgeLength, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                int iRed = Color.red(0) + 921;
                int defaultSize = View.getDefaultSize(0, 0) + 28;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b5, (byte) (b5 | 37), bArr2[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iRed, defaultSize, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMyTid = Process.myTid();
            int i3 = ~iMyTid;
            int i4 = (-720528378) + ((1610083739 | i3) * (-369)) + (((~((-432467353) | i3)) | 1341612291) * (-369)) + (((~(iMyTid | 432467352)) | 1177616387 | (~(i3 | (-268471449)))) * 369) + 1596901110;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - TextUtils.lastIndexOf("", '0', 0, 0), (char) Color.green(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getLongPressTimeout() >> 16) + 63, ExpandableListView.getPackedPositionType(0L) + 18, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1808), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                    b = i7 % 128;
                    int i8 = i7 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            c(81 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (13566 - TextUtils.getTrimmedLength("")), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 97, (ViewConfiguration.getLongPressTimeout() >> 16) + 16, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33645), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i9 = b + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1596901110};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[9];
                byte b7 = bArr3[90];
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[90];
                byte b9 = bArr3[9];
                Object[] objArr14 = new Object[1];
                d(b8, b9, b9, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 921;
                    int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[80];
                    Object[] objArr15 = new Object[1];
                    a(b10, (byte) (b10 | 37), bArr4[37], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, capsMode, iCombineMeasuredStates, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, (char) (18088 - ImageFormat.getBitsPerPixel(0)), objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, (ViewConfiguration.getScrollBarSize() >> 8) + 15, (char) (Gravity.getAbsoluteGravity(0, 0) + 30038), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRgb2 = (char) ((-16745683) - Color.rgb(0, 0, 0));
                        int iIndexOf2 = TextUtils.indexOf("", "") + 921;
                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 29;
                        byte b11 = $$a[37];
                        Object[] objArr18 = new Object[1];
                        a(b11, (byte) 52, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb2, iIndexOf2, iIndexOf3, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                        int iIndexOf4 = 921 - TextUtils.indexOf("", "", 0);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[37];
                        byte b13 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b12, b13, b13, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, iIndexOf4, scrollBarFadeDuration, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                    b = i11 % 128;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i15 = b + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                for (int i16 = i15 % 2 == 0 ? 0 : 1; i16 < strArr.length; i16++) {
                    arrayList.add(strArr[i16]);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = ~((-1336367516) | iIdentityHashCode);
        int i19 = ~iIdentityHashCode;
        int i20 = i17 + 1555946605 + ((i18 | (~(1605893531 | i19))) * (-406)) + ((~((-1168181404) | i19)) * (-406)) + (((~(iIdentityHashCode | (-437712129))) | (~(1336367515 | i19))) * 406);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr20[0])[0] = i22 ^ (i22 << 5);
        return new ServiceAreaBottomSheetDialogFragment$handleItemClicked$1(getusecount, codeNamePair, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((ServiceAreaBottomSheetDialogFragment$handleItemClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        int i4 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceAreaBottomSheetDialogFragment$handleItemClicked$1(getUseCount getusecount, CodeNamePair codeNamePair, Continuation<? super ServiceAreaBottomSheetDialogFragment$handleItemClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = getusecount;
        this.$data = codeNamePair;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = 115 - r8
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.ServiceAreaBottomSheetDialogFragment$handleItemClicked$1.$$c
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r8 = r8 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.ServiceAreaBottomSheetDialogFragment$handleItemClicked$1.$$g(int, byte, int):java.lang.String");
    }
}
