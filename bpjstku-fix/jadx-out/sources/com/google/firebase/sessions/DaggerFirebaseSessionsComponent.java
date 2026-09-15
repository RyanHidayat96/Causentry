package com.google.firebase.sessions;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.content.core.DataStore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.DoubleCheck;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.settings.LocalOverrideSettings;
import com.google.firebase.sessions.settings.LocalOverrideSettings_Factory;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher_Factory;
import com.google.firebase.sessions.settings.RemoteSettings_Factory;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.firebase.sessions.settings.SessionsSettings_Factory;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import com.google.firebase.sessions.settings.SettingsCacheImpl_Factory;
import defpackage.deInitSession;
import defpackage.getCaptureFuture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class DaggerFirebaseSessionsComponent {
    private DaggerFirebaseSessionsComponent() {
    }

    public static FirebaseSessionsComponent.Builder builder() {
        return new Builder();
    }

    static final class Builder implements FirebaseSessionsComponent.Builder {
        private Context appContext;
        private CoroutineContext backgroundDispatcher;
        private CoroutineContext blockingDispatcher;
        private FirebaseApp firebaseApp;
        private FirebaseInstallationsApi firebaseInstallationsApi;
        private Provider<getCaptureFuture> transportFactoryProvider;
        private static final byte[] $$c = {110, -73, -111, 99};
        private static final int $$f = 38;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {93, -122, -23, -24, -9, -26, 22, -29, -18, -4, -9, -28, 4, -10, 16, -54, 4, -19, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 120;
        private static final byte[] $$a = {53, -70, 9, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$b = 14;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60043, 60048, 60045, 60063, 60055, 60053, 60040, 60042, 60054, 60051, 60041, 60083, 60072, 60117, 60073, 60052, 60050, 60047, 60058, 60049, 60056, 60062, 60060, 60088, 60034};
        private static char b = 57188;

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 52
                int r0 = r7 + 1
                byte[] r1 = com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder.$$a
                int r6 = r6 * 52
                int r6 = 55 - r6
                int r8 = r8 + 84
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2e
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                int r6 = r6 + 1
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder.a(short, byte, int, java.lang.Object[]):void");
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
        private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 14
                int r7 = r7 + 4
                int r6 = r6 * 19
                int r6 = 103 - r6
                byte[] r0 = com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder.$$d
                int r8 = r8 * 38
                int r1 = 53 - r8
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r7
                r7 = r8
                r4 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r7 + (-11)
                int r7 = r3 + 1
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder.d(short, int, byte, java.lang.Object[]):void");
        }

        private Builder() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x01bb  */
        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final /* bridge */ /* synthetic */ FirebaseSessionsComponent.Builder appContext(Context context) throws Throwable {
            Context applicationContext;
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iRed = Color.red(0) + 876;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a((byte) (-bArr[5]), bArr[7], (byte) $$b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iRed, pressedStateDuration, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{15, '\b', 0, '\r', 16, 17, '\b', 18, 16, 5, 14, '\r', 21, '\t', 16, 22, '\r', 3, 0, 19, 21, 0}, (byte) (Color.rgb(0, 0, 0) + 16777236), 22 - (Process.myPid() >> 22), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{24, 1, 15, 3, 11, 1, 4, '\r', 23, 16, 2, 19, 18, 6, 13915}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 92), (ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i2 = 877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$a;
                byte b2 = (byte) (-bArr2[5]);
                Object[] objArr5 = new Object[1];
                a(b2, b2, bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, i2, iKeyCodeFromString, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int defaultSize = 876 - View.getDefaultSize(0, 0);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b3, b3, bArr3[54], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, defaultSize, iResolveOpacity, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i3 = ~iIdentityHashCode;
                int i4 = (~((-1072965540) | i3)) | 40904225;
                int i5 = ~(iIdentityHashCode | (-593997));
                int i6 = (((-900605302) + ((i4 | i5) * (-502))) + ((i5 | (~(i3 | (-1032061315)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1767718089;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            } else {
                if (context == null) {
                    applicationContext = context;
                } else if (!(!(context instanceof ContextWrapper))) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) context).getBaseContext() != null) {
                        applicationContext = context.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = context.getApplicationContext();
                }
                Object[] objArr8 = new Object[1];
                c(new char[]{15, 19, 3, 17, 14, 3, 15, '\b', 23, '\f', 14, 22, 7, 16, 23, 6}, (byte) (30 - ExpandableListView.getPackedPositionChild(0L)), 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{18, 1, 20, 6, 18, 17, 19, 22, '\r', 16, 7, 5, 20, 18, 1, 23}, (byte) (Process.getGidForName("") + 1), 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9);
                try {
                    Object[] objArr10 = {applicationContext, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -1767718089};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[21];
                    Object[] objArr11 = new Object[1];
                    d(b4, b4, bArr4[19], objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b5 = bArr4[19];
                    Object[] objArr12 = new Object[1];
                    d(b5, b5, bArr4[21], objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i11 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iResolveOpacity2 = 10 - Drawable.resolveOpacity(0, 0);
                            byte[] bArr5 = $$a;
                            byte b6 = bArr5[7];
                            Object[] objArr14 = new Object[1];
                            a(b6, b6, bArr5[54], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, i11, iResolveOpacity2, 256017550, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            c(new char[]{15, '\b', 0, '\r', 16, 17, '\b', 18, 16, 5, 14, '\r', 21, '\t', 16, 22, '\r', 3, 0, 19, 21, 0}, (byte) ((Process.myPid() >> 22) + 20), TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            c(new char[]{24, 1, 15, 3, 11, 1, 4, '\r', 23, 16, 2, 19, 18, 6, 13915}, (byte) (Color.blue(0) + 92), 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int iMyTid = 876 - (Process.myTid() >> 22);
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 10;
                                byte[] bArr6 = $$a;
                                byte b7 = (byte) (-bArr6[5]);
                                Object[] objArr17 = new Object[1];
                                a(b7, b7, bArr6[7], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iMyTid, capsMode, 2009631821, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                                int iIndexOf = TextUtils.indexOf("", "", 0) + 876;
                                int i12 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                byte[] bArr7 = $$a;
                                Object[] objArr18 = new Object[1];
                                a((byte) (-bArr7[5]), bArr7[7], (byte) $$b, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf, i12, 252381699, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i13 = TuitionPaymentFragmentbindingInflater1 + 41;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                            int i14 = i13 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr13;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                throw null;
            }
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i18 = ~iFreeMemory;
            int i19 = i17 + 847904972 + (((~((-120744401) | i18)) | (-80434172)) * (-602)) + (((~(iFreeMemory | (-120744401))) | 53487616 | (~((-13177388) | i18))) * (-301)) + ((~(i18 | (-80434172))) * 301);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr19[1])[0] = i21 ^ (i21 << 5);
            int i22 = TuitionPaymentFragmentbindingInflater1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
            if (i22 % 2 == 0) {
                return appContext(context);
            }
            appContext(context);
            throw null;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final /* bridge */ /* synthetic */ FirebaseSessionsComponent.Builder backgroundDispatcher(CoroutineContext coroutineContext) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                backgroundDispatcher(coroutineContext);
                obj.hashCode();
                throw null;
            }
            Builder builderBackgroundDispatcher = backgroundDispatcher(coroutineContext);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 != 0) {
                return builderBackgroundDispatcher;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0133  */
        /* JADX WARN: Code duplicated, block: B:44:0x013f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0153  */
        /* JADX WARN: Code duplicated, block: B:47:0x0169  */
        /* JADX WARN: Code duplicated, block: B:50:0x01b6 A[Catch: all -> 0x036e, TryCatch #1 {all -> 0x036e, blocks: (B:23:0x0094, B:25:0x00a5, B:26:0x00d2, B:48:0x016b, B:50:0x01b6, B:51:0x0224, B:55:0x0239, B:57:0x0272, B:58:0x02d3), top: B:77:0x0094 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0237  */
        /* JADX WARN: Code duplicated, block: B:57:0x0272 A[Catch: all -> 0x036e, TryCatch #1 {all -> 0x036e, blocks: (B:23:0x0094, B:25:0x00a5, B:26:0x00d2, B:48:0x016b, B:50:0x01b6, B:51:0x0224, B:55:0x0239, B:57:0x0272, B:58:0x02d3), top: B:77:0x0094 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x02f4  */
        /* JADX WARN: Code duplicated, block: B:62:0x02fb  */
        /* JADX WARN: Code duplicated, block: B:63:0x032d  */
        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3;
            Object obj;
            Object[] objArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int length;
            char[] cArr2;
            int i4 = 2;
            int i5 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i6 = 1770390596;
            Object obj2 = null;
            if (cArr3 != null) {
                int i7 = $10 + 67;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $11 + 65;
                    $10 = i9 % 128;
                    int i10 = i9 % i4;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2266 - TextUtils.lastIndexOf("", '0'), 33 - TextUtils.getOffsetBefore("", 0), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                        i8++;
                        i4 = 2;
                        i6 = 1770390596;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i11 = $11 + 15;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i13 = $11 + 7;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                i3 = $10 + 93;
                                $11 = i3 % 128;
                                if (i3 % 2 == 0) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >> b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / b2);
                                } else {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                }
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49267), Drawable.resolveOpacity(0, 0) + 3261, 29 - ImageFormat.getBitsPerPixel(0), -127612708, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b9 = (byte) 0;
                                        byte b10 = b9;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - ExpandableListView.getPackedPositionType(0L)), (Process.myPid() >> 22) + 594, 17 - TextUtils.getTrimmedLength(""), 1570859318, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i15 = $10 + 47;
                                        $11 = i15 % 128;
                                        int i16 = i15 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i17];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i18];
                                    } else {
                                        int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i19];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i20];
                                    }
                                }
                            }
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                i3 = $10 + 93;
                                $11 = i3 % 128;
                                if (i3 % 2 == 0) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >> b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / b2);
                                } else {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                }
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b11 = (byte) 0;
                                    byte b12 = b11;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49267), Drawable.resolveOpacity(0, 0) + 3261, 29 - ImageFormat.getBitsPerPixel(0), -127612708, false, $$g(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b13 = (byte) 0;
                                        byte b14 = b13;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - ExpandableListView.getPackedPositionType(0L)), (Process.myPid() >> 22) + 594, 17 - TextUtils.getTrimmedLength(""), 1570859318, false, $$g(b13, b14, (byte) (b14 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i110];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i111 = $10 + 47;
                                        $11 = i111 % 128;
                                        int i112 = i111 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i113];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i114];
                                    } else {
                                        int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i115];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i21];
                                    }
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                for (int i22 = 0; i22 < i; i22++) {
                    int i23 = $11 + 49;
                    $10 = i23 % 128;
                    int i24 = i23 % 2;
                    cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final /* bridge */ /* synthetic */ FirebaseSessionsComponent.Builder blockingDispatcher(CoroutineContext coroutineContext) throws IllegalAccessException {
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.getDefaultSize(0, 0)), 40 - TextUtils.getOffsetAfter("", 0), 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1513912262, false, "b", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37836), (ViewConfiguration.getTapTimeout() >> 16) + 59, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            long j = i3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37836), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59, 18 - (ViewConfiguration.getEdgeSlop() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = -375;
            long j3 = (j2 * 1571681844661784178L) + (j2 * 3947571652498002061L);
            long j4 = 376;
            long jIdentityHashCode = System.identityHashCode(this);
            long j5 = -1;
            long j6 = j5 ^ 1571681844661784178L;
            long j7 = 4021643891181592319L ^ j5;
            long j8 = j3 + ((jIdentityHashCode | ((j6 | (j5 ^ 3947571652498002061L)) ^ j5) | j7) * j4) + (((long) (-376)) * ((((jIdentityHashCode ^ j5) | 1571681844661784178L) ^ j5) | j7)) + (j4 * (((j6 | jIdentityHashCode) ^ j5) | 3947571652498002061L));
            int i5 = 0;
            while (true) {
                int i6 = 0;
                while (i6 != 8) {
                    i4 = (((((int) (j >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                    i6++;
                    int i7 = TuitionPaymentFragmentbindingInflater1 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (i5 != 0) {
                    break;
                }
                i5++;
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                int i10 = i9 % 2;
                j = j8;
            }
            if (i4 != i2) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                int i12 = i11 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (ViewConfiguration.getTapTimeout() >> 16)), Drawable.resolveOpacity(0, 0) + 40, 19 - (ViewConfiguration.getTapTimeout() >> 16), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
            }
            return blockingDispatcher(coroutineContext);
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final /* bridge */ /* synthetic */ FirebaseSessionsComponent.Builder firebaseApp(FirebaseApp firebaseApp) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Builder builderFirebaseApp = firebaseApp(firebaseApp);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                return builderFirebaseApp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final /* bridge */ /* synthetic */ FirebaseSessionsComponent.Builder firebaseInstallationsApi(FirebaseInstallationsApi firebaseInstallationsApi) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Builder builderFirebaseInstallationsApi = firebaseInstallationsApi(firebaseInstallationsApi);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 48 / 0;
            }
            return builderFirebaseInstallationsApi;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final /* bridge */ /* synthetic */ FirebaseSessionsComponent.Builder transportFactoryProvider(Provider provider) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Builder builderTransportFactoryProvider = transportFactoryProvider((Provider<getCaptureFuture>) provider);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return builderTransportFactoryProvider;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final Builder appContext(Context context) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Context context2 = (Context) Preconditions.checkNotNull(context);
            if (i3 == 0) {
                this.appContext = context2;
                return this;
            }
            this.appContext = context2;
            throw null;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final Builder backgroundDispatcher(CoroutineContext coroutineContext) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.backgroundDispatcher = (CoroutineContext) Preconditions.checkNotNull(coroutineContext);
            if (i3 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final Builder blockingDispatcher(CoroutineContext coroutineContext) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            this.blockingDispatcher = (CoroutineContext) Preconditions.checkNotNull(coroutineContext);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final Builder firebaseApp(FirebaseApp firebaseApp) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            this.firebaseApp = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final Builder firebaseInstallationsApi(FirebaseInstallationsApi firebaseInstallationsApi) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) Preconditions.checkNotNull(firebaseInstallationsApi);
            if (i3 != 0) {
                this.firebaseInstallationsApi = firebaseInstallationsApi2;
                return this;
            }
            this.firebaseInstallationsApi = firebaseInstallationsApi2;
            throw null;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final Builder transportFactoryProvider(Provider<getCaptureFuture> provider) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.transportFactoryProvider = (Provider) Preconditions.checkNotNull(provider);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 0;
            }
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public final FirebaseSessionsComponent build() {
            int i = 2 % 2;
            Preconditions.checkBuilderRequirement(this.appContext, Context.class);
            Preconditions.checkBuilderRequirement(this.backgroundDispatcher, CoroutineContext.class);
            Preconditions.checkBuilderRequirement(this.blockingDispatcher, CoroutineContext.class);
            Preconditions.checkBuilderRequirement(this.firebaseApp, FirebaseApp.class);
            Preconditions.checkBuilderRequirement(this.firebaseInstallationsApi, FirebaseInstallationsApi.class);
            Preconditions.checkBuilderRequirement(this.transportFactoryProvider, Provider.class);
            FirebaseSessionsComponentImpl firebaseSessionsComponentImpl = new FirebaseSessionsComponentImpl(this.appContext, this.backgroundDispatcher, this.blockingDispatcher, this.firebaseApp, this.firebaseInstallationsApi, this.transportFactoryProvider);
            int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return firebaseSessionsComponentImpl;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r7, short r8, short r9) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = r8 + 1
                byte[] r0 = com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder.$$c
                int r9 = r9 + 113
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r7
                goto L29
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L29:
                int r7 = r7 + r3
                int r9 = r9 + 1
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder.$$g(byte, short, short):java.lang.String");
        }
    }

    static final class FirebaseSessionsComponentImpl implements FirebaseSessionsComponent {
        private com.google.firebase.sessions.dagger.internal.Provider<Context> appContextProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<ApplicationInfo> applicationInfoProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<CoroutineContext> backgroundDispatcherProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<CoroutineContext> blockingDispatcherProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<EventGDTLogger> eventGDTLoggerProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<FirebaseApp> firebaseAppProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<FirebaseInstallationsApi> firebaseInstallationsApiProvider;
        private final FirebaseSessionsComponentImpl firebaseSessionsComponentImpl;
        private com.google.firebase.sessions.dagger.internal.Provider<FirebaseSessions> firebaseSessionsProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<LocalOverrideSettings> localOverrideSettingsProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<ProcessDataManagerImpl> processDataManagerImplProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<RemoteSettingsFetcher> remoteSettingsFetcherProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<RemoteSettings> remoteSettingsProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<DataStore<SessionConfigs>> sessionConfigsDataStoreProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<SessionDataSerializer> sessionDataSerializerProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<DataStore<SessionData>> sessionDataStoreProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<SessionFirelogPublisherImpl> sessionFirelogPublisherImplProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<SessionGenerator> sessionGeneratorProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<SessionsActivityLifecycleCallbacks> sessionsActivityLifecycleCallbacksProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<SessionsSettings> sessionsSettingsProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<SettingsCacheImpl> settingsCacheImplProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<SharedSessionRepositoryImpl> sharedSessionRepositoryImplProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<TimeProvider> timeProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<Provider<getCaptureFuture>> transportFactoryProvider;
        private com.google.firebase.sessions.dagger.internal.Provider<UuidGenerator> uuidGeneratorProvider;

        private FirebaseSessionsComponentImpl(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<getCaptureFuture> provider) {
            this.firebaseSessionsComponentImpl = this;
            initialize(context, coroutineContext, coroutineContext2, firebaseApp, firebaseInstallationsApi, provider);
        }

        private void initialize(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<getCaptureFuture> provider) {
            this.firebaseAppProvider = InstanceFactory.create(firebaseApp);
            Factory factoryCreate = InstanceFactory.create(context);
            this.appContextProvider = factoryCreate;
            this.localOverrideSettingsProvider = DoubleCheck.provider(LocalOverrideSettings_Factory.create(factoryCreate));
            this.timeProvider = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory.create());
            this.firebaseInstallationsApiProvider = InstanceFactory.create(firebaseInstallationsApi);
            this.applicationInfoProvider = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory.create(this.firebaseAppProvider));
            Factory factoryCreate2 = InstanceFactory.create(coroutineContext2);
            this.blockingDispatcherProvider = factoryCreate2;
            this.remoteSettingsFetcherProvider = DoubleCheck.provider(RemoteSettingsFetcher_Factory.create(this.applicationInfoProvider, factoryCreate2));
            this.backgroundDispatcherProvider = InstanceFactory.create(coroutineContext);
            com.google.firebase.sessions.dagger.internal.Provider<DataStore<SessionConfigs>> provider2 = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory.create(this.appContextProvider, this.blockingDispatcherProvider));
            this.sessionConfigsDataStoreProvider = provider2;
            com.google.firebase.sessions.dagger.internal.Provider<SettingsCacheImpl> provider3 = DoubleCheck.provider(SettingsCacheImpl_Factory.create(this.backgroundDispatcherProvider, this.timeProvider, provider2));
            this.settingsCacheImplProvider = provider3;
            com.google.firebase.sessions.dagger.internal.Provider<RemoteSettings> provider4 = DoubleCheck.provider(RemoteSettings_Factory.create(this.timeProvider, this.firebaseInstallationsApiProvider, this.applicationInfoProvider, this.remoteSettingsFetcherProvider, provider3));
            this.remoteSettingsProvider = provider4;
            this.sessionsSettingsProvider = DoubleCheck.provider(SessionsSettings_Factory.create(this.localOverrideSettingsProvider, provider4));
            com.google.firebase.sessions.dagger.internal.Provider<UuidGenerator> provider5 = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory.create());
            this.uuidGeneratorProvider = provider5;
            this.sessionGeneratorProvider = DoubleCheck.provider(SessionGenerator_Factory.create(this.timeProvider, provider5));
            Factory factoryCreate3 = InstanceFactory.create(provider);
            this.transportFactoryProvider = factoryCreate3;
            com.google.firebase.sessions.dagger.internal.Provider<EventGDTLogger> provider6 = DoubleCheck.provider(EventGDTLogger_Factory.create(factoryCreate3));
            this.eventGDTLoggerProvider = provider6;
            this.sessionFirelogPublisherImplProvider = DoubleCheck.provider(SessionFirelogPublisherImpl_Factory.create(this.firebaseAppProvider, this.firebaseInstallationsApiProvider, this.sessionsSettingsProvider, provider6, this.backgroundDispatcherProvider));
            com.google.firebase.sessions.dagger.internal.Provider<SessionDataSerializer> provider7 = DoubleCheck.provider(SessionDataSerializer_Factory.create(this.sessionGeneratorProvider));
            this.sessionDataSerializerProvider = provider7;
            this.sessionDataStoreProvider = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory.create(this.appContextProvider, this.blockingDispatcherProvider, provider7));
            com.google.firebase.sessions.dagger.internal.Provider<ProcessDataManagerImpl> provider8 = DoubleCheck.provider(ProcessDataManagerImpl_Factory.create(this.appContextProvider, this.uuidGeneratorProvider));
            this.processDataManagerImplProvider = provider8;
            com.google.firebase.sessions.dagger.internal.Provider<SharedSessionRepositoryImpl> provider9 = DoubleCheck.provider(SharedSessionRepositoryImpl_Factory.create(this.sessionsSettingsProvider, this.sessionGeneratorProvider, this.sessionFirelogPublisherImplProvider, this.timeProvider, this.sessionDataStoreProvider, provider8, this.backgroundDispatcherProvider));
            this.sharedSessionRepositoryImplProvider = provider9;
            com.google.firebase.sessions.dagger.internal.Provider<SessionsActivityLifecycleCallbacks> provider10 = DoubleCheck.provider(SessionsActivityLifecycleCallbacks_Factory.create(provider9));
            this.sessionsActivityLifecycleCallbacksProvider = provider10;
            this.firebaseSessionsProvider = DoubleCheck.provider(FirebaseSessions_Factory.create(this.firebaseAppProvider, this.sessionsSettingsProvider, this.backgroundDispatcherProvider, provider10));
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final FirebaseSessions getFirebaseSessions() {
            return this.firebaseSessionsProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final SessionFirelogPublisher getSessionFirelogPublisher() {
            return this.sessionFirelogPublisherImplProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final SessionGenerator getSessionGenerator() {
            return this.sessionGeneratorProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final SessionsSettings getSessionsSettings() {
            return this.sessionsSettingsProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public final SharedSessionRepository getSharedSessionRepository() {
            return this.sharedSessionRepositoryImplProvider.get();
        }
    }
}
