package com.google.firebase.sessions;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.CameraController1;
import defpackage.CameraControllerUseCases;
import defpackage.CorrectNegativeLatLongForMediaMuxer;
import defpackage.createImageAnalysis;
import defpackage.initSession;
import defpackage.isUseCaseEnabled;
import defpackage.setImageAnalysisAnalyzer;
import defpackage.setVideoStabilizationMode;
import defpackage.startCamera;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@CorrectNegativeLatLongForMediaMuxer
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\t\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u001c\u0010(\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014R(\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0016"}, d2 = {"Lcom/google/firebase/sessions/SessionData;", "", "Lcom/google/firebase/sessions/SessionDetails;", "p0", "Lcom/google/firebase/sessions/Time;", "p1", "", "", "Lcom/google/firebase/sessions/ProcessData;", "p2", "<init>", "(Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;)V", "", "p3", "LCameraController1;", "p4", "(ILcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;LCameraController1;)V", "component1", "()Lcom/google/firebase/sessions/SessionDetails;", "component2", "()Lcom/google/firebase/sessions/Time;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;)Lcom/google/firebase/sessions/SessionData;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LisUseCaseEnabled;", "LcreateImageAnalysis;", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionData;LisUseCaseEnabled;LcreateImageAnalysis;)V", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "getSessionDetails", "backgroundTime", "Lcom/google/firebase/sessions/Time;", "getBackgroundTime", "processDataMap", "Ljava/util/Map;", "getProcessDataMap", "Companion", "$serializer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionData {
    private static final videoProfileHdrFormatsToDynamicRangeEncoding<Object>[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Time backgroundTime;
    private final Map<String, ProcessData> processDataMap;
    private final SessionDetails sessionDetails;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$d = 228;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {112, 19, -59, 97, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 189;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 1
            int r5 = r5 + 4
            byte[] r1 = com.google.firebase.sessions.SessionData.$$a
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r2
            r2 = r5
            goto L2d
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            int r6 = r6 + 1
            if (r2 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r1[r6]
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r4
        L2d:
            int r5 = r5 + r6
            int r5 = r5 + (-11)
            r6 = r2
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionData.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionData$Companion;", "", "<init>", "()V", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lcom/google/firebase/sessions/SessionData;", "serializer", "()LvideoProfileHdrFormatsToDynamicRangeEncoding;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final videoProfileHdrFormatsToDynamicRangeEncoding<SessionData> serializer() {
            return SessionData$$serializer.INSTANCE;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        b();
        INSTANCE = new Companion(null);
        $childSerializers = new videoProfileHdrFormatsToDynamicRangeEncoding[]{null, null, new setImageAnalysisAnalyzer(CameraControllerUseCases.INSTANCE, ProcessData$$serializer.INSTANCE)};
        int i = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SessionData(int i, SessionDetails sessionDetails, Time time, Map map, CameraController1 cameraController1) {
        if (1 != (i & 1)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
            b = i2 % 128;
            int i3 = i2 % 2;
            startCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 1, SessionData$$serializer.INSTANCE.getDescriptor());
            int i4 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.sessionDetails = sessionDetails;
        if ((i & 2) == 0) {
            this.backgroundTime = null;
            int i7 = b + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            this.backgroundTime = time;
        }
        if ((i & 4) == 0) {
            this.processDataMap = null;
        } else {
            this.processDataMap = map;
        }
    }

    public static final /* synthetic */ videoProfileHdrFormatsToDynamicRangeEncoding[] access$get$childSerializers$cp() {
        videoProfileHdrFormatsToDynamicRangeEncoding<Object>[] videoprofilehdrformatstodynamicrangeencodingArr;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            videoprofilehdrformatstodynamicrangeencodingArr = $childSerializers;
            int i4 = 32 / 0;
        } else {
            videoprofilehdrformatstodynamicrangeencodingArr = $childSerializers;
        }
        int i5 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return videoprofilehdrformatstodynamicrangeencodingArr;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1
  0x0033: PHI (r1v5 videoProfileHdrFormatsToDynamicRangeEncoding<java.lang.Object>[]) = 
  (r1v4 videoProfileHdrFormatsToDynamicRangeEncoding<java.lang.Object>[])
  (r1v10 videoProfileHdrFormatsToDynamicRangeEncoding<java.lang.Object>[])
 binds: [B:8:0x0031, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionData p0, isUseCaseEnabled p1, createImageAnalysis p2) {
        videoProfileHdrFormatsToDynamicRangeEncoding<Object>[] videoprofilehdrformatstodynamicrangeencodingArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            videoprofilehdrformatstodynamicrangeencodingArr = $childSerializers;
            p1.encodeSerializableElement(p2, 1, SessionDetails$$serializer.INSTANCE, p0.sessionDetails);
            if (!p1.shouldEncodeElementDefault(p2, 1)) {
                if (p0.backgroundTime != null) {
                }
            }
            if (!p1.shouldEncodeElementDefault(p2, 2)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                b = i3 % 128;
                int i4 = i3 % 2;
                if (p0.processDataMap == null) {
                    return;
                }
            }
            p1.encodeNullableSerializableElement(p2, 2, videoprofilehdrformatstodynamicrangeencodingArr[2], p0.processDataMap);
        }
        videoprofilehdrformatstodynamicrangeencodingArr = $childSerializers;
        p1.encodeSerializableElement(p2, 0, SessionDetails$$serializer.INSTANCE, p0.sessionDetails);
        if (!p1.shouldEncodeElementDefault(p2, 1)) {
            if (p0.backgroundTime != null) {
            }
        }
        if (!p1.shouldEncodeElementDefault(p2, 2)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            b = i5 % 128;
            int i6 = i5 % 2;
            if (p0.processDataMap == null) {
                return;
            }
        }
        p1.encodeNullableSerializableElement(p2, 2, videoprofilehdrformatstodynamicrangeencodingArr[2], p0.processDataMap);
        p1.encodeNullableSerializableElement(p2, 1, Time$$serializer.INSTANCE, p0.backgroundTime);
        if (!p1.shouldEncodeElementDefault(p2, 2)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            b = i7 % 128;
            int i8 = i7 % 2;
            if (p0.processDataMap == null) {
                return;
            }
        }
        p1.encodeNullableSerializableElement(p2, 2, videoprofilehdrformatstodynamicrangeencodingArr[2], p0.processDataMap);
    }

    public SessionData(SessionDetails sessionDetails, Time time, Map<String, ProcessData> map) {
        Intrinsics.checkNotNullParameter(sessionDetails, "");
        this.sessionDetails = sessionDetails;
        this.backgroundTime = time;
        this.processDataMap = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SessionData(SessionDetails sessionDetails, Time time, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = b + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            time = null;
        }
        if ((i & 4) != 0) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
            map = null;
        }
        this(sessionDetails, time, map);
    }

    public final SessionDetails getSessionDetails() {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sessionDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Time getBackgroundTime() {
        Time time;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 15;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            time = this.backgroundTime;
            int i4 = 5 / 0;
        } else {
            time = this.backgroundTime;
        }
        int i5 = i2 + 23;
        b = i5 % 128;
        int i6 = i5 % 2;
        return time;
    }

    public final Map<String, ProcessData> getProcessDataMap() {
        int i = 2 % 2;
        int i2 = b + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        Map<String, ProcessData> map = this.processDataMap;
        int i5 = i3 + 13;
        b = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Time component2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Time time = this.backgroundTime;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 652;
            int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, modifierMetaStateMask, iKeyCodeFromString, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 15}, false, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 6}, true, new byte[]{1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iResolveOpacity = 44 - Drawable.resolveOpacity(0, 0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 51, bArr2[80], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, fadingEdgeLength, iResolveOpacity, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43;
                byte b4 = $$a[7];
                Object[] objArr6 = new Object[1];
                a((byte) 51, b4, (byte) (b4 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i3, i4, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = ((((-245883772) + (((~((-984696755) | i7)) | 981265944) * (-865))) + ((~(iIdentityHashCode | 984696754)) * 865)) + (((~(981265944 | i7)) | (~(i7 | 984696754))) * 865)) - 1680714796;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 1610 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 26 - Color.alpha(0), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1680714796, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iMyPid = 651 - (Process.myPid() >> 22);
                    int minimumFlingVelocity = 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    a((byte) 51, bArr3[80], bArr3[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, iMyPid, minimumFlingVelocity, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 695, 146 - AndroidCharacter.getMirror('0')), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.red(0) + 63406), TextUtils.indexOf("", "") + 793, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 82), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRed = (char) Color.red(0);
                    int i11 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i12 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b5 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    a((byte) 51, b5, (byte) (b5 | 37), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, i11, i12, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new int[]{0, 22, 0, 15}, false, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new int[]{22, 15, 0, 6}, true, new byte[]{1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                        int iIndexOf = 651 - TextUtils.indexOf("", "", 0, 0);
                        int iGreen = Color.green(0) + 44;
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a((byte) 51, bArr4[80], bArr4[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, iIndexOf, iGreen, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int doubleTapTimeout = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 44;
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[5];
                        byte b7 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a(b6, b7, (byte) (b7 | 52), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity, doubleTapTimeout, deadChar2, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                    b = i15 % 128;
                    if (i15 % 2 != 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 26;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        b = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[0])[0];
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i21 = i18 + 1818329828 + (((~((~startElapsedRealtime) | 1049704391)) | 5031976) * 529) + (((~(startElapsedRealtime | 1049704391)) | 1046273581) * 529);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr16[3])[0] = i23 ^ (i23 << 5);
        return time;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
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
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr2 != null) {
            int i10 = 5;
            int i11 = $10 + 5;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                int i12 = $10 + 31;
                $11 = i12 % 128;
                if (i12 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[i6];
                        objArr2[i4] = Integer.valueOf(cArr2[i]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i10;
                            byte b3 = (byte) (b2 - 5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1270 - Color.alpha(i4), 18 - (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 407021364, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr[i] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 5;
                        byte b5 = (byte) (b4 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myTid() >> 22), 1270 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionType(0L) + 18, 407021364, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i++;
                }
                i2 = 2;
                i4 = 0;
                i6 = 1;
                i10 = 5;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr2, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i7) {
                int i13 = $11 + 97;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i15 = $11 + 85;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.red(0) + 3225, View.MeasureSpec.makeMeasureSpec(0, 0) + 13, 2133916302, false, $$e((byte) 6, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                } else {
                    int i18 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                        int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                        int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                        byte length2 = (byte) $$c.length;
                        byte b7 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, touchSlop, iResolveSizeAndState, 387247676, false, $$e(length2, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1705 - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0', 0, 0) + 22, -1434471773, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i19 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i19, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i19);
        }
        if (z) {
            int i20 = $11 + 13;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            char[] cArr6 = new char[i7];
            setvideostabilizationmode.b = 0;
            while (setvideostabilizationmode.b < i7) {
                int i22 = $11 + 95;
                $10 = i22 % 128;
                int i23 = i22 % 2;
                cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i24 = $10 + 29;
                $11 = i24 % 128;
                int i25 = i24 % 2;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i26 = 0;
            while (true) {
                setvideostabilizationmode.b = i26;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i26 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionData copy$default(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            sessionDetails = sessionData.sessionDetails;
            int i5 = i3 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            time = sessionData.backgroundTime;
        }
        if ((i & 4) != 0) {
            map = sessionData.processDataMap;
        }
        return sessionData.copy(sessionDetails, time, map);
    }

    public final SessionDetails component1() {
        int i = 2 % 2;
        int i2 = b + 39;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        SessionDetails sessionDetails = this.sessionDetails;
        int i5 = i3 + 33;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return sessionDetails;
        }
        throw null;
    }

    public final Map<String, ProcessData> component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        int i3 = i2 % 128;
        b = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Map<String, ProcessData> map = this.processDataMap;
        int i4 = i3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final SessionData copy(SessionDetails p0, Time p1, Map<String, ProcessData> p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        SessionData sessionData = new SessionData(p0, p1, p2);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return sessionData;
        }
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SessionData)) {
            int i2 = b + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SessionData sessionData = (SessionData) p0;
        if (Intrinsics.areEqual(this.sessionDetails, sessionData.sessionDetails)) {
            return Intrinsics.areEqual(this.backgroundTime, sessionData.backgroundTime) && Intrinsics.areEqual(this.processDataMap, sessionData.processDataMap);
        }
        int i4 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        Time time;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.sessionDetails.hashCode();
            time = this.backgroundTime;
            iHashCode2 = 1;
            if (time == null) {
                int i3 = b + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = time.hashCode();
            }
        } else {
            iHashCode = this.sessionDetails.hashCode();
            time = this.backgroundTime;
            if (time == null) {
                iHashCode2 = 0;
                int i5 = b + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iHashCode2 = iHashCode3;
                iHashCode3 = time.hashCode();
            }
        }
        Map<String, ProcessData> map = this.processDataMap;
        if (map != null) {
            int i7 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 == 0) {
                map.hashCode();
                throw null;
            }
            iHashCode2 = map.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SessionData(sessionDetails=");
        sb.append(this.sessionDetails);
        sb.append(", backgroundTime=");
        sb.append(this.backgroundTime);
        sb.append(", processDataMap=");
        sb.append(this.processDataMap);
        sb.append(')');
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{59676, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59757, 59705, 59751, 59770, 59747, 59757, 59747, 59758, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, short r7, short r8) {
        /*
            byte[] r0 = com.google.firebase.sessions.SessionData.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = 105 - r6
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionData.$$e(byte, short, short):java.lang.String");
    }
}
