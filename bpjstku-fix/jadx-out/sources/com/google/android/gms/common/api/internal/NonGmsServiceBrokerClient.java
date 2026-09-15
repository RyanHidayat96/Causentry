package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {
    private static long TuitionPaymentFragmentbindingInflater1 = 0;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    private static int b = 0;
    private static final String zaa = "NonGmsServiceBrokerClient";
    private final String zab;
    private final String zac;
    private final ComponentName zad;
    private final Context zae;
    private final ConnectionCallbacks zaf;
    private final Handler zag;
    private final OnConnectionFailedListener zah;
    private IBinder zai;
    private boolean zaj;
    private String zak;
    private String zal;
    private static final byte[] $$c = {67, -127, -109, 9};
    private static final int $$f = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, -93, -120, -48, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 11, 7, -15, 1, 6, 16, -5, 11, -6, -3, 73, -73, 3, 16, -1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -48, -17, 4, 15, Base64.padSymbol, -48, -12, 10, 62, -66, 13, 5, -4, 8, -2, 67, -33, -16, -14, 10, 15, 5, -16, 14, -3, 4, 47, -42, -3, 10, 13, 20, -15, -10, -1, 16, 9, 1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$e = 133;
    private static final byte[] $$a = {36, -74, -79, -21, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 53;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    public NonGmsServiceBrokerClient(Context context, Looper looper, ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, null, null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    private static void a(short s, byte b2, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = b2 + 4;
        int i3 = (i * 14) + 84;
        byte[] bArr2 = new byte[53 - s];
        int i4 = 52 - s;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i2 + (-i4)) - 10;
            i2 = i2;
        }
        while (true) {
            int i6 = i2 + 1;
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i6])) - 10;
                i2 = i6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.$$d
            int r1 = 61 - r6
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r6 = 60 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r5]
            int r3 = r3 + 1
        L27:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + 3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.d(short, int, short, java.lang.Object[]):void");
    }

    public final IBinder getBinder() {
        int i = 2 % 2;
        int i2 = g + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zad();
        IBinder iBinder = this.zai;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        g = i4 % 128;
        int i5 = i4 % 2;
        return iBinder;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Collections.emptySet();
            throw null;
        }
        Set<Scope> setEmptySet = Collections.emptySet();
        int i3 = g + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
        }
        return setEmptySet;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Intent getSignInIntent() {
        int i = 2 % 2;
        Intent intent = new Intent();
        int i2 = g + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return intent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnected() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        g = i2 % 128;
        int i3 = i2 % 2;
        zad();
        if (this.zai == null) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        g = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean isConnecting() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        g = i2 % 128;
        int i3 = i2 % 2;
        zad();
        boolean z = this.zaj;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        g = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        int i = 2 % 2;
        this.zag.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacg
            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.zaa(iBinder);
            }
        });
        int i2 = g + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2 % 2;
        this.zag.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacf
            @Override // java.lang.Runnable
            public final void run() {
                this.zaa.zab();
            }
        });
        int i2 = g + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r6 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private NonGmsServiceBrokerClient(android.content.Context r2, android.os.Looper r3, java.lang.String r4, java.lang.String r5, android.content.ComponentName r6, com.google.android.gms.common.api.internal.ConnectionCallbacks r7, com.google.android.gms.common.api.internal.OnConnectionFailedListener r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaj = r0
            r0 = 0
            r1.zak = r0
            r1.zae = r2
            com.google.android.gms.internal.base.zau r2 = new com.google.android.gms.internal.base.zau
            r2.<init>(r3)
            r1.zag = r2
            r1.zaf = r7
            r1.zah = r8
            if (r4 == 0) goto L33
            if (r5 == 0) goto L33
            int r2 = com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.g
            int r2 = r2 + 125
            int r3 = r2 % 128
            com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            r7 = 2
            int r2 = r2 % r7
            if (r6 != 0) goto L3c
            int r3 = r3 + 33
            int r2 = r3 % 128
            com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.g = r2
            int r3 = r3 % r7
            if (r3 == 0) goto L32
            int r7 = r7 % r7
            r6 = r0
            goto L35
        L32:
            throw r0
        L33:
            if (r6 == 0) goto L3c
        L35:
            r1.zab = r4
            r1.zac = r5
            r1.zad = r6
            return
        L3c:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }

    private final void zad() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            Handler handler = this.zag;
            Thread.currentThread();
            handler.getLooper().getThread();
            throw null;
        }
        if (Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
        int i3 = g + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String getEndpointPackageName() {
        int i = 2 % 2;
        int i2 = g + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.zab;
        if (str == null) {
            Preconditions.checkNotNull(this.zad);
            return this.zad.getPackageName();
        }
        int i4 = i3 + 111;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zaa(IBinder iBinder) {
        int i = 2 % 2;
        this.zaj = false;
        this.zai = iBinder;
        this.zaf.onConnected(new Bundle());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    final /* synthetic */ void zab() {
        ConnectionCallbacks connectionCallbacks;
        int i = 2 % 2;
        int i2 = g + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.zaj = true;
            this.zai = null;
            connectionCallbacks = this.zaf;
        } else {
            this.zaj = false;
            this.zai = null;
            connectionCallbacks = this.zaf;
        }
        connectionCallbacks.onConnectionSuspended(1);
        int i3 = g + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        int i = 2 % 2;
        int i2 = g + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                zad();
                this.zae.unbindService(this);
                obj.hashCode();
                throw null;
            }
            zad();
            this.zae.unbindService(this);
            this.zaj = false;
            this.zai = null;
        } catch (IllegalArgumentException unused) {
        }
    }

    public NonGmsServiceBrokerClient(Context context, Looper looper, String str, String str2, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, null, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            zad();
            isConnected();
            throw null;
        }
        zad();
        if (isConnected()) {
            int i3 = g + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    disconnect("connect() called when already connected");
                    throw null;
                }
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.zad;
            if (componentName != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                g = i4 % 128;
                if (i4 % 2 == 0) {
                    intent.setComponent(componentName);
                    throw null;
                }
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.zab).setAction(this.zac);
            }
            boolean zBindService = this.zae.bindService(intent, this, GmsClientSupervisor.getDefaultBindFlags());
            this.zaj = zBindService;
            if (!zBindService) {
                this.zai = null;
                this.zah.onConnectionFailed(new ConnectionResult(16));
            }
            int i5 = g + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        } catch (SecurityException e2) {
            this.zaj = false;
            this.zai = null;
            throw e2;
        }
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 43;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i - i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2187 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 40 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - Color.red(0)), 3011 - TextUtils.getTrimmedLength(""), 26 - Gravity.getAbsoluteGravity(0, 0), 321985076, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 36506), View.MeasureSpec.getMode(0) + 3376, (ViewConfiguration.getJumpTapTimeout() >> 16) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.myTid() >> 22), 2187 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 40 - TextUtils.indexOf("", ""), 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33016), View.resolveSize(0, 0) + 3011, 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 321985076, false, $$g(b10, b11, (byte) (b11 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (Color.alpha(0) + 36505), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3376, 17 - Gravity.getAbsoluteGravity(0, 0), -968507904, false, $$g(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - (KeyEvent.getMaxKeyCode() >> 16)), 3376 - TextUtils.indexOf("", "", 0, 0), 17 - Color.red(0), -968507904, false, $$g(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            int i8 = $11 + 85;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void disconnect(String str) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iRgb = Color.rgb(0, 0, 0) + 16777244;
            byte b2 = (byte) ($$b - 1);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(b2, bArr[37], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollBarFadeDuration, iRgb, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyTid = (char) (31533 - (Process.myTid() >> 22));
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
            int keyRepeatDelay = 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[37], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, edgeSlop, keyRepeatDelay, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
                int i2 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr3[33]), (byte) ($$b - 2), bArr3[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, scrollBarSize, i2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~iIdentityHashCode;
            int i4 = (-906843592) + (((~((-167772229) | i3)) | (~((-279315457) | iIdentityHashCode)) | (~((-1159219732) | iIdentityHashCode))) * 765) + (((~((-447087685) | i3)) | 167772228) * 1530) + (((~(iIdentityHashCode | (-447087685))) | (~(i3 | (-1159219732)))) * 765) + 1435363988;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(38 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - View.MeasureSpec.getSize(0), (char) View.combineMeasuredStates(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 63, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, (char) (40681 - KeyEvent.keyCodeFromString("")), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                g = i7 % 128;
                if (i7 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(str != null ? str.length() : 0), 0, 1435363988};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[39];
                Object[] objArr11 = new Object[1];
                d((short) (b4 - 1), bArr4[16], (byte) (b4 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d(bArr4[151], bArr4[20], bArr4[39], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31532);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
                    int iMyTid = 28 - (Process.myTid() >> 22);
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    a((byte) (-bArr5[33]), (byte) ($$b - 2), bArr5[80], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iNormalizeMetaState, iMyTid, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(ViewConfiguration.getPressedStateDuration() >> 16, View.resolveSizeAndState(0, 0, 0) + 22, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(21 - TextUtils.indexOf((CharSequence) "", '0'), 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c4 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                        int i8 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 28;
                        byte[] bArr6 = $$a;
                        byte b5 = bArr6[80];
                        Object[] objArr17 = new Object[1];
                        a(b5, bArr6[37], b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, i8, iCombineMeasuredStates, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyTid2 = (char) (31533 - (Process.myTid() >> 22));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                        int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b6 = (byte) ($$b - 1);
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        a(b6, bArr7[37], bArr7[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid2, absoluteGravity, maxKeyCode, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i9 = g + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        int i10 = i9 % 2;
        int i11 = ((int[]) objArr[0])[0];
        Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i12 = ~iIdentityHashCode2;
        int i13 = (~((-432380435) | i12)) | 163614720;
        int i14 = ~(iIdentityHashCode2 | 1610464923);
        int i15 = i11 + (-1990676837) + ((i13 | i14) * (-502)) + ((i14 | (~(i12 | (-268765715)))) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr19[0])[0] = i17 ^ (i17 << 5);
        zad();
        this.zak = str;
        disconnect();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0237  */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int iMyTid = 921 - (Process.myTid() >> 22);
            int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
            byte b2 = (byte) ($$b - 1);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(b2, bArr[37], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, iMyTid, tapTimeout, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22 - ExpandableListView.getPackedPositionType(0L), (char) KeyEvent.keyCodeFromString(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(Color.blue(0) + 22, KeyEvent.keyCodeFromString("") + 15, (char) KeyEvent.keyCodeFromString(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
            int iMyPid = 921 - (Process.myPid() >> 22);
            int iMyTid2 = 28 - (Process.myTid() >> 22);
            byte[] bArr2 = $$a;
            byte b3 = bArr2[80];
            Object[] objArr5 = new Object[1];
            a(b3, bArr2[37], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iMyPid, iMyTid2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = g + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char size = (char) (31533 - View.MeasureSpec.getSize(0));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                int minimumFlingVelocity2 = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr3[33]), (byte) ($$b - 2), bArr3[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, iKeyCodeFromString, minimumFlingVelocity2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = ~elapsedCpuTime;
            int i5 = (-1128424400) + (((~((-889496816) | i4)) | 884582828) * 226) + (((~(i4 | (-17040452))) | (~((-884582829) | elapsedCpuTime)) | 12126464) * (-113)) + ((~(elapsedCpuTime | (-889496816))) * 113) + 1050968932;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, ((byte) KeyEvent.getModifierMetaStateMask()) + 27, (char) TextUtils.indexOf("", "", 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(63 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.green(0) + 18, (char) (40681 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                    g = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i10 = g + 19;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        int i11 = i10 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(81 - KeyEvent.normalizeMetaState(0), 16 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(97 - (ViewConfiguration.getWindowTouchSlop() >> 8), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (1756 - TextUtils.getOffsetBefore("", 0)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1050968932};
                byte[] bArr4 = $$d;
                byte b4 = (byte) (bArr4[39] - 1);
                Object[] objArr13 = new Object[1];
                d((short) 99, b4, b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                d((short) ($$e | 26), bArr4[20], bArr4[39], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                    int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iAxisFromString = 27 - MotionEvent.axisFromString("");
                    byte[] bArr5 = $$a;
                    Object[] objArr16 = new Object[1];
                    a((byte) (-bArr5[33]), (byte) ($$b - 2), bArr5[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, iMakeMeasureSpec, iAxisFromString, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(TextUtils.getOffsetAfter("", 0), ImageFormat.getBitsPerPixel(0) + 23, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(21 - Process.getGidForName(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, (char) View.getDefaultSize(0, 0), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 31533);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 921;
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
                        byte[] bArr6 = $$a;
                        byte b5 = bArr6[80];
                        Object[] objArr19 = new Object[1];
                        a(b5, bArr6[37], b5, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(defaultSize, packedPositionType, scrollBarFadeDuration, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRed = (char) (31533 - Color.red(0));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                        int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                        byte b6 = (byte) ($$b - 1);
                        byte[] bArr7 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(b6, bArr7[37], bArr7[7], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iCombineMeasuredStates, capsMode, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                g = i14 % 128;
                int i15 = i14 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i16 = g + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i19 = ~startElapsedRealtime;
        int i20 = i18 + (-295462318) + (((~(i19 | 1082752878)) | 691326765) * (-1042)) + ((1082752878 | startElapsedRealtime) * 521) + (((~(startElapsedRealtime | (-691326766))) | 20268 | (~(i19 | 1774059375))) * 521);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        Object obj = objArr21[0];
        ((int[]) obj)[0] = i22 ^ (i22 << 5);
        int i23 = ((int[]) obj)[0];
        int i24 = i23 * i23;
        int i25 = -(389643757 * i23);
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        int i27 = -(i23 * (-125359635));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        int i29 = (i28 & (-264009367)) + ((-264009367) | i28);
        int i30 = i29 >> 19;
        int i31 = ((((i30 | (-16383)) << 1) - (i30 ^ (-16383))) / 8192) + 1;
        int i32 = (i29 & i31) + (i31 | i29);
        int i33 = i29 >> 23;
        int i34 = ((i33 ^ (-1023)) + ((i33 & (-1023)) << 1)) / 512;
        int i35 = -(i32 ^ ((i34 ^ 1) + ((i34 & 1) << 1)));
        int i36 = (i35 ^ 6) + ((i35 & 6) << 1);
        int i37 = i36 >> 21;
        int i38 = (((i37 | (-4095)) << 1) - (i37 ^ (-4095))) / 2048;
        int i39 = (i38 & 1) + (i38 | 1);
        return 0 / (((-(((i39 | 1) << 1) - (i39 ^ 1))) & i36) * 96);
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        b = i % 128;
        int i2 = i % 2;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 2 % 2;
        int i2 = g + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Feature[] getAvailableFeatures() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 37;
        g = i3 % 128;
        int i4 = i3 % 2;
        Feature[] featureArr = new Feature[0];
        int i5 = i2 + 93;
        g = i5 % 128;
        int i6 = i5 % 2;
        return featureArr;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String getLastDisconnectMessage() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 91;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zak;
        int i5 = i2 + 13;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Feature[] getRequiredFeatures() {
        int i = 2 % 2;
        int i2 = g + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        return new Feature[i2 % 2 != 0 ? 1 : 0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final IBinder getServiceBrokerBinder() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 105;
        g = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        int i = 2 % 2;
        int i2 = g + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        g = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        int i = 2 % 2;
        int i2 = g + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final void zac(String str) {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.zal = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{45565, 48428, 43076, 38772, 33419, 61859, 64716, 60320, 55043, 49697, 12574, 15429, 11149, 5801, 1484, 28923, 31761, 27489, 22124, 17801, 45223, 49089, 45561, 48430, 43073, 38774, 33431, 61871, 64716, 60380, 55049, 49715, 12636, 15458, 11165, 5815, 1501, 45565, 48428, 43076, 38772, 33419, 61859, 64716, 60320, 55053, 49698, 12608, 15416, 11189, 5817, 1484, 28919, 31754, 27467, 22132, 17823, 45200, 49090, 43770, 38411, 34093, 61526, 12054, 9182, 14011, 2461, 7272, 28493, 25141, 29990, 18933, 23755, 44981, 41622, 46462, 34898, 39717, 60958, 58106, 62885, 45558, 48419, 43094, 38759, 33482, 61862, 64713, 60384, 55051, 49788, 12643, 15471, 11143, 5806, 1501, 28915, 46889, 48122, 44697, 37300, 33868, 63359, 64000, 60715, 53752, 50415, 14239, 15010, 11627, 4201, 768, 30247};
        TuitionPaymentFragmentbindingInflater1 = 4745900346433060162L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, byte r8, int r9) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.$$c
            int r9 = r9 * 2
            int r9 = 3 - r9
            int r8 = r8 * 3
            int r8 = r8 + 109
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.$$g(int, byte, int):java.lang.String");
    }
}
