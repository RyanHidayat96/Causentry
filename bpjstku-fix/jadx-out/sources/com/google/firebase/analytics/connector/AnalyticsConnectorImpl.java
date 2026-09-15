package com.google.firebase.analytics.connector;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzc;
    final AppMeasurementSdk zza;
    final Map zzb;

    AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.zza = appMeasurementSdk;
        this.zzb = new ConcurrentHashMap();
    }

    public static AnalyticsConnector getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    static /* synthetic */ void zza(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.checkNotNull(zzc)).zza.zza(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final boolean zzb(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.zzb;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zzc.zzb(str2, bundle)) {
            this.zza.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.zza.getConditionalUserProperties(str, str2)) {
            int i = zzc.zza;
            Preconditions.checkNotNull(bundle);
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
            conditionalUserProperty.origin = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, null));
            conditionalUserProperty.name = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "name", String.class, null));
            conditionalUserProperty.value = zzjh.zzb(bundle, "value", Object.class, null);
            conditionalUserProperty.triggerEventName = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            conditionalUserProperty.triggerTimeout = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            conditionalUserProperty.timedOutEventName = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            conditionalUserProperty.timedOutEventParams = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.triggeredEventName = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            conditionalUserProperty.triggeredEventParams = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.timeToLive = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            conditionalUserProperty.expiredEventName = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            conditionalUserProperty.expiredEventParams = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            conditionalUserProperty.active = ((Boolean) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.creationTimestamp = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            conditionalUserProperty.triggeredTimestamp = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public int getMaxUserProperties(String str) {
        return this.zza.getMaxUserProperties(str);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public Map<String, Object> getUserProperties(boolean z) {
        return this.zza.getUserProperties(null, null, z);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzc.zza(str) && zzc.zzb(str2, bundle) && zzc.zze(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.zza.logEvent(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(final String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        com.google.firebase.analytics.connector.internal.zza zzgVar;
        Preconditions.checkNotNull(analyticsConnectorListener);
        if (zzc.zza(str) && !zzb(str)) {
            AppMeasurementSdk appMeasurementSdk = this.zza;
            if ("fiam".equals(str)) {
                zzgVar = new zze(appMeasurementSdk, analyticsConnectorListener);
            } else {
                zzgVar = "clx".equals(str) ? new zzg(appMeasurementSdk, analyticsConnectorListener) : null;
            }
            if (zzgVar != null) {
                this.zzb.put(str, zzgVar);
                return new AnalyticsConnector.AnalyticsConnectorHandle(this) { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
                    final /* synthetic */ AnalyticsConnectorImpl zzb;
                    private static final byte[] $$c = {87, -91, 60, 112};
                    private static final int $$d = 167;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {97, 58, 103, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                    private static final int $$b = 92;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                    private static int TuitionPaymentFragmentbindingInflater1 = -83722420;

                    {
                        Objects.requireNonNull(this);
                        this.zzb = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void b(int r6, short r7, byte r8, java.lang.Object[] r9) {
                        /*
                            int r8 = r8 * 4
                            int r8 = r8 + 84
                            byte[] r0 = com.google.firebase.analytics.connector.AnalyticsConnectorImpl.AnonymousClass1.$$a
                            int r6 = r6 * 4
                            int r6 = 3 - r6
                            int r7 = r7 * 3
                            int r7 = 53 - r7
                            byte[] r1 = new byte[r7]
                            r2 = 0
                            if (r0 != 0) goto L16
                            r3 = r7
                            r5 = r2
                            goto L2a
                        L16:
                            r3 = r2
                        L17:
                            int r6 = r6 + 1
                            byte r4 = (byte) r8
                            int r5 = r3 + 1
                            r1[r3] = r4
                            if (r5 != r7) goto L28
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            r9[r2] = r6
                            return
                        L28:
                            r3 = r0[r6]
                        L2a:
                            int r3 = -r3
                            int r8 = r8 + r3
                            int r8 = r8 + (-11)
                            r3 = r5
                            goto L17
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.AnonymousClass1.b(int, short, byte, java.lang.Object[]):void");
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void registerEventNames(Set<String> set) {
                        int i = 2 % 2;
                        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                        int i3 = i2 % 2;
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (!(!analyticsConnectorImpl.zzb(str2))) {
                            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                            int i5 = i4 % 2;
                            if (!str2.equals("fiam")) {
                                return;
                            }
                            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i7 = i6 + 17;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 23 / 0;
                                if (set == null) {
                                    return;
                                }
                            } else if (set == null) {
                                return;
                            }
                            int i9 = i6 + 25;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            if (i9 % 2 == 0) {
                                if (set.isEmpty()) {
                                    return;
                                }
                                ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzb(set);
                            } else {
                                set.isEmpty();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        }
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public final void unregister() {
                        int i = 2 % 2;
                        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                        int i3 = i2 % 2;
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (analyticsConnectorImpl.zzb(str2)) {
                            Map map = analyticsConnectorImpl.zzb;
                            AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListenerZza = ((com.google.firebase.analytics.connector.internal.zza) map.get(str2)).zza();
                            if (analyticsConnectorListenerZza != null) {
                                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                                int i5 = i4 % 2;
                                analyticsConnectorListenerZza.onMessageTriggered(0, null);
                            }
                            map.remove(str2);
                            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:32:0x016a  */
                    /* JADX WARN: Code duplicated, block: B:33:0x016b  */
                    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                        int i4;
                        Throwable cause;
                        int i5 = 2 % 2;
                        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                        char[] cArr2 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        while (true) {
                            i4 = 29209604;
                            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                                break;
                            }
                            int i6 = $10 + 55;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b = (byte) 0;
                                    byte b2 = b;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 3291 - (ViewConfiguration.getEdgeSlop() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, 1199271174, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = (byte) (b3 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf("", '0') + 652, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, -450685997, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            } catch (Throwable th) {
                                cause = th.getCause();
                                if (cause != null) {
                                    throw th;
                                }
                                throw cause;
                            }
                            cause = th.getCause();
                            if (cause != null) {
                                throw th;
                            }
                            throw cause;
                        }
                        if (i3 > 0) {
                            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                            char[] cArr3 = new char[i2];
                            System.arraycopy(cArr2, 0, cArr3, 0, i2);
                            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                        }
                        if (z) {
                            int i9 = $11 + 101;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            char[] cArr4 = new char[i2];
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = (byte) (b5 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 651 - KeyEvent.getDeadChar(0, 0), 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -450685997, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                i4 = 29209604;
                            }
                            cArr2 = cArr4;
                        }
                        objArr[0] = new String(cArr2);
                    }

                    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                    public void unregisterEventNames() throws Throwable {
                        int i = 2 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                        int i2 = 0;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 46400), Process.getGidForName("") + 41, 19 - Gravity.getAbsoluteGravity(0, 0), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        Object obj = null;
                        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                        Object[] objArr = new Object[1];
                        a(true, 144 - TextUtils.indexOf((CharSequence) "", '0', 0), 21 - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf("", "", 0, 0) + 17, new char[]{'\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504}, objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        Object[] objArr2 = new Object[1];
                        a(false, (ViewConfiguration.getTouchSlop() >> 8) + 149, 15 - KeyEvent.getDeadChar(0, 0), 2 - TextUtils.lastIndexOf("", '0'), new char[]{2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r'}, objArr2);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                        long j = -495;
                        long j2 = -1;
                        long j3 = j2 ^ 2809354019437868250L;
                        long jIdentityHashCode = System.identityHashCode(this);
                        long j4 = ((j3 | (j2 ^ (-712096844695909263L))) ^ j2) | ((j3 | jIdentityHashCode) ^ j2);
                        long j5 = (j * 2809354019437868250L) + (j * (-712096844695909263L)) + (((long) 992) * j4) + (((long) (-496)) * (j4 | (((jIdentityHashCode ^ j2) | (-648835306891903749L)) ^ j2))) + (((long) 496) * (jIdentityHashCode | (-712096844695909263L)));
                        int i4 = 0;
                        while (true) {
                            if (i4 == 10) {
                                Object[] objArr3 = new Object[1];
                                a(false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 144, 15 - TextUtils.lastIndexOf("", '0'), 14 - View.MeasureSpec.getSize(0), new char[]{20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535}, objArr3);
                                Class<?> cls2 = Class.forName((String) objArr3[0]);
                                Object[] objArr4 = new Object[1];
                                a(false, TextUtils.getOffsetAfter("", 0) + 148, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, 13 - ExpandableListView.getPackedPositionChild(0L), new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr4);
                                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                                try {
                                    Object[] objArr5 = {1540027877};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 46038), 1133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1415419772, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 15;
                                        byte b = $$a[7];
                                        byte b2 = b;
                                        Object[] objArr7 = new Object[1];
                                        b(b, b2, b2, objArr7);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, iRgb, iCombineMeasuredStates, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1117 - View.resolveSizeAndState(0, 0, 0), 16 - Process.getGidForName("")), Boolean.TYPE});
                                    }
                                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                                    int i5 = 0;
                                    if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                                        break;
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    String[] strArr = (String[]) objArr8[0];
                                    if (strArr != null) {
                                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                                        int i7 = i6 % 2;
                                        while (i5 < strArr.length) {
                                            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                arrayList.add(strArr[i5]);
                                                i5 += 86;
                                            } else {
                                                arrayList.add(strArr[i5]);
                                                i5++;
                                            }
                                        }
                                    }
                                    throw null;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            int i10 = i9 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37837 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 60, (ViewConfiguration.getTapTimeout() >> 16) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                            }
                            int i11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(obj);
                            int i12 = i2;
                            long j6 = jLongValue;
                            while (true) {
                                int i13 = i2;
                                for (int i14 = 8; i13 != i14; i14 = 8) {
                                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                                    int i16 = i15 % 2;
                                    i11 = (((((int) (j6 >> i13)) & 255) + (i11 << 6)) + (i11 << 16)) - i11;
                                    i13++;
                                }
                                if (i12 != 0) {
                                    break;
                                }
                                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                                i12 = i17 % 2 == 0 ? i12 + 48 : i12 + 1;
                                j6 = j5;
                                i2 = 0;
                            }
                            if (i11 == i3) {
                                break;
                            }
                            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                            if (i18 % 2 != 0) {
                                jLongValue -= 1024;
                                i4 += 63;
                            } else {
                                jLongValue -= 1024;
                                i4++;
                            }
                            i2 = 0;
                            obj = null;
                        }
                        AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
                        String str2 = str;
                        if (analyticsConnectorImpl.zzb(str2) && str2.equals("fiam")) {
                            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                            if (i19 % 2 == 0) {
                                ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzc();
                                throw null;
                            }
                            ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzc();
                        }
                    }

                    private static String $$e(byte b, int i, short s) {
                        int i2 = b * 2;
                        byte[] bArr = $$c;
                        int i3 = (s * 2) + 4;
                        int i4 = 120 - i;
                        byte[] bArr2 = new byte[i2 + 1];
                        int i5 = -1;
                        if (bArr == null) {
                            i4 = i2 + i3;
                            i3++;
                            i5 = -1;
                        }
                        while (true) {
                            int i6 = i5 + 1;
                            bArr2[i6] = (byte) i4;
                            if (i6 == i2) {
                                return new String(bArr2, 0);
                            }
                            int i7 = i3;
                            i4 += bArr[i3];
                            i3 = i7 + 1;
                            i5 = i6;
                        }
                    }
                };
            }
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        int i = zzc.zza;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return;
        }
        if ((conditionalUserProperty.value == null || zzlt.zzb(conditionalUserProperty.value) != null) && zzc.zza(str) && zzc.zzd(str, conditionalUserProperty.name)) {
            if (conditionalUserProperty.expiredEventName == null || (zzc.zzb(conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams) && zzc.zze(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
                if (conditionalUserProperty.triggeredEventName == null || (zzc.zzb(conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams) && zzc.zze(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
                    if (conditionalUserProperty.timedOutEventName == null || (zzc.zzb(conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams) && zzc.zze(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams))) {
                        AppMeasurementSdk appMeasurementSdk = this.zza;
                        Bundle bundle = new Bundle();
                        if (conditionalUserProperty.origin != null) {
                            bundle.putString("origin", conditionalUserProperty.origin);
                        }
                        if (conditionalUserProperty.name != null) {
                            bundle.putString("name", conditionalUserProperty.name);
                        }
                        if (conditionalUserProperty.value != null) {
                            zzjh.zza(bundle, conditionalUserProperty.value);
                        }
                        if (conditionalUserProperty.triggerEventName != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, conditionalUserProperty.triggerEventName);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.triggerTimeout);
                        if (conditionalUserProperty.timedOutEventName != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, conditionalUserProperty.timedOutEventName);
                        }
                        if (conditionalUserProperty.timedOutEventParams != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, conditionalUserProperty.timedOutEventParams);
                        }
                        if (conditionalUserProperty.triggeredEventName != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, conditionalUserProperty.triggeredEventName);
                        }
                        if (conditionalUserProperty.triggeredEventParams != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, conditionalUserProperty.triggeredEventParams);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.timeToLive);
                        if (conditionalUserProperty.expiredEventName != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, conditionalUserProperty.expiredEventName);
                        }
                        if (conditionalUserProperty.expiredEventParams != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, conditionalUserProperty.expiredEventParams);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.creationTimestamp);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.active);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.triggeredTimestamp);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector
    public void setUserProperty(String str, String str2, Object obj) throws Throwable {
        if (zzc.zza(str) && zzc.zzd(str, str2)) {
            this.zza.setUserProperty(str, str2, obj);
        }
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp) {
        return (AnalyticsConnector) firebaseApp.get(AnalyticsConnector.class);
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(subscriber);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzc == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                if (zzc == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.isDefaultApp()) {
                        subscriber.subscribe(DataCollectionDefaultChange.class, zzb.zza, zza.zza);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    zzc = new AnalyticsConnectorImpl(zzfb.zza(context, bundle).zzb());
                }
            }
        }
        return zzc;
    }
}
