package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AppMeasurementSdk {
    private final zzfb zza;
    private static final byte[] $$c = {106, -66, 28, 119};
    private static final int $$f = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {48, -110, 22, 55, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -40, -19, -23, 7, -9, 3, 32, -48, -2, -7, 11, -23, 76, -17, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
    private static final int $$e = 48;
    private static final byte[] $$a = {81, -102, -70, -91, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 95;
    private static int b = 0;
    private static int asInterface = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47396, 47447, 47393, 47443, 47446, 47452, 47383, 47442, 47410, 47436, 47441, 47392, 47448, 47362, 47449, 47394, 47450, 47445, 47411, 47364, 47439, 47409, 47453, 47440};
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719621;
    private static boolean TuitionPaymentFragmentbindingInflater1 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class ConditionalUserProperty {
        public static final String ACTIVE = "active";
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        public static final String NAME = "name";
        public static final String ORIGIN = "origin";
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        public static final String TIME_TO_LIVE = "time_to_live";
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public interface EventInterceptor extends zzjp {
        @Override // com.google.android.gms.measurement.internal.zzjp
        void interceptEvent(String str, String str2, Bundle bundle, long j);
    }

    public interface OnEventListener extends zzjq {
        @Override // com.google.android.gms.measurement.internal.zzjq
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 56 - r6
            byte[] r0 = com.google.android.gms.measurement.api.AppMeasurementSdk.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.api.AppMeasurementSdk.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 13
            int r7 = 97 - r7
            byte[] r0 = com.google.android.gms.measurement.api.AppMeasurementSdk.$$d
            int r6 = r6 * 38
            int r6 = 41 - r6
            int r8 = r8 * 14
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-4)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.api.AppMeasurementSdk.d(int, short, byte, java.lang.Object[]):void");
    }

    public void beginAdUnitExposure(String str) {
        int i = 2 % 2;
        int i2 = b + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzu(str);
        int i4 = b + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzm(str, str2, bundle);
        int i4 = b + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void endAdUnitExposure(String str) {
        int i = 2 % 2;
        int i2 = b + 3;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzv(str);
            throw null;
        }
        this.zza.zzv(str);
        int i3 = asInterface + 35;
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public long generateEventId() {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzz();
            throw null;
        }
        long jZzz = this.zza.zzz();
        int i3 = asInterface + 9;
        b = i3 % 128;
        int i4 = i3 % 2;
        return jZzz;
    }

    public String getAppInstanceId() {
        int i = 2 % 2;
        int i2 = b + 75;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzy();
            throw null;
        }
        String strZzy = this.zza.zzy();
        int i3 = b + 105;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
        }
        return strZzy;
    }

    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        b = i2 % 128;
        int i3 = i2 % 2;
        List<Bundle> listZzn = this.zza.zzn(str, str2);
        int i4 = b + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return listZzn;
    }

    public String getCurrentScreenClass() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzB();
            throw null;
        }
        String strZzB = this.zza.zzB();
        int i3 = b + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return strZzB;
    }

    public String getCurrentScreenName() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        String strZzA = this.zza.zzA();
        int i4 = asInterface + 53;
        b = i4 % 128;
        int i5 = i4 % 2;
        return strZzA;
    }

    public String getGmpAppId() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        String strZzx = this.zza.zzx();
        int i4 = asInterface + 45;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return strZzx;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getMaxUserProperties(String str) {
        int i = 2 % 2;
        int i2 = b + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzF(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iZzF = this.zza.zzF(str);
        int i3 = asInterface + 45;
        b = i3 % 128;
        int i4 = i3 % 2;
        return iZzF;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        Map mapZzC;
        int i = 2 % 2;
        int i2 = b + 57;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            mapZzC = this.zza.zzC(str, str2, z);
            int i3 = 17 / 0;
        } else {
            mapZzC = this.zza.zzC(str, str2, z);
        }
        int i4 = asInterface + 45;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return mapZzC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzi(str, str2, bundle);
            throw null;
        }
        this.zza.zzi(str, str2, bundle);
        int i3 = b + 71;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j) {
        int i = 2 % 2;
        int i2 = b + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzj(str, str2, bundle, j);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asInterface + 71;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void performAction(Bundle bundle) {
        zzfb zzfbVar;
        boolean z;
        int i = 2 % 2;
        int i2 = b + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            zzfbVar = this.zza;
            z = true;
        } else {
            zzfbVar = this.zza;
            z = false;
        }
        zzfbVar.zzE(bundle, z);
        int i3 = asInterface + 87;
        b = i3 % 128;
        int i4 = i3 % 2;
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleZzE = this.zza.zzE(bundle, true);
        int i4 = asInterface + 9;
        b = i4 % 128;
        int i5 = i4 % 2;
        return bundleZzE;
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        int i = 2 % 2;
        int i2 = b + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzf(onEventListener);
        int i4 = b + 83;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    public void setConditionalUserProperty(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzl(bundle);
        int i4 = asInterface + 25;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        int i = 2 % 2;
        int i2 = b + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzd(eventInterceptor);
        int i4 = b + 13;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static AppMeasurementSdk getInstance(Context context) {
        int i = 2 % 2;
        int i2 = b + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AppMeasurementSdk appMeasurementSdkZzb = zzfb.zza(context, null).zzb();
        int i4 = asInterface + 7;
        b = i4 % 128;
        int i5 = i4 % 2;
        return appMeasurementSdkZzb;
    }

    public void setCurrentScreen(Activity activity, String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzp(zzdf.zza(activity), str, str2);
        } else {
            this.zza.zzp(zzdf.zza(activity), str, str2);
            throw null;
        }
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        if (cArr3 != null) {
            int i5 = $11 + 55;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = $10 + 81;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31340 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))), 3042 - AndroidCharacter.getMirror('0'), (KeyEvent.getMaxKeyCode() >> 16) + 17, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i2 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (31340 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2993, 17 - ((Process.getThreadPriority(0) + 20) >> 6), 1182129903, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i2++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                j = 0;
            }
            int i7 = $11 + 91;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr2;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43324), ((Process.getThreadPriority(0) + 20) >> 6) + 253, 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                int i9 = $10 + 23;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i11 = $10 + 115;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (MotionEvent.axisFromString("") + 33603), Drawable.resolveOpacity(0, 0) + 3085, Color.alpha(0) + 26, -2146875848, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!TuitionPaymentFragmentbindingInflater1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getTouchSlop() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 3085, Color.argb(0, 0, 0, 0) + 26, -2146875848, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                int i13 = $10 + 117;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setUserProperty(String str, String str2, Object obj) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int defaultSize = 921 - View.getDefaultSize(0, 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
            byte b2 = $$a[37];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) 52, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, defaultSize, iLastIndexOf, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(null, null, (Process.myPid() >> 22) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(null, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) (Color.red(0) + 31533);
            int iRed = 921 - Color.red(0);
            int iArgb = 28 - Color.argb(0, 0, 0, 0);
            byte[] bArr = $$a;
            byte b3 = bArr[37];
            byte b4 = bArr[80];
            Object[] objArr6 = new Object[1];
            a(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, iRed, iArgb, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int iCombineMeasuredStates = 921 - View.combineMeasuredStates(0, 0);
                int iAxisFromString = MotionEvent.axisFromString("") + 29;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr7 = new Object[1];
                a(b5, bArr2[33], b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iCombineMeasuredStates, iAxisFromString, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = (((-893950133) + (((~((-1073325028) | iIdentityHashCode)) | 700490400) * 1504)) + ((~(iIdentityHashCode | (-372834628))) * (-1504))) - 1848223377;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(null, null, View.getDefaultSize(0, 0) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(null, null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i5 = asInterface + 95;
                b = i5 % 128;
                int i6 = i5 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int length = str != null ? str.length() : 0;
            int i7 = asInterface + 113;
            b = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(length), 0, 1049288223};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[9];
                Object[] objArr12 = new Object[1];
                d(b6, bArr3[79], b6, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr3[79];
                Object[] objArr13 = new Object[1];
                d(b7, bArr3[9], b7, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
                    int absoluteGravity = 921 - Gravity.getAbsoluteGravity(0, 0);
                    int i9 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b8 = bArr4[80];
                    Object[] objArr14 = new Object[1];
                    a(b8, bArr4[33], b8, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, absoluteGravity, i9, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(null, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(null, null, 127 - Drawable.resolveOpacity(0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 922;
                        int i10 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[37];
                        byte b10 = bArr5[80];
                        Object[] objArr17 = new Object[1];
                        a(b9, b10, b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, iLastIndexOf2, i10, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 31533);
                        int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                        int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b11 = $$a[37];
                        Object[] objArr18 = new Object[1];
                        a(b11, (byte) 52, b11, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, packedPositionGroup, keyRepeatTimeout, -1048449946, false, (String) objArr18[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i14 = ~iUptimeMillis;
            int i15 = i13 + (-1128424400) + (((~((-1381619471) | i14)) | 392460173) * 226) + (((~(i14 | (-1075412995))) | (~((-392460174) | iUptimeMillis)) | 86253697) * (-113)) + ((~(iUptimeMillis | (-1381619471))) * 113);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr2[0])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i18 = b + 3;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                for (String str3 : strArr) {
                    arrayList.add(str3);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i20 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = i20 + ((((~((-1225524670) | iIdentityHashCode2)) | 1774079331) * 262) - 130594737) + (((~((~iIdentityHashCode2) | (-1225524670))) | 1774079331) * 262);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr2[0])[0] = i23 ^ (i23 << 5);
        }
        zzfb zzfbVar = this.zza;
        int i24 = ((int[]) objArr2[0])[0];
        int i25 = i24 * i24;
        int i26 = -(135185284 * i24);
        int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
        int i28 = -(i24 * (-694513466));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        int i30 = (i29 & 794634585) + (794634585 | i29);
        int i31 = i30 >> 24;
        int i32 = ((i31 ^ (-511)) + ((i31 & (-511)) << 1)) / 256;
        int i33 = (i32 & 1) + (i32 | 1);
        int i34 = ((i30 | i33) << 1) - (i33 ^ i30);
        int i35 = ((i30 >> 22) - 2047) / 1024;
        int i36 = -(i34 ^ ((i35 ^ 1) + ((i35 & 1) << 1)));
        int i37 = ((i36 | 6) << 1) - (i36 ^ 6);
        int i38 = i37 >> 28;
        int i39 = (((i38 ^ (-31)) + ((i38 & (-31)) << 1)) / 16) + 1;
        zzfbVar.zzk(str, str2, obj, 1122 / (((-((i39 ^ 1) + ((i39 & 1) << 1))) & i37) * 187));
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        int i = 2 % 2;
        int i2 = b + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzg(onEventListener);
        int i4 = asInterface + 27;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zza(boolean z) {
        int i = 2 % 2;
        int i2 = b + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.zza.zzK(z);
        int i4 = asInterface + 99;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AppMeasurementSdk appMeasurementSdkZzb = zzfb.zza(context, bundle).zzb();
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return appMeasurementSdkZzb;
    }

    public AppMeasurementSdk(zzfb zzfbVar) {
        this.zza = zzfbVar;
    }

    public String getAppIdOrigin() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzfb zzfbVar = this.zza;
        if (i3 == 0) {
            return zzfbVar.zzI();
        }
        zzfbVar.zzI();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void setConsent(Bundle bundle) {
        int i = 2 % 2;
        int i2 = b + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Deprecated
    public void setMeasurementEnabled(Boolean bool) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            int r7 = 68 - r7
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.measurement.api.AppMeasurementSdk.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.api.AppMeasurementSdk.$$g(short, int, byte):java.lang.String");
    }
}
