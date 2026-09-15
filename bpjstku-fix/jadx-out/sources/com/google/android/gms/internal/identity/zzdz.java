package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzad;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdz extends GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final SimpleArrayMap zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;
    private final SimpleArrayMap zzi;
    private static final byte[] $$l = {97, 58, 103, -72};
    private static final int $$m = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {109, 48, -62, 38, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 73, -3, -16, 1, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$k = 18;
    private static final byte[] $$d = {99, -43, -44, -62, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 171;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long b = 4465468465351614652L;

    public zzdz(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzf = new SimpleArrayMap();
        this.zzg = new SimpleArrayMap();
        this.zzh = new SimpleArrayMap();
        this.zzi = new SimpleArrayMap();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r0 = com.google.android.gms.internal.identity.zzdz.$$d
            int r1 = 53 - r7
            int r6 = r6 * 52
            int r6 = 56 - r6
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r5
            r5 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r0[r6]
        L29:
            int r5 = r5 + r3
            int r5 = r5 + (-10)
            int r6 = r6 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdz.f(short, int, byte, java.lang.Object[]):void");
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
    private static void h(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 5
            int r0 = r6 + 48
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r8 = r8 * 47
            int r8 = r8 + 4
            byte[] r1 = com.google.android.gms.internal.identity.zzdz.$$j
            byte[] r0 = new byte[r0]
            int r6 = r6 + 47
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r8 = r8 + r4
            int r7 = r7 + 1
            int r8 = r8 + 3
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdz.h(byte, short, short, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Feature[] featureArr = zzo.zzp;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return featureArr;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    public final void zzB(TaskCompletionSource taskCompletionSource) throws RemoteException {
        int i = 2 % 2;
        ((zzv) getService()).zzC(new zzdn(null, taskCompletionSource));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void zzC(ListenerHolder listenerHolder, DeviceOrientationRequest deviceOrientationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey = (ListenerHolder.ListenerKey) Objects.requireNonNull(listenerHolder.getListenerKey());
        synchronized (this.zzh) {
            zzdq zzdqVar = (zzdq) this.zzh.get(listenerKey);
            if (zzdqVar == null) {
                zzdqVar = new zzdq(listenerHolder);
                this.zzh.put(listenerKey, zzdqVar);
            } else {
                zzdqVar.zzc(listenerHolder);
            }
            ((zzv) getService()).zzF(new zzj(1, new zzh(deviceOrientationRequest, zzh.zza, null), zzdqVar, new zzdn(null, taskCompletionSource)));
        }
    }

    public final void zzD(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzh) {
            zzdq zzdqVar = (zzdq) this.zzh.remove(listenerKey);
            if (zzdqVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
            } else {
                zzdqVar.zze();
                ((zzv) getService()).zzF(new zzj(2, null, zzdqVar, new zzdn(Boolean.TRUE, taskCompletionSource)));
            }
        }
    }

    public final void zzs(zzdr zzdrVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzdy zzdyVar;
        ListenerHolder listenerHolderZza = zzdrVar.zza();
        ListenerHolder.ListenerKey listenerKey = (ListenerHolder.ListenerKey) Objects.requireNonNull(listenerHolderZza.getListenerKey());
        boolean zZzG = zzG(zzo.zzj);
        synchronized (this.zzf) {
            zzdy zzdyVar2 = (zzdy) this.zzf.get(listenerKey);
            if (zzdyVar2 == null || zZzG) {
                zzdy zzdyVar3 = new zzdy(zzdrVar);
                this.zzf.put(listenerKey, zzdyVar3);
                zzdyVar = zzdyVar3;
            } else {
                zzdyVar2.zzc(listenerHolderZza);
                zzdyVar = zzdyVar2;
                zzdyVar2 = null;
            }
            if (zZzG) {
                ((zzv) getService()).zzw(zzee.zza(zzdyVar2, zzdyVar, listenerKey.toIdString()), locationRequest, new zzdj(null, taskCompletionSource));
            } else {
                ((zzv) getService()).zzv(new zzei(1, zzeg.zza(null, locationRequest), zzdyVar, null, null, new zzdo(taskCompletionSource, zzdyVar), listenerKey.toIdString()));
            }
        }
    }

    public final void zzt(zzdr zzdrVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzdv zzdvVar;
        ListenerHolder listenerHolderZza = zzdrVar.zza();
        ListenerHolder.ListenerKey listenerKey = (ListenerHolder.ListenerKey) Objects.requireNonNull(listenerHolderZza.getListenerKey());
        boolean zZzG = zzG(zzo.zzj);
        synchronized (this.zzg) {
            zzdv zzdvVar2 = (zzdv) this.zzg.get(listenerKey);
            if (zzdvVar2 == null || zZzG) {
                zzdv zzdvVar3 = new zzdv(zzdrVar);
                this.zzg.put(listenerKey, zzdvVar3);
                zzdvVar = zzdvVar3;
            } else {
                zzdvVar2.zzc(listenerHolderZza);
                zzdvVar = zzdvVar2;
                zzdvVar2 = null;
            }
            if (zZzG) {
                ((zzv) getService()).zzw(zzee.zzb(zzdvVar2, zzdvVar, listenerKey.toIdString()), locationRequest, new zzdj(null, taskCompletionSource));
            } else {
                ((zzv) getService()).zzv(new zzei(1, zzeg.zza(null, locationRequest), null, zzdvVar, null, new zzdd(taskCompletionSource, zzdvVar), listenerKey.toIdString()));
            }
        }
    }

    public final void zzv(ListenerHolder.ListenerKey listenerKey, boolean z, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzf) {
            zzdy zzdyVar = (zzdy) this.zzf.remove(listenerKey);
            if (zzdyVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            zzdyVar.zzf();
            if (!z) {
                taskCompletionSource.setResult(Boolean.TRUE);
            } else if (zzG(zzo.zzj)) {
                zzv zzvVar = (zzv) getService();
                int iIdentityHashCode = System.identityHashCode(zzdyVar);
                StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                sb.append("ILocationListener@");
                sb.append(iIdentityHashCode);
                zzvVar.zzx(zzee.zza(null, zzdyVar, sb.toString()), new zzdj(Boolean.TRUE, taskCompletionSource));
            } else {
                ((zzv) getService()).zzv(new zzei(2, null, zzdyVar, null, null, new zzdn(Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    public final void zzw(ListenerHolder.ListenerKey listenerKey, boolean z, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzg) {
            zzdv zzdvVar = (zzdv) this.zzg.remove(listenerKey);
            if (zzdvVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            zzdvVar.zzg();
            if (!z) {
                taskCompletionSource.setResult(Boolean.TRUE);
            } else if (zzG(zzo.zzj)) {
                zzv zzvVar = (zzv) getService();
                int iIdentityHashCode = System.identityHashCode(zzdvVar);
                StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                sb.append("ILocationCallback@");
                sb.append(iIdentityHashCode);
                zzvVar.zzx(zzee.zzb(null, zzdvVar, sb.toString()), new zzdj(Boolean.TRUE, taskCompletionSource));
            } else {
                ((zzv) getService()).zzv(new zzei(2, null, null, zzdvVar, null, new zzdn(Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        int i = 2 % 2;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return !((iInterfaceQueryLocalInterface instanceof zzv) ^ true) ? (zzv) iInterfaceQueryLocalInterface : new zzu(iBinder);
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final boolean zzG(Feature feature) {
        Feature feature2;
        int i = 2 % 2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= availableFeatures.length) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    int i4 = i3 % 2;
                    feature2 = null;
                    break;
                }
                feature2 = availableFeatures[i2];
                if (feature.getName().equals(feature2.getName())) {
                    break;
                }
                i2++;
            }
            if (feature2 != null && feature2.getVersion() >= feature.getVersion()) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return false;
    }

    public final void zzy(TaskCompletionSource taskCompletionSource) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            zzG(zzo.zzg);
            obj.hashCode();
            throw null;
        }
        if (zzG(zzo.zzg)) {
            ((zzv) getService()).zzz(true, new zzdj(null, taskCompletionSource));
            return;
        }
        ((zzv) getService()).zzy(true);
        taskCompletionSource.setResult(null);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void zzz(TaskCompletionSource taskCompletionSource) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (!zzG(zzo.zzg)) {
            ((zzv) getService()).zzy(false);
            taskCompletionSource.setResult(true);
            return;
        }
        ((zzv) getService()).zzz(false, new zzdj(true, taskCompletionSource));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void zzA(Location location, TaskCompletionSource taskCompletionSource) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            zzG(zzo.zzh);
            obj.hashCode();
            throw null;
        }
        if (!zzG(zzo.zzh)) {
            ((zzv) getService()).zzA(location);
            taskCompletionSource.setResult(null);
        } else {
            ((zzv) getService()).zzB(location, new zzdj(null, taskCompletionSource));
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void zzF(zzem zzemVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzG(zzo.zzn);
            throw null;
        }
        if (!zzG(zzo.zzn)) {
            ((zzv) getService()).zzf(zzemVar, new zzdg(taskCompletionSource));
            return;
        }
        ((zzv) getService()).zzg(zzemVar, new zzdj(null, taskCompletionSource));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void zzE(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (zzG(zzo.zzn)) {
            ((zzv) getService()).zze(geofencingRequest, pendingIntent, new zzdj(null, taskCompletionSource));
            return;
        }
        ((zzv) getService()).zzd(geofencingRequest, pendingIntent, new zzdg(taskCompletionSource));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzp(zzad zzadVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (zzG(zzo.zzj)) {
            ((zzv) getService()).zzo(zzadVar, new zzee(5, null, new zzdl(taskCompletionSource), null, null));
            return;
        }
        taskCompletionSource.setResult(((zzv) getService()).zzp(getContext().getPackageName()));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void zzq(LastLocationRequest lastLocationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (zzG(zzo.zzj)) {
            ((zzv) getService()).zzq(lastLocationRequest, zzee.zzd(new zzdk(taskCompletionSource)));
            return;
        }
        if (zzG(zzo.zzf)) {
            ((zzv) getService()).zzr(lastLocationRequest, new zzdk(taskCompletionSource));
            return;
        }
        taskCompletionSource.setResult(((zzv) getService()).zzs());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzG(zzo.zzj);
            throw null;
        }
        if (zzG(zzo.zzj)) {
            ((zzv) getService()).zzx(zzee.zzc(pendingIntent), new zzdj(null, taskCompletionSource));
            return;
        }
        ((zzv) getService()).zzv(new zzei(2, null, null, null, pendingIntent, new zzdn(null, taskCompletionSource), null));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r12 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r0 = (com.google.android.gms.internal.identity.zzv) getService();
        r5 = com.google.android.gms.internal.identity.zzeg.zza(null, r13);
        r9 = new com.google.android.gms.internal.identity.zzdn(null, r14);
        r13 = r12.hashCode();
        r14 = new java.lang.StringBuilder(java.lang.String.valueOf(r13).length() + 14);
        r14.append("PendingIntent@");
        r14.append(r13);
        r0.zzv(new com.google.android.gms.internal.identity.zzei(1, r5, null, null, r12, r9, r14.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (zzG(com.google.android.gms.location.zzo.zzj) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (zzG(com.google.android.gms.location.zzo.zzj) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        ((com.google.android.gms.internal.identity.zzv) getService()).zzw(com.google.android.gms.internal.identity.zzee.zzc(r12), r13, new com.google.android.gms.internal.identity.zzdj(null, r14));
        r12 = com.google.android.gms.internal.identity.zzdz.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        com.google.android.gms.internal.identity.zzdz.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r12 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzu(android.app.PendingIntent r12, com.google.android.gms.location.LocationRequest r13, com.google.android.gms.tasks.TaskCompletionSource r14) throws android.os.RemoteException {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.identity.zzdz.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.google.android.gms.internal.identity.zzdz.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1c
            com.google.android.gms.common.Feature r1 = com.google.android.gms.location.zzo.zzj
            boolean r1 = r11.zzG(r1)
            r3 = 91
            int r3 = r3 / 0
            if (r1 == 0) goto L43
            goto L24
        L1c:
            com.google.android.gms.common.Feature r1 = com.google.android.gms.location.zzo.zzj
            boolean r1 = r11.zzG(r1)
            if (r1 == 0) goto L43
        L24:
            android.os.IInterface r1 = r11.getService()
            com.google.android.gms.internal.location.zzv r1 = (com.google.android.gms.internal.identity.zzv) r1
            com.google.android.gms.internal.location.zzee r12 = com.google.android.gms.internal.identity.zzee.zzc(r12)
            com.google.android.gms.internal.location.zzdj r3 = new com.google.android.gms.internal.location.zzdj
            r3.<init>(r2, r14)
            r1.zzw(r12, r13, r3)
            int r12 = com.google.android.gms.internal.identity.zzdz.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r12 = r12 + 47
            int r13 = r12 % 128
            com.google.android.gms.internal.identity.zzdz.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r13
            int r12 = r12 % r0
            if (r12 != 0) goto L42
            return
        L42:
            throw r2
        L43:
            android.os.IInterface r0 = r11.getService()
            com.google.android.gms.internal.location.zzv r0 = (com.google.android.gms.internal.identity.zzv) r0
            com.google.android.gms.internal.location.zzeg r5 = com.google.android.gms.internal.identity.zzeg.zza(r2, r13)
            com.google.android.gms.internal.location.zzdn r9 = new com.google.android.gms.internal.location.zzdn
            r9.<init>(r2, r14)
            int r13 = r12.hashCode()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r13)
            int r1 = r1.length()
            int r1 = r1 + 14
            r14.<init>(r1)
            java.lang.String r1 = "PendingIntent@"
            r14.append(r1)
            r14.append(r13)
            com.google.android.gms.internal.location.zzei r13 = new com.google.android.gms.internal.location.zzei
            r4 = 1
            r6 = 0
            r7 = 0
            java.lang.String r10 = r14.toString()
            r3 = r13
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.zzv(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdz.zzu(android.app.PendingIntent, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r9 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r9.onCanceledRequested(new com.google.android.gms.internal.identity.zzed(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (zzG(com.google.android.gms.location.zzo.zze) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r8 = ((com.google.android.gms.internal.identity.zzv) getService()).zzu(r8, new com.google.android.gms.internal.identity.zzdk(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r9 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r9.onCanceledRequested(new com.google.android.gms.internal.identity.zzeb(r8));
        r8 = com.google.android.gms.internal.identity.zzdz.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        com.google.android.gms.internal.identity.zzdz.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if ((r8 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r8 = null;
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        r0 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(new com.google.android.gms.internal.identity.zzdh(r7, r10), com.google.android.gms.internal.identity.zzfc.zza(), "GetCurrentLocation");
        r1 = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) java.util.Objects.requireNonNull(r0.getListenerKey());
        r2 = new com.google.android.gms.internal.identity.zzdi(r7, r0, r10);
        r0 = new com.google.android.gms.tasks.TaskCompletionSource();
        r3 = new com.google.android.gms.location.LocationRequest.Builder(r8.getPriority(), 0);
        r3.setMinUpdateIntervalMillis(0);
        r3.setDurationMillis(r8.getDurationMillis());
        r3.setGranularity(r8.getGranularity());
        r3.setMaxUpdateAgeMillis(r8.getMaxUpdateAgeMillis());
        r3.zzb(r8.zza());
        r3.zza(r8.zzb());
        r3.setWaitForAccurateLocation(true);
        r3.zzc(r8.zzc());
        zzt(r2, r3.build(), r0);
        r0.getTask().addOnCompleteListener(new com.google.android.gms.internal.identity.zzea(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
    
        if (r9 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e7, code lost:
    
        r9.onCanceledRequested(new com.google.android.gms.internal.identity.zzec(r7, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ef, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (zzG(com.google.android.gms.location.zzo.zzj) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (zzG(com.google.android.gms.location.zzo.zzj) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r8 = ((com.google.android.gms.internal.identity.zzv) getService()).zzt(r8, com.google.android.gms.internal.identity.zzee.zzd(new com.google.android.gms.internal.identity.zzdk(r10)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzr(com.google.android.gms.location.CurrentLocationRequest r8, com.google.android.gms.tasks.CancellationToken r9, final com.google.android.gms.tasks.TaskCompletionSource r10) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdz.zzr(com.google.android.gms.location.CurrentLocationRequest, com.google.android.gms.tasks.CancellationToken, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    private static void g(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 73;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - KeyEvent.normalizeMetaState(0)), 1356 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 39, 894276454, false, $$n(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 47773), AndroidCharacter.getMirror('0') + 420, Color.green(0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01fd  */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) (31533 - Color.alpha(0));
            int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iResolveOpacity = 28 - Drawable.resolveOpacity(0, 0);
            byte b2 = $$d[37];
            Object[] objArr2 = new Object[1];
            f(b2, b2, (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, scrollBarFadeDuration, iResolveOpacity, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        g(new char[]{20462, 20367, 51325, 49865, 55667, 52387, 54488, 25833, 62500, 65110, 36315, 49148, 6481, 43428, 40969, 33577, 52655, 17692, 23355, 22151, 57891, 28740, 3995, 14949, 38533, 11252}, ImageFormat.getBitsPerPixel(0) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        g(new char[]{21647, 21738, 14526, 12808, 31089, 27812, 61552, 32660, 53390, 3737, 11740, 39722, 570, 22901, 'L', 42916, 55006, 46529, 64301}, ViewConfiguration.getTouchSlop() >> 8, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
            int maxKeyCode = 921 - (KeyEvent.getMaxKeyCode() >> 16);
            int mode = 28 - View.MeasureSpec.getMode(0);
            byte[] bArr = $$d;
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            f(b3, bArr[37], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, maxKeyCode, mode, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha2 = (char) (Color.alpha(0) + 31533);
                int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 921;
                int iRed = Color.red(0) + 28;
                byte[] bArr2 = $$d;
                byte b4 = bArr2[80];
                Object[] objArr6 = new Object[1];
                f(b4, b4, bArr2[33], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha2, i2, iRed, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i3}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (((((~((-286670868) | i4)) | (~(1069434743 | iIdentityHashCode))) * 988) + 1646217591) + ((((~(iIdentityHashCode | (-991315768))) | 704644900) | (~(i4 | 1069434743))) * 988)) - 490253000;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            g(new char[]{8837, 8932, 47574, 45922, 56153, 52873, 52443, 2434, 60455, 36861, 36849, 43007, 29748, 55308, 41597, 39767, 41212, 13479, 22801, 20104, 36691, 453, 3497, 8816, 64473, 23132, 8263, 5588, 9876, 46840}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            g(new char[]{11406, 11501, 35404, 32995, 41223, 46273, 5438, 1923, 13762, 48224, 62889, 32373, 31278, 60310, 55337, 17141, 44757, 1855, 9049, 38765, 33089, 12888}, ViewConfiguration.getDoubleTapTimeout() >> 16, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            g(new char[]{57224, 57314, 57593, 59970, 18678, 23860, 43594, 62670, 35493, 54999, 7241, 49469, 35135, 33149, 12771, 64898, 24003, 28063, 51901, 10254}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            g(new char[]{3153, 3128, 10983, 8281, 15542, 10599, 1520, 10061, 9488, 7372, 26639, 28319, 23241, 19244, 17808, 21030, 36394, 42906, 48879, 34739}, 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -490253000};
                byte[] bArr3 = $$j;
                byte b5 = (byte) (bArr3[50] - 1);
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                h(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[50];
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                h(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cGreen = (char) (Color.green(0) + 31533);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                    byte[] bArr4 = $$d;
                    byte b9 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    f(b9, b9, bArr4[33], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, iMakeMeasureSpec, pressedStateDuration, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    g(new char[]{20462, 20367, 51325, 49865, 55667, 52387, 54488, 25833, 62500, 65110, 36315, 49148, 6481, 43428, 40969, 33577, 52655, 17692, 23355, 22151, 57891, 28740, 3995, 14949, 38533, 11252}, TextUtils.getCapsMode("", 0, 0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    g(new char[]{21647, 21738, 14526, 12808, 31089, 27812, 61552, 32660, 53390, 3737, 11740, 39722, 570, 22901, 'L', 42916, 55006, 46529, 64301}, MotionEvent.axisFromString("") + 1, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                        byte[] bArr5 = $$d;
                        byte b10 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        f(b10, bArr5[37], b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i9, keyRepeatDelay, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                        int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
                        byte b11 = $$d[37];
                        Object[] objArr20 = new Object[1];
                        f(b11, b11, (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iIndexOf, i10, -1048449946, false, (String) objArr20[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i16}, (String[]) objArr[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i17 = i15 + (-301471657) + (((~(iElapsedRealtime | 852300908)) | (-921778736)) * (-668)) + ((852300908 | (~((-921778736) | iElapsedRealtime))) * 1336) + ((iElapsedRealtime | (-70265348)) * 668);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
            return "com.google.android.location.internal.GoogleLocationManagerService.START";
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i20 = 0;
            while (i20 < strArr.length) {
                arrayList.add(strArr[i20]);
                i20++;
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                int i22 = i21 % 2;
            }
        }
        Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
        int i23 = ((int[]) objArr[0])[0];
        int i24 = ((int[]) objArr[3])[0];
        Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i24}, (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i25 = ~iIdentityHashCode2;
        int i26 = i23 + 25598825 + (((~((-1337846949) | i25)) | (~((-436232696) | iIdentityHashCode2))) * 1900) + (((~(i25 | 436232695)) | (~(iIdentityHashCode2 | 1337846948))) * (-950)) + (((~(iIdentityHashCode2 | 436232695)) | (~(i25 | 1337846948))) * 950);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr22[0])[0] = i28 ^ (i28 << 5);
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        return i2 % 2 == 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(short r6, byte r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 107
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = com.google.android.gms.internal.identity.zzdz.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdz.$$n(short, byte, int):java.lang.String");
    }
}
