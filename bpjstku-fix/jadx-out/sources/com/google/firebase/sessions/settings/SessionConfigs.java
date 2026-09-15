package com.google.firebase.sessions.settings;

import android.content.Context;
import android.graphics.Color;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.abt.R;
import defpackage.CameraController1;
import defpackage.CorrectNegativeLatLongForMediaMuxer;
import defpackage.createImageAnalysis;
import defpackage.getImageCaptureIoExecutor;
import defpackage.initSession;
import defpackage.isUseCaseEnabled;
import defpackage.lambdanew1androidxcameraviewCameraController;
import defpackage.setImageAnalysisBackgroundExecutor;
import defpackage.setVideoStabilizationMode;
import defpackage.startCamera;
import defpackage.unbindPreviewAndRecreate;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@CorrectNegativeLatLongForMediaMuxer
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H×\u0001¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020$H\u0001¢\u0006\u0004\b&\u0010'R\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010+\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010.\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u00101\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010\u0016R\u001c\u00103\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0019"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "p5", "LCameraController1;", "p6", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;LCameraController1;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LisUseCaseEnabled;", "LcreateImageAnalysis;", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/settings/SessionConfigs;LisUseCaseEnabled;LcreateImageAnalysis;)V", "sessionsEnabled", "Ljava/lang/Boolean;", "getSessionsEnabled", "sessionSamplingRate", "Ljava/lang/Double;", "getSessionSamplingRate", "sessionTimeoutSeconds", "Ljava/lang/Integer;", "getSessionTimeoutSeconds", "cacheDurationSeconds", "getCacheDurationSeconds", "cacheUpdatedTimeSeconds", "Ljava/lang/Long;", "getCacheUpdatedTimeSeconds", "Companion", "$serializer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionConfigs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Integer cacheDurationSeconds;
    private final Long cacheUpdatedTimeSeconds;
    private final Double sessionSamplingRate;
    private final Integer sessionTimeoutSeconds;
    private final Boolean sessionsEnabled;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$d = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {112, 19, -59, 97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 24;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int b = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 84
            int r7 = r7 * 15
            int r7 = r7 + 38
            int r8 = r8 + 4
            byte[] r0 = com.google.firebase.sessions.settings.SessionConfigs.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionConfigs.a(byte, int, int, java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs$Companion;", "", "<init>", "()V", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "serializer", "()LvideoProfileHdrFormatsToDynamicRangeEncoding;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final videoProfileHdrFormatsToDynamicRangeEncoding<SessionConfigs> serializer() {
            return SessionConfigs$$serializer.INSTANCE;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionConfigs(int i, Boolean bool, Double d, Integer num, Integer num2, Long l, CameraController1 cameraController1) {
        createImageAnalysis descriptor;
        int i2 = 31;
        if (31 != (i & 31)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = SessionConfigs$$serializer.INSTANCE.getDescriptor();
                i2 = 41;
            } else {
                descriptor = SessionConfigs$$serializer.INSTANCE.getDescriptor();
            }
            startCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionConfigs p0, isUseCaseEnabled p1, createImageAnalysis p2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        p1.encodeNullableSerializableElement(p2, 0, unbindPreviewAndRecreate.INSTANCE, p0.sessionsEnabled);
        p1.encodeNullableSerializableElement(p2, 1, getImageCaptureIoExecutor.INSTANCE, p0.sessionSamplingRate);
        p1.encodeNullableSerializableElement(p2, 2, lambdanew1androidxcameraviewCameraController.INSTANCE, p0.sessionTimeoutSeconds);
        p1.encodeNullableSerializableElement(p2, 3, lambdanew1androidxcameraviewCameraController.INSTANCE, p0.cacheDurationSeconds);
        p1.encodeNullableSerializableElement(p2, 4, setImageAnalysisBackgroundExecutor.INSTANCE, p0.cacheUpdatedTimeSeconds);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public SessionConfigs(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr = TuitionPaymentFragmentbindingInflater1;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 77;
                $10 = i11 % 128;
                if (i11 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[i6];
                        objArr2[i4] = Integer.valueOf(cArr[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", i4);
                            int offsetBefore = TextUtils.getOffsetBefore("", i4) + 1270;
                            int i12 = 18 - (TypedValue.complexToFraction(i4, f, f) > f ? 1 : (TypedValue.complexToFraction(i4, f, f) == f ? 0 : -1));
                            byte b2 = $$c[i6];
                            byte b3 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, offsetBefore, i12, 407021364, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i10 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1270, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 407021364, false, $$e($$c[1], b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i10++;
                }
                i2 = 2;
                i4 = 0;
                i6 = 1;
                f = 0.0f;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i7) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 3225 - KeyEvent.normalizeMetaState(0), View.resolveSizeAndState(0, 0, 0) + 13, 2133916302, false, $$e((byte) ($$c[1] + 1), b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iIndexOf = TextUtils.indexOf("", "") + 23;
                        byte length2 = (byte) $$c.length;
                        byte b6 = (byte) (length2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, keyRepeatTimeout, iIndexOf, 387247676, false, $$e(length2, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - ExpandableListView.getPackedPositionGroup(0L)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1705, Color.green(0) + 21, -1434471773, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            int i15 = $11 + 39;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i17 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i17, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i17);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i7];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i7) {
                int i18 = $10 + 11;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr6[setvideostabilizationmode.b] = cArr3[i7 << setvideostabilizationmode.b];
                    int i19 = setvideostabilizationmode.b;
                    setvideostabilizationmode.b = 0;
                } else {
                    cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                }
                int i20 = $10 + 3;
                $11 = i20 % 128;
                int i21 = i20 % 2;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i22 = 0;
            while (true) {
                setvideostabilizationmode.b = i22;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i22 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final Boolean getSessionsEnabled() throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
            int iMyPid = (Process.myPid() >> 22) + 1755;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, iMyPid, iIndexOf, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(new int[]{0, 22, 2, 22}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(new int[]{22, 15, 0, 3}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
            int iRgb = Color.rgb(0, 0, 0) + 16778971;
            int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            byte b5 = bArr[5];
            Object[] objArr4 = new Object[1];
            a(b4, b5, (byte) (b5 | 36), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iRgb, iLastIndexOf, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 23;
                byte[] bArr2 = $$a;
                byte b6 = bArr2[7];
                byte b7 = bArr2[5];
                Object[] objArr5 = new Object[1];
                a(b6, b7, (byte) (b7 | 88), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i5, offsetAfter, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~((-373675667) | iIdentityHashCode);
            int i7 = ~iIdentityHashCode;
            int i8 = ((((-1705690095) + ((i6 | (~((-161073241) | i7))) * (-1808))) + (((~((-373560963) | iIdentityHashCode)) | (~(i7 | (-160958537)))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(iIdentityHashCode | 161073240)) | 114704) | (~(373675666 | i7))) * TypedValues.Custom.TYPE_BOOLEAN)) - 1371255047;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c(new int[]{37, 16, 161, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c(new int[]{53, 16, 0, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-168632700};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 42050), 1726 - Drawable.resolveOpacity(0, 0), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -1371255047);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf3 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                    int iAlpha = 23 - Color.alpha(0);
                    byte[] bArr3 = $$a;
                    byte b8 = bArr3[7];
                    byte b9 = bArr3[5];
                    Object[] objArr10 = new Object[1];
                    a(b8, b9, (byte) (b9 | 88), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf3, maximumFlingVelocity, iAlpha, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new int[]{0, 22, 2, 22}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new int[]{22, 15, 0, 3}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0}, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int iRed = 1755 - Color.red(0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[7];
                        byte b11 = bArr4[5];
                        Object[] objArr13 = new Object[1];
                        a(b10, b11, (byte) (b11 | 36), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iRed, jumpTapTimeout, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int iRgb2 = (-16775461) - Color.rgb(0, 0, 0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr14 = new Object[1];
                        a(b12, b13, b13, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, iRgb2, packedPositionType, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i12 == i11) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iNextInt = new Random().nextInt(1103433286);
            int i16 = ~iNextInt;
            int i17 = i15 + 1189776958 + (((~(356325086 | i16)) | 568927512) * (-90)) + (((~(356325086 | iNextInt)) | 336859846) * (-45)) + (((~(iNextInt | (-568927513))) | 356325086 | (~(i16 | 568927512))) * 45);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr15[3])[0] = i19 ^ (i19 << 5);
            i = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i20 = i12 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i22 = ~System.identityHashCode(this);
            int i23 = i21 + 1290138949 + ((~((-27787851) | i22)) * 52) + (((~(508917909 | i22)) | (~(296315483 | i22)) | (-536705760)) * (-52)) + (((~(i22 | (-508917910))) | 268527633) * 52);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr16[3])[0] = i25 ^ (i25 << 5);
            int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
            i = 2;
            int i27 = i26 % 2;
        }
        Boolean bool = this.sessionsEnabled;
        int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
        int i29 = i28 % i;
        return bool;
    }

    public final Double getSessionSamplingRate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Double d = this.sessionSamplingRate;
        int i4 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return d;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer getSessionTimeoutSeconds() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sessionTimeoutSeconds;
        }
        throw null;
    }

    public final Integer getCacheDurationSeconds() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.cacheDurationSeconds;
        int i5 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Long getCacheUpdatedTimeSeconds() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.cacheUpdatedTimeSeconds;
        int i5 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return l;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d, Integer num, Integer num2, Long l, int i, Object obj) {
        Boolean bool2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = i3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            Boolean bool3 = sessionConfigs.sessionsEnabled;
            int i6 = i3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            bool2 = bool3;
        } else {
            bool2 = bool;
        }
        if ((i & 2) != 0) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            d = sessionConfigs.sessionSamplingRate;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            num = sessionConfigs.sessionTimeoutSeconds;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = sessionConfigs.cacheDurationSeconds;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            l = sessionConfigs.cacheUpdatedTimeSeconds;
        }
        return sessionConfigs.copy(bool2, d2, num3, num4, l);
    }

    public final Boolean component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.sessionsEnabled;
        int i5 = i3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return bool;
    }

    public final Double component2() {
        Double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            d = this.sessionSamplingRate;
            int i4 = 38 / 0;
        } else {
            d = this.sessionSamplingRate;
        }
        int i5 = i3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sessionTimeoutSeconds;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cacheDurationSeconds;
        }
        throw null;
    }

    public final Long component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        Long l = this.cacheUpdatedTimeSeconds;
        int i5 = i3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        throw null;
    }

    public final SessionConfigs copy(Boolean p0, Double p1, Integer p2, Integer p3, Long p4) {
        int i = 2 % 2;
        SessionConfigs sessionConfigs = new SessionConfigs(p0, p1, p2, p3, p4);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return sessionConfigs;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.google.firebase.sessions.settings.SessionConfigs) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.google.firebase.sessions.settings.SessionConfigs) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.sessionsEnabled, r6.sessionsEnabled)) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r6 = com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if ((r6 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5.sessionSamplingRate, (java.lang.Object) r6.sessionSamplingRate) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r6 = com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.sessionTimeoutSeconds, r6.sessionTimeoutSeconds) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.cacheDurationSeconds, r6.cacheDurationSeconds) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r6 = com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.cacheUpdatedTimeSeconds, r6.cacheUpdatedTimeSeconds) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 79
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.google.firebase.sessions.settings.SessionConfigs
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.google.firebase.sessions.settings.SessionConfigs r6 = (com.google.firebase.sessions.settings.SessionConfigs) r6
            java.lang.Boolean r1 = r5.sessionsEnabled
            java.lang.Boolean r4 = r6.sessionsEnabled
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == 0) goto L38
            int r6 = com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r6 = r6 + 105
            int r1 = r6 % 128
            com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L37
            return r2
        L37:
            return r3
        L38:
            java.lang.Double r1 = r5.sessionSamplingRate
            java.lang.Double r4 = r6.sessionSamplingRate
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L4c
            int r6 = com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r6 = r6 + 111
            int r1 = r6 % 128
            com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r6 = r6 % r0
            return r3
        L4c:
            java.lang.Integer r1 = r5.sessionTimeoutSeconds
            java.lang.Integer r4 = r6.sessionTimeoutSeconds
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L57
            return r3
        L57:
            java.lang.Integer r1 = r5.cacheDurationSeconds
            java.lang.Integer r4 = r6.cacheDurationSeconds
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L6b
            int r6 = com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r6 = r6 + 63
            int r1 = r6 % 128
            com.google.firebase.sessions.settings.SessionConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1
            int r6 = r6 % r0
            return r3
        L6b:
            java.lang.Long r0 = r5.cacheUpdatedTimeSeconds
            java.lang.Long r6 = r6.cacheUpdatedTimeSeconds
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L76
            return r3
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionConfigs.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Boolean bool = this.sessionsEnabled;
        int i2 = 0;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Double d = this.sessionSamplingRate;
        if (d == null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = d.hashCode();
        }
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.cacheDurationSeconds;
        if (num2 == null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            iHashCode2 = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = num2.hashCode();
        }
        Long l = this.cacheUpdatedTimeSeconds;
        if (l != null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            int iHashCode5 = l.hashCode();
            if (i7 != 0) {
                int i8 = 18 / 0;
            }
            i2 = iHashCode5;
        }
        return (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + i2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SessionConfigs(sessionsEnabled=");
        sb.append(this.sessionsEnabled);
        sb.append(", sessionSamplingRate=");
        sb.append(this.sessionSamplingRate);
        sb.append(", sessionTimeoutSeconds=");
        sb.append(this.sessionTimeoutSeconds);
        sb.append(", cacheDurationSeconds=");
        sb.append(this.cacheDurationSeconds);
        sb.append(", cacheUpdatedTimeSeconds=");
        sb.append(this.cacheUpdatedTimeSeconds);
        sb.append(')');
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{59706, 59746, 59744, 59750, 59769, 59749, 59747, 59712, 59739, 59768, 59737, 59721, 59747, 59763, 59774, 59749, 59744, 59729, 59730, 59748, 59744, 59746, 59711, 59744, 59746, 59758, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59790, 59405, 59399, 59399, 59875, 59877, 59404, 59395, 59392, 59872, 59882, 59404, 59420, 59423, 59398, 59393, 59705, 59759, 59746, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757};
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
    private static java.lang.String $$e(int r6, int r7, short r8) {
        /*
            int r6 = 105 - r6
            int r7 = r7 + 4
            byte[] r0 = com.google.firebase.sessions.settings.SessionConfigs.$$c
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionConfigs.$$e(int, int, short):java.lang.String");
    }
}
