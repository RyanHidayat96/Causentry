package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseGmsClient<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES;
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static final Feature[] zze;
    private volatile String zzA;
    private volatile AttributionSourceWrapper zzB;
    private ConnectionResult zzC;
    private boolean zzD;
    private volatile zzk zzE;
    zzv zza;
    final Handler zzb;
    protected ConnectionProgressReportCallbacks zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private zze zzu;
    private int zzv;
    private final BaseConnectionCallbacks zzw;
    private final BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$f = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {64, 73, -26, 82, 19, -21, 39, -5, -25, 39, 27, -5, -27, 43, 26, -2, 22, -8, -56, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -57};
    private static final int $$h = 88;
    private static final byte[] $$a = {109, 84, -87, -114, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 23;
    private static int d = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    public interface BaseConnectionCallbacks {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(ConnectionResult connectionResult);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    protected BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 1
            int r8 = r8 + 84
            byte[] r0 = com.google.android.gms.common.internal.BaseGmsClient.$$a
            int r7 = 72 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 21
            int r6 = r6 + 84
            int r0 = r7 + 53
            byte[] r1 = com.google.android.gms.common.internal.BaseGmsClient.$$g
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r8 = r8 + r3
            int r8 = r8 + (-9)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.e(int, short, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ void zzk(BaseGmsClient baseGmsClient, int i) {
        int i2;
        int i3;
        synchronized (baseGmsClient.zzp) {
            i2 = baseGmsClient.zzv;
        }
        if (i2 == 3) {
            baseGmsClient.zzD = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(i3, baseGmsClient.zzd.get(), 16));
    }

    static /* synthetic */ boolean zzn(BaseGmsClient baseGmsClient, int i, int i2, IInterface iInterface) {
        synchronized (baseGmsClient.zzp) {
            if (baseGmsClient.zzv != i) {
                return false;
            }
            baseGmsClient.zzp(i2, iInterface);
            return true;
        }
    }

    private final void zzp(int i, IInterface iInterface) {
        zzv zzvVar;
        Preconditions.checkArgument((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            this.zzv = i;
            this.zzs = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    GmsClientSupervisor gmsClientSupervisor = this.zzn;
                    String strZzb = this.zza.zzb();
                    Preconditions.checkNotNull(strZzb);
                    String str = strZzb;
                    gmsClientSupervisor.zzc(strZzb, this.zza.zza(), 4225, zzeVar, zze(), this.zza.zzc());
                    this.zzu = null;
                }
            } else if (i == 2 || i == 3) {
                zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzvVar = this.zza) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzvVar.zzb() + " on " + zzvVar.zza());
                    GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                    String strZzb2 = this.zza.zzb();
                    Preconditions.checkNotNull(strZzb2);
                    String str2 = strZzb2;
                    gmsClientSupervisor2.zzc(strZzb2, this.zza.zza(), 4225, zzeVar2, zze(), this.zza.zzc());
                    this.zzd.incrementAndGet();
                }
                zze zzeVar3 = new zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                zzv zzvVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new zzv(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new zzv(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = zzvVar2;
                if (zzvVar2.zzc() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.zzb())));
                }
                GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                String strZzb3 = this.zza.zzb();
                Preconditions.checkNotNull(strZzb3);
                String str3 = strZzb3;
                ConnectionResult connectionResultZza = gmsClientSupervisor3.zza(new zzo(strZzb3, this.zza.zza(), 4225, this.zza.zzc()), zzeVar3, zze(), getBindServiceExecutor());
                if (!connectionResultZza.isSuccess()) {
                    Log.w("GmsClient", "unable to connect to service: " + this.zza.zzb() + " on " + this.zza.zza());
                    int errorCode = connectionResultZza.getErrorCode() == -1 ? 16 : connectionResultZza.getErrorCode();
                    if (connectionResultZza.getResolution() != null) {
                        bundle = new Bundle();
                        bundle.putParcelable(KEY_PENDING_INTENT, connectionResultZza.getResolution());
                    }
                    zzl(errorCode, bundle, this.zzd.get());
                }
            } else if (i == 4) {
                Preconditions.checkNotNull(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    protected abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i = 0; i < size; i++) {
                ((zzc) this.zzt.get(i)).zzf();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            printWriterAppend2.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.getStatusCodeString(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            printWriterAppend3.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
    }

    protected abstract String getServiceDescriptor();

    protected abstract String getStartServiceAction();

    protected final void checkConnected() {
        int i = 2 % 2;
        int i2 = d + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
        int i4 = asBinder + 115;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
            this.zzc = connectionProgressReportCallbacks;
        } else {
            Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
            this.zzc = connectionProgressReportCallbacks;
        }
        zzp(2, null);
        int i3 = asBinder + 115;
        d = i3 % 128;
        int i4 = i3 % 2;
    }

    public String getEndpointPackageName() {
        zzv zzvVar;
        int i = 2 % 2;
        int i2 = d + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            isConnected();
            throw null;
        }
        if (!isConnected() || (zzvVar = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        int i3 = asBinder + 63;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return zzvVar.zza();
        }
        zzvVar.zza();
        throw null;
    }

    static /* synthetic */ void zzj(BaseGmsClient baseGmsClient, zzk zzkVar) {
        RootTelemetryConfiguration rootTelemetryConfigurationZza;
        int i = 2 % 2;
        baseGmsClient.zzE = zzkVar;
        if (baseGmsClient.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.zzd;
            RootTelemetryConfigManager rootTelemetryConfigManager = RootTelemetryConfigManager.getInstance();
            if (connectionTelemetryConfiguration == null) {
                int i2 = d + 7;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 58 / 0;
                }
                rootTelemetryConfigurationZza = null;
            } else {
                rootTelemetryConfigurationZza = connectionTelemetryConfiguration.zza();
            }
            rootTelemetryConfigManager.zza(rootTelemetryConfigurationZza);
        }
        int i4 = d + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ boolean zzo(BaseGmsClient baseGmsClient) {
        int i = 2 % 2;
        if (baseGmsClient.zzD) {
            int i2 = asBinder + 85;
            d = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (TextUtils.isEmpty(baseGmsClient.getServiceDescriptor())) {
            int i4 = asBinder + 33;
            d = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (TextUtils.isEmpty(baseGmsClient.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(baseGmsClient.getServiceDescriptor());
            int i6 = d + 43;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(ConnectionResult connectionResult) throws Throwable {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (BaseGmsClient.zzc(BaseGmsClient.this) != null) {
                BaseGmsClient.zzc(BaseGmsClient.this).onConnectionFailed(connectionResult);
            }
        }

        public LegacyClientCallbackAdapter() {
        }
    }

    public void checkAvailabilityAndConnect() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
            obj.hashCode();
            throw null;
        }
        int iIsGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (iIsGooglePlayServicesAvailable == 0) {
            connect(new LegacyClientCallbackAdapter());
            int i3 = asBinder + 87;
            d = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        zzp(1, null);
        triggerNotAvailable(new LegacyClientCallbackAdapter(), iIsGooglePlayServicesAvailable, null);
        int i5 = d + 105;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
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
            int i4 = $11 + 103;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 16778451 + Color.rgb(0, 0, 0), 36 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -653973969, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i2;
                    byte b5 = (byte) (b4 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2765 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 14, 1504416861, false, $$i(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43324), 254 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 22 - (ViewConfiguration.getPressedStateDuration() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 65199), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2891, (ViewConfiguration.getScrollBarSize() >> 8) + 17, 2012627446, false, $$i(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 51;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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
    }

    protected Bundle getGetServiceRequestExtraArgs() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int touchSlop = 651 - (ViewConfiguration.getTouchSlop() >> 8);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 45;
            byte b2 = $$a[24];
            Object[] objArr2 = new Object[1];
            a((byte) 52, b2, (byte) (b2 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, touchSlop, iLastIndexOf, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{45885, 57169, 21149, 39300}, (char) (ViewConfiguration.getLongPressTimeout() >> 16), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{23082, 5115, 28078, 52578, 33132, 38376, 19027, 65040, 26383, 20550, 11919, 36130, 16986, 54638, 16402, 5999, 55422, 4683, 45386, 56829, 60329, 60863}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{32108, 49876, 1965, 6843}, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47878), KeyEvent.normalizeMetaState(0) - 1379740547, new char[]{31513, 60547, 60065, 8785, 13739, 1591, 9443, 4986, 53579, 37370, 1033, 55008, 54640, 34408, 60363}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 651;
            int iMakeMeasureSpec = 44 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b3 = $$a[24];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 | 14), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, maximumFlingVelocity, iMakeMeasureSpec, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = d + 41;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iMakeMeasureSpec2 = 651 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int edgeSlop = 44 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b5 = $$a[24];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, iMakeMeasureSpec2, edgeSlop, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i7 = ((((~(startUptimeMillis | 1005296458)) | (-1001865649)) * 56) - 263022175) + (((~((~startUptimeMillis) | (-1001865649))) | 1005296458) * 56) + 1325468136;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1610, 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1325468136, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 651;
                    int iMyTid = (Process.myTid() >> 22) + 44;
                    byte b7 = $$a[24];
                    byte b8 = b7;
                    Object[] objArr9 = new Object[1];
                    a(b8, (byte) (b8 | 14), b7, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, doubleTapTimeout, iMyTid, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 1), 694 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 98 - KeyEvent.getDeadChar(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 63406), 793 - TextUtils.indexOf("", ""), MotionEvent.axisFromString("") + 84), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 44;
                    byte b9 = $$a[24];
                    byte b10 = b9;
                    Object[] objArr11 = new Object[1];
                    a(b9, b10, (byte) (b10 | 37), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, maximumDrawingCacheSize2, capsMode, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{45885, 57169, 21149, 39300}, (char) View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, new char[]{23082, 5115, 28078, 52578, 33132, 38376, 19027, 65040, 26383, 20550, 11919, 36130, 16986, 54638, 16402, 5999, 55422, 4683, 45386, 56829, 60329, 60863}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{32108, 49876, 1965, 6843}, (char) (47879 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (-1379740548) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{31513, 60547, 60065, 8785, 13739, 1591, 9443, 4986, 53579, 37370, 1033, 55008, 54640, 34408, 60363}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int iBlue = 651 - Color.blue(0);
                        int iAxisFromString = MotionEvent.axisFromString("") + 45;
                        byte b11 = $$a[24];
                        byte b12 = b11;
                        Object[] objArr14 = new Object[1];
                        a(b12, (byte) (b12 | 14), b11, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iBlue, iAxisFromString, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int iGreen = Color.green(0) + 651;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 44;
                        byte b13 = $$a[24];
                        Object[] objArr15 = new Object[1];
                        a((byte) 52, b13, (byte) (b13 | 52), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, iGreen, tapTimeout, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i10 = d + 81;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
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
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                    int i14 = d + 33;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i16 = ((int[]) objArr[3])[0];
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        int i19 = (int) Runtime.getRuntime().totalMemory();
        int i20 = ~i19;
        int i21 = i16 + (((~(845968317 | i20)) | (~((-849399128) | i19)) | (~(i20 | 849399127))) * 959) + 514257434 + (((~(i19 | 849399127)) | (~(i20 | (-849399128))) | (~(845968317 | i19))) * 959);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr16[3])[0] = i23 ^ (i23 << 5);
        int i24 = asBinder + 17;
        d = i24 % 128;
        int i25 = i24 % 2;
        return new Bundle();
    }

    public int getMinApkVersion() {
        int i = 2 % 2;
        int i2 = d + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        int i5 = asBinder + 121;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) throws Throwable {
        AttributionSource attributionSource;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.zzB == null || (attributionSource = this.zzB.getAttributionSource()) == null || attributionSource.getAttributionTag() == null) ? this.zzA : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.zzy;
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.zzj = account;
            if (iAccountAccessor != null) {
                getServiceRequest.zzg = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzj = getAccount();
        }
        getServiceRequest.zzk = zze;
        getServiceRequest.zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzo = true;
        }
        try {
            synchronized (this.zzq) {
                IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new zzd(this, this.zzd.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected Set<Scope> getScopes() {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        Set<Scope> setEmptySet = Collections.emptySet();
        int i4 = asBinder + 47;
        d = i4 % 128;
        int i5 = i4 % 2;
        return setEmptySet;
    }

    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t = (T) this.zzs;
            Preconditions.checkNotNull(t, "Client is connected but service is null");
        }
        return t;
    }

    public Intent getSignInIntent() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (getMinApkVersion() >= 211700000) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (getMinApkVersion() >= 211700000) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r1 = com.google.android.gms.common.internal.BaseGmsClient.d + 103;
        com.google.android.gms.common.internal.BaseGmsClient.asBinder = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean getUseDynamicLookup() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.common.internal.BaseGmsClient.asBinder
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.google.android.gms.common.internal.BaseGmsClient.d = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 211700000(0xc9e4920, float:2.4387765E-31)
            if (r1 == 0) goto L1c
            int r1 = r5.getMinApkVersion()
            r4 = 27
            int r4 = r4 / r2
            if (r1 < r3) goto L2d
            goto L22
        L1c:
            int r1 = r5.getMinApkVersion()
            if (r1 < r3) goto L2d
        L22:
            int r1 = com.google.android.gms.common.internal.BaseGmsClient.d
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.google.android.gms.common.internal.BaseGmsClient.asBinder = r2
            int r1 = r1 % r0
            r0 = 1
            return r0
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.getUseDynamicLookup():boolean");
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = i == 2 || i == 3;
        }
        return z;
    }

    protected void onConnectedLocked(T t) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zzh = System.currentTimeMillis();
        int i4 = asBinder + 39;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onConnectionSuspended(int i) {
        int i2 = 2 % 2;
        int i3 = d + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
        int i5 = d + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    protected void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        int i3 = 2 % 2;
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i2, -1, new zzf(this, i, iBinder, bundle)));
        int i4 = d + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
        int i = 2 % 2;
        int i2 = d + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        signOutCallbacks.onSignOutComplete();
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
    }

    protected final String zze() {
        int i = 2 % 2;
        int i2 = d + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String name = this.zzz;
        if (name == null) {
            name = this.zzl.getClass().getName();
        }
        int i4 = d + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return name;
    }

    protected final void zzl(int i, Bundle bundle, int i2) {
        int i3 = 2 % 2;
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i2, -1, new zzg(this, i, bundle)));
        int i4 = asBinder + 49;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    protected void onConnectionFailed(ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = d + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzi = connectionResult.getErrorCode();
            this.zzj = System.currentTimeMillis();
            int i3 = 38 / 0;
        } else {
            this.zzi = connectionResult.getErrorCode();
            this.zzj = System.currentTimeMillis();
        }
        int i4 = asBinder + 67;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void triggerConnectionSuspended(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        d = i3 % 128;
        int i4 = i3 % 2;
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i));
        int i5 = asBinder + 87;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    protected void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, PendingIntent pendingIntent) {
        int i2 = 2 % 2;
        int i3 = asBinder + 119;
        d = i3 % 128;
        int i4 = i3 % 2;
        Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i, pendingIntent));
        int i5 = asBinder + 43;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseGmsClient(Context context, Looper looper, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        Preconditions.checkNotNull(baseConnectionCallbacks);
        Preconditions.checkNotNull(baseOnConnectionFailedListener);
        this(context, looper, gmsClientSupervisor, googleApiAvailabilityLight, i, baseConnectionCallbacks, baseOnConnectionFailedListener, str);
    }

    public void disconnect(String str) {
        int i = 2 % 2;
        int i2 = d + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.zzk = str;
        disconnect();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new zzb(this, looper);
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }

    protected Executor getBindServiceExecutor() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
            int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 69, bArr[12], bArr[26], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, bitsPerPixel, threadPriority, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{45885, 57169, 21149, 39300}, (char) ((-1) - Process.getGidForName("")), TextUtils.indexOf("", "", 0), new char[]{23082, 5115, 28078, 52578, 33132, 38376, 19027, 65040, 26383, 20550, 11919, 36130, 16986, 54638, 16402, 5999, 55422, 4683, 45386, 56829, 60329, 60863}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{32108, 49876, 1965, 6843}, (char) (47879 - View.resolveSizeAndState(0, 0, 0)), (-1379740548) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{31513, 60547, 60065, 8785, 13739, 1591, 9443, 4986, 53579, 37370, 1033, 55008, 54640, 34408, 60363}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int longPressTimeout2 = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int i2 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 59, bArr2[17], bArr2[24], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, longPressTimeout2, i2, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = asBinder + 115;
            d = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i5 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                byte[] bArr3 = $$a;
                byte b2 = bArr3[12];
                byte b3 = bArr3[58];
                Object[] objArr6 = new Object[1];
                a((byte) 59, b2, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, i5, offsetBefore, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            Object[] objArr8 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i6 = ~((~new Random().nextInt()) | 943086502);
            int i7 = ((805716352 | i6) * (-374)) + 893686608 + ((i6 | 137370150) * 374) + 1203022643;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr8[1])[0] = i9 ^ (i9 << 5);
            objArr = objArr8;
            c = 2;
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{14737, 24055, 57890, 11372}, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 27874), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{30594, 59235, 64838, 17334, 17912, 10786, 20496, 1106, 29218, 35536, 9244, 3225, 28361, 47232, 35710, 53466}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{26591, 1128, 35115, 24486}, (char) (42633 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, new char[]{4106, 55325, 55077, 36731, 47307, 17494, 37396, 55178, 64234, 30097, 63589, 31673, 48429, 63785, 58667, 16968}, objArr10);
            try {
                Object[] objArr11 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 1203022643};
                byte[] bArr4 = $$g;
                byte b4 = bArr4[30];
                Object[] objArr12 = new Object[1];
                e(b4, b4, bArr4[44], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b5 = bArr4[90];
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                e(b5, b6, (byte) (b6 | 52), objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                    int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    a((byte) 59, bArr5[12], bArr5[58], objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, scrollBarSize, i10, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{45885, 57169, 21149, 39300}, (char) TextUtils.getTrimmedLength(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{23082, 5115, 28078, 52578, 33132, 38376, 19027, 65040, 26383, 20550, 11919, 36130, 16986, 54638, 16402, 5999, 55422, 4683, 45386, 56829, 60329, 60863}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{32108, 49876, 1965, 6843}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 47880), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1379740547, new char[]{31513, 60547, 60065, 8785, 13739, 1591, 9443, 4986, 53579, 37370, 1033, 55008, 54640, 34408, 60363}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c4 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
                        int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                        byte[] bArr6 = $$a;
                        Object[] objArr17 = new Object[1];
                        a((byte) 59, bArr6[17], bArr6[24], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, pressedStateDuration, i11, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int capsMode = 876 - TextUtils.getCapsMode("", 0, 0);
                        int mirror = ':' - AndroidCharacter.getMirror('0');
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        a((byte) 69, bArr7[12], bArr7[26], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, capsMode, mirror, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i12 = asBinder + 73;
                    d = i12 % 128;
                    c = 2;
                    int i13 = i12 % 2;
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
        int i14 = ((int[]) objArr[c])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            int i16 = asBinder + 95;
            d = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt();
            int i19 = i18 + (-1874904592) + (((~(165700272 | iNextInt)) | 27263536) * (-502)) + ((~((~iNextInt) | 233274037)) * (-502)) + (((~(iNextInt | (-206010502))) | 165700272) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr19[1])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i22 = i15 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i22) % 2) - 1], 1).show();
            int i23 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode;
            int i25 = i23 + 177945068 + (((~(135145787 | i24)) | (~((-175456017) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | 176111419)) | (~(i24 | (-134490385)))) * 210);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[1])[0] = i27 ^ (i27 << 5);
        }
        return null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentbindingInflater1();
        zze = new Feature[0];
        GOOGLE_PLUS_REQUIRED_FEATURES = new String[]{"service_esmobile", "service_googleme"};
        int i = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ ConnectionResult zza(BaseGmsClient baseGmsClient) {
        int i = 2 % 2;
        int i2 = d + 79;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ConnectionResult connectionResult = baseGmsClient.zzC;
        int i5 = i3 + 81;
        d = i5 % 128;
        int i6 = i5 % 2;
        return connectionResult;
    }

    static /* synthetic */ BaseConnectionCallbacks zzb(BaseGmsClient baseGmsClient) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.zzw;
        int i5 = i3 + 111;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return baseConnectionCallbacks;
    }

    static /* synthetic */ BaseOnConnectionFailedListener zzc(BaseGmsClient baseGmsClient) {
        int i = 2 % 2;
        int i2 = d + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.zzx;
        if (i3 != 0) {
            return baseOnConnectionFailedListener;
        }
        throw null;
    }

    static /* synthetic */ Object zzd(BaseGmsClient baseGmsClient) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = baseGmsClient.zzq;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return obj;
    }

    static /* synthetic */ ArrayList zzf(BaseGmsClient baseGmsClient) {
        int i = 2 % 2;
        int i2 = d + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ArrayList arrayList = baseGmsClient.zzt;
        if (i3 != 0) {
            return arrayList;
        }
        throw null;
    }

    static /* synthetic */ void zzg(BaseGmsClient baseGmsClient, ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = d + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        baseGmsClient.zzC = connectionResult;
        if (i3 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void zzh(BaseGmsClient baseGmsClient, IGmsServiceBroker iGmsServiceBroker) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 21;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        baseGmsClient.zzr = iGmsServiceBroker;
        int i5 = i2 + 5;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void zzi(BaseGmsClient baseGmsClient, int i, IInterface iInterface) {
        int i2 = 2 % 2;
        int i3 = asBinder + 73;
        d = i3 % 128;
        int i4 = i3 % 2;
        baseGmsClient.zzp(i, null);
        if (i4 != 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean zzm(BaseGmsClient baseGmsClient) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean z = baseGmsClient.zzD;
        int i5 = i2 + 5;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    protected boolean enableLocalFallback() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public Account getAccount() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 57;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public Feature[] getApiFeatures() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 47;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Feature[] featureArr = zze;
        int i5 = i2 + 9;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return featureArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AttributionSourceWrapper getAttributionSourceWrapper() {
        int i = 2 % 2;
        int i2 = d + 51;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        AttributionSourceWrapper attributionSourceWrapper = this.zzB;
        int i3 = d + 91;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 20 / 0;
        }
        return attributionSourceWrapper;
    }

    public final Feature[] getAvailableFeatures() {
        int i = 2 % 2;
        int i2 = d + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzk zzkVar = this.zzE;
        if (zzkVar != null) {
            return zzkVar.zzb;
        }
        int i4 = asBinder + 45;
        d = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public Bundle getConnectionHint() {
        int i = 2 % 2;
        int i2 = d + 117;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final Context getContext() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        d = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.zzl;
        int i5 = i2 + 49;
        d = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    public int getGCoreServiceId() {
        int i = 2 % 2;
        int i2 = d + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.zzy;
        if (i3 == 0) {
            int i5 = 31 / 0;
        }
        return i4;
    }

    public String getLastDisconnectMessage() {
        int i = 2 % 2;
        int i2 = d + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.zzk;
        int i4 = d + 77;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return str;
    }

    protected String getLocalStartServiceAction() {
        int i = 2 % 2;
        int i2 = d + 51;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return null;
    }

    public final Looper getLooper() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 85;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Looper looper = this.zzm;
        int i5 = i2 + 79;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return looper;
    }

    protected String getStartServicePackage() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 37;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = i2 + 3;
        d = i5 % 128;
        int i6 = i5 % 2;
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        int i = 2 % 2;
        int i2 = d + 75;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        zzk zzkVar = this.zzE;
        if (zzkVar != null) {
            return zzkVar.zzd;
        }
        int i3 = d + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public boolean hasConnectionInfo() {
        int i = 2 % 2;
        int i2 = d + 117;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
            if (this.zzE == null) {
                return false;
            }
        } else if (this.zzE == null) {
            return false;
        }
        int i4 = asBinder + 119;
        d = i4 % 128;
        return i4 % 2 == 0;
    }

    public boolean providesSignIn() {
        int i = 2 % 2;
        int i2 = d + 43;
        asBinder = i2 % 128;
        return i2 % 2 == 0;
    }

    public boolean requiresAccount() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 43;
        asBinder = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public boolean requiresGooglePlayServices() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public boolean requiresSignIn() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 55;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 101;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAttributionSourceWrapper(AttributionSourceWrapper attributionSourceWrapper) {
        int i = 2 % 2;
        int i2 = d + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.zzB = attributionSourceWrapper;
        int i4 = asBinder + 107;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setAttributionTag(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zzA = str;
        int i4 = d + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public boolean usesClientTelemetry() {
        int i = 2 % 2;
        int i2 = d + 65;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        d = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        b = (char) 2283;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, short r6, short r7) {
        /*
            byte[] r0 = com.google.android.gms.common.internal.BaseGmsClient.$$c
            int r5 = r5 + 102
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r3 = r5
            r5 = r7
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r6]
        L27:
            int r5 = r5 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.$$i(byte, short, short):java.lang.String");
    }
}
