package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.koushikdutta.async.AsyncServer;
import com.koushikdutta.ion.ResponseServedFrom;
import defpackage.lambdasetUpRotationUpdates1.AnonymousClass1;
import defpackage.lambdasetUpRotationUpdates1.AnonymousClass5;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
final class SurfaceOutputImpl implements lambdasetUpRotationUpdates1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    ArrayList<SurfaceProcessorWithExecutorExternalSyntheticLambda0> INotificationSideChannel;
    boolean TuitionPaymentFragmentbindingInflater1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    lambdasetUpRotationUpdates1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f222a;
    int asBinder;
    int asInterface;
    String b;
    SurfaceProcessorNodeExternalSyntheticLambda2 d;
    ArrayList<SurfaceProcessorWithExecutor> g;

    SurfaceOutputImpl() {
    }

    private boolean TuitionPaymentFragmentbindingInflater1(String str) {
        calculateInvertedTextureTransform calculateinvertedtexturetransform = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (this.TuitionPaymentFragmentbindingInflater1) {
            if (str == null || !str.startsWith("file:/")) {
                return false;
            }
            File file = new File(URI.create(str));
            if (!file.exists()) {
                return false;
            }
            getTransformMatrix.b bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1(file.getAbsolutePath());
            if (bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || !getTransformMatrix.TuitionPaymentFragmentbindingInflater1(bVarTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                new lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode(calculateinvertedtexturetransform, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null).TuitionPaymentFragmentbindingInflater1(null, new transformSingleOutput<>(null, ResponseServedFrom.LOADED_FROM_CACHE, null, null, file));
                return true;
            }
        }
        boolean z = this.f222a;
        Iterator<setUpRotationUpdates> it = calculateInvertedTextureTransform.this.d.iterator();
        while (it.hasNext()) {
            DefaultSurfaceProcessorExternalSyntheticLambda10<SurfaceProcessorNodeExternalSyntheticLambda2> defaultSurfaceProcessorExternalSyntheticLambda10TuitionPaymentFragmentspecialinlinedviewModeldefault3 = it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(), calculateinvertedtexturetransform, this.b, str, this.asBinder, this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (defaultSurfaceProcessorExternalSyntheticLambda10TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                final SurfaceOutputImplExternalSyntheticLambda1 surfaceOutputImplExternalSyntheticLambda1 = new SurfaceOutputImplExternalSyntheticLambda1(calculateinvertedtexturetransform, this.b, !z);
                defaultSurfaceProcessorExternalSyntheticLambda10TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2>() { // from class: SurfaceOutputImpl.2
                    private static short[] asInterface;
                    private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
                    private static final int $$f = 202;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$d = {39, 27, 2, 54, -19, -5, 56, -64, -15, -7, 1, -12, 0, 48, -58, -20, 3, -21, -4, -1, -2, 47, -70, 5, -26, 8, -20, 2, 1, -18, 55, -61, -4, -26, 8, -18, 0, -1, -15, -1, -20, Base64.padSymbol, -38, -27, -26, 8, -20, 2, 1, -18, 34, -37, -18, 0, -16, 3, -4, -24, 71, -27, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, -6, -4, 4, -5, -13, 1, -18, -4, -12, -5, -4, -12, 2, -6, -25, 6, -3, -25, 35, -41, 4, -8, -14, 1, -8, -8, -2, -27, 2, -15, 58};
                    private static final int $$e = 167;
                    private static final byte[] $$a = {83, -90, 68, -23, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
                    private static final int $$b = 3;
                    private static int d = 0;
                    private static int g = 1;
                    private static int b = -1643727539;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795618;
                    private static int TuitionPaymentFragmentbindingInflater1 = -758418498;

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static byte[] f223a = {120, -75, -15, -84, -110, 19, -75, -6, -86, -57, -125, -114, 4, -95, 106, -9, -60, -57, -58, -85, -13, -74, 113, -28, 48, -31, 52, 55, 24, 15, 10, 27, -18, 63, 43, -31, 51, 68, -16, 11, 0, -7, -29, 40, -14, -8, 0, -6, 2, -18, -47, -32, 77, -1, -4, -64, 57, 8, 9, 10, -3, 5, -6, 124, -76, 63, -86, 8, -73, -77, -78, -75, 57, -28, -62, 63, 14, -88, 57, -78, 11, 126, -23, -50, -2, -5, 31, 26, -68, -58, -14, -54, 7, -78, -56, -22, -52, 126, 55, -93, 8, -15, -93, 6, 63, -19, 51, 33, -93, 50, 47, 55, -47};

                    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
                        /*
                            int r7 = 103 - r7
                            int r6 = r6 * 52
                            int r0 = 53 - r6
                            byte[] r1 = defpackage.SurfaceOutputImpl.AnonymousClass2.$$a
                            int r8 = r8 + 4
                            byte[] r0 = new byte[r0]
                            int r6 = 52 - r6
                            r2 = 0
                            if (r1 != 0) goto L15
                            r7 = r6
                            r3 = r8
                            r4 = r2
                            goto L2d
                        L15:
                            r3 = r2
                        L16:
                            byte r4 = (byte) r7
                            r0[r3] = r4
                            int r8 = r8 + 1
                            if (r3 != r6) goto L25
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r0, r2)
                            r9[r2] = r6
                            return
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
                            int r7 = r7 + (-11)
                            r8 = r3
                            r3 = r4
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceOutputImpl.AnonymousClass2.c(int, short, short, java.lang.Object[]):void");
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void f(short r6, short r7, byte r8, java.lang.Object[] r9) {
                        /*
                            int r6 = r6 * 4
                            int r0 = 57 - r6
                            byte[] r1 = defpackage.SurfaceOutputImpl.AnonymousClass2.$$d
                            int r7 = r7 * 15
                            int r7 = 99 - r7
                            int r8 = r8 * 56
                            int r8 = r8 + 4
                            byte[] r0 = new byte[r0]
                            int r6 = 56 - r6
                            r2 = 0
                            if (r1 != 0) goto L19
                            r3 = r6
                            r7 = r8
                            r4 = r2
                            goto L2e
                        L19:
                            r3 = r2
                        L1a:
                            byte r4 = (byte) r7
                            r0[r3] = r4
                            int r4 = r3 + 1
                            if (r3 != r6) goto L29
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r0, r2)
                            r9[r2] = r6
                            return
                        L29:
                            r3 = r1[r8]
                            r5 = r8
                            r8 = r7
                            r7 = r5
                        L2e:
                            int r3 = -r3
                            int r8 = r8 + r3
                            int r8 = r8 + (-7)
                            int r7 = r7 + 1
                            r3 = r4
                            r5 = r8
                            r8 = r7
                            r7 = r5
                            goto L1a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceOutputImpl.AnonymousClass2.f(short, short, byte, java.lang.Object[]):void");
                    }

                    @Override // defpackage.DefaultSurfaceProcessorExternalSyntheticLambda14
                    public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Exception exc, SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2) throws Throwable {
                        Object[] objArr;
                        int i = 2 % 2;
                        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda3 = surfaceProcessorNodeExternalSyntheticLambda2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 876;
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
                            byte b2 = $$a[5];
                            byte b3 = b2;
                            Object[] objArr2 = new Object[1];
                            c(b3, (byte) (b3 + 4), (byte) (-b2), objArr2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iIndexOf, iResolveOpacity, 252381699, false, (String) objArr2[0], null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                        Object[] objArr3 = new Object[1];
                        e(AndroidCharacter.getMirror('0') - 12071, TextUtils.getOffsetAfter("", 0) - 121, (short) (ExpandableListView.getPackedPositionType(0L) + 75), (byte) ((-106) - KeyEvent.normalizeMetaState(0)), (-313256364) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        e((-1583754995) - View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 121, (short) (KeyEvent.normalizeMetaState(0) + 20), (byte) ((-18) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-313256341) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                            int jumpTapTimeout2 = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i2 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr = $$a;
                            Object[] objArr5 = new Object[1];
                            c(bArr[7], bArr[10], (byte) (-bArr[5]), objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, jumpTapTimeout2, i2, 2009631821, false, (String) objArr5[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            int i3 = g + 33;
                            d = i3 % 128;
                            int i4 = i3 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char gidForName = (char) (Process.getGidForName("") + 1);
                                int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                                byte[] bArr2 = $$a;
                                byte b4 = bArr2[5];
                                byte b5 = bArr2[7];
                                Object[] objArr6 = new Object[1];
                                c(b4, b5, (byte) (b5 | 51), objArr6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, iCombineMeasuredStates, iMakeMeasureSpec, 256017550, false, (String) objArr6[0], null);
                            }
                            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                            int i5 = ~System.identityHashCode(this);
                            int i6 = (-942559356) + (((~((-11078225) | i5)) | 51388453) * (-828)) + ((i5 | (-11078225)) * (-828)) + 748691232;
                            int i7 = (i6 << 13) ^ i6;
                            int i8 = i7 ^ (i7 >>> 17);
                            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                        } else {
                            Object[] objArr8 = new Object[1];
                            e((ViewConfiguration.getScrollBarSize() >> 8) - 1583754999, (Process.myTid() >> 22) - 121, (short) (TextUtils.indexOf("", "", 0, 0) - 2), (byte) (TextUtils.indexOf("", "", 0, 0) + 23), (ViewConfiguration.getWindowTouchSlop() >> 8) - 313256326, objArr8);
                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            e((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1583754998, (-121) - ((Process.getThreadPriority(0) + 20) >> 6), (short) ((-25) - ((Process.getThreadPriority(0) + 20) >> 6)), (byte) ((-59) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 5828 - AndroidCharacter.getMirror('0'), objArr9);
                            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                            if (applicationContext != null) {
                                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                            }
                            Object[] objArr10 = new Object[1];
                            e((-1583754990) - (ViewConfiguration.getJumpTapTimeout() >> 16), (-121) - Color.blue(0), (short) ((-29) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) (MotionEvent.axisFromString("") - 5), View.getDefaultSize(0, 0) - 313256282, objArr10);
                            Class<?> cls3 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            e((-1583754991) - View.combineMeasuredStates(0, 0), (-122) - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (Color.blue(0) + 121), (byte) (75 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (-313256266) - View.combineMeasuredStates(0, 0), objArr11);
                            try {
                                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 165856352};
                                byte[] bArr3 = $$d;
                                byte b6 = bArr3[12];
                                byte b7 = b6;
                                Object[] objArr13 = new Object[1];
                                f(b6, b7, b7, objArr13);
                                Class<?> cls4 = Class.forName((String) objArr13[0]);
                                byte b8 = bArr3[10];
                                byte b9 = b8;
                                Object[] objArr14 = new Object[1];
                                f(b8, b9, b9, objArr14);
                                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                if (applicationContext != null) {
                                    int i9 = g + 77;
                                    d = i9 % 128;
                                    int i10 = i9 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                        int jumpTapTimeout3 = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int i11 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        byte[] bArr4 = $$a;
                                        byte b10 = bArr4[5];
                                        byte b11 = bArr4[7];
                                        Object[] objArr16 = new Object[1];
                                        c(b10, b11, (byte) (b11 | 51), objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, jumpTapTimeout3, i11, 256017550, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                                    try {
                                        Object[] objArr17 = new Object[1];
                                        e((-1583754998) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-121) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 74), (byte) (Color.argb(0, 0, 0, 0) - 106), View.MeasureSpec.getMode(0) - 313256363, objArr17);
                                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                                        Object[] objArr18 = new Object[1];
                                        e((-1583754995) - Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0', 0) - 120, (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20), (byte) ((-17) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-313256341) - Gravity.getAbsoluteGravity(0, 0), objArr18);
                                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf = Long.valueOf(jLongValue2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                                            int defaultSize = 10 - View.getDefaultSize(0, 0);
                                            byte[] bArr5 = $$a;
                                            Object[] objArr19 = new Object[1];
                                            c(bArr5[7], bArr5[10], (byte) (-bArr5[5]), objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, packedPositionType, defaultSize, 2009631821, false, (String) objArr19[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char cBlue = (char) Color.blue(0);
                                            int defaultSize2 = 876 - View.getDefaultSize(0, 0);
                                            int iGreen = Color.green(0) + 10;
                                            byte b12 = $$a[5];
                                            byte b13 = b12;
                                            Object[] objArr20 = new Object[1];
                                            c(b13, (byte) (b13 + 4), (byte) (-b12), objArr20);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cBlue, defaultSize2, iGreen, 252381699, false, (String) objArr20[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                    } catch (Exception unused) {
                                        throw new RuntimeException();
                                    }
                                }
                                objArr = objArr15;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        int i12 = ((int[]) objArr[2])[0];
                        int i13 = ((int[]) objArr[0])[0];
                        if (i13 != i12) {
                            throw new RuntimeException(String.valueOf(i13));
                        }
                        int i14 = d + 71;
                        g = i14 % 128;
                        int i15 = i14 % 2;
                        int i16 = ((int[]) objArr[1])[0];
                        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i17 = ~iIdentityHashCode;
                        int i18 = i16 + 629539536 + (((~((-866246920) | i17)) | (~(825936690 | i17))) * (-867)) + (((~((-866246920) | iIdentityHashCode)) | 42016773 | (~(825936690 | iIdentityHashCode))) * (-1734)) + (((~(iIdentityHashCode | 867953463)) | (~(i17 | (-42016774))) | (~((-824230147) | iIdentityHashCode))) * 867);
                        int i19 = (i18 << 13) ^ i18;
                        int i20 = i19 ^ (i19 >>> 17);
                        ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
                        surfaceOutputImplExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc, surfaceProcessorNodeExternalSyntheticLambda3);
                    }

                    /* JADX WARN: Code duplicated, block: B:14:0x0078  */
                    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                        int i4;
                        boolean z2;
                        int length;
                        byte[] bArr;
                        int i5;
                        int i6 = 2 % 2;
                        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                        StringBuilder sb = new StringBuilder();
                        try {
                            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 2268, 16777249 + Color.rgb(0, 0, 0), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            if (iIntValue == -1) {
                                int i7 = $10 + 63;
                                $11 = i7 % 128;
                                if (i7 % 2 == 0) {
                                    i4 = 0;
                                } else {
                                    i4 = 1;
                                }
                            } else {
                                i4 = 0;
                            }
                            long j = 0;
                            if (i4 != 0) {
                                int i8 = $11 + 59;
                                $10 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    throw null;
                                }
                                byte[] bArr2 = f223a;
                                if (bArr2 != null) {
                                    int length2 = bArr2.length;
                                    byte[] bArr3 = new byte[length2];
                                    int i9 = 0;
                                    while (i9 < length2) {
                                        try {
                                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                byte b5 = (byte) 0;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) - 1), 3358 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                                            }
                                            bArr3[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                            i9++;
                                            j = 0;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    bArr2 = bArr3;
                                }
                                if (bArr2 != null) {
                                    byte[] bArr4 = f223a;
                                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = b6;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetBefore("", 0) + 2267, 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                                } else {
                                    iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                                }
                            }
                            if (iIntValue > 0) {
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i4;
                                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - View.combineMeasuredStates(0, 0)), ExpandableListView.getPackedPositionType(0L) + 2855, TextUtils.getOffsetBefore("", 0) + 13, -1529949196, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                }
                                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                byte[] bArr5 = f223a;
                                if (bArr5 != null) {
                                    int i10 = $10 + 105;
                                    $11 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        length = bArr5.length;
                                        bArr = new byte[length];
                                        i5 = 1;
                                    } else {
                                        length = bArr5.length;
                                        bArr = new byte[length];
                                        i5 = 0;
                                    }
                                    while (i5 < length) {
                                        bArr[i5] = (byte) (((long) bArr5[i5]) ^ 3046761265686732006L);
                                        i5++;
                                    }
                                    bArr5 = bArr;
                                }
                                if (bArr5 != null) {
                                    int i11 = $11 + 37;
                                    $10 = i11 % 128;
                                    int i12 = i11 % 2;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                    if (z2) {
                                        byte[] bArr6 = f223a;
                                        int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                                    } else {
                                        short[] sArr = asInterface;
                                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                                    }
                                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                }
                            }
                            objArr[0] = sb.toString();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$g(int r6, short r7, int r8) {
                        /*
                            byte[] r0 = defpackage.SurfaceOutputImpl.AnonymousClass2.$$c
                            int r8 = r8 + 117
                            int r6 = r6 * 2
                            int r6 = r6 + 4
                            int r7 = r7 * 3
                            int r1 = r7 + 1
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            if (r0 != 0) goto L15
                            r4 = r8
                            r3 = r2
                            r8 = r6
                            goto L28
                        L15:
                            r3 = r2
                        L16:
                            byte r4 = (byte) r8
                            r1[r3] = r4
                            if (r3 != r7) goto L21
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L21:
                            int r3 = r3 + 1
                            r4 = r0[r6]
                            r5 = r8
                            r8 = r6
                            r6 = r5
                        L28:
                            int r6 = r6 + r4
                            int r8 = r8 + 1
                            r5 = r8
                            r8 = r6
                            r6 = r5
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceOutputImpl.AnonymousClass2.$$g(int, short, int):java.lang.String");
                    }
                });
                return true;
            }
        }
        return false;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(calculateInvertedTextureTransform calculateinvertedtexturetransform) {
        if (calculateinvertedtexturetransform.b.b.keySet().size() <= 5) {
            return false;
        }
        Iterator<String> it = calculateinvertedtexturetransform.b.b.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if ((calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(it.next()) instanceof SurfaceOutputImplExternalSyntheticLambda1) && (i = i + 1) > 5) {
                return true;
            }
        }
        return false;
    }

    public final SurfaceEdgeSettableSurfaceExternalSyntheticLambda0 b() {
        SurfaceEdgeSettableSurfaceExternalSyntheticLambda0 surfaceEdgeSettableSurfaceExternalSyntheticLambda0 = new SurfaceEdgeSettableSurfaceExternalSyntheticLambda0(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return surfaceEdgeSettableSurfaceExternalSyntheticLambda0;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(calculateInvertedTextureTransform calculateinvertedtexturetransform) {
        if (this.f222a && calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            SurfaceEdgeExternalSyntheticLambda6<DefaultSurfaceProcessorExternalSyntheticLambda14<SurfaceProcessorNodeExternalSyntheticLambda2>> surfaceEdgeExternalSyntheticLambda6 = calculateinvertedtexturetransform.b;
            String str = this.b;
            surfaceEdgeExternalSyntheticLambda6.b(str, new SurfaceProcessorNodeExternalSyntheticLambda0(calculateinvertedtexturetransform, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, str, this.INotificationSideChannel, this.g));
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Node nodeB;
        final calculateInvertedTextureTransform calculateinvertedtexturetransform = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        SurfaceEdgeExternalSyntheticLambda5 surfaceEdgeExternalSyntheticLambda5 = calculateinvertedtexturetransform.INotificationSideChannel.b;
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
        if (surfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 0).exists() && !this.TuitionPaymentFragmentbindingInflater1) {
            final String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final ArrayList<SurfaceProcessorWithExecutor> arrayList = this.g;
            if (calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str) == null) {
                final SurfaceOutputImplExternalSyntheticLambda1 surfaceOutputImplExternalSyntheticLambda1 = new SurfaceOutputImplExternalSyntheticLambda1(calculateinvertedtexturetransform, str, true);
                calculateInvertedTextureTransform.TuitionPaymentFragmentbindingInflater1().execute(new Runnable() { // from class: lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface.4
                    private /* synthetic */ lambdaclose1androidxcameracoreprocessingSurfaceEdgeSettableSurface TuitionPaymentFragmentbindingInflater1;
                    private /* synthetic */ ArrayList TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

                    AnonymousClass4() {
                        str = str;
                        lambdaclose1androidxcameracoreprocessingsurfaceedgesettablesurface = surfaceOutputImplExternalSyntheticLambda1;
                        arrayList = arrayList;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str) != lambdaclose1androidxcameracoreprocessingsurfaceedgesettablesurface) {
                            return;
                        }
                        try {
                            Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor.TuitionPaymentFragmentbindingInflater1(calculateinvertedtexturetransform.INotificationSideChannel.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str), (BitmapFactory.Options) null);
                            if (bitmapTuitionPaymentFragmentbindingInflater1 == null) {
                                throw new Exception("Bitmap failed to load");
                            }
                            SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2 = new SurfaceProcessorNodeExternalSyntheticLambda2(str, "image/jpeg", bitmapTuitionPaymentFragmentbindingInflater1, null);
                            surfaceProcessorNodeExternalSyntheticLambda2.notify = ResponseServedFrom.LOADED_FROM_CACHE;
                            ArrayList<SurfaceProcessorWithExecutor> arrayList2 = arrayList;
                            if (arrayList2 != null) {
                                for (SurfaceProcessorWithExecutor surfaceProcessorWithExecutor : arrayList2) {
                                }
                            }
                            lambdaclose1androidxcameracoreprocessingsurfaceedgesettablesurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, surfaceProcessorNodeExternalSyntheticLambda2);
                        } catch (Exception e2) {
                            lambdaclose1androidxcameracoreprocessingsurfaceedgesettablesurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, null);
                            try {
                                SurfaceEdgeExternalSyntheticLambda5 surfaceEdgeExternalSyntheticLambda6 = calculateinvertedtexturetransform.INotificationSideChannel.b;
                                String str2 = str;
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    SurfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceEdgeExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append(".");
                                    sb.append(i2);
                                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString()) == null) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                while (true) {
                                    File fileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceEdgeExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2, i);
                                    if (!fileTuitionPaymentFragmentspecialinlinedviewModeldefault3.exists()) {
                                        return;
                                    }
                                    fileTuitionPaymentFragmentspecialinlinedviewModeldefault3.delete();
                                    i++;
                                }
                            } catch (Exception unused) {
                            }
                        } catch (OutOfMemoryError e3) {
                            lambdaclose1androidxcameracoreprocessingsurfaceedgesettablesurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Exception(e3), null);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b) == null && !TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = null;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1261a = this;
            if (!this.TuitionPaymentFragmentbindingInflater1) {
                lambdasetUpRotationUpdates1 lambdasetuprotationupdates1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                lambdacreateSurfaceRequest0androidxcameracoreprocessingSurfaceEdge lambdacreatesurfacerequest0androidxcameracoreprocessingsurfaceedge = new lambdacreateSurfaceRequest0androidxcameracoreprocessingSurfaceEdge();
                Runnable runnable = new Runnable() { // from class: SurfaceOutputImpl.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        AsyncServer.TuitionPaymentFragmentbindingInflater1(calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new Runnable() { // from class: SurfaceOutputImpl.4.5
                            private static final byte[] $$c = {Base64.padSymbol, -108, 49, -100};
                            private static final int $$f = 254;
                            private static int $10 = 0;
                            private static int $11 = 1;
                            private static final byte[] $$d = {48, -119, -71, 110, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 66, -9, 18, 6, -66, 66, 5, -8, 4, 10, -59, 37, 34, 0, 16, -15, 11, 2, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
                            private static final int $$e = 61;
                            private static final byte[] $$a = {84, 10, 24, -102, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
                            private static final int $$b = 68;
                            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                            private static int b = 1;
                            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2184743057997287985L;

                            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
                                /*
                                    byte[] r0 = defpackage.SurfaceOutputImpl.AnonymousClass4.AnonymousClass5.$$a
                                    int r1 = 53 - r7
                                    int r8 = r8 * 14
                                    int r8 = 98 - r8
                                    int r6 = r6 * 52
                                    int r6 = r6 + 4
                                    byte[] r1 = new byte[r1]
                                    int r7 = 52 - r7
                                    r2 = 0
                                    if (r0 != 0) goto L17
                                    r8 = r6
                                    r3 = r7
                                    r4 = r2
                                    goto L2e
                                L17:
                                    r3 = r2
                                L18:
                                    byte r4 = (byte) r8
                                    r1[r3] = r4
                                    if (r3 != r7) goto L25
                                    java.lang.String r6 = new java.lang.String
                                    r6.<init>(r1, r2)
                                    r9[r2] = r6
                                    return
                                L25:
                                    int r3 = r3 + 1
                                    r4 = r0[r6]
                                    r5 = r8
                                    r8 = r6
                                    r6 = r4
                                    r4 = r3
                                    r3 = r5
                                L2e:
                                    int r3 = r3 + r6
                                    int r6 = r3 + (-10)
                                    int r8 = r8 + 1
                                    r3 = r4
                                    r5 = r8
                                    r8 = r6
                                    r6 = r5
                                    goto L18
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceOutputImpl.AnonymousClass4.AnonymousClass5.a(int, byte, int, java.lang.Object[]):void");
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
                                /*
                                    int r6 = r6 * 3
                                    int r0 = r6 + 38
                                    int r7 = r7 * 15
                                    int r7 = 99 - r7
                                    int r8 = r8 * 40
                                    int r8 = 43 - r8
                                    byte[] r1 = defpackage.SurfaceOutputImpl.AnonymousClass4.AnonymousClass5.$$d
                                    byte[] r0 = new byte[r0]
                                    int r6 = r6 + 37
                                    r2 = 0
                                    if (r1 != 0) goto L19
                                    r7 = r6
                                    r3 = r8
                                    r4 = r2
                                    goto L31
                                L19:
                                    r3 = r2
                                L1a:
                                    byte r4 = (byte) r7
                                    r0[r3] = r4
                                    int r8 = r8 + 1
                                    if (r3 != r6) goto L29
                                    java.lang.String r6 = new java.lang.String
                                    r6.<init>(r0, r2)
                                    r9[r2] = r6
                                    return
                                L29:
                                    int r3 = r3 + 1
                                    r4 = r1[r8]
                                    r5 = r3
                                    r3 = r8
                                    r8 = r4
                                    r4 = r5
                                L31:
                                    int r7 = r7 + r8
                                    int r7 = r7 + (-3)
                                    r8 = r3
                                    r3 = r4
                                    goto L1a
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceOutputImpl.AnonymousClass4.AnonymousClass5.d(short, int, short, java.lang.Object[]):void");
                            }

                            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                                int i2 = 2 % 2;
                                abortCapture abortcapture = new abortCapture();
                                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
                                int i3 = 4;
                                abortcapture.b = 4;
                                while (abortcapture.b < cArrB.length) {
                                    int i4 = $11 + 93;
                                    $10 = i4 % 128;
                                    int i5 = i4 % 2;
                                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
                                    int i6 = abortcapture.b;
                                    try {
                                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            byte b2 = (byte) 0;
                                            byte b3 = b2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 64838), KeyEvent.keyCodeFromString("") + 1356, TextUtils.getCapsMode("", 0, 0) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                                        }
                                        cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                        Object[] objArr3 = {abortcapture, abortcapture};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.resolveSize(0, 0) + 47773), 469 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                                        int i7 = $10 + 107;
                                        $11 = i7 % 128;
                                        int i8 = i7 % 2;
                                        i3 = 4;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                            }

                            /* JADX WARN: Code duplicated, block: B:28:0x021e  */
                            /* JADX WARN: Code duplicated, block: B:29:0x0220  */
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Object[] objArr;
                                int i = 2 % 2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                int i2 = 0;
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char packedPositionGroup = (char) (31533 - ExpandableListView.getPackedPositionGroup(0L));
                                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
                                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                                    byte b2 = $$a[80];
                                    byte b3 = b2;
                                    Object[] objArr2 = new Object[1];
                                    a(b3, (byte) (b3 | 52), b2, objArr2);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, maximumFlingVelocity, modifierMetaStateMask, -1048449946, false, (String) objArr2[0], null);
                                }
                                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                                Object[] objArr3 = new Object[1];
                                c(new char[]{29136, 29105, 21666, 37733, 58379, 27453, 60091, 48178, 28443, 30017, 50863, 51587, 19703, 38887, 42889, 10274, 10821, 45187, 32887, 3760, 2861, 53535, 25267, 28118, 59527, 62419}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
                                Class<?> cls = Class.forName((String) objArr3[0]);
                                Object[] objArr4 = new Object[1];
                                c(new char[]{42932, 42961, 58808, 8829, 17448, 51995, 38322, 49977, 47459, 50261, 26249, 46836, 39577, 9965, 2029, 22286, 64561, 389, 8256}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
                                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                                    int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                                    int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                                    byte[] bArr = $$a;
                                    byte b4 = bArr[80];
                                    Object[] objArr5 = new Object[1];
                                    a(b4, b4, bArr[37], objArr5);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, modifierMetaStateMask2, i3, -778300370, false, (String) objArr5[0], null);
                                }
                                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cBlue = (char) (31533 - Color.blue(0));
                                        int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                                        int iRed = 28 - Color.red(0);
                                        byte[] bArr2 = $$a;
                                        byte b5 = bArr2[37];
                                        Object[] objArr6 = new Object[1];
                                        a(b5, bArr2[33], b5, objArr6);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, iResolveOpacity, iRed, -1142834547, false, (String) objArr6[0], null);
                                    }
                                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                    int i4 = ((int[]) objArr7[3])[0];
                                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i4}, (String[]) objArr7[4]};
                                    int iNextInt = new Random().nextInt(200007437);
                                    int i5 = ~((-83228467) | iNextInt);
                                    int i6 = 45199495 + ((3514386 | i5) * (-280)) + ((i5 | (~((-1690851178) | iNextInt))) * 140);
                                    int i7 = ~((-79714081) | iNextInt);
                                    int i8 = ~iNextInt;
                                    int i9 = (i6 + (((~(i8 | (-1611137098))) | (i7 | (~((-3514387) | i8)))) * 140)) - 1956923450;
                                    int i10 = (i9 << 13) ^ i9;
                                    int i11 = i10 ^ (i10 >>> 17);
                                    ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                                } else {
                                    Object[] objArr8 = new Object[1];
                                    c(new char[]{57368, 57465, 54440, 4975, 65186, 29076, 153, 22032, 65235, 62795, 56326, 9121, 56625, 6126, 48510, 49789, 48053, 12441, 39646, 58526, 39678, 20799, 30722, 34786, 31096, 29658, 22880, 42586, 22433, 27786}, 1 - View.resolveSize(0, 0), objArr8);
                                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                                    Object[] objArr9 = new Object[1];
                                    c(new char[]{3714, 3809, 29402, 46342, 40013, 4973, 62489, 41616, 4163, 21285, 48879, 55118, 13242, 45447, 57243, 14010, 21773, 38642, 63527, 4126, 29821, 63313}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
                                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                                    if (applicationContext != null) {
                                        int i12 = b + 47;
                                        int i13 = i12 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
                                        if (i12 % 2 != 0) {
                                            boolean z2 = applicationContext instanceof ContextWrapper;
                                            throw null;
                                        }
                                        if (applicationContext instanceof ContextWrapper) {
                                            int i14 = i13 + 79;
                                            b = i14 % 128;
                                            if (i14 % 2 == 0) {
                                                int i15 = 41 / 0;
                                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                                    applicationContext = applicationContext.getApplicationContext();
                                                } else {
                                                    applicationContext = null;
                                                }
                                            } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                                applicationContext = applicationContext.getApplicationContext();
                                            } else {
                                                applicationContext = null;
                                            }
                                        } else {
                                            applicationContext = applicationContext.getApplicationContext();
                                        }
                                    }
                                    Object[] objArr10 = new Object[1];
                                    c(new char[]{39756, 39718, 5834, 53506, 11780, 41248, 9133, 30007, 34246, 14115, 3255, 198, 42595, 54749, 28137, 57613, 49363, 62179, 19067, 51133}, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr10);
                                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                                    Object[] objArr11 = new Object[1];
                                    c(new char[]{45348, 45389, 9603, 57934, 54500, 23507, 38134, 49763, 45044, 1130, 63057, 46981, 35876, 59102, 38714, 22088, 60043, 49588, 45193, 28897}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr11);
                                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                                    b = i16 % 128;
                                    int i17 = i16 % 2;
                                    try {
                                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1956923450};
                                        byte[] bArr3 = $$d;
                                        byte b6 = bArr3[5];
                                        Object[] objArr13 = new Object[1];
                                        d(b6, bArr3[18], b6, objArr13);
                                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                                        byte b7 = bArr3[18];
                                        Object[] objArr14 = new Object[1];
                                        d(b7, bArr3[5], b7, objArr14);
                                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                                            int i18 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                                            int iArgb = Color.argb(0, 0, 0, 0) + 28;
                                            byte[] bArr4 = $$a;
                                            byte b8 = bArr4[37];
                                            Object[] objArr15 = new Object[1];
                                            a(b8, bArr4[33], b8, objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, i18, iArgb, -1142834547, false, (String) objArr15[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                        try {
                                            Object[] objArr16 = new Object[1];
                                            c(new char[]{29136, 29105, 21666, 37733, 58379, 27453, 60091, 48178, 28443, 30017, 50863, 51587, 19703, 38887, 42889, 10274, 10821, 45187, 32887, 3760, 2861, 53535, 25267, 28118, 59527, 62419}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr16);
                                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                                            Object[] objArr17 = new Object[1];
                                            c(new char[]{42932, 42961, 58808, 8829, 17448, 51995, 38322, 49977, 47459, 50261, 26249, 46836, 39577, 9965, 2029, 22286, 64561, 389, 8256}, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr17);
                                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf = Long.valueOf(jLongValue2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                char c2 = (char) (31534 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                int i19 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                int iIndexOf = TextUtils.indexOf("", "", 0) + 28;
                                                byte[] bArr5 = $$a;
                                                byte b9 = bArr5[80];
                                                Object[] objArr18 = new Object[1];
                                                a(b9, b9, bArr5[37], objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i19, iIndexOf, -778300370, false, (String) objArr18[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
                                                int maximumFlingVelocity2 = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                int defaultSize = 28 - View.getDefaultSize(0, 0);
                                                byte b10 = $$a[80];
                                                byte b11 = b10;
                                                Object[] objArr19 = new Object[1];
                                                a(b11, (byte) (b11 | 52), b10, objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, maximumFlingVelocity2, defaultSize, -1048449946, false, (String) objArr19[0], null);
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
                                    ArrayList arrayList2 = new ArrayList();
                                    String[] strArr = (String[]) objArr[4];
                                    if (strArr == null) {
                                        throw null;
                                    }
                                    while (i2 < strArr.length) {
                                        int i20 = b + 59;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                                        if (i20 % 2 != 0) {
                                            arrayList2.add(strArr[i2]);
                                            i2 += 85;
                                        } else {
                                            arrayList2.add(strArr[i2]);
                                            i2++;
                                        }
                                    }
                                    throw null;
                                }
                                int i21 = b + 91;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                int i22 = i21 % 2;
                                int i23 = ((int[]) objArr[0])[0];
                                int i24 = ((int[]) objArr[3])[0];
                                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i24}, (String[]) objArr[4]};
                                int iIdentityHashCode = System.identityHashCode(this);
                                int i25 = ~iIdentityHashCode;
                                int i26 = i23 + 577420676 + (((~(i25 | 884066397)) | 890013246) * (-1042)) + ((884066397 | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-890013247))) | 872448028 | (~(i25 | 901631615))) * 521);
                                int i27 = (i26 << 13) ^ i26;
                                int i28 = i27 ^ (i27 >>> 17);
                                ((int[]) objArr20[0])[0] = i28 ^ (i28 << 5);
                                calculateinvertedtexturetransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceOutputImpl.this.b);
                                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                                b = i29 % 128;
                                int i30 = i29 % 2;
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                            /* JADX WARN: Code duplicated, block: B:8:0x0023  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            private static java.lang.String $$g(byte r6, short r7, short r8) {
                                /*
                                    int r8 = r8 * 3
                                    int r8 = r8 + 4
                                    byte[] r0 = defpackage.SurfaceOutputImpl.AnonymousClass4.AnonymousClass5.$$c
                                    int r6 = r6 * 3
                                    int r6 = r6 + 107
                                    int r7 = r7 * 3
                                    int r1 = 1 - r7
                                    byte[] r1 = new byte[r1]
                                    r2 = 0
                                    int r7 = 0 - r7
                                    r3 = -1
                                    if (r0 != 0) goto L19
                                    r4 = r3
                                    r3 = r8
                                    goto L2f
                                L19:
                                    r5 = r8
                                    r8 = r6
                                    r6 = r5
                                L1c:
                                    int r3 = r3 + 1
                                    byte r4 = (byte) r8
                                    r1[r3] = r4
                                    if (r3 != r7) goto L29
                                    java.lang.String r6 = new java.lang.String
                                    r6.<init>(r1, r2)
                                    return r6
                                L29:
                                    r4 = r0[r6]
                                    r5 = r3
                                    r3 = r6
                                    r6 = r4
                                    r4 = r5
                                L2f:
                                    int r6 = -r6
                                    int r8 = r8 + r6
                                    int r6 = r3 + 1
                                    r3 = r4
                                    goto L1c
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.SurfaceOutputImpl.AnonymousClass4.AnonymousClass5.$$g(byte, short, short):java.lang.String");
                            }
                        });
                    }
                };
                if (!TextUtils.isEmpty(null) && lambdasetuprotationupdates1.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Accept".toLowerCase(Locale.US)) == "*/*") {
                    lambdasetuprotationupdates1.TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("Accept".toLowerCase(Locale.US));
                }
                Uri uriTuitionPaymentFragmentbindingInflater1 = lambdasetuprotationupdates1.TuitionPaymentFragmentbindingInflater1();
                if (uriTuitionPaymentFragmentbindingInflater1 != null) {
                    nodeB = lambdasetuprotationupdates1.b(uriTuitionPaymentFragmentbindingInflater1);
                    lambdacreatesurfacerequest0androidxcameracoreprocessingsurfaceedge.TuitionPaymentFragmentbindingInflater1();
                    for (setUpRotationUpdates setuprotationupdates : lambdasetuprotationupdates1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d) {
                        calculateInvertedTextureTransform calculateinvertedtexturetransform2 = lambdasetuprotationupdates1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    }
                } else {
                    nodeB = null;
                }
                lambdasetUpRotationUpdates1.AnonymousClass5 anonymousClass5 = lambdasetuprotationupdates1.new AnonymousClass5(runnable, lambdacreatesurfacerequest0androidxcameracoreprocessingsurfaceedge);
                if (uriTuitionPaymentFragmentbindingInflater1 != null) {
                    anonymousClass5.f1262a = nodeB;
                    lambdasetuprotationupdates1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(anonymousClass5);
                } else {
                    anonymousClass5.b(new Exception("Invalid URI"), (Object) null, (DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null);
                }
                anonymousClass5.asBinder().TuitionPaymentFragmentspecialinlinedviewModeldefault1(new createAndSendSurfaceOutput(calculateinvertedtexturetransform, this.b, !this.f222a, this.asBinder, this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            } else {
                final File fileTuitionPaymentFragmentbindingInflater1 = surfaceEdgeExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
                final lambdasetUpRotationUpdates1 lambdasetuprotationupdates2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                lambdasetUpRotationUpdates1.AnonymousClass1 anonymousClass1 = lambdasetuprotationupdates2.new AnonymousClass1(new Runnable() { // from class: lambdasetUpRotationUpdates1.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        fileTuitionPaymentFragmentbindingInflater1.delete();
                    }
                }, true, new getDeferrableSurfaceForTesting(lambdasetuprotationupdates2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fileTuitionPaymentFragmentbindingInflater1), fileTuitionPaymentFragmentbindingInflater1);
                lambdasetuprotationupdates2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(anonymousClass1);
                DefaultSurfaceProcessorExternalSyntheticLambda5 defaultSurfaceProcessorExternalSyntheticLambda5 = new DefaultSurfaceProcessorExternalSyntheticLambda5();
                anonymousClass1.TuitionPaymentFragmentbindingInflater1((DefaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) null, new DefaultSurfaceProcessorExternalSyntheticLambda4(new lambdasetUpRotationUpdates1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.AnonymousClass2(defaultSurfaceProcessorExternalSyntheticLambda5)));
                defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1((lambdarelease5androidxcameracoreprocessingDefaultSurfaceProcessor) anonymousClass1);
                defaultSurfaceProcessorExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new lambdasendSurfaceOutputs0androidxcameracoreprocessingSurfaceProcessorNode(calculateinvertedtexturetransform, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, surfaceEdgeExternalSyntheticLambda5));
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(calculateinvertedtexturetransform);
    }

    @Override // lambdasetUpRotationUpdates1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Node node) {
        return !TuitionPaymentFragmentbindingInflater1(node.INotificationSideChannel.toString());
    }
}
