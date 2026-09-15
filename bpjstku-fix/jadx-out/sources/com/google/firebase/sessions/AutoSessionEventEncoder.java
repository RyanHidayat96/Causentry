package com.google.firebase.sessions;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class AutoSessionEventEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoSessionEventEncoder();

    private AutoSessionEventEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(SessionEvent.class, SessionEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(SessionInfo.class, SessionInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(DataCollectionStatus.class, DataCollectionStatusEncoder.INSTANCE);
        encoderConfig.registerEncoder(ApplicationInfo.class, ApplicationInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, AndroidApplicationInfoEncoder.INSTANCE);
        encoderConfig.registerEncoder(ProcessDetails.class, ProcessDetailsEncoder.INSTANCE);
    }

    static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {
        static final SessionEventEncoder INSTANCE = new SessionEventEncoder();
        private static final FieldDescriptor EVENTTYPE_DESCRIPTOR = FieldDescriptor.of("eventType");
        private static final FieldDescriptor SESSIONDATA_DESCRIPTOR = FieldDescriptor.of("sessionData");
        private static final FieldDescriptor APPLICATIONINFO_DESCRIPTOR = FieldDescriptor.of("applicationInfo");

        private SessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(SessionEvent sessionEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(EVENTTYPE_DESCRIPTOR, sessionEvent.getEventType());
            objectEncoderContext.add(SESSIONDATA_DESCRIPTOR, sessionEvent.getSessionData());
            objectEncoderContext.add(APPLICATIONINFO_DESCRIPTOR, sessionEvent.getApplicationInfo());
        }
    }

    static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {
        private static final FieldDescriptor DATACOLLECTIONSTATUS_DESCRIPTOR;
        private static final FieldDescriptor EVENTTIMESTAMPUS_DESCRIPTOR;
        private static final FieldDescriptor FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR;
        private static final FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR;
        private static final FieldDescriptor FIRSTSESSIONID_DESCRIPTOR;
        static final SessionInfoEncoder INSTANCE;
        private static final FieldDescriptor SESSIONID_DESCRIPTOR;
        private static final FieldDescriptor SESSIONINDEX_DESCRIPTOR;
        private static boolean TuitionPaymentFragmentbindingInflater1;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static int b;
        private static final byte[] $$c = {6, 51, 46, 31};
        private static final int $$f = 186;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {58, -103, 118, 14, 14, 0, -61, 53, 17, 2, 5, -11, 8, 15, -18, 15, -66, Base64.padSymbol, 7, 8, -13, 15, -2, -11, 13, -60, 21, 7, 36, -53, 66, -28, -13, 9, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -65};
        private static final int $$e = 116;
        private static final byte[] $$a = {115, 25, -47, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$b = 102;
        private static int asInterface = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f824a = 1;
        private static int d = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 52
                int r0 = r6 + 1
                int r7 = r7 + 84
                byte[] r1 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.$$a
                int r5 = r5 * 52
                int r5 = 56 - r5
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r7 = r5
                r4 = r6
                r3 = r2
                goto L27
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L23:
                int r3 = r3 + 1
                r4 = r1[r5]
            L27:
                int r5 = r5 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.c(short, byte, short, java.lang.Object[]):void");
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
        private static void f(byte r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 15
                int r9 = 99 - r9
                byte[] r0 = com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.$$d
                int r7 = r7 * 22
                int r7 = r7 + 31
                int r8 = r8 * 30
                int r8 = 34 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r9 = r8
                r5 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
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
                int r3 = r3 + r8
                int r8 = r3 + (-2)
                int r9 = r9 + 1
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.AutoSessionEventEncoder.SessionInfoEncoder.f(byte, byte, int, java.lang.Object[]):void");
        }

        private SessionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 125;
            f824a = i2 % 128;
            int i3 = i2 % 2;
            encode((SessionInfo) obj, objectEncoderContext);
            int i4 = asInterface + 63;
            f824a = i4 % 128;
            int i5 = i4 % 2;
        }

        static {
            b = 0;
            b();
            INSTANCE = new SessionInfoEncoder();
            SESSIONID_DESCRIPTOR = FieldDescriptor.of("sessionId");
            FIRSTSESSIONID_DESCRIPTOR = FieldDescriptor.of("firstSessionId");
            SESSIONINDEX_DESCRIPTOR = FieldDescriptor.of("sessionIndex");
            EVENTTIMESTAMPUS_DESCRIPTOR = FieldDescriptor.of("eventTimestampUs");
            DATACOLLECTIONSTATUS_DESCRIPTOR = FieldDescriptor.of("dataCollectionStatus");
            FIREBASEINSTALLATIONID_DESCRIPTOR = FieldDescriptor.of("firebaseInstallationId");
            FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = FieldDescriptor.of("firebaseAuthenticationToken");
            int i = d + 105;
            b = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (cArr3 != null) {
                int i3 = $11 + 115;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getTouchSlop() >> 8)), Color.green(0) + 2994, 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43325), KeyEvent.normalizeMetaState(0) + 253, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i6 = 1687675375;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - Drawable.resolveOpacity(0, 0)), Process.getGidForName("") + 3086, TextUtils.getTrimmedLength("") + 26, -2146875848, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i6 = 1687675375;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i7 = $11 + 65;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
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
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33601), 3084 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2146875848, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
            int i8 = $11 + 37;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 31 / 0;
            }
        }

        public final void encode(SessionInfo sessionInfo, ObjectEncoderContext objectEncoderContext) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            objectEncoderContext.add(SESSIONID_DESCRIPTOR, sessionInfo.getSessionId());
            objectEncoderContext.add(FIRSTSESSIONID_DESCRIPTOR, sessionInfo.getFirstSessionId());
            objectEncoderContext.add(SESSIONINDEX_DESCRIPTOR, sessionInfo.getSessionIndex());
            objectEncoderContext.add(EVENTTIMESTAMPUS_DESCRIPTOR, sessionInfo.getEventTimestampUs());
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 10;
                byte[] bArr = $$a;
                byte b2 = (byte) (-bArr[5]);
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, b3, (byte) (b3 | 14), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, i2, capsMode, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(null, null, 127 - KeyEvent.keyCodeFromString(""), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cBlue = (char) Color.blue(0);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                int iRed = Color.red(0) + 10;
                byte[] bArr2 = $$a;
                byte b4 = (byte) (-bArr2[5]);
                Object[] objArr5 = new Object[1];
                c(b4, b4, bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iResolveSizeAndState, iRed, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    c(b5, b5, bArr3[54], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, absoluteGravity, deadChar, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i3 = ~startElapsedRealtime;
                int i4 = ~(476242228 | i3);
                int i5 = ((((-887678412) + (((-503049088) | i4) * (-712))) + (((~(startElapsedRealtime | (-26806860))) | (~(i3 | 503049087))) * (-712))) + ((435931999 | i4) * 712)) - 1471116728;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                int i8 = asInterface + 1;
                f824a = i8 % 128;
                int i9 = i8 % 2;
            } else {
                Object[] objArr8 = new Object[1];
                e(null, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(null, null, 126 - TextUtils.lastIndexOf("", '0'), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e(null, null, 127 - ExpandableListView.getPackedPositionType(0L), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i10 = asInterface + 9;
                f824a = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -1471116728};
                    byte[] bArr4 = $$d;
                    byte b6 = bArr4[5];
                    Object[] objArr13 = new Object[1];
                    f(b6, bArr4[39], b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr4[39];
                    Object[] objArr14 = new Object[1];
                    f(b7, bArr4[5], b7, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 10;
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[7];
                            Object[] objArr16 = new Object[1];
                            c(b8, b8, bArr5[54], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, iMakeMeasureSpec, iResolveSizeAndState2, 256017550, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            e(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            e(null, null, (-16777089) - Color.rgb(0, 0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                int threadPriority2 = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                                byte[] bArr6 = $$a;
                                byte b9 = (byte) (-bArr6[5]);
                                Object[] objArr19 = new Object[1];
                                c(b9, b9, bArr6[7], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, threadPriority2, i12, 2009631821, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                int iAxisFromString = MotionEvent.axisFromString("") + 877;
                                int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte[] bArr7 = $$a;
                                byte b10 = (byte) (-bArr7[5]);
                                byte b11 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                c(b10, b11, (byte) (b11 | 14), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iAxisFromString, maximumDrawingCacheSize, 252381699, false, (String) objArr20[0], null);
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
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 == i13) {
                int i15 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i16 = ~iIdentityHashCode;
                int i17 = i15 + 40370043 + (((~(804652672 | i16)) | (-1073684182)) * 98) + (((~(i16 | (-844962902))) | 804652672 | (~(844962901 | iIdentityHashCode))) * (-49)) + (((~(iIdentityHashCode | 804652672)) | 228721280) * 49);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr21[1])[0] = i19 ^ (i19 << 5);
                int i20 = asInterface + 99;
                f824a = i20 % 128;
                int i21 = i20 % 2;
            } else {
                int[] iArr = new int[i14];
                int i22 = i14 - 1;
                iArr[i22] = 1;
                Toast.makeText((Context) null, iArr[((i14 * i22) % 2) - 1], 1).show();
                int i23 = ((int[]) objArr[1])[0];
                Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i24 = i23 + (((~((~iUptimeMillis) | 938213077)) * 130) - 2043406976) + (((~(iUptimeMillis | 938213077)) | 822088832) * 130);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr22[1])[0] = i26 ^ (i26 << 5);
            }
            objectEncoderContext.add(DATACOLLECTIONSTATUS_DESCRIPTOR, sessionInfo.getDataCollectionStatus());
            objectEncoderContext.add(FIREBASEINSTALLATIONID_DESCRIPTOR, sessionInfo.getFirebaseInstallationId());
            objectEncoderContext.add(FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR, sessionInfo.getFirebaseAuthenticationToken());
        }

        static void b() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{47441, 47428, 47438, 47424, 47427, 47433, 47364, 47487, 47455, 47481, 47486, 47437, 47429, 47407, 47430, 47439, 47431, 47426, 47392, 47409, 47484, 47454, 47434, 47485, 47432, 47435, 47402};
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719666;
            TuitionPaymentFragmentbindingInflater1 = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        }

        private static String $$g(int i, byte b2, byte b3) {
            int i2 = 68 - b2;
            int i3 = i * 2;
            byte[] bArr = $$c;
            int i4 = (b3 * 4) + 4;
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            int i6 = -1;
            if (bArr == null) {
                i2 += i4;
                i4++;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i4;
                i2 += bArr[i4];
                i4 = i8 + 1;
                i6 = i7;
            }
        }
    }

    static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {
        static final DataCollectionStatusEncoder INSTANCE = new DataCollectionStatusEncoder();
        private static final FieldDescriptor PERFORMANCE_DESCRIPTOR = FieldDescriptor.of("performance");
        private static final FieldDescriptor CRASHLYTICS_DESCRIPTOR = FieldDescriptor.of("crashlytics");
        private static final FieldDescriptor SESSIONSAMPLINGRATE_DESCRIPTOR = FieldDescriptor.of("sessionSamplingRate");

        private DataCollectionStatusEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PERFORMANCE_DESCRIPTOR, dataCollectionStatus.getPerformance());
            objectEncoderContext.add(CRASHLYTICS_DESCRIPTOR, dataCollectionStatus.getCrashlytics());
            objectEncoderContext.add(SESSIONSAMPLINGRATE_DESCRIPTOR, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {
        static final ApplicationInfoEncoder INSTANCE = new ApplicationInfoEncoder();
        private static final FieldDescriptor APPID_DESCRIPTOR = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.APP_ID);
        private static final FieldDescriptor DEVICEMODEL_DESCRIPTOR = FieldDescriptor.of("deviceModel");
        private static final FieldDescriptor SESSIONSDKVERSION_DESCRIPTOR = FieldDescriptor.of("sessionSdkVersion");
        private static final FieldDescriptor OSVERSION_DESCRIPTOR = FieldDescriptor.of("osVersion");
        private static final FieldDescriptor LOGENVIRONMENT_DESCRIPTOR = FieldDescriptor.of("logEnvironment");
        private static final FieldDescriptor ANDROIDAPPINFO_DESCRIPTOR = FieldDescriptor.of("androidAppInfo");

        private ApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(ApplicationInfo applicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(APPID_DESCRIPTOR, applicationInfo.getAppId());
            objectEncoderContext.add(DEVICEMODEL_DESCRIPTOR, applicationInfo.getDeviceModel());
            objectEncoderContext.add(SESSIONSDKVERSION_DESCRIPTOR, applicationInfo.getSessionSdkVersion());
            objectEncoderContext.add(OSVERSION_DESCRIPTOR, applicationInfo.getOsVersion());
            objectEncoderContext.add(LOGENVIRONMENT_DESCRIPTOR, applicationInfo.getLogEnvironment());
            objectEncoderContext.add(ANDROIDAPPINFO_DESCRIPTOR, applicationInfo.getAndroidAppInfo());
        }
    }

    static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {
        static final AndroidApplicationInfoEncoder INSTANCE = new AndroidApplicationInfoEncoder();
        private static final FieldDescriptor PACKAGENAME_DESCRIPTOR = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        private static final FieldDescriptor VERSIONNAME_DESCRIPTOR = FieldDescriptor.of("versionName");
        private static final FieldDescriptor APPBUILDVERSION_DESCRIPTOR = FieldDescriptor.of("appBuildVersion");
        private static final FieldDescriptor DEVICEMANUFACTURER_DESCRIPTOR = FieldDescriptor.of("deviceManufacturer");
        private static final FieldDescriptor CURRENTPROCESSDETAILS_DESCRIPTOR = FieldDescriptor.of("currentProcessDetails");
        private static final FieldDescriptor APPPROCESSDETAILS_DESCRIPTOR = FieldDescriptor.of("appProcessDetails");

        private AndroidApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(AndroidApplicationInfo androidApplicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PACKAGENAME_DESCRIPTOR, androidApplicationInfo.getPackageName());
            objectEncoderContext.add(VERSIONNAME_DESCRIPTOR, androidApplicationInfo.getVersionName());
            objectEncoderContext.add(APPBUILDVERSION_DESCRIPTOR, androidApplicationInfo.getAppBuildVersion());
            objectEncoderContext.add(DEVICEMANUFACTURER_DESCRIPTOR, androidApplicationInfo.getDeviceManufacturer());
            objectEncoderContext.add(CURRENTPROCESSDETAILS_DESCRIPTOR, androidApplicationInfo.getCurrentProcessDetails());
            objectEncoderContext.add(APPPROCESSDETAILS_DESCRIPTOR, androidApplicationInfo.getAppProcessDetails());
        }
    }

    static final class ProcessDetailsEncoder implements ObjectEncoder<ProcessDetails> {
        static final ProcessDetailsEncoder INSTANCE = new ProcessDetailsEncoder();
        private static final FieldDescriptor PROCESSNAME_DESCRIPTOR = FieldDescriptor.of("processName");
        private static final FieldDescriptor PID_DESCRIPTOR = FieldDescriptor.of("pid");
        private static final FieldDescriptor IMPORTANCE_DESCRIPTOR = FieldDescriptor.of("importance");
        private static final FieldDescriptor DEFAULTPROCESS_DESCRIPTOR = FieldDescriptor.of("defaultProcess");

        private ProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PROCESSNAME_DESCRIPTOR, processDetails.getProcessName());
            objectEncoderContext.add(PID_DESCRIPTOR, processDetails.getPid());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, processDetails.getImportance());
            objectEncoderContext.add(DEFAULTPROCESS_DESCRIPTOR, processDetails.isDefaultProcess());
        }
    }
}
