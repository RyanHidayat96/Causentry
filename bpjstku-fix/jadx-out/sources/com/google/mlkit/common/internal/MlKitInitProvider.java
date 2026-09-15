package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.point.PointDataStore;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class MlKitInitProvider extends ContentProvider {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f825a;
    private static int asInterface;
    private static byte[] b;
    private static final byte[] $$c = {68, -119, -76, 97};
    private static final int $$f = 249;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            byte[] r0 = com.google.mlkit.common.internal.MlKitInitProvider.$$a
            int r1 = r6 + 1
            int r7 = 214 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r6
            r8 = r7
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L1f:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L28:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.MlKitInitProvider.d(byte, short, int, java.lang.Object[]):void");
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
    private static void e(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.mlkit.common.internal.MlKitInitProvider.$$d
            int r6 = r6 + 4
            int r7 = r7 + 84
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r6
            r4 = r8
            r3 = r2
            goto L26
        L11:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.MlKitInitProvider.e(int, byte, short, java.lang.Object[]):void");
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        f825a = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkState(!providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"), "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        super.attachInfo(context, providerInfo);
        int i4 = asInterface + 115;
        f825a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        byte b3;
        long j;
        int i4 = 2;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i6 = 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iRgb = (-16777183) - Color.rgb(0, 0, 0);
                byte length = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i6, iRgb, 1387473586, false, $$g((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                byte[] bArr = b;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = $10 + 73;
                        $11 = i9 % 128;
                        if (i9 % i4 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3357, TextUtils.lastIndexOf("", '0') + 19, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i8 %= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3357, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i4 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 85;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr3 = b;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iResolveSize = 2267 - View.resolveSize(0, 0);
                            int i11 = 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte length3 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, iResolveSize, i11, 1387473586, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b3 = (byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) - 3046761265686732006L);
                        j = ((long) TuitionPaymentFragmentbindingInflater1) * 3046761265686732006L;
                    } else {
                        byte[] bArr4 = b;
                        Object[] objArr6 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int i12 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2268;
                            int keyRepeatDelay = 33 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte length4 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i12, keyRepeatDelay, 1387473586, false, $$g((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b3 = (byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L);
                        j = ((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L;
                    }
                    iIntValue = (byte) (b3 + ((int) j));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    int i13 = $10 + 63;
                    $11 = i13 % 128;
                    i4 = 2;
                    int i14 = i13 % 2;
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - i4) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i7;
                Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (55905 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2855, Color.green(0) + 13, -1529949196, false, $$g(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = b;
                if (bArr5 != null) {
                    int length5 = bArr5.length;
                    byte[] bArr6 = new byte[length5];
                    int i15 = $11 + 1;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    for (int i17 = 0; i17 < length5; i17++) {
                        bArr6[i17] = (byte) (((long) bArr5[i17]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                int i18 = $11 + 3;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr7 = b;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    /* JADX WARN: Type inference failed for: r1v317, types: [boolean, int] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        String str;
        Object[] objArr4;
        int i;
        Object[] objArr5;
        Object[] objArr6;
        String str2;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        String str3;
        Object[] objArr10;
        Object[] objArr11;
        int i2;
        Object[] objArr12;
        int i3;
        String str4;
        Object[] objArr13;
        Object obj;
        Object[] objArr14;
        Object[] objArr15;
        int i4;
        Object[] objArr16;
        Object[] objArr17;
        char c;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Object[] objArr18 = new Object[1];
        c((-681866339) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-11) - (KeyEvent.getMaxKeyCode() >> 16), (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-437376763) - TextUtils.indexOf("", ""), objArr18);
        String str5 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        c(Color.argb(0, 0, 0, 0) - 681866335, (ViewConfiguration.getTapTimeout() >> 16) - 18, (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0') - 437376741, objArr19);
        String str6 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        c((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 681866331, (-18) - TextUtils.lastIndexOf("", '0', 0), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (byte) ((-1) - MotionEvent.axisFromString("")), (-437376793) - (KeyEvent.getMaxKeyCode() >> 16), objArr20);
        String str7 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        c(TextUtils.getTrimmedLength("") - 681866331, (-17) - ((Process.getThreadPriority(0) + 20) >> 6), (short) (Process.myPid() >> 22), (byte) KeyEvent.keyCodeFromString(""), Drawable.resolveOpacity(0, 0) - 437376778, objArr21);
        String str8 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        c((-681866339) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-7) - (ViewConfiguration.getEdgeSlop() >> 16), (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) - 437376835, objArr22);
        String str9 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        c((-681866337) - View.MeasureSpec.getMode(0), (-15) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (-437376809) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr23);
        String str10 = (String) objArr23[0];
        int i8 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i8 != (-1041656352) + ((1216650125 | (~(iIdentityHashCode | 386662582))) * (-668)) + ((386662582 | (~(1216650125 | iIdentityHashCode))) * 1336) + ((iIdentityHashCode | 1603050431) * 668)) {
            throw null;
        }
        int i9 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i10 = ~iIdentityHashCode2;
        if (i9 != (-130066532) + ((1048592 | (~((-1880703702) | i10))) * 184) + ((iIdentityHashCode2 | (-2044447480)) * (-184)) + ((~((-164792371) | i10)) * 184)) {
            int[] iArr = new int[1113335496];
            iArr[1113335495] = 1;
            int i11 = (-1018964616) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int keyRepeatTimeout = 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 33;
            Object[] objArr24 = new Object[1];
            d((byte) ($$b + 1), (short) 210, $$a[7], objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, keyRepeatTimeout, capsMode, -887667012, false, (String) objArr24[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cGreen = (char) Color.green(0);
                int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0');
                int i12 = 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr25 = new Object[1];
                d((byte) 37, (short) 158, $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, iLastIndexOf, i12, -654680577, false, (String) objArr25[0], null);
            }
            Object[] objArr26 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i13 = ((int[]) objArr26[0])[0];
            int i14 = ((int[]) objArr26[3])[0];
            String[] strArr = (String[]) objArr26[1];
            int iMyPid = Process.myPid();
            int i15 = (-1406368311) + (((~((-955423352) | iMyPid)) | 145922579 | (~((-146710036) | iMyPid))) * (-754));
            int i16 = ~((-145922580) | iMyPid);
            int i17 = ~iMyPid;
            int i18 = i15 + ((i16 | (~((-787457) | i17))) * (-754)) + ((i17 | (-955423352)) * 754) + 489360925;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[2])[0] = i20 ^ (i20 << 5);
            str10 = str10;
        } else {
            Context applicationContext = (Context) Class.forName(str9).getMethod(str10, new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr27 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue()), 0, 489360925};
                byte[] bArr = $$d;
                Object[] objArr28 = new Object[1];
                e(bArr[7], (byte) (-bArr[482]), bArr[36], objArr28);
                Class<?> cls = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(bArr[36], bArr[44], bArr[7], objArr29);
                Object[] objArr30 = (Object[]) cls.getMethod((String) objArr29[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr27);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i21 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                        int mirror = AndroidCharacter.getMirror('0') - 15;
                        Object[] objArr31 = new Object[1];
                        d((byte) 37, (short) 158, $$a[7], objArr31);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i21, mirror, -654680577, false, (String) objArr31[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr30);
                    try {
                        long jLongValue = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                            int mode = View.MeasureSpec.getMode(0) + 2267;
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 34;
                            Object[] objArr32 = new Object[1];
                            d((byte) ($$b + 1), (short) 121, $$a[7], objArr32);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, mode, modifierMetaStateMask, -874156483, false, (String) objArr32[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 2267;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 34;
                            Object[] objArr33 = new Object[1];
                            d((byte) ($$b + 1), (short) 210, $$a[7], objArr33);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, deadChar, iIndexOf, -887667012, false, (String) objArr33[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    str10 = str10;
                    objArr30 = objArr30;
                }
                objArr = objArr30;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i22 = ((int[]) objArr[3])[0];
        int i23 = ((int[]) objArr[0])[0];
        if (i23 == i22) {
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i27 = i24 + (((~((-815599314) | iIdentityHashCode3)) | 590401) * (-283)) + 975796798 + ((~(iIdentityHashCode3 | (-815008913))) * 283);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr2[2])[0] = i29 ^ (i29 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                for (String str11 : strArr3) {
                    arrayList.add(str11);
                }
            }
            Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            int i32 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int i33 = ~new Random().nextInt(401185803);
            int i34 = i30 + (((~((-30950037) | i33)) | 5767300) * (-241)) + 831195404 + (((~(i33 | (-25182737))) | 771995979) * 241);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr2[2])[0] = i36 ^ (i36 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
            Object[] objArr34 = new Object[1];
            d((byte) 37, (short) 158, $$a[7], objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iIndexOf2, threadPriority, 986134021, false, (String) objArr34[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char gidForName = (char) (Process.getGidForName("") + 29945);
                int i37 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                Object[] objArr35 = new Object[1];
                d((byte) ($$b + 1), (short) 210, $$a[7], objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName, i37, modifierMetaStateMask2, 1599039318, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr36[0])[0]}, new int[]{((int[]) objArr36[1])[0]}, (Object[]) objArr36[2], new int[1], (String[]) objArr36[4]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i38 = ~((-545612626) | (~iIdentityHashCode4));
            int i39 = (((((-870152024) | i38) | (~(545612625 | iIdentityHashCode4))) * (-338)) - 1841005559) + (((~(iIdentityHashCode4 | (-324539399))) | i38) * 338) + 416102581;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr3[3])[0] = i41 ^ (i41 << 5);
            objArr2 = objArr2;
        } else {
            int iIntValue = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr37 = {1530463315};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (42049 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1725, 'M' - AndroidCharacter.getMirror('0'), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr37), 416102581, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 1755;
                    int iGreen = Color.green(0) + 23;
                    Object[] objArr38 = new Object[1];
                    d((byte) ($$b + 1), (short) 210, $$a[7], objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(jumpTapTimeout, iIndexOf3, iGreen, 1599039318, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
                try {
                    long jLongValue2 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                        int iGreen2 = 1755 - Color.green(0);
                        int i42 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                        Object[] objArr39 = new Object[1];
                        d((byte) ($$b + 1), (short) 69, $$a[7], objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cCombineMeasuredStates, iGreen2, i42, 1596667560, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
                        int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Object[] objArr40 = new Object[1];
                        d((byte) 37, (short) 158, $$a[7], objArr40);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(minimumFlingVelocity, iNormalizeMetaState, scrollDefaultDelay, 986134021, false, (String) objArr40[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                    objArr3 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (((int[]) objArr3[0])[0] != ((int[]) objArr3[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[4];
            if (strArr5 != null) {
                int i43 = asInterface + 3;
                f825a = i43 % 128;
                int i44 = i43 % 2;
                for (String str12 : strArr5) {
                    arrayList2.add(str12);
                }
            }
            throw null;
        }
        int i45 = ((int[]) objArr3[3])[0];
        Object[] objArr41 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
        int iIdentityHashCode5 = System.identityHashCode(this);
        int i46 = ~iIdentityHashCode5;
        int i47 = i45 + 1218500761 + (((~((-479336) | i46)) | (~((-212123091) | iIdentityHashCode5))) * 217) + (((~(iIdentityHashCode5 | (-479336))) | 266306) * 217) + (((~((-212123091) | i46)) | 479335) * 217);
        int i48 = (i47 << 13) ^ i47;
        int i49 = i48 ^ (i48 >>> 17);
        ((int[]) objArr41[3])[0] = i49 ^ (i49 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char cKeyCodeFromString = (char) (37567 - KeyEvent.keyCodeFromString(""));
            int keyRepeatDelay = 625 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iIndexOf4 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            short s = bArr2[0];
            Object[] objArr42 = new Object[1];
            d(b2, s, (byte) (s - 3), objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, keyRepeatDelay, iIndexOf4, -477065106, false, (String) objArr42[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char offsetBefore = (char) (37567 - TextUtils.getOffsetBefore("", 0));
            int iRgb = Color.rgb(0, 0, 0) + 16777841;
            int longPressTimeout = 14 - (ViewConfiguration.getLongPressTimeout() >> 16);
            Object[] objArr43 = new Object[1];
            d((byte) ($$b + 1), (short) 121, $$a[7], objArr43);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetBefore, iRgb, longPressTimeout, -976899241, false, (String) objArr43[0], null);
        }
        if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) << 52) >>> 52)) >> 12)) {
            int i50 = asInterface + 51;
            f825a = i50 % 128;
            int i51 = i50 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37567);
                int mirror2 = 673 - AndroidCharacter.getMirror('0');
                int iResolveSize = 14 - View.resolveSize(0, 0);
                Object[] objArr44 = new Object[1];
                d((byte) ($$b + 1), (short) 210, $$a[7], objArr44);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatTimeout2, mirror2, iResolveSize, -973632554, false, (String) objArr44[0], null);
            }
            Object[] objArr45 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            int i52 = ((int[]) objArr45[2])[0];
            int i53 = ((int[]) objArr45[0])[0];
            String[] strArr6 = (String[]) objArr45[3];
            int[] iArr2 = {i52};
            int iMyUid = Process.myUid();
            int i54 = ~iMyUid;
            int i55 = 1514772952 + (((~((-221776402) | i54)) | (~(1295641169 | iMyUid))) * 520);
            int i56 = ~((-1295641170) | i54);
            int i57 = ~(iMyUid | 528096951);
            int i58 = i55 + ((i56 | i57) * (-1040)) + ((i57 | (~(i54 | (-528096952))) | 1073864768) * 520) + 1514954336;
            int i59 = (i58 << 13) ^ i58;
            int i60 = i59 ^ (i59 >>> 17);
            ((int[]) objArr4[1])[0] = i60 ^ (i60 << 5);
            objArr4 = new Object[]{new int[]{i53}, new int[1], iArr2, strArr6};
            i = 0;
            str = str10;
        } else {
            str = str10;
            Context applicationContext2 = (Context) Class.forName(str9).getMethod(str, new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : applicationContext2.getApplicationContext();
            }
            int iIntValue2 = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue();
            Object[] objArr46 = new Object[1];
            c((-681866386) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, (short) (KeyEvent.getMaxKeyCode() >> 16), (byte) (ViewConfiguration.getTapTimeout() >> 16), (-437376728) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr46);
            String str13 = (String) objArr46[0];
            Object[] objArr47 = new Object[1];
            c((-681866337) - (ViewConfiguration.getWindowTouchSlop() >> 8), 31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (byte) ExpandableListView.getPackedPositionGroup(0L), (-437376665) - (KeyEvent.getMaxKeyCode() >> 16), objArr47);
            Object[] objArr48 = {applicationContext2, new String[]{str13, (String) objArr47[0]}, Integer.valueOf(iIntValue2), 17, 1514954336};
            byte[] bArr3 = $$d;
            short s2 = bArr3[36];
            byte b3 = bArr3[99];
            int i61 = $$e;
            Object[] objArr49 = new Object[1];
            e(s2, b3, (byte) (i61 & 350), objArr49);
            Class<?> cls2 = Class.forName((String) objArr49[0]);
            Object[] objArr50 = new Object[1];
            e((short) (i61 & 898), bArr3[7], bArr3[43], objArr50);
            Object[] objArr51 = (Object[]) cls2.getMethod((String) objArr50[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr48);
            int i62 = ((int[]) objArr51[0])[0];
            int i63 = ((int[]) objArr51[2])[0];
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cArgb = (char) (37567 - Color.argb(0, 0, 0, 0));
                    int iIndexOf5 = TextUtils.indexOf("", "") + 625;
                    int i64 = 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    Object[] objArr52 = new Object[1];
                    d((byte) ($$b + 1), (short) 210, $$a[7], objArr52);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cArgb, iIndexOf5, i64, -973632554, false, (String) objArr52[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr51);
                try {
                    long jLongValue4 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cIndexOf = (char) (37567 - TextUtils.indexOf("", ""));
                        int iIndexOf6 = TextUtils.indexOf("", "", 0) + 625;
                        int keyRepeatDelay2 = 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        Object[] objArr53 = new Object[1];
                        d((byte) ($$b + 1), (short) 121, $$a[7], objArr53);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf, iIndexOf6, keyRepeatDelay2, -976899241, false, (String) objArr53[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char cArgb2 = (char) (Color.argb(0, 0, 0, 0) + 37567);
                        int absoluteGravity = 625 - Gravity.getAbsoluteGravity(0, 0);
                        int i65 = 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        short s3 = bArr4[0];
                        Object[] objArr54 = new Object[1];
                        d(b4, s3, (byte) (s3 - 3), objArr54);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cArgb2, absoluteGravity, i65, -477065106, false, (String) objArr54[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                objArr51 = objArr51;
                str = str;
            }
            objArr4 = objArr51;
            i = 0;
        }
        int i66 = ((int[]) objArr4[i])[i];
        int i67 = ((int[]) objArr4[2])[i];
        if (i67 != i66) {
            int i68 = i;
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr4[3];
            if (strArr7 != null) {
                for (int i69 = i68; i69 < strArr7.length; i69++) {
                    arrayList3.add(strArr7[i69]);
                }
            }
            throw new RuntimeException(String.valueOf(i67));
        }
        Object[] objArr55 = new Object[4];
        int[] iArr3 = new int[1];
        objArr55[i] = iArr3;
        objArr55[1] = new int[1];
        int[] iArr4 = new int[1];
        objArr55[2] = iArr4;
        int i70 = ((int[]) objArr4[1])[i];
        int i71 = ((int[]) objArr4[2])[i];
        int i72 = ((int[]) objArr4[i])[i];
        String[] strArr8 = (String[]) objArr4[3];
        iArr4[i] = i71;
        iArr3[i] = i72;
        int iIdentityHashCode6 = System.identityHashCode(this);
        int i73 = i70 + 723513704 + ((~((~iIdentityHashCode6) | 1542717182)) * (-116)) + ((416397978 | iIdentityHashCode6) * 116) + (((~(iIdentityHashCode6 | (-1407340143))) | 281020938) * 116);
        int i74 = (i73 << 13) ^ i73;
        int i75 = i74 ^ (i74 >>> 17);
        ((int[]) objArr55[1])[0] = i75 ^ (i75 << 5);
        objArr55[3] = strArr8;
        int i76 = asInterface + 45;
        f825a = i76 % 128;
        int i77 = i76 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char keyRepeatDelay3 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iIndexOf7 = 1031 - TextUtils.indexOf("", "");
            int iRed = Color.red(0) + 15;
            Object[] objArr56 = new Object[1];
            d((byte) ($$b + 1), (short) 121, $$a[7], objArr56);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(keyRepeatDelay3, iIndexOf7, iRed, 1357589585, false, (String) objArr56[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int i78 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr57 = new Object[1];
            d((byte) ($$b + 1), (short) 210, $$a[7], objArr57);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cResolveOpacity, i78, packedPositionGroup, 1344079056, false, (String) objArr57[0], null);
        }
        if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "");
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                int iIndexOf8 = 14 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr5 = $$a;
                byte b5 = bArr5[7];
                short s4 = bArr5[0];
                Object[] objArr58 = new Object[1];
                d(b5, s4, (byte) (s4 - 3), objArr58);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cIndexOf2, maximumDrawingCacheSize2, iIndexOf8, 632103528, false, (String) objArr58[0], null);
            }
            Object[] objArr59 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            objArr5 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i79 = ((int[]) objArr59[3])[0];
            int i80 = ((int[]) objArr59[1])[0];
            String[] strArr9 = (String[]) objArr59[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i81 = ((((~(805975360 | elapsedCpuTime)) | (-244553195)) * 262) - 71525775) + (((~((~elapsedCpuTime) | 805975360)) | (-244553195)) * 262) + 1554138134;
            int i82 = (i81 << 13) ^ i81;
            int i83 = i82 ^ (i82 >>> 17);
            ((int[]) objArr5[2])[0] = i83 ^ (i83 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue();
            Object[] objArr60 = {1530463315};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46038), 1133 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr61 = {Integer.valueOf(iIntValue3), 0, 1554138134, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).newInstance(objArr60), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 15;
                Object[] objArr62 = new Object[1];
                d((byte) ($$b + 1), (short) 121, $$a[7], objArr62);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cIndexOf3, touchSlop2, packedPositionGroup2, 1298546779, false, (String) objArr62[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1117, 16 - ((byte) KeyEvent.getModifierMetaStateMask())), Boolean.TYPE});
            }
            objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr61);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int i84 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int touchSlop4 = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                byte[] bArr6 = $$a;
                byte b6 = bArr6[7];
                short s5 = bArr6[0];
                Object[] objArr63 = new Object[1];
                d(b6, s5, (byte) (s5 - 3), objArr63);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(touchSlop3, i84, touchSlop4, 632103528, false, (String) objArr63[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr5);
            try {
                long jLongValue6 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                    int iRed2 = 15 - Color.red(0);
                    Object[] objArr64 = new Object[1];
                    d((byte) ($$b + 1), (short) 210, $$a[7], objArr64);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(trimmedLength, doubleTapTimeout, iRed2, 1344079056, false, (String) objArr64[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int iGreen3 = Color.green(0) + 1031;
                    int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 15;
                    Object[] objArr65 = new Object[1];
                    d((byte) ($$b + 1), (short) 121, $$a[7], objArr65);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c4, iGreen3, packedPositionGroup3, 1357589585, false, (String) objArr65[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf8);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i85 = ((int[]) objArr5[1])[0];
        int i86 = ((int[]) objArr5[3])[0];
        if (i86 == i85) {
            objArr6 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i87 = ((int[]) objArr5[2])[0];
            int i88 = ((int[]) objArr5[3])[0];
            int i89 = ((int[]) objArr5[1])[0];
            String[] strArr10 = (String[]) objArr5[0];
            int iNextInt = new Random().nextInt();
            int i90 = i87 + (-1330492805) + (((~((~iNextInt) | 422586162)) | 646942860) * 446) + (((~(iNextInt | 1069529022)) | 19923472) * 446) + 773706728;
            int i91 = (i90 << 13) ^ i90;
            int i92 = i91 ^ (i91 >>> 17);
            ((int[]) objArr6[2])[0] = i92 ^ (i92 << 5);
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr11 = (String[]) objArr5[0];
            if (strArr11 != null) {
                for (String str14 : strArr11) {
                    arrayList4.add(str14);
                }
            }
            Toast.makeText((Context) null, i86 / (((i86 - 1) * i86) % 2), 0).show();
            objArr6 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i93 = ((int[]) objArr5[2])[0];
            int i94 = ((int[]) objArr5[3])[0];
            int i95 = ((int[]) objArr5[1])[0];
            String[] strArr12 = (String[]) objArr5[0];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i96 = ~iIdentityHashCode7;
            int i97 = (~((-917414547) | i96)) | 379617426;
            int i98 = ~(iIdentityHashCode7 | (-135337257));
            int i99 = i93 + 1833666997 + ((i97 | i98) * (-502)) + ((i98 | (~(i96 | (-537797121)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i100 = (i99 << 13) ^ i99;
            int i101 = i100 ^ (i100 >>> 17);
            ((int[]) objArr6[2])[0] = i101 ^ (i101 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char maximumDrawingCacheSize3 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 10;
            Object[] objArr66 = new Object[1];
            d((byte) 37, (short) 158, $$a[7], objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(maximumDrawingCacheSize3, fadingEdgeLength, absoluteGravity2, -1650998592, false, (String) objArr66[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int iIndexOf9 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            Object[] objArr67 = new Object[1];
            d((byte) ($$b + 1), (short) 210, $$a[7], objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cResolveSizeAndState, packedPositionGroup4, iIndexOf9, 2012020043, false, (String) objArr67[0], null);
        }
        if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int mode2 = View.MeasureSpec.getMode(0) + 876;
                int scrollDefaultDelay2 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr68 = new Object[1];
                d((byte) ($$b + 1), (short) 121, $$a[7], objArr68);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cIndexOf4, mode2, scrollDefaultDelay2, 2012931276, false, (String) objArr68[0], null);
            }
            Object[] objArr69 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr69[0])[0]}, new int[1], new int[]{((int[]) objArr69[2])[0]}, (String[]) objArr69[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i102 = ~iIdentityHashCode8;
            int i103 = 1416071028 + ((iIdentityHashCode8 | 580951642) * (-859)) + (((~(iIdentityHashCode8 | (-41948763))) | (~(580951642 | i102))) * 859) + (((~(540641413 | i102)) | (-582590176)) * 859) + 191100802;
            int i104 = (i103 << 13) ^ i103;
            int i105 = i104 ^ (i104 >>> 17);
            ((int[]) objArr7[1])[0] = i105 ^ (i105 << 5);
            str2 = str;
        } else {
            str2 = str;
            Context applicationContext3 = (Context) Class.forName(str9).getMethod(str2, new Class[0]).invoke(null, null);
            if (applicationContext3 != null) {
                applicationContext3 = ((applicationContext3 instanceof ContextWrapper) && ((ContextWrapper) applicationContext3).getBaseContext() == null) ? null : applicationContext3.getApplicationContext();
            }
            Object[] objArr70 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue()), 0, 191100802};
            int i106 = $$e;
            byte[] bArr7 = $$d;
            Object[] objArr71 = new Object[1];
            e((short) (i106 & 950), bArr7[99], bArr7[31], objArr71);
            Class<?> cls3 = Class.forName((String) objArr71[0]);
            Object[] objArr72 = new Object[1];
            e((short) (i106 & 898), bArr7[7], bArr7[43], objArr72);
            Object[] objArr73 = (Object[]) cls3.getMethod((String) objArr72[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr70);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char c5 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
                    int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                    Object[] objArr74 = new Object[1];
                    d((byte) ($$b + 1), (short) 121, $$a[7], objArr74);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c5, iLastIndexOf2, iKeyCodeFromString, 2012931276, false, (String) objArr74[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr73);
                try {
                    long jLongValue8 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int i107 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int defaultSize = View.getDefaultSize(0, 0) + 10;
                        Object[] objArr75 = new Object[1];
                        d((byte) ($$b + 1), (short) 210, $$a[7], objArr75);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(edgeSlop, i107, defaultSize, 2012020043, false, (String) objArr75[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int iResolveSize2 = View.resolveSize(0, 0) + 876;
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                        Object[] objArr76 = new Object[1];
                        d((byte) 37, (short) 158, $$a[7], objArr76);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cResolveSize, iResolveSize2, scrollBarFadeDuration, -1650998592, false, (String) objArr76[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr73 = objArr73;
            }
            objArr7 = objArr73;
        }
        int i108 = ((int[]) objArr7[2])[0];
        int i109 = ((int[]) objArr7[0])[0];
        if (i109 == i108) {
            int i110 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i111 = ~iIdentityHashCode9;
            int i112 = i110 + (-1260175431) + (((~((-869735696) | i111)) | (-829425467)) * (-602)) + (((~(iIdentityHashCode9 | (-869735696))) | 42407941 | (~((-2097713) | i111))) * (-301)) + ((~(i111 | (-829425467))) * 301);
            int i113 = (i112 << 13) ^ i112;
            int i114 = i113 ^ (i113 >>> 17);
            ((int[]) objArr8[1])[0] = i114 ^ (i114 << 5);
        } else {
            int[] iArr5 = new int[i109];
            int i115 = i109 - 1;
            iArr5[i115] = 1;
            Toast.makeText((Context) null, iArr5[((i109 * i115) % 2) - 1], 1).show();
            int i116 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i117 = (~(228722337 | startElapsedRealtime)) | 269031510;
            int i118 = ~startElapsedRealtime;
            int i119 = i116 + 809175880 + ((i117 | (~((-228721282) | i118))) * 886) + (((~(i118 | (-228722338))) | 269032566) * (-1772)) + ((~(i118 | 269032566)) * 886);
            int i120 = (i119 << 13) ^ i119;
            int i121 = i120 ^ (i120 >>> 17);
            ((int[]) objArr8[1])[0] = i121 ^ (i121 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int doubleTapTimeout2 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iKeyCodeFromString2 = 10 - KeyEvent.keyCodeFromString("");
            byte[] bArr8 = $$a;
            Object[] objArr77 = new Object[1];
            d(bArr8[9], bArr8[0], bArr8[205], objArr77);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(maxKeyCode, doubleTapTimeout2, iKeyCodeFromString2, -1199417970, false, (String) objArr77[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
            byte[] bArr9 = $$a;
            Object[] objArr78 = new Object[1];
            d(bArr9[7], bArr9[41], bArr9[33], objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(edgeSlop2, iCombineMeasuredStates, minimumFlingVelocity2, 254769921, false, (String) objArr78[0], null);
        }
        if (j4 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) << 52) >>> 52)) >> 12)) {
            int i122 = f825a + 39;
            asInterface = i122 % 128;
            int i123 = i122 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char keyRepeatTimeout3 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int doubleTapTimeout3 = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 10;
                byte[] bArr10 = $$a;
                byte b7 = bArr10[41];
                Object[] objArr79 = new Object[1];
                d(b7, b7, bArr10[205], objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(keyRepeatTimeout3, doubleTapTimeout3, offsetBefore2, 1324201839, false, (String) objArr79[0], null);
            }
            Object[] objArr80 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr80[0])[0]}, new int[1], new int[]{((int[]) objArr80[2])[0]}, (String[]) objArr80[3]};
            int i124 = (int) Runtime.getRuntime().totalMemory();
            int i125 = 588278440 + ((i124 | 154483815) * (-50));
            int i126 = ~((-154212454) | i124);
            int i127 = ~i124;
            int i128 = i125 + ((i126 | (~(268386039 | i127))) * 50) + (((~(i127 | 154483815)) | (~(114173586 | i127)) | (-268386040)) * 50) + 435912510;
            int i129 = (i128 << 13) ^ i128;
            int i130 = i129 ^ (i129 >>> 17);
            ((int[]) objArr9[1])[0] = i130 ^ (i130 << 5);
        } else {
            Object[] objArr81 = {Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue()), 435912510};
            short s6 = (short) ($$e & 988);
            byte[] bArr11 = $$d;
            byte b8 = bArr11[99];
            Object[] objArr82 = new Object[1];
            e(s6, b8, (byte) (b8 | 32), objArr82);
            Class<?> cls4 = Class.forName((String) objArr82[0]);
            Object[] objArr83 = new Object[1];
            e((short) 267, bArr11[7], bArr11[43], objArr83);
            objArr9 = (Object[]) cls4.getMethod((String) objArr83[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr81);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                char c6 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int maximumDrawingCacheSize4 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                int i131 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                byte[] bArr12 = $$a;
                byte b9 = bArr12[41];
                Object[] objArr84 = new Object[1];
                d(b9, b9, bArr12[205], objArr84);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c6, maximumDrawingCacheSize4, i131, 1324201839, false, (String) objArr84[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr9);
            try {
                long jLongValue10 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char cResolveSize2 = (char) View.resolveSize(0, 0);
                    int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                    int i132 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                    byte[] bArr13 = $$a;
                    Object[] objArr85 = new Object[1];
                    d(bArr13[7], bArr13[41], bArr13[33], objArr85);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cResolveSize2, iResolveOpacity, i132, 254769921, false, (String) objArr85[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char cIndexOf5 = (char) TextUtils.indexOf("", "", 0);
                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 876;
                    int fadingEdgeLength2 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr14 = $$a;
                    Object[] objArr86 = new Object[1];
                    d(bArr14[9], bArr14[0], bArr14[205], objArr86);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cIndexOf5, absoluteGravity3, fadingEdgeLength2, -1199417970, false, (String) objArr86[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i133 = ((int[]) objArr9[2])[0];
        int i134 = ((int[]) objArr9[0])[0];
        if (i134 != i133) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr13 = (String[]) objArr9[3];
            if (strArr13 != null) {
                int i135 = f825a + 107;
                asInterface = i135 % 128;
                for (int i136 = i135 % 2 != 0 ? 0 : 1; i136 < strArr13.length; i136++) {
                    arrayList5.add(strArr13[i136]);
                }
            }
            throw new RuntimeException(String.valueOf(i134));
        }
        int i137 = ((int[]) objArr9[1])[0];
        Object[] objArr87 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
        int iIdentityHashCode10 = System.identityHashCode(this);
        int i138 = i137 + 926133806 + ((~((~iIdentityHashCode10) | (-16979337))) * 433) + (((~(53215192 | iIdentityHashCode10)) | (-93525422)) * (-433)) + (((~(iIdentityHashCode10 | (-93525422))) | 36235856) * 433);
        int i139 = (i138 << 13) ^ i138;
        int i140 = i139 ^ (i139 >>> 17);
        ((int[]) objArr87[1])[0] = i140 ^ (i140 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char c7 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i141 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int iNormalizeMetaState2 = 10 - KeyEvent.normalizeMetaState(0);
            byte[] bArr15 = $$a;
            byte b10 = bArr15[7];
            short s7 = bArr15[0];
            Object[] objArr88 = new Object[1];
            d(b10, s7, (byte) (s7 - 3), objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c7, i141, iNormalizeMetaState2, 252381699, false, (String) objArr88[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
            char c8 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int minimumFlingVelocity3 = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iRed3 = 10 - Color.red(0);
            Object[] objArr89 = new Object[1];
            d((byte) ($$b + 1), (short) 69, $$a[7], objArr89);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c8, minimumFlingVelocity3, iRed3, 2009631821, false, (String) objArr89[0], null);
        }
        if (j5 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char c9 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                int i142 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr16 = $$a;
                byte b11 = bArr16[7];
                Object[] objArr90 = new Object[1];
                d(b11, b11, bArr16[54], objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c9, edgeSlop3, i142, 256017550, false, (String) objArr90[0], null);
            }
            Object[] objArr91 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr91[0])[0]}, new int[1], new int[]{((int[]) objArr91[2])[0]}, (String[]) objArr91[3]};
            int iMyTid = Process.myTid();
            int i143 = 246928964 + ((~(iMyTid | 438199663)) * 216);
            int i144 = ~iMyTid;
            int i145 = i143 + ((532639743 | i144) * (-216)) + (((~(i144 | 438199663)) | (-397889435)) * 216) + 886467344;
            int i146 = (i145 << 13) ^ i145;
            int i147 = i146 ^ (i146 >>> 17);
            ((int[]) objArr10[1])[0] = i147 ^ (i147 << 5);
            str3 = str2;
        } else {
            Context applicationContext4 = (Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null);
            if (applicationContext4 != null) {
                if ((applicationContext4 instanceof ContextWrapper) && ((ContextWrapper) applicationContext4).getBaseContext() == null) {
                    str3 = str2;
                    applicationContext4 = null;
                } else {
                    str3 = str2;
                    str3 = str2;
                    applicationContext4 = applicationContext4.getApplicationContext();
                }
            }
            str3 = str2;
            Object[] objArr92 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, this)).intValue()), 886467344};
            byte[] bArr17 = $$d;
            Object[] objArr93 = new Object[1];
            e((short) 319, bArr17[59], bArr17[24], objArr93);
            Class<?> cls5 = Class.forName((String) objArr93[0]);
            Object[] objArr94 = new Object[1];
            e((short) 337, bArr17[7], bArr17[43], objArr94);
            Object[] objArr95 = (Object[]) cls5.getMethod((String) objArr94[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr92);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char minimumFlingVelocity4 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int packedPositionGroup5 = 876 - ExpandableListView.getPackedPositionGroup(0L);
                    int i148 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte[] bArr18 = $$a;
                    byte b12 = bArr18[7];
                    Object[] objArr96 = new Object[1];
                    d(b12, b12, bArr18[54], objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(minimumFlingVelocity4, packedPositionGroup5, i148, 256017550, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr95);
                try {
                    long jLongValue12 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int iIndexOf10 = 876 - TextUtils.indexOf("", "", 0, 0);
                        int doubleTapTimeout4 = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        Object[] objArr97 = new Object[1];
                        d((byte) ($$b + 1), (short) 69, $$a[7], objArr97);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(packedPositionType, iIndexOf10, doubleTapTimeout4, 2009631821, false, (String) objArr97[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char c10 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int maxKeyCode2 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                        int i149 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                        byte[] bArr19 = $$a;
                        byte b13 = bArr19[7];
                        short s8 = bArr19[0];
                        Object[] objArr98 = new Object[1];
                        d(b13, s8, (byte) (s8 - 3), objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c10, maxKeyCode2, i149, 252381699, false, (String) objArr98[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf14);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr95 = objArr95;
            }
            objArr10 = objArr95;
        }
        int i150 = ((int[]) objArr10[2])[0];
        int i151 = ((int[]) objArr10[0])[0];
        if (i151 == i150) {
            int i152 = asInterface + 45;
            f825a = i152 % 128;
            int i153 = i152 % 2;
            int i154 = ((int[]) objArr10[1])[0];
            objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int iMyUid2 = Process.myUid();
            int i155 = ~iMyUid2;
            int i156 = (-868597916) + (((~((-840217230) | i155)) | 269492741 | (~(799907000 | i155)) | (~((-229182513) | iMyUid2))) * (-84));
            int i157 = (~(iMyUid2 | 799907000)) | 840217229;
            int i158 = ~(i155 | (-799907001));
            int i159 = i154 + i156 + ((i157 | i158) * (-84)) + ((229182512 | i158) * 84);
            int i160 = i159 ^ (i159 << 13);
            int i161 = i160 ^ (i160 >>> 17);
            ((int[]) objArr11[1])[0] = i161 ^ (i161 << 5);
            i2 = 0;
        } else {
            int[] iArr6 = new int[i151];
            int i162 = i151 - 1;
            iArr6[i162] = 1;
            Toast.makeText((Context) null, iArr6[((i151 * i162) % 2) - 1], 1).show();
            int i163 = ((int[]) objArr10[1])[0];
            objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int i164 = ~System.identityHashCode(this);
            int i165 = i163 + (((1213162868 + (((~(i164 | 49228523)) | (~((-4587649) | i164))) * (-184))) + (((42475552 | (~((-47063201) | i164))) | (~(6752971 | i164))) * 184)) - 398419616);
            int i166 = (i165 << 13) ^ i165;
            int i167 = i166 ^ (i166 >>> 17);
            i2 = 0;
            ((int[]) objArr11[1])[0] = i167 ^ (i167 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iCombineMeasuredStates2 = View.combineMeasuredStates(i2, i2) + 651;
            int absoluteGravity4 = 44 - Gravity.getAbsoluteGravity(i2, i2);
            Object[] objArr99 = new Object[1];
            d((byte) ($$b + 1), (short) 69, $$a[7], objArr99);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(pressedStateDuration, iCombineMeasuredStates2, absoluteGravity4, -459846511, false, (String) objArr99[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char doubleTapTimeout5 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int size = View.MeasureSpec.getSize(0) + 651;
            int iGreen4 = 44 - Color.green(0);
            byte[] bArr20 = $$a;
            byte b14 = bArr20[7];
            short s9 = bArr20[0];
            Object[] objArr100 = new Object[1];
            d(b14, s9, (byte) (s9 - 3), objArr100);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(doubleTapTimeout5, size, iGreen4, -873460649, false, (String) objArr100[0], null);
        }
        if (j6 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int i168 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                Object[] objArr101 = new Object[1];
                d((byte) 37, (short) 158, $$a[7], objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cMyPid, i168, jumpTapTimeout2, -1595579076, false, (String) objArr101[0], null);
            }
            Object[] objArr102 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr12 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i169 = ((int[]) objArr102[2])[0];
            int i170 = ((int[]) objArr102[0])[0];
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i171 = ~((-3670427) | iIdentityHashCode11);
            int i172 = ~iIdentityHashCode11;
            int i173 = 1142053825 + ((i171 | (~(771469307 | i172))) * 920) + (((~((-771229692) | i172)) | 3670426) * 920) + (((~(iIdentityHashCode11 | 771469307)) | (~((-3670427) | i172)) | (~((-767559266) | iIdentityHashCode11))) * 920) + 1224813743;
            int i174 = (i173 << 13) ^ i173;
            int i175 = i174 ^ (i174 >>> 17);
            ((int[]) objArr12[3])[0] = i175 ^ (i175 << 5);
            i3 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 1610 - Drawable.resolveOpacity(0, 0), 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr103 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).newInstance(null), 1224813743, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char cAlpha = (char) Color.alpha(0);
                int doubleTapTimeout6 = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i176 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44;
                byte[] bArr21 = $$a;
                byte b15 = bArr21[7];
                short s10 = bArr21[0];
                Object[] objArr104 = new Object[1];
                d(b15, s10, (byte) (s10 - 3), objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cAlpha, doubleTapTimeout6, i176, 2075921419, false, (String) objArr104[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), View.resolveSize(0, 0) + 695, (Process.myTid() >> 22) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myTid() >> 22) + 63406), TextUtils.indexOf("", "", 0, 0) + 793, 82 - TextUtils.lastIndexOf("", '0')), Integer.TYPE, Integer.TYPE});
            }
            Object[] objArr105 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).invoke(null, objArr103);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char cRed = (char) Color.red(0);
                int mode3 = 651 - View.MeasureSpec.getMode(0);
                int mode4 = 44 - View.MeasureSpec.getMode(0);
                Object[] objArr106 = new Object[1];
                d((byte) 37, (short) 158, $$a[7], objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cRed, mode3, mode4, -1595579076, false, (String) objArr106[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArr105);
            try {
                long jLongValue14 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int iResolveSizeAndState = 651 - View.resolveSizeAndState(0, 0, 0);
                    int i177 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte[] bArr22 = $$a;
                    byte b16 = bArr22[7];
                    short s11 = bArr22[0];
                    Object[] objArr107 = new Object[1];
                    d(b16, s11, (byte) (s11 - 3), objArr107);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(offsetAfter, iResolveSizeAndState, i177, -873460649, false, (String) objArr107[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iAxisFromString = 650 - MotionEvent.axisFromString("");
                    int iIndexOf11 = TextUtils.indexOf("", "", 0) + 44;
                    Object[] objArr108 = new Object[1];
                    d((byte) ($$b + 1), (short) 69, $$a[7], objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(jumpTapTimeout3, iAxisFromString, iIndexOf11, -459846511, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf16);
                objArr12 = objArr105;
                i3 = 0;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr12[2])[i3] != ((int[]) objArr12[i3])[i3]) {
            int i178 = i3;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr14 = (String[]) objArr12[1];
            if (strArr14 != null) {
                int i179 = f825a + 43;
                asInterface = i179 % 128;
                for (int i180 = i179 % 2 == 0 ? 1 : i178; i180 < strArr14.length; i180++) {
                    int i181 = asInterface + 107;
                    f825a = i181 % 128;
                    int i182 = i181 % 2;
                    arrayList6.add(strArr14[i180]);
                }
            }
            throw null;
        }
        Object[] objArr109 = new Object[4];
        int[] iArr7 = new int[1];
        objArr109[i3] = iArr7;
        int[] iArr8 = new int[1];
        objArr109[2] = iArr8;
        objArr109[3] = new int[1];
        int i183 = ((int[]) objArr12[3])[i3];
        int i184 = ((int[]) objArr12[2])[i3];
        int i185 = ((int[]) objArr12[i3])[i3];
        iArr8[i3] = i184;
        iArr7[i3] = i185;
        objArr109[1] = new String[i3];
        int i186 = ~((~System.identityHashCode(this)) | (-39436819));
        int i187 = i183 + (((-48225215) | i186) * (-970)) + 534802987 + ((i186 | 8788396) * 970);
        int i188 = (i187 << 13) ^ i187;
        int i189 = i188 ^ (i188 >>> 17);
        ((int[]) objArr109[3])[0] = i189 ^ (i189 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char c11 = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int iIndexOf12 = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
            byte[] bArr23 = $$a;
            byte b17 = bArr23[7];
            short s12 = bArr23[0];
            Object[] objArr110 = new Object[1];
            d(b17, s12, (byte) (s12 - 3), objArr110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c11, maximumFlingVelocity, iIndexOf12, -1048449946, false, (String) objArr110[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                int iResolveSize3 = View.resolveSize(0, 0) + 921;
                int keyRepeatTimeout4 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                Object[] objArr111 = new Object[1];
                d((byte) 37, (short) 158, $$a[7], objArr111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cLastIndexOf, iResolveSize3, keyRepeatTimeout4, -1142834547, false, (String) objArr111[0], null);
            }
            Object[] objArr112 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
            objArr13 = new Object[]{new int[1], new int[]{((int[]) objArr112[1])[0]}, (Object[]) objArr112[2], new int[]{((int[]) objArr112[3])[0]}, (String[]) objArr112[4]};
            int iMyPid2 = Process.myPid();
            int i190 = ((808541329 + (((~((~iMyPid2) | (-1097679796))) | 4260512) * 446)) + (((~(iMyPid2 | (-1093419284))) | 672139336) * 446)) - 1051650221;
            int i191 = (i190 << 13) ^ i190;
            int i192 = i191 ^ (i191 >>> 17);
            ((int[]) objArr13[0])[0] = i192 ^ (i192 << 5);
            objArr109 = objArr109;
            str4 = str8;
        } else {
            Context applicationContext5 = (Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null);
            if (applicationContext5 != null) {
                applicationContext5 = ((applicationContext5 instanceof ContextWrapper) && ((ContextWrapper) applicationContext5).getBaseContext() == null) ? null : applicationContext5.getApplicationContext();
            }
            str4 = str8;
            Object[] objArr113 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 1343128723};
            byte[] bArr24 = $$d;
            Object[] objArr114 = new Object[1];
            e((short) 389, bArr24[99], bArr24[474], objArr114);
            Class<?> cls6 = Class.forName((String) objArr114[0]);
            Object[] objArr115 = new Object[1];
            e((short) 337, bArr24[7], bArr24[43], objArr115);
            Object[] objArr116 = (Object[]) cls6.getMethod((String) objArr115[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr113);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char cBlue = (char) (31533 - Color.blue(0));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
                int minimumFlingVelocity5 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr117 = new Object[1];
                d((byte) 37, (short) 158, $$a[7], objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cBlue, iMakeMeasureSpec, minimumFlingVelocity5, -1142834547, false, (String) objArr117[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr116);
            try {
                long jLongValue15 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char maxKeyCode3 = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                    int keyRepeatDelay4 = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
                    Object[] objArr118 = new Object[1];
                    d((byte) ($$b + 1), (short) 210, $$a[7], objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(maxKeyCode3, keyRepeatDelay4, bitsPerPixel, -778300370, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                    int gidForName2 = Process.getGidForName("") + 922;
                    int keyRepeatTimeout5 = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr25 = $$a;
                    byte b18 = bArr25[7];
                    short s13 = bArr25[0];
                    Object[] objArr119 = new Object[1];
                    d(b18, s13, (byte) (s13 - 3), objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(packedPositionChild, gidForName2, keyRepeatTimeout5, -1048449946, false, (String) objArr119[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf18);
                objArr13 = objArr116;
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr13[3])[0] != ((int[]) objArr13[1])[0]) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr15 = (String[]) objArr13[4];
            if (strArr15 != null) {
                for (String str15 : strArr15) {
                    arrayList7.add(str15);
                }
            }
            throw null;
        }
        int i193 = asInterface + 85;
        f825a = i193 % 128;
        int i194 = i193 % 2;
        int i195 = ((int[]) objArr13[0])[0];
        Object[] objArr120 = {new int[1], new int[]{((int[]) objArr13[1])[0]}, (Object[]) objArr13[2], new int[]{((int[]) objArr13[3])[0]}, (String[]) objArr13[4]};
        int iIdentityHashCode12 = System.identityHashCode(this);
        int i196 = ~iIdentityHashCode12;
        int i197 = i195 + (-548430903) + (((~(i196 | 1595564233)) | (-1606151644) | (~((-167928001) | iIdentityHashCode12))) * 717) + (((~(iIdentityHashCode12 | 1595564233)) | (~(i196 | (-167928001))) | (-1606151644)) * 717);
        int i198 = (i197 << 13) ^ i197;
        int i199 = i198 ^ (i198 >>> 17);
        ((int[]) objArr120[0])[0] = i199 ^ (i199 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char scrollDefaultDelay3 = (char) (53893 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            int i200 = 1320 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int pressedStateDuration2 = 36 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr26 = $$a;
            byte b19 = bArr26[7];
            short s14 = bArr26[0];
            Object[] objArr121 = new Object[1];
            d(b19, s14, (byte) (s14 - 3), objArr121);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(scrollDefaultDelay3, i200, pressedStateDuration2, -1433084963, false, (String) objArr121[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cResolveSizeAndState2 = (char) (53893 - View.resolveSizeAndState(0, 0, 0));
                int defaultSize2 = 1320 - View.getDefaultSize(0, 0);
                int i201 = 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr122 = new Object[1];
                d((byte) ($$b + 1), (short) 210, $$a[7], objArr122);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cResolveSizeAndState2, defaultSize2, i201, -1920778747, false, (String) objArr122[0], null);
            }
            Object[] objArr123 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr14 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i202 = ((int[]) objArr123[0])[0];
            int i203 = ((int[]) objArr123[3])[0];
            String[] strArr16 = (String[]) objArr123[2];
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i204 = 559254896 + (((~((-1100100653) | iIdentityHashCode13)) | 1187844) * 104) + ((~((~iIdentityHashCode13) | 1369439980)) * (-104)) + ((iIdentityHashCode13 | 270527172) * 104) + 713527372;
            int i205 = (i204 << 13) ^ i204;
            int i206 = i205 ^ (i205 >>> 17);
            ((int[]) objArr14[1])[0] = i206 ^ (i206 << 5);
        } else {
            Context applicationContext6 = (Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null);
            if (applicationContext6 == null) {
                obj = null;
            } else {
                if (applicationContext6 instanceof ContextWrapper) {
                    int i207 = f825a + 61;
                    asInterface = i207 % 128;
                    if (i207 % 2 == 0) {
                        ((ContextWrapper) applicationContext6).getBaseContext();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext6).getBaseContext() == null) {
                        applicationContext6 = null;
                        obj = null;
                    }
                }
                obj = null;
                applicationContext6 = applicationContext6.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str7).getMethod(str4, Object.class).invoke(obj, this)).intValue();
            Object[] objArr124 = {1530463315};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 47977), 1299 - ImageFormat.getBitsPerPixel(0), 20 - Color.red(0), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr125 = {applicationContext6, "com.bpjstku", 713527372, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).newInstance(objArr124), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53893);
                int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 1320;
                int jumpTapTimeout4 = 36 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr126 = new Object[1];
                d((byte) ($$b + 1), (short) 210, $$a[7], objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(scrollBarSize, iNormalizeMetaState3, jumpTapTimeout4, 819724799, false, (String) objArr126[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57877 - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1393, 76 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Boolean.TYPE});
            }
            Object[] objArr127 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).invoke(null, objArr125);
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char absoluteGravity5 = (char) (Gravity.getAbsoluteGravity(0, 0) + 53893);
                    int offsetAfter2 = 1320 - TextUtils.getOffsetAfter("", 0);
                    int fadingEdgeLength3 = 36 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr128 = new Object[1];
                    d((byte) ($$b + 1), (short) 210, $$a[7], objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(absoluteGravity5, offsetAfter2, fadingEdgeLength3, -1920778747, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr127);
                try {
                    long jLongValue16 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char gidForName3 = (char) (Process.getGidForName("") + 53894);
                        int iIndexOf13 = TextUtils.indexOf("", "") + 1320;
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 37;
                        Object[] objArr129 = new Object[1];
                        d((byte) 37, (short) 158, $$a[7], objArr129);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(gidForName3, iIndexOf13, iLastIndexOf3, -1273706634, false, (String) objArr129[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                        char c12 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 53893);
                        int offsetBefore3 = 1320 - TextUtils.getOffsetBefore("", 0);
                        int gidForName4 = Process.getGidForName("") + 37;
                        byte[] bArr27 = $$a;
                        byte b20 = bArr27[7];
                        short s15 = bArr27[0];
                        Object[] objArr130 = new Object[1];
                        d(b20, s15, (byte) (s15 - 3), objArr130);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(c12, offsetBefore3, gidForName4, -1433084963, false, (String) objArr130[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } else {
                objArr127 = objArr127;
            }
            objArr14 = objArr127;
        }
        int i208 = ((int[]) objArr14[3])[0];
        int i209 = ((int[]) objArr14[0])[0];
        if (i209 == i208) {
            objArr15 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i210 = ((int[]) objArr14[1])[0];
            int i211 = ((int[]) objArr14[0])[0];
            int i212 = ((int[]) objArr14[3])[0];
            String[] strArr17 = (String[]) objArr14[2];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i213 = ~((-347619586) | iFreeMemory);
            int i214 = ~iFreeMemory;
            int i215 = i210 + (-1181552528) + ((i213 | (~((-134223011) | i214))) * 920) + (((~((-888785230) | i214)) | 347619585) * 920) + (((~(iFreeMemory | (-134223011))) | (~((-347619586) | i214)) | (~((-541165645) | iFreeMemory))) * 920);
            int i216 = (i215 << 13) ^ i215;
            int i217 = i216 ^ (i216 >>> 17);
            i4 = 0;
            ((int[]) objArr15[1])[0] = i217 ^ (i217 << 5);
        } else {
            Toast.makeText((Context) null, i209 / (((i209 - 1) * i209) % 2), 0).show();
            objArr15 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i218 = ((int[]) objArr14[1])[0];
            int i219 = ((int[]) objArr14[0])[0];
            int i220 = ((int[]) objArr14[3])[0];
            String[] strArr18 = (String[]) objArr14[2];
            int i221 = ~((int) Runtime.getRuntime().totalMemory());
            int i222 = i218 + (-778668592) + (((~(i221 | 931751861)) | (-1068103616)) * (-160)) + (((~(i221 | (-438875964))) | 931751861) * 160);
            int i223 = i222 ^ (i222 << 13);
            int i224 = i223 ^ (i223 >>> 17);
            i4 = 0;
            ((int[]) objArr15[1])[0] = i224 ^ (i224 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char cResolveSizeAndState3 = (char) (43042 - View.resolveSizeAndState(i4, i4, i4));
            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', i4, i4) + 3112;
            int i225 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
            Object[] objArr131 = new Object[1];
            d((byte) ($$b + 1), (short) 121, $$a[7], objArr131);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cResolveSizeAndState3, iLastIndexOf4, i225, -1272852037, false, (String) objArr131[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cKeyCodeFromString2 = (char) (KeyEvent.keyCodeFromString("") + 43042);
                int i226 = 3111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int pressedStateDuration3 = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                Object[] objArr132 = new Object[1];
                d((byte) 37, (short) 158, $$a[7], objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cKeyCodeFromString2, i226, pressedStateDuration3, 154975793, false, (String) objArr132[0], null);
            }
            Object[] objArr133 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            int i227 = ((int[]) objArr133[2])[0];
            int i228 = ((int[]) objArr133[1])[0];
            String[] strArr19 = (String[]) objArr133[3];
            int[] iArr9 = {i228};
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i229 = ~iIdentityHashCode14;
            int i230 = ((((-1272411950) + (((~((-1140515581) | i229)) | 27312164) * 168)) + ((~((-27312165) | iIdentityHashCode14)) * 168)) + (((~(iIdentityHashCode14 | (-1113203417))) | ((~(i229 | (-564515879))) | 537203714)) * 168)) - 356004399;
            int i231 = (i230 << 13) ^ i230;
            int i232 = i231 ^ (i231 >>> 17);
            ((int[]) objArr16[0])[0] = i232 ^ (i232 << 5);
            objArr16 = new Object[]{new int[1], iArr9, new int[]{i227}, strArr19};
        } else {
            Object[] objArr134 = {null, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, -356004399};
            short s16 = (short) TypedValues.CycleType.TYPE_WAVE_OFFSET;
            byte[] bArr28 = $$d;
            Object[] objArr135 = new Object[1];
            e(s16, bArr28[99], (byte) (-bArr28[498]), objArr135);
            Class<?> cls7 = Class.forName((String) objArr135[0]);
            Object[] objArr136 = new Object[1];
            e((short) 498, bArr28[7], bArr28[531], objArr136);
            objArr16 = (Object[]) cls7.getMethod((String) objArr136[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr134);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char cResolveSizeAndState4 = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                int i233 = 3111 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i234 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                Object[] objArr137 = new Object[1];
                d((byte) 37, (short) 158, $$a[7], objArr137);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cResolveSizeAndState4, i233, i234, 154975793, false, (String) objArr137[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr16);
            try {
                long jLongValue17 = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char c13 = (char) (43042 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int iIndexOf14 = TextUtils.indexOf("", "") + 3111;
                    int iBlue = Color.blue(0) + 22;
                    Object[] objArr138 = new Object[1];
                    d((byte) ($$b + 1), (short) 210, $$a[7], objArr138);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c13, iIndexOf14, iBlue, -1269618118, false, (String) objArr138[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char c14 = (char) (43042 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 3112;
                    int trimmedLength2 = 22 - TextUtils.getTrimmedLength("");
                    Object[] objArr139 = new Object[1];
                    d((byte) ($$b + 1), (short) 121, $$a[7], objArr139);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(c14, modifierMetaStateMask3, trimmedLength2, -1272852037, false, (String) objArr139[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i235 = ((int[]) objArr16[1])[0];
        int i236 = ((int[]) objArr16[2])[0];
        if (i236 == i235) {
            int i237 = ((int[]) objArr16[0])[0];
            int i238 = ((int[]) objArr16[2])[0];
            int i239 = ((int[]) objArr16[1])[0];
            String[] strArr20 = (String[]) objArr16[3];
            int[] iArr10 = {i239};
            int iIdentityHashCode15 = System.identityHashCode(this);
            int i240 = ~iIdentityHashCode15;
            int i241 = i237 + (-919315566) + (((~(iIdentityHashCode15 | 1219199459)) | (~((-144769316) | i240)) | (-1560262144)) * (-68)) + ((~((-341062685) | i240)) * (-68)) + (((~((-1219199460) | i240)) | (-485832000)) * 68);
            int i242 = (i241 << 13) ^ i241;
            int i243 = i242 ^ (i242 >>> 17);
            ((int[]) objArr17[0])[0] = i243 ^ (i243 << 5);
            objArr17 = new Object[]{new int[1], iArr10, new int[]{i238}, strArr20};
            c = 0;
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr21 = (String[]) objArr16[3];
            if (strArr21 != null) {
                for (String str16 : strArr21) {
                    arrayList8.add(str16);
                }
            }
            Toast.makeText((Context) null, i236 / (((i236 - 1) * i236) % 2), 0).show();
            int i244 = ((int[]) objArr16[0])[0];
            int i245 = ((int[]) objArr16[2])[0];
            int i246 = ((int[]) objArr16[1])[0];
            String[] strArr22 = (String[]) objArr16[3];
            int[] iArr11 = {i245};
            int[] iArr12 = {i246};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i247 = i244 + (-1440894) + (((~((-807450922) | iElapsedRealtime)) | (~((~iElapsedRealtime) | 897580537))) * (-318)) + (((~(807927209 | iElapsedRealtime)) | 89653328) * (-318)) + (((~(iElapsedRealtime | (-807927210))) | (-897104250)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i248 = (i247 << 13) ^ i247;
            int i249 = i248 ^ (i248 >>> 17);
            c = 0;
            ((int[]) objArr17[0])[0] = i249 ^ (i249 << 5);
            objArr17 = new Object[]{new int[1], iArr12, iArr11, strArr22};
        }
        Context context = getContext();
        if (context == null) {
            int i250 = ((int[]) objArr11[1])[c];
            int i251 = i250 * i250;
            int i252 = -(1872738454 * i250);
            int i253 = ((i251 | i252) << 1) - (i251 ^ i252);
            int i254 = -(i250 * 682623234);
            int i255 = (i253 & i254) + (i254 | i253);
            int i256 = (i255 & 613892752) + (613892752 | i255);
            int i257 = i256 >> 29;
            int i258 = ((i257 & (-15)) + (i257 | (-15))) / 8;
            int i259 = (i258 & 1) + (i258 | 1);
            int i260 = ((i256 | i259) << 1) - (i259 ^ i256);
            int i261 = ((i256 >> 22) - 2047) / 1024;
            int i262 = -(i260 ^ ((i261 & 1) + (i261 | 1)));
            int i263 = (i262 & 4) + (i262 | 4);
            int i264 = ((i263 >> 22) - 2047) / 1024;
            int i265 = 5176160 / (((-(((i264 ^ 1) + ((i264 & 1) << 1)) - (-1))) & i263) * 1903);
            int i266 = ((int[]) objArr109[3])[0];
            int i267 = ((i266 * i266) - (~(-(1181730308 * i266)))) - 1;
            int i268 = -(i266 * (-731743102));
            int i269 = (i267 ^ i268) + ((i267 & i268) << 1);
            int i270 = (i269 ^ 457725833) + ((457725833 & i269) << 1);
            int i271 = i270 >> 18;
            int i272 = ((i271 & (-32767)) + (i271 | (-32767))) / 16384;
            int i273 = (i272 & 1) + (i272 | 1);
            int i274 = (i270 ^ i273) + ((i273 & i270) << 1);
            int i275 = i270 >> 29;
            int i276 = ((i275 & (-15)) + (i275 | (-15))) / 8;
            int i277 = (-(((i276 ^ 1) + ((i276 & 1) << 1)) ^ i274)) + 4;
            int i278 = i277 >> 20;
            int i279 = (((i278 | (-8191)) << 1) - (i278 ^ (-8191))) / 4096;
            int i280 = (i279 ^ 1) + ((i279 & 1) << 1);
            int i281 = 3895920 / ((i277 & (-(((i280 | 1) << 1) - (i280 ^ 1)))) * 1546);
            int i282 = ((int[]) objArr120[0])[0];
            int i283 = i282 * i282;
            int i284 = -(2075204144 * i282);
            int i285 = (i283 & i284) + (i283 | i284);
            int i286 = -(i282 * (-1657903242));
            int i287 = ((i285 | i286) << 1) - (i286 ^ i285);
            int i288 = ((i287 | (-1875431959)) << 1) - ((-1875431959) ^ i287);
            int i289 = i288 >> 16;
            int i290 = ((((-131071) | i289) << 1) - (i289 ^ (-131071))) / 65536;
            int i291 = (i290 & 1) + (i290 | 1);
            int i292 = -(((((i288 >> 27) - 63) / 32) - (-1)) ^ ((i288 ^ i291) + ((i291 & i288) << 1)));
            int i293 = (i292 & 6) + (i292 | 6);
            int i294 = i293 >> 26;
            int i295 = ((((i294 | ComposerKt.defaultsKey) << 1) - (i294 ^ ComposerKt.defaultsKey)) / 64) - (-1);
            int i296 = (-2318382) / (((-((i295 ^ 1) + ((i295 & 1) << 1))) & i293) * 297);
            int i297 = ((int[]) objArr41[3])[0];
            int i298 = i297 * i297;
            int i299 = -(63214134 * i297);
            int i300 = (i298 ^ i299) + ((i298 & i299) << 1);
            int i301 = -(i297 * 1969657854);
            int i302 = (i300 ^ i301) + ((i301 & i300) << 1);
            int i303 = (i302 & 387663524) + (387663524 | i302);
            int i304 = i303 >> 21;
            int i305 = (((i304 ^ (-4095)) + ((i304 & (-4095)) << 1)) / 2048) - (-1);
            int i306 = (i303 & i305) + (i305 | i303);
            int i307 = i303 >> 16;
            int i308 = ((((-131071) | i307) << 1) - (i307 ^ (-131071))) / 65536;
            int i309 = -(i306 ^ (((i308 | 1) << 1) - (i308 ^ 1)));
            int i310 = (i309 ^ 4) + ((i309 & 4) << 1);
            int i311 = i310 >> 25;
            int i312 = ((i311 & (-255)) + (i311 | (-255))) / 128;
            int i313 = (i312 & 1) + (i312 | 1);
            int i314 = 3066864 / (((-((i313 ^ 1) + ((i313 & 1) << 1))) & i310) * 1412);
            int i315 = ((int[]) objArr55[1])[0];
            int i316 = ((i315 * i315) - (~(-(1643431641 * i315)))) - 1;
            int i317 = -(i315 * (-1576540761));
            int i318 = (i316 ^ i317) + ((i317 & i316) << 1);
            int i319 = (i318 & (-1005645824)) + ((-1005645824) | i318);
            int i320 = i319 >> 24;
            int i321 = ((i320 & (-511)) + (i320 | (-511))) / 256;
            int i322 = (i321 ^ 1) + ((i321 & 1) << 1);
            int i323 = -(i322 ^ ((i319 & i322) + (i319 | i322)));
            int i324 = (i323 ^ 1) + ((i323 & 1) << 1);
            int i325 = i324 >> 29;
            int i326 = (((i325 ^ (-15)) + ((i325 & (-15)) << 1)) / 8) - (-1);
            int i327 = 234786 / (((-((i326 & 1) + (i326 | 1))) & i324) * 1077);
            int i328 = ((int[]) objArr8[1])[0];
            int i329 = ((i328 * i328) - (~(-(1105751409 * i328)))) - 1;
            int i330 = -(i328 * 846975213);
            int i331 = (i329 & i330) + (i330 | i329);
            int i332 = ((i331 | 2116577953) << 1) - (2116577953 ^ i331);
            int i333 = i332 >> 27;
            int i334 = (((i333 | (-63)) << 1) - (i333 ^ (-63))) / 32;
            int i335 = (i334 & 1) + (i334 | 1);
            int i336 = (i332 & i335) + (i335 | i332);
            int i337 = i332 >> 24;
            int i338 = ((i337 & (-511)) + (i337 | (-511))) / 256;
            int i339 = -((((i338 | 1) << 1) - (i338 ^ 1)) ^ i336);
            int i340 = (i339 ^ 3) + ((i339 & 3) << 1);
            int i341 = i340 >> 23;
            int i342 = ((i341 & (-1023)) + (i341 | (-1023))) / 512;
            int i343 = 759564 / (((-(((i342 & 1) + (i342 | 1)) - (-1))) & i340) * 1082);
            int i344 = ((int[]) objArr87[1])[0];
            int i345 = i344 * i344;
            int i346 = -(808599342 * i344);
            int i347 = (i345 ^ i346) + ((i345 & i346) << 1);
            int i348 = -(i344 * 1461233370);
            int i349 = ((i347 | i348) << 1) - (i348 ^ i347);
            int i350 = (i349 & (-1898670064)) + ((-1898670064) | i349);
            int i351 = i350 >> 27;
            int i352 = ((((i351 | (-63)) << 1) - (i351 ^ (-63))) / 32) - (-1);
            int i353 = (i350 & i352) + (i352 | i350);
            int i354 = ((i350 >> 29) - 15) / 8;
            int i355 = -(i353 ^ ((i354 & 1) + (i354 | 1)));
            int i356 = ((i355 | 6) << 1) - (i355 ^ 6);
            int i357 = i356 >> 27;
            int i358 = ((i357 & (-63)) + (i357 | (-63))) / 32;
            int i359 = (-11247486) / (((-((((i358 | 1) << 1) - (i358 ^ 1)) - (-1))) & i356) * 1907);
            int i360 = ((int[]) objArr2[2])[0];
            int i361 = ((i360 * i360) - (~(-(1308842056 * i360)))) - 1;
            int i362 = -(i360 * 6695884);
            int i363 = (((i361 | i362) << 1) - (i362 ^ i361)) - (-1931683940);
            int i364 = i363 >> 19;
            int i365 = ((i364 & (-16383)) + (i364 | (-16383))) / 8192;
            int i366 = (i365 ^ 1) + ((i365 & 1) << 1);
            int i367 = ((i363 | i366) << 1) - (i366 ^ i363);
            int i368 = i363 >> 28;
            int i369 = ((i368 & (-31)) + (i368 | (-31))) / 16;
            int i370 = -((((i369 | 1) << 1) - (i369 ^ 1)) ^ i367);
            int i371 = (i370 & 7) + (i370 | 7);
            int i372 = i371 >> 29;
            int i373 = (((i372 & (-15)) + (i372 | (-15))) / 8) - (-1);
            i5 = 4251723 / (((-((i373 ^ 1) + ((i373 & 1) << 1))) & i371) * 691);
            int i374 = ((int[]) objArr17[0])[0];
            int i375 = i374 * i374;
            int i376 = -(134372267 * i374);
            int i377 = ((i375 | i376) << 1) - (i375 ^ i376);
            int i378 = -(i374 * (-903774429));
            int i379 = ((i377 & i378) + (i378 | i377)) - 506077327;
            int i380 = ((i379 >> 24) - 511) / 256;
            int i381 = (i380 ^ 1) + ((i380 & 1) << 1);
            int i382 = (i379 & i381) + (i381 | i379);
            int i383 = i379 >> 17;
            int i384 = (((-65535) ^ i383) + ((i383 & (-65535)) << 1)) / 32768;
            int i385 = (-(i382 ^ ((i384 ^ 1) + ((i384 & 1) << 1)))) + 6;
            int i386 = i385 >> 16;
            int i387 = ((((-131071) | i386) << 1) - (i386 ^ (-131071))) / 65536;
            i6 = (-7868808) / ((i385 & (-(((i387 & 1) + (i387 | 1)) - (-1)))) * 1492);
        } else {
            MlKitContext.zza(context);
            int i388 = ((int[]) objArr6[2])[0];
            int i389 = i388 * i388;
            int i390 = -(1397812843 * i388);
            int i391 = ((i389 | i390) << 1) - (i389 ^ i390);
            int i392 = -(i388 * (-2073919215));
            int i393 = (i391 ^ i392) + ((i392 & i391) << 1);
            int i394 = ((i393 | (-671272700)) << 1) - ((-671272700) ^ i393);
            int i395 = i394 >> 29;
            int i396 = ((i395 ^ (-15)) + ((i395 & (-15)) << 1)) / 8;
            int i397 = (i396 & 1) + (i396 | 1);
            int i398 = (i394 & i397) + (i397 | i394);
            int i399 = i394 >> 19;
            int i400 = (((i399 | (-16383)) << 1) - (i399 ^ (-16383))) / 8192;
            int i401 = (-(((i400 ^ 1) + ((i400 & 1) << 1)) ^ i398)) + 3;
            int i402 = i401 >> 20;
            int i403 = ((i402 ^ (-8191)) + ((i402 & (-8191)) << 1)) / 4096;
            int i404 = ((i403 | 1) << 1) - (i403 ^ 1);
            i5 = 314706 / ((i401 & (-(((i404 | 1) << 1) - (i404 ^ 1)))) * 118);
            int i405 = ((int[]) objArr15[1])[0];
            int i406 = i405 * i405;
            int i407 = -(1276672580 * i405);
            int i408 = (i406 ^ i407) + ((i406 & i407) << 1);
            int i409 = -(i405 * 1188071038);
            int i410 = ((i408 & i409) + (i409 | i408)) - 364305215;
            int i411 = i410 >> 29;
            int i412 = (((i411 ^ (-15)) + ((i411 & (-15)) << 1)) / 8) - (-1);
            int i413 = (i410 ^ i412) + ((i412 & i410) << 1);
            int i414 = i410 >> 16;
            int i415 = ((((-131071) | i414) << 1) - (i414 ^ (-131071))) / 65536;
            int i416 = -(i413 ^ (((i415 | 1) << 1) - (i415 ^ 1)));
            int i417 = ((i416 | 4) << 1) - (i416 ^ 4);
            int i418 = i417 >> 17;
            int i419 = ((((-65535) | i418) << 1) - (i418 ^ (-65535))) / 32768;
            int i420 = ((i419 | 1) << 1) - (i419 ^ 1);
            i6 = (-202692) / (((-((i420 & 1) + (i420 | 1))) & i417) * 57);
        }
        return i5 + i6;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        int i3 = i2 % 128;
        f825a = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        int i = 2 % 2;
        int i2 = f825a + 45;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        int i3 = 99 / 0;
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 97;
        f825a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 73;
        f825a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 13;
        f825a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        f825a = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = f825a;
        int i3 = i2 + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    static {
        byte[] bArr = new byte[539];
        System.arraycopy("A\u0086¿\u0002üý\f\u0000üÃû;\u0005\u0006ñ\rüó\u000bÂ5\fÿõ\u0012ý\u0000ó\t\u0006º&\r\u0012øæ$ð\u0010ð\fþÁ4\u000eú\t\u0001÷\n¹B\u0002ó\u000eò\t\u0006í\u0013õ\u0006ÿÀ@\u0001\u0005õý\u0003úþ\u0013õ\u0006ÿÀ !\u0005õý\u0003úþ\u0013õ\u0006ÿÔ-\u0005\u0000ûþæ\u0015ý\u0000\u000f°Oýõþ\u0006ø\u000b¸\u0000E\u0005þý\u0005÷ÿÀE\u0005üûþ\u0011°@\u0001\u0001û\u0014÷\b°\r!ô\u000bõ\u0006ÿâ\u0011\u0018ôø\t\u0006Ò,ï\u0006\u0006ø\t\u0006ÿýõþ\u0006ø\u000bý\u0005þý\u0005÷ÿ\u0012óü\u0012Ö\"õ\u0001\u0007ø\u0001\u0001û\u0014÷\b¿\fþÁ9\b\u0000ø\u0005ùÉ?ÿÿþ\u000bº5\fþ\u0000\u0002ÿÀEñ\u0007þ\u0005\u0006ñ\rüó\u000bÂL\u0000ï\fþÁ9\b\u0000ø\u0005ùÉ3\rö\u000eýúûÊ9\u0006\u0006»;\u0005\u0006ñ\rüó\u000bÂ?øü\u0012\u0002ýó\bø\t\u0006ºL\u0000ôô!ô\u000bõ\u0006ÿâ\u0011\u0018ôø\t\u0006Ò,ï\u0006\u0006ø\t\u0006ÿýõþ\u0006ø\u000bý\u0005þý\u0005÷ÿ\u0012óü\u0012Ö\"õ\u0001\u0007ø\u0001\u0001û\u0014÷\b½þ\u000fÛ!õ\tû\u0005ùÛ*\u0003ô\bú\r²>!ô\u000bõ\u0006ÿâ\u0011\u0018ôø\t\u0006Ò,ï\u0006\u0006ø\t\u0006ÿýõþ\u0006ø\u000bý\u0005þý\u0005÷ÿ\u0012óü\u0012Ö\"õ\u0001\u0007ø\u0001\u0001û\u0014÷\b¾\fþÁ3\rö\u000eýúûÊHùý\u0000ù\u0014µ\u00132\u0006õõï\u0013\f\u0004ð\u000e\u0001Ý$ð\u0010ð\fþÁ6ý\u0013í\u0003\u000bøÇ3\rö\u000eýúûÊD\u0003øÁ;\u0005\u0006ñ\rüó\u000bÂ6\u000bþô\b\u0005ÀEð\f\u0001õÉ$#øÔ\"\u0011õ\u0006ÿå\u0010\f\u0001õ¿Oò\töÝ\"\u0011õ\u0006ÿ¶\u000eò\u000e!ô\u000bõ\u0006ÿâ\u0011\u0018ôø\t\u0006Ò,ï\u0006\u0006ø\t\u0006î\u0007\u0005ö\u0005\u0005ùâ%ø\u0006õ\u0013ñ\r¿".getBytes("ISO-8859-1"), 0, bArr, 0, 539);
        $$d = bArr;
        $$e = 255;
        $$a = new byte[]{17, 104, 102, -28, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 51;
        f825a = 0;
        asInterface = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1766028379;
        TuitionPaymentFragmentbindingInflater1 = -1934795577;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1542903774;
        b = new byte[]{-27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -42, 42, -30, -26, -56, 26, 25, 49, -42, 28, -30, 53, -49, -18, 41, -54, -28, 40, 25, -56, -30, 25, 41, -29, -49, -31, -26, 30, -31, 55, -50, -26, -29, 54, -41, -28, 41, -51, 52, -27, -51, -26, -28, 54, -55, -29, 28, -28, 50, 26, -26, -42, 41, -26, -53, -27, 54, -30, -25, -26, 29, -25, -43, -42, -32, 41, -53, -28, 42, -27, -41, 25, 25, 52, -49, -26, 48, -52, -32, -26, 25, 27, -25, 54, -25, -43, -26, 55, 26, -41, -27, 26, 53, -49, -25, 25, -26, -32, 28, 49, -56, 52, -54, 54, -55, -28, -28, 27, -27, -25, 24, 40, -46, 43, -27, -44, 44, -25, -56, 51, -53, -29, 28, 52, -27, 24, -26, -26, -26, -26, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, short r7) {
        /*
            byte[] r0 = com.google.mlkit.common.internal.MlKitInitProvider.$$c
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r6 = 121 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r5]
        L25:
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.MlKitInitProvider.$$g(short, byte, short):java.lang.String");
    }
}
