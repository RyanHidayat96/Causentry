package com.google.android.gms.maps.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg extends com.google.android.gms.internal.maps.zza implements IGoogleMapDelegate {
    private static final byte[] $$c = {29, -5, -24, -13};
    private static final int $$d = 236;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {49, -45, -112, 57, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 152;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {124307202, -984514052, -627246486, -434945484, 1831120105, -1871338709, -1943630897, 324002591, 681218112, -2115349110, -317184293, 1658059683, 311707458, 1430016345, -367970470, -2075244412, -1992882406, 4182871};

    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = com.google.android.gms.maps.internal.zzg.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-11)
            r9 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzg.a(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void clear() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzc(14, zza());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onDestroy() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzc(57, zza());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onExitAmbient() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 9;
        } else {
            parcelZza = zza();
            i = 82;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onLowMemory() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzc(58, zza());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onPause() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 26;
        } else {
            parcelZza = zza();
            i = 56;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onResume() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzc(55, zza());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStart() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzc(101, zza());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStop() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 41;
        } else {
            parcelZza = zza();
            i = 102;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void resetMinMaxZoomPreference() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzc(94, zza());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void addOnMapCapabilitiesChangedListener(zzal zzalVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzalVar);
            i = 119;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzalVar);
            i = 110;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
            i = 4;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
            i = 5;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void getMapAsync(zzat zzatVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzatVar);
            i = 75;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzatVar);
            i = 53;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void moveCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        }
        zzc(4, parcelZza);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onCreate(Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, bundle);
        zzc(54, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, bundle);
        zzc(81, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void removeOnMapCapabilitiesChangedListener(zzal zzalVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzalVar);
        zzc(111, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setContentDescription(String str) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            parcelZza.writeString(str);
            i = 80;
        } else {
            parcelZza = zza();
            parcelZza.writeString(str);
            i = 61;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setInfoWindowAdapter(zzi zziVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zziVar);
        zzc(33, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLngBounds);
        zzc(95, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iLocationSourceDelegate);
        zzc(24, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapColorScheme(int i) throws RemoteException {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(113, parcelZza);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapType(int i) throws RemoteException {
        Parcel parcelZza;
        int i2;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            parcelZza = zza();
            parcelZza.writeInt(i);
            i2 = 66;
        } else {
            parcelZza = zza();
            parcelZza.writeInt(i);
            i2 = 16;
        }
        zzc(i2, parcelZza);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMaxZoomPreference(float f) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            parcelZza.writeFloat(f);
            i = 6;
        } else {
            parcelZza = zza();
            parcelZza.writeFloat(f);
            i = 93;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMinZoomPreference(float f) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzc(92, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraChangeListener(zzn zznVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zznVar);
        zzc(27, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraIdleListener(zzp zzpVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzpVar);
            i = 52;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzpVar);
            i = 99;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveCanceledListener(zzr zzrVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzrVar);
            i = 91;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzrVar);
            i = 98;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveListener(zzt zztVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zztVar);
            i = 118;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zztVar);
            i = 97;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveStartedListener(zzv zzvVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzvVar);
            i = 61;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzvVar);
            i = 96;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCircleClickListener(zzx zzxVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzxVar);
            i = 31;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzxVar);
            i = 89;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnGroundOverlayClickListener(zzz zzzVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzzVar);
        zzc(83, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnIndoorStateChangeListener(zzab zzabVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzabVar);
            i = 37;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzabVar);
            i = 45;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowClickListener(zzad zzadVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzadVar);
            i = 81;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzadVar);
            i = 32;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowCloseListener(zzaf zzafVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzafVar);
        zzc(86, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowLongClickListener(zzah zzahVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzahVar);
        zzc(84, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapClickListener(zzan zzanVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzanVar);
            i = 123;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzanVar);
            i = 28;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLoadedCallback(zzap zzapVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzapVar);
            i = 96;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzapVar);
            i = 42;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLongClickListener(zzar zzarVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzarVar);
        zzc(29, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzd zzdVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzdVar);
        zzc(6, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final CameraPosition getCameraPosition() throws RemoteException {
        Parcel parcelZzJ;
        CameraPosition cameraPosition;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            parcelZzJ = zzJ(0, zza());
            cameraPosition = (CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, CameraPosition.CREATOR);
        } else {
            parcelZzJ = zzJ(1, zza());
            cameraPosition = (CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, CameraPosition.CREATOR);
        }
        parcelZzJ.recycle();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return cameraPosition;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaa getFocusedBuilding() throws RemoteException {
        Parcel parcelZzJ;
        com.google.android.gms.internal.maps.zzaa zzaaVarZzb;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(2, zza());
            zzaaVarZzb = com.google.android.gms.internal.maps.zzz.zzb(parcelZzJ.readStrongBinder());
        } else {
            parcelZzJ = zzJ(44, zza());
            zzaaVarZzb = com.google.android.gms.internal.maps.zzz.zzb(parcelZzJ.readStrongBinder());
        }
        parcelZzJ.recycle();
        return zzaaVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzag getMapCapabilities() throws RemoteException {
        Parcel parcelZzJ;
        com.google.android.gms.internal.maps.zzag zzagVarZzb;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(97, zza());
            zzagVarZzb = com.google.android.gms.internal.maps.zzaf.zzb(parcelZzJ.readStrongBinder());
        } else {
            parcelZzJ = zzJ(109, zza());
            zzagVarZzb = com.google.android.gms.internal.maps.zzaf.zzb(parcelZzJ.readStrongBinder());
        }
        parcelZzJ.recycle();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return zzagVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapColorScheme() throws RemoteException {
        Parcel parcelZzJ;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZzJ = zzJ(108, zza());
            i = parcelZzJ.readInt();
        } else {
            parcelZzJ = zzJ(114, zza());
            i = parcelZzJ.readInt();
        }
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapType() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(15, zza());
        int i4 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        int i5 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMaxZoomLevel() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(2, zza());
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMinZoomLevel() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(3, zza());
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final Location getMyLocation() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(23, zza());
        Location location = (Location) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, Location.CREATOR);
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return location;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isBuildingsEnabled() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(40, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isIndoorEnabled() throws RemoteException {
        Parcel parcelZzJ;
        boolean zZzh;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            parcelZzJ = zzJ(51, zza());
            zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        } else {
            parcelZzJ = zzJ(19, zza());
            zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        }
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isMyLocationEnabled() throws RemoteException {
        Parcel parcelZzJ;
        boolean zZzh;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(0, zza());
            zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        } else {
            parcelZzJ = zzJ(21, zza());
            zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        }
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isTrafficEnabled() throws RemoteException {
        Parcel parcelZzJ;
        boolean zZzh;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            parcelZzJ = zzJ(109, zza());
            zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        } else {
            parcelZzJ = zzJ(17, zza());
            zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        }
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setBuildingsEnabled(boolean z) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        int i4 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(41, parcelZza);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMyLocationEnabled(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            int i4 = com.google.android.gms.internal.maps.zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 37;
        } else {
            parcelZza = zza();
            int i5 = com.google.android.gms.internal.maps.zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 22;
        }
        zzc(i, parcelZza);
        int i6 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzn addCircle(CircleOptions circleOptions) throws RemoteException {
        Parcel parcelZzJ;
        com.google.android.gms.internal.maps.zzn zznVarZzb;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza, circleOptions);
            parcelZzJ = zzJ(28, parcelZza);
            zznVarZzb = com.google.android.gms.internal.maps.zzm.zzb(parcelZzJ.readStrongBinder());
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza2, circleOptions);
            parcelZzJ = zzJ(35, parcelZza2);
            zznVarZzb = com.google.android.gms.internal.maps.zzm.zzb(parcelZzJ.readStrongBinder());
        }
        parcelZzJ.recycle();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return zznVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzx addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, groundOverlayOptions);
        Parcel parcelZzJ = zzJ(12, parcelZza);
        com.google.android.gms.internal.maps.zzx zzxVarZzb = com.google.android.gms.internal.maps.zzw.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return zzxVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaj addMarker(MarkerOptions markerOptions) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, markerOptions);
        Parcel parcelZzJ = zzJ(11, parcelZza);
        com.google.android.gms.internal.maps.zzaj zzajVarZzb = com.google.android.gms.internal.maps.zzai.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return zzajVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzao addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        Parcel parcelZzJ;
        com.google.android.gms.internal.maps.zzao zzaoVarZzb;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza, polygonOptions);
            parcelZzJ = zzJ(10, parcelZza);
            zzaoVarZzb = com.google.android.gms.internal.maps.zzan.zzb(parcelZzJ.readStrongBinder());
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza2, polygonOptions);
            parcelZzJ = zzJ(10, parcelZza2);
            zzaoVarZzb = com.google.android.gms.internal.maps.zzan.zzb(parcelZzJ.readStrongBinder());
        }
        parcelZzJ.recycle();
        return zzaoVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzar addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        Parcel parcelZzJ;
        com.google.android.gms.internal.maps.zzar zzarVarZzb;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza, polylineOptions);
            parcelZzJ = zzJ(20, parcelZza);
            zzarVarZzb = com.google.android.gms.internal.maps.zzaq.zzb(parcelZzJ.readStrongBinder());
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza2, polylineOptions);
            parcelZzJ = zzJ(9, parcelZza2);
            zzarVarZzb = com.google.android.gms.internal.maps.zzaq.zzb(parcelZzJ.readStrongBinder());
        }
        parcelZzJ.recycle();
        return zzarVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaw addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, tileOverlayOptions);
        Parcel parcelZzJ = zzJ(13, parcelZza);
        com.google.android.gms.internal.maps.zzaw zzawVarZzb = com.google.android.gms.internal.maps.zzav.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return zzawVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, zzd zzdVar) throws RemoteException {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzdVar);
        zzc(7, parcelZza);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzu getFeatureLayer(FeatureLayerOptions featureLayerOptions) throws RemoteException {
        Parcel parcelZzJ;
        com.google.android.gms.internal.maps.zzu zzuVarZzb;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza, featureLayerOptions);
            parcelZzJ = zzJ(2, parcelZza);
            zzuVarZzb = com.google.android.gms.internal.maps.zzt.zzb(parcelZzJ.readStrongBinder());
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza2, featureLayerOptions);
            parcelZzJ = zzJ(112, parcelZza2);
            zzuVarZzb = com.google.android.gms.internal.maps.zzt.zzb(parcelZzJ.readStrongBinder());
        }
        parcelZzJ.recycle();
        return zzuVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, mapStyleOptions);
        Parcel parcelZzJ = zzJ(91, parcelZza);
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zZzh;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IProjectionDelegate getProjection() throws RemoteException {
        Parcel parcelZzJ;
        IBinder strongBinder;
        IProjectionDelegate zzbuVar;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0 ? (strongBinder = (parcelZzJ = zzJ(26, zza())).readStrongBinder()) != null : (strongBinder = (parcelZzJ = zzJ(81, zza())).readStrongBinder()) != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            zzbuVar = iInterfaceQueryLocalInterface instanceof IProjectionDelegate ? (IProjectionDelegate) iInterfaceQueryLocalInterface : new zzbu(strongBinder);
        } else {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            zzbuVar = null;
        }
        parcelZzJ.recycle();
        return zzbuVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IUiSettingsDelegate getUiSettings() throws RemoteException {
        IUiSettingsDelegate zzcaVar;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(25, zza());
        IBinder strongBinder = parcelZzJ.readStrongBinder();
        if (strongBinder == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            zzcaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (iInterfaceQueryLocalInterface instanceof IUiSettingsDelegate) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
                zzcaVar = (IUiSettingsDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzcaVar = new zzca(strongBinder);
            }
        }
        parcelZzJ.recycle();
        return zzcaVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1
  0x0035: PHI (r1v6 android.os.Parcel) = (r1v5 android.os.Parcel), (r1v9 android.os.Parcel) binds: [B:8:0x0033, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel parcelZzJ;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza, bundle);
            parcelZzJ = zzJ(102, parcelZza);
            if (parcelZzJ.readInt() != 0) {
                bundle.readFromParcel(parcelZzJ);
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 == 0) {
                    int i4 = 3 / 4;
                }
            }
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zze(parcelZza2, bundle);
            parcelZzJ = zzJ(60, parcelZza2);
            if (parcelZzJ.readInt() != 0) {
                bundle.readFromParcel(parcelZzJ);
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                TuitionPaymentFragmentbindingInflater1 = i % 128;
                if (i % 2 == 0) {
                    int i5 = 3 / 4;
                }
            }
        }
        parcelZzJ.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setIndoorEnabled(boolean z) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        int i4 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzJ = zzJ(20, parcelZza);
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return zZzh;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 103;
                $10 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.getSize(i6), 3292 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 31 - TextUtils.indexOf("", "", i6), 1948206109, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = -1870535734;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 17;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (iArr5 != null) {
            int i12 = $10 + 123;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr5[i14]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), 3291 - KeyEvent.keyCodeFromString(""), 30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1948206109, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i14++;
                iArr5 = iArr5;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i15 = $11 + 17;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i17 = 17;
            for (int i18 = 1; i17 > i18; i18 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i17];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), (-16774657) - Color.rgb(0, 0, 0), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), 683220507, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i17--;
            }
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 28879), 348 - TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 26, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
        int i21 = $10 + 11;
        $11 = i21 % 128;
        int i22 = i21 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerClickListener(zzav zzavVar) throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        char c2;
        int i = 2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzavVar);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int i2 = 652 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 52), bArr[80], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, i2, modifierMetaStateMask, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        b(new int[]{1516171219, 1332827080, 35722156, -738614384, 374592118, -1714329885, 1142353395, -1883104638, -2124120433, 905025065, -452161543, 492654284, 1191293542, -1348197309}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(new int[]{-2109874677, 1795331272, -322211865, 474463447, -1302372469, -1480881864, -1397469664, -1519391953, 911408549, 1932248658}, 15 - Color.argb(0, 0, 0, 0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651;
            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b2, b3, (byte) (b3 | 51), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, maximumDrawingCacheSize, maximumDrawingCacheSize2, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 651;
                int iResolveSize = View.resolveSize(0, 0) + 44;
                byte b4 = $$a[7];
                Object[] objArr7 = new Object[1];
                a(b4, (byte) (b4 | 37), (byte) 51, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iResolveOpacity, iResolveSize, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i3 = ((int[]) objArr8[2])[0];
            int i4 = ((int[]) objArr8[0])[0];
            int iMyPid = Process.myPid();
            int i5 = (((-1972715175) + (((~(358670955 | iMyPid)) | 9772036) * 576)) + (((~((~iMyPid) | 368442991)) | 352329729) * 576)) - 670252015;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[3])[0] = i7 ^ (i7 << 5);
            c = 2;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 1611, 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -2003977455, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iIndexOf = 651 - TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[5];
                    byte b6 = bArr3[7];
                    Object[] objArr10 = new Object[1];
                    a(b5, b6, (byte) (b6 | 51), objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iIndexOf, iIndexOf2, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 695 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63405 - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf("", "", 0) + 793, ((byte) KeyEvent.getModifierMetaStateMask()) + 84), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c4 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int iIndexOf3 = 651 - TextUtils.indexOf("", "", 0);
                    int iAlpha = 44 - Color.alpha(0);
                    byte b7 = $$a[7];
                    Object[] objArr11 = new Object[1];
                    a(b7, (byte) (b7 | 37), (byte) 51, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, iIndexOf3, iAlpha, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    b(new int[]{1516171219, 1332827080, 35722156, -738614384, 374592118, -1714329885, 1142353395, -1883104638, -2124120433, 905025065, -452161543, 492654284, 1191293542, -1348197309}, KeyEvent.getDeadChar(0, 0) + 22, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b(new int[]{-2109874677, 1795331272, -322211865, 474463447, -1302372469, -1480881864, -1397469664, -1519391953, 911408549, 1932248658}, 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int offsetAfter = 651 - TextUtils.getOffsetAfter("", 0);
                        int doubleTapTimeout = 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[5];
                        byte b9 = bArr4[7];
                        Object[] objArr14 = new Object[1];
                        a(b8, b9, (byte) (b9 | 51), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, offsetAfter, doubleTapTimeout, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumDrawingCacheSize3 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 650;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 45;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a(b10, (byte) (b10 | 52), bArr5[80], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumDrawingCacheSize3, i8, bitsPerPixel, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i9 = TuitionPaymentFragmentbindingInflater1 + 5;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    c = 2;
                    int i10 = i9 % 2;
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
        int i11 = ((int[]) objArr[0])[0];
        int i12 = ((int[]) objArr[c])[0];
        if (i12 == i11) {
            objArr2 = new Object[4];
            objArr2[0] = new int[]{i};
            objArr2[c] = new int[]{i};
            objArr2[3] = new int[1];
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[c])[0];
            int i15 = ((int[]) objArr[0])[0];
            objArr2[1] = new String[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i16 = ~iMaxMemory;
            int i17 = i13 + (-384250608) + (((~(369534534 | i16)) | 372965344) * 226) + (((~(i16 | 373227494)) | (~((-372965345) | iMaxMemory)) | 369272384) * (-113)) + ((~(iMaxMemory | 369534534)) * 113);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[3])[0] = i19 ^ (i19 << 5);
            c2 = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i20 = i12 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i20) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i21 = ((int[]) objArr[3])[0];
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[0])[0];
            int iNextInt = new Random().nextInt(567024761);
            int i24 = ~(1008143509 | iNextInt);
            int i25 = i21 + (-1182807761) + (((-1073200896) | i24) * (-814)) + ((i24 | (~((~iNextInt) | 1004712699)) | 939655313) * 407) + (((~(iNextInt | (-1004712700))) | (~((-1008143510) | iNextInt)) | 939655313) * 407);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            c2 = 3;
            ((int[]) objArr2[3])[0] = i27 ^ (i27 << 5);
            int i28 = TuitionPaymentFragmentbindingInflater1 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
            int i29 = i28 % 2;
        }
        int i30 = ((int[]) objArr2[c2])[0];
        int i31 = i30 * i30;
        int i32 = -(2031889030 * i30);
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        int i34 = -(i30 * 1047230640);
        int i35 = (i33 & i34) + (i34 | i33);
        int i36 = (i35 & 801141721) + (801141721 | i35);
        int i37 = i36 >> 24;
        int i38 = ((i37 ^ (-511)) + ((i37 & (-511)) << 1)) / 256;
        int i39 = ((i38 | 1) << 1) - (i38 ^ 1);
        int i40 = (i36 ^ i39) + ((i39 & i36) << 1);
        int i41 = i36 >> 26;
        int i42 = ((i41 ^ ComposerKt.defaultsKey) + ((i41 & ComposerKt.defaultsKey) << 1)) / 64;
        int i43 = -((((i42 | 1) << 1) - (i42 ^ 1)) ^ i40);
        int i44 = ((i43 | 9) << 1) - (i43 ^ 9);
        int i45 = i44 >> 18;
        int i46 = (((i45 | (-32767)) << 1) - (i45 ^ (-32767))) / 16384;
        int i47 = ((i46 | 1) << 1) - (i46 ^ 1);
        zzc(518130 / (((-((i47 & 1) + (i47 | 1))) & i44) * 1919), parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void stopAnimation() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 46;
        } else {
            parcelZza = zza();
            i = 8;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerDragListener(zzax zzaxVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzaxVar);
            i = 27;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzaxVar);
            i = 31;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationButtonClickListener(zzaz zzazVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzazVar);
        zzc(37, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationChangeListener(zzbb zzbbVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbbVar);
        zzc(36, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationClickListener(zzbd zzbdVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbdVar);
        zzc(107, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPoiClickListener(zzbf zzbfVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbfVar);
            i = 18;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbfVar);
            i = 80;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolygonClickListener(zzbh zzbhVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbhVar);
            i = 73;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbhVar);
            i = 85;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolylineClickListener(zzbj zzbjVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbjVar);
        zzc(87, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshotForTest(zzbw zzbwVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbwVar);
            i = 11;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbwVar);
            i = 71;
        }
        zzc(i, parcelZza);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setTrafficEnabled(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            int i4 = com.google.android.gms.internal.maps.zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 104;
        } else {
            parcelZza = zza();
            int i5 = com.google.android.gms.internal.maps.zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 18;
        }
        zzc(i, parcelZza);
        int i6 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setWatermarkEnabled(boolean z) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        int i4 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(51, parcelZza);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshot(zzbw zzbwVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbwVar);
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
            i = 15;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbwVar);
            com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
            i = 38;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean useViewLifecycleWhenInFragment() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(59, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setPadding(int i, int i2, int i3, int i4) throws RemoteException {
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        parcelZza.writeInt(i4);
        zzc(39, parcelZza);
        int i8 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static String $$e(short s, short s2, byte b) {
        byte[] bArr = $$c;
        int i = (s2 * 56) + 66;
        int i2 = b * 4;
        int i3 = s + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = (-i3) + i;
            i3 = i3;
        }
        while (true) {
            int i5 = i3 + 1;
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            i4 = i6;
            i = (-bArr[i5]) + i;
            i3 = i5;
        }
    }
}
