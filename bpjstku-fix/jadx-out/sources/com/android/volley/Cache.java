package com.android.volley;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public interface Cache {
    void clear();

    Entry get(String str);

    void initialize();

    void invalidate(String str, boolean z);

    void put(String str, Entry entry);

    void remove(String str);

    public static class Entry {
        public List<Header> allResponseHeaders;
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map<String, String> responseHeaders = Collections.emptyMap();
        public long serverDate;
        public long softTtl;
        public long ttl;
        private static final byte[] $$c = {74, 60, 122, -26};
        private static final int $$f = 172;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {32, 1, 70, -122, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -48, -12, 10, 62, -60, 1, 14, 2, -4, 65, -73, 3, 26, -12};
        private static final int $$e = 116;
        private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 67;
        private static int b = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57929;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 52
                int r8 = 55 - r8
                int r9 = r9 + 1
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r0 = com.android.volley.Cache.Entry.$$a
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2f
            L14:
                r3 = r2
            L15:
                r6 = r8
                r8 = r7
                r7 = r6
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2f:
                int r3 = r3 + r7
                int r7 = r3 + (-10)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.volley.Cache.Entry.a(short, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 49
                int r0 = r6 + 1
                int r8 = r8 * 49
                int r8 = 52 - r8
                byte[] r1 = com.android.volley.Cache.Entry.$$d
                int r7 = 99 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2c
            L14:
                r3 = r2
            L15:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L24:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2c:
                int r8 = -r8
                int r7 = r7 + r8
                int r7 = r7 + 3
                r8 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.volley.Cache.Entry.d(byte, byte, byte, java.lang.Object[]):void");
        }

        public boolean isExpired() throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsExpired = isExpired(System.currentTimeMillis());
            int i4 = TuitionPaymentFragmentbindingInflater1 + 41;
            b = i4 % 128;
            int i5 = i4 % 2;
            return zIsExpired;
        }

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i4 = $11 + 101;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.MeasureSpec.getSize(0) + 1235, 35 - Gravity.getAbsoluteGravity(0, 0), -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2764 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Gravity.getAbsoluteGravity(0, 0) + 14, 1504416861, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.getCapsMode("", 0, 0)), 253 - TextUtils.getOffsetBefore("", 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2891, Process.getGidForName("") + 18, 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
            int i6 = $11 + 41;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Type inference failed for: r2v67, types: [boolean, int] */
        boolean isExpired(long j) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                int i2 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                byte[] bArr = $$a;
                byte b2 = bArr[37];
                Object[] objArr3 = new Object[1];
                a(b2, b2, bArr[80], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, i2, iNormalizeMetaState, -1048449946, false, (String) objArr3[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{52333, 44732, 54246, 13507}, (char) (KeyEvent.getMaxKeyCode() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{40925, 14285, 3057, 23084, 8309, 35672, 12901, 4022, 35116, 31654, 18884, 64830, 20451, 4768, 42031, 18584, 27472, 49093, 60777, 58630, 17769, 55754}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{54259, 35795, 14002, 6158}, (char) (3638 - ((Process.getThreadPriority(0) + 20) >> 6)), (-1299459117) + (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{5388, 58767, 48216, 53350, 15671, 13483, 44631, 40416, 19663, 43005, 52382, 35926, 22504, 36229, 47402}, objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0'));
                int iBlue = 921 - Color.blue(0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[80], bArr2[37], (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iBlue, iLastIndexOf, -778300370, false, (String) objArr6[0], null);
            }
            if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                    int i3 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[80];
                    Object[] objArr7 = new Object[1];
                    a(b3, b3, (byte) (-bArr3[2]), objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, absoluteGravity, i3, -1142834547, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = ~iIdentityHashCode;
                int i5 = ~((-558301669) | i4);
                int i6 = ~((-1215777976) | iIdentityHashCode);
                int i7 = (-414465930) + ((i5 | i6) * 1150) + (((~(1215777975 | i4)) | i6) * (-575)) + (((~(iIdentityHashCode | (-558301669))) | (~(i4 | 558301668))) * 575) + 1700314465;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr9 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{6923, 43201, 43930, 20704}, (char) (57515 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0), new char[]{16198, 25080, 10283, 56026, 39346, 15869, 10372, 3365, 44310, 31782, 32539, 62200, 38019, 23092, 31580, 35916, 37145, 26400, 31983, 40830, 35627, 61794, 5203, 36222, 1022, 53014}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{18719, 30798, 35922, 15045}, (char) (50572 - (ViewConfiguration.getLongPressTimeout() >> 16)), Color.green(0), new char[]{13923, 48423, 17202, 7238, 29144, 16583, 62124, 19904, 28053, 31705, 9126, 55876, 25630, 56266, 38209, 27586, 15490, 49273}, objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr11 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{51154, 41125, 61016, 54095}, (char) (KeyEvent.getDeadChar(0, 0) + 20462), Process.myTid() >> 22, new char[]{53081, 48750, 19164, 8843, 36103, 4341, 40913, 12063, 5053, 15689, 43302, 35275, 20972, 34178, 26588, 11836}, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                c(new char[]{0, 0, 0, 0}, new char[]{9513, 22082, 40762, 11545}, (char) (6558 - Process.getGidForName("")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{9682, 4019, 13156, 42328, 63135, 11471, 50436, 58146, 53941, 37656, 32265, 53401, 62636, 58272, 7084, 26032}, objArr12);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                int i10 = b + 33;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 1700314465};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[1];
                    byte b5 = b4;
                    Object[] objArr14 = new Object[1];
                    d(b5, (byte) (b5 - 1), b4, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    byte b6 = bArr4[1];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr15 = new Object[1];
                    d(b7, b8, (byte) (b8 - 1), objArr15);
                    Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        Object[] objArr17 = new Object[1];
                        a(b9, b9, (byte) (-bArr5[2]), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, deadChar, edgeSlop, -1142834547, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{52333, 44732, 54246, 13507}, (char) (AndroidCharacter.getMirror('0') - '0'), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{40925, 14285, 3057, 23084, 8309, 35672, 12901, 4022, 35116, 31654, 18884, 64830, 20451, 4768, 42031, 18584, 27472, 49093, 60777, 58630, 17769, 55754}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new char[]{0, 0, 0, 0}, new char[]{54259, 35795, 14002, 6158}, (char) (3638 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1299459117, new char[]{5388, 58767, 48216, 53350, 15671, 13483, 44631, 40416, 19663, 43005, 52382, 35926, 22504, 36229, 47402}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                            int defaultSize = View.getDefaultSize(0, 0) + 28;
                            byte[] bArr6 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(bArr6[80], bArr6[37], (byte) 52, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iKeyCodeFromString, defaultSize, -778300370, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
                            int edgeSlop2 = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                            byte[] bArr7 = $$a;
                            byte b10 = bArr7[37];
                            byte b11 = bArr7[80];
                            Object[] objArr21 = new Object[1];
                            a(b10, b10, b11, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, edgeSlop2, maximumFlingVelocity, -1048449946, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i12 = b + 95;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        int i13 = i12 % 2;
                        objArr = objArr16;
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
            int i14 = ((int[]) objArr[1])[0];
            int i15 = ((int[]) objArr[3])[0];
            if (i15 == i14) {
                int i16 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i17 = i16 + 1702492072 + (((~(startElapsedRealtime | 820966469)) | (-955252312)) * 305) + (((~((~startElapsedRealtime) | 820966469)) | (-953113175)) * 305);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr2[0])[0] = i19 ^ (i19 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i20 = TuitionPaymentFragmentbindingInflater1 + 57;
                    b = i20 % 128;
                    int i21 = 2;
                    int i22 = i20 % 2;
                    int i23 = 0;
                    while (i23 < strArr.length) {
                        int i24 = TuitionPaymentFragmentbindingInflater1 + 65;
                        b = i24 % 128;
                        if (i24 % i21 != 0) {
                            arrayList.add(strArr[i23]);
                            i23 += 27;
                        } else {
                            arrayList.add(strArr[i23]);
                            i23++;
                        }
                        i21 = 2;
                    }
                }
                int[] iArr = new int[i15];
                int i25 = i15 - 1;
                iArr[i25] = 1;
                Toast.makeText((Context) null, iArr[((i15 * i25) % 2) - 1], 1).show();
                int i26 = ((int[]) objArr[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i27 = ~iIdentityHashCode2;
                int i28 = i26 + 134002307 + (((~((-687665068) | i27)) | 12603040 | (~((-1086414577) | i27))) * (-1136)) + (((~((-687665068) | iIdentityHashCode2)) | (~((-1086414577) | iIdentityHashCode2)) | (~(1761476603 | i27))) * (-568)) + (((~(iIdentityHashCode2 | (-12603041))) | (~(i27 | 1086414576)) | (~(687665067 | i27))) * 568);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
            }
            if (this.ttl >= j) {
                return false;
            }
            int i31 = ((int[]) objArr2[0])[0];
            int i32 = i31 * i31;
            int i33 = -(784910376 * i31);
            int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
            int i35 = -(i31 * (-211609334));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            int i37 = ((i36 | (-1388758159)) << 1) - ((-1388758159) ^ i36);
            int i38 = i37 >> 18;
            int i39 = (((i38 & (-32767)) + (i38 | (-32767))) / 16384) + 1;
            int i40 = (i37 ^ i39) + ((i39 & i37) << 1);
            int i41 = i37 >> 19;
            int i42 = ((i41 & (-16383)) + (i41 | (-16383))) / 8192;
            int i43 = (-(i40 ^ (((i42 | 1) << 1) - (i42 ^ 1)))) + 2;
            int i44 = i43 >> 27;
            int i45 = ((i44 & (-63)) + (i44 | (-63))) / 32;
            int i46 = ((i45 | 1) << 1) - (i45 ^ 1);
            return 1156 / ((i43 & (-((i46 ^ 1) + ((i46 & 1) << 1)))) * 578);
        }

        public boolean refreshNeeded() {
            boolean zRefreshNeeded;
            int i = 2 % 2;
            int i2 = b + 33;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                zRefreshNeeded = refreshNeeded(System.currentTimeMillis());
                int i3 = 16 / 0;
            } else {
                zRefreshNeeded = refreshNeeded(System.currentTimeMillis());
            }
            int i4 = b + 67;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return zRefreshNeeded;
        }

        boolean refreshNeeded(long j) {
            int i = 2 % 2;
            int i2 = b;
            int i3 = i2 + 51;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this.softTtl >= j) {
                return false;
            }
            int i4 = i2 + 47;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, short r7, byte r8) {
            /*
                int r8 = r8 * 4
                int r0 = r8 + 1
                int r7 = r7 + 102
                byte[] r1 = com.android.volley.Cache.Entry.$$c
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L13
                r3 = r7
                r4 = r2
                r7 = r6
                goto L28
            L13:
                r3 = r2
            L14:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                r3 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r5
            L28:
                int r3 = -r3
                int r6 = r6 + r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.volley.Cache.Entry.$$g(short, short, byte):java.lang.String");
        }
    }
}
