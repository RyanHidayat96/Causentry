package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
final class zaaa implements zaca {
    private static short[] TuitionPaymentFragmentbindingInflater1;
    private final Context zaa;
    private final zabe zab;
    private final Looper zac;
    private final zabi zad;
    private final zabi zae;
    private final Map zaf;
    private final Api.Client zah;
    private Bundle zai;
    private final Lock zam;
    private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$f = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, 70, 6, -35, -3, 14, -51, 30, 17, -15, -48, -3, 30, 21, -3, 6, -14, 18, 0, -4, -14, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -2, -4, -12, -3, 5, -9, 10, -4, 4, -3, -4, 4, -10, -2, 17, -14, -5, 17, -43, 33, -12, 0, 6, -9, 0, 0, -6, 19, -10, 7, -66, 3, 4, -9, -4, 4, -65, 68, 5, -7, 0, -16, 7, -64, 33, 33, -4, -13, 1, 13, -1, -41, 40, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -2, -4, -12, -3, 5, -9, 10, -4, 4, -3, -4, 4, -10, -2, 17, -14, -5, 17, -43, 33, -12, 0, 6, -9, 0, 0, -6, 19, -10, 7, -67};
    private static final int $$e = 221;
    private static final byte[] $$a = {67, -127, -109, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 144;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1982362014;
    private static int b = -1934795533;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1036233102;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, -42, 42, -30, -26, -56, 26, 25, 49, -42, 28, -30, 53, -49, -18, 41, -54, -28, 40, 25, -56, -30, 25, 41, -29, -49, -31, -26, 30, -31, 55, -50, -26, -29, 54, -41, -28, 41, -51, 52, -27, -51, -26, -28, 54, -55, -29, 28, -28, 50, 26, -26, -42, 41, -26, -53, -27, 54, -30, -25, -26, 29, -25, -43, -42, -32, 41, -53, -28, 42, -27, -41, 25, 25, 52, -49, -26, 48, -52, -32, -26, 25, 27, -25, 54, -25, -43, -26, 55, 26, -41, -27, 26, 53, -49, -25, 25, -26, -32, 28, 49, -56, 52, -54, 54, -55, -28, -28, 27, -27, -25, 24, 40, -46, 43, -27, -44, 44, -25, -56, 51, -53, -29, 28, 52, -27, 24, -26, -26, -26, -26, -26, -26, -26, -26};
    private final Set zag = Collections.newSetFromMap(new WeakHashMap());
    private ConnectionResult zaj = null;
    private ConnectionResult zak = null;
    private boolean zal = false;
    private int zan = 0;

    private zaaa(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.zaa = context;
        this.zab = zabeVar;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        this.zad = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zax(this, null));
        this.zae = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, null));
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            arrayMap.put((Api.AnyClientKey) it.next(), this.zad);
        }
        Iterator it2 = map.keySet().iterator();
        int i = asInterface + 39;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 % 2;
        }
        while (it2.hasNext()) {
            int i3 = asBinder + 37;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                arrayMap.put((Api.AnyClientKey) it2.next(), this.zae);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            arrayMap.put((Api.AnyClientKey) it2.next(), this.zae);
            int i4 = 2 % 2;
        }
        this.zaf = Collections.unmodifiableMap(arrayMap);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 144 - r8
            byte[] r0 = com.google.android.gms.common.api.internal.zaaa.$$a
            int r7 = r7 + 1
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 95 - r6
            int r7 = 107 - r7
            int r8 = r8 * 5
            int r8 = r8 + 18
            byte[] r0 = com.google.android.gms.common.api.internal.zaaa.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.d(short, int, int, java.lang.Object[]):void");
    }

    private final boolean zaC() {
        int i = 2 % 2;
        ConnectionResult connectionResult = this.zak;
        if (connectionResult == null) {
            return false;
        }
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (connectionResult.getErrorCode() != 4) {
            return false;
        }
        int i4 = asInterface + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static boolean zaE(ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (connectionResult == null || (!connectionResult.isSuccess())) {
            int i4 = asInterface + 7;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
            return false;
        }
        int i6 = asInterface;
        int i7 = i6 + 87;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 59;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    static /* synthetic */ void zan(zaaa zaaaVar, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = asInterface + 41;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zaaaVar.zab.zac(i, z);
        zaaaVar.zak = null;
        zaaaVar.zaj = null;
        int i5 = asInterface + 25;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void zao(zaaa zaaaVar, Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Bundle bundle2 = zaaaVar.zai;
        if (bundle2 == null) {
            zaaaVar.zai = bundle;
        } else if (bundle != null) {
            int i5 = i3 + 113;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            bundle2.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    private final void zaA(ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = this.zan;
        if (i2 != 1) {
            int i3 = asBinder + 65;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                int i5 = asInterface + 83;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            } else {
                this.zab.zaa(connectionResult);
                zaB();
            }
        } else {
            zaB();
        }
        this.zan = 0;
        int i7 = asInterface + 27;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    private final void zaB() {
        int i = 2 % 2;
        Iterator it = this.zag.iterator();
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            ((SignInConnectionListener) it.next()).onComplete();
        }
        this.zag.clear();
        int i4 = asBinder + 23;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final PendingIntent zaz() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Api.Client client = this.zah;
        if (client != null) {
            return PendingIntent.getActivity(this.zaa, System.identityHashCode(this.zab), client.getSignInIntent(), com.google.android.gms.internal.base.zap.zaa | 134217728);
        }
        int i4 = i3 + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final boolean zaD(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            zabi zabiVar = (zabi) this.zaf.get(apiMethodImpl.getClientKey());
            Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
            return zabiVar.equals(this.zae);
        }
        zabi zabiVar2 = (zabi) this.zaf.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar2, "GoogleApiClient is not configured to use the API required for this call.");
        int i3 = 14 / 0;
        return zabiVar2.equals(this.zae);
    }

    static /* synthetic */ void zap(zaaa zaaaVar) {
        ConnectionResult connectionResult;
        int i = 2 % 2;
        int i2 = asInterface + 39;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zaE(zaaaVar.zaj);
            throw null;
        }
        if (!(!zaE(zaaaVar.zaj))) {
            if (!zaE(zaaaVar.zak)) {
                int i3 = asInterface + 17;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                if (!zaaaVar.zaC()) {
                    ConnectionResult connectionResult2 = zaaaVar.zak;
                    if (connectionResult2 != null) {
                        if (zaaaVar.zan != 1) {
                            zaaaVar.zaA(connectionResult2);
                            zaaaVar.zad.zar();
                            return;
                        }
                        int i5 = asBinder + 63;
                        asInterface = i5 % 128;
                        int i6 = i5 % 2;
                        zaaaVar.zaB();
                        int i7 = asInterface + 53;
                        asBinder = i7 % 128;
                        int i8 = i7 % 2;
                        return;
                    }
                }
            }
            int i9 = zaaaVar.zan;
            if (i9 == 1) {
                zaaaVar.zaB();
            } else if (i9 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zabe) Preconditions.checkNotNull(zaaaVar.zab)).zab(zaaaVar.zai);
                int i10 = asBinder + 19;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                zaaaVar.zaB();
            }
            zaaaVar.zan = 0;
            return;
        }
        if (zaaaVar.zaj != null && zaE(zaaaVar.zak)) {
            zaaaVar.zae.zar();
            zaaaVar.zaA((ConnectionResult) Preconditions.checkNotNull(zaaaVar.zaj));
            return;
        }
        ConnectionResult connectionResult3 = zaaaVar.zaj;
        if (connectionResult3 != null && (connectionResult = zaaaVar.zak) != null) {
            int i12 = asBinder + 65;
            asInterface = i12 % 128;
            int i13 = i12 % 2;
            if (zaaaVar.zae.zaf < zaaaVar.zad.zaf) {
                connectionResult3 = connectionResult;
            }
            zaaaVar.zaA(connectionResult3);
        }
        int i14 = asInterface + 27;
        asBinder = i14 % 128;
        if (i14 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static zaaa zag(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        int i = 2 % 2;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                int i2 = asInterface + 39;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                client = client2;
            }
            if (client2.requiresSignIn()) {
                arrayMap.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                arrayMap2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.checkState(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey anyClientKeyZab = api.zab();
            if (arrayMap.containsKey(anyClientKeyZab)) {
                int i4 = asBinder + 107;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayMap3.put(api, (Boolean) map2.get(api));
                    int i5 = 68 / 0;
                } else {
                    arrayMap3.put(api, (Boolean) map2.get(api));
                }
            } else {
                if (!arrayMap2.containsKey(anyClientKeyZab)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                arrayMap4.put(api, (Boolean) map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = asInterface + 43;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                arrayMap3.containsKey(((zat) arrayList.get(i6)).zaa);
                throw null;
            }
            zat zatVar = (zat) arrayList.get(i6);
            if (arrayMap3.containsKey(zatVar.zaa)) {
                int i8 = asBinder + 65;
                asInterface = i8 % 128;
                if (i8 % 2 != 0) {
                    arrayList2.add(zatVar);
                    int i9 = 26 / 0;
                } else {
                    arrayList2.add(zatVar);
                }
                int i10 = asInterface + 73;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
            } else {
                if (!arrayMap4.containsKey(zatVar.zaa)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                int i12 = asBinder + 55;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                arrayList3.add(zatVar);
            }
        }
        return new zaaa(context, zabeVar, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(Api api) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 43042);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 3111;
            int i2 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
            Object[] objArr2 = new Object[1];
            a((byte) 52, (short) ($$b - 3), $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, scrollBarSize, i2, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((-1318128178) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.alpha(0) + 1, (short) (ViewConfiguration.getTapTimeout() >> 16), (byte) TextUtils.indexOf("", "", 0, 0), (-91935364) - View.getDefaultSize(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((-1318128175) - Drawable.resolveOpacity(0, 0), (-6) - View.MeasureSpec.getSize(0), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") - 91935343, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
            int iIndexOf = TextUtils.indexOf("", "") + 3111;
            int defaultSize = 22 - View.getDefaultSize(0, 0);
            Object[] objArr5 = new Object[1];
            a((byte) 52, (short) 89, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, defaultSize, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                int i3 = 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i4 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte b2 = (byte) 37;
                Object[] objArr6 = new Object[1];
                a(b2, b2, $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, i3, i4, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = 1879698000 + (((~((-132421984) | iIdentityHashCode)) | 94640451) * 345) + (((~((-132421984) | (~iIdentityHashCode))) | 1477969024) * 345) + ((~(iIdentityHashCode | (-94640452))) * 345) + 1559557376;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i5}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(Gravity.getAbsoluteGravity(0, 0) - 1318128170, Color.red(0) - 5, (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) ((-1) - Process.getGidForName("")), (KeyEvent.getMaxKeyCode() >> 16) - 91935329, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((-1318128171) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-5) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) View.getDefaultSize(0, 0), (byte) Color.green(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 91935315, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1559557376};
                byte[] bArr = $$d;
                Object[] objArr11 = new Object[1];
                d((byte) 91, bArr[50], bArr[18], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d((byte) 74, bArr[29], bArr[71], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 43042);
                    int offsetBefore = 3111 - TextUtils.getOffsetBefore("", 0);
                    int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
                    byte b3 = (byte) 37;
                    Object[] objArr13 = new Object[1];
                    a(b3, b3, $$a[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, offsetBefore, iCombineMeasuredStates, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1318128179, Drawable.resolveOpacity(0, 0) + 1, (short) (Process.myTid() >> 22), (byte) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getTouchSlop() >> 8) - 91935364, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c((ViewConfiguration.getTapTimeout() >> 16) - 1318128175, (-5) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) Color.alpha(0), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "") - 91935343, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                        int keyRepeatTimeout = 3111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 23;
                        Object[] objArr16 = new Object[1];
                        a((byte) 52, (short) 89, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, keyRepeatTimeout, iIndexOf2, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (43043 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
                        Object[] objArr17 = new Object[1];
                        a((byte) 52, (short) ($$b - 3), $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i10, iResolveOpacity, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i11 = asInterface + 93;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i16 = i13 + (((~((-603111331) | iIdentityHashCode2)) | 575801378) * (-566)) + 1191096910 + ((~(iIdentityHashCode2 | (-27309953))) * 566);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
        Object[] objArr18 = {new int[1], new int[]{i15}, new int[]{i14}, strArr3};
        if (!Objects.equal(this.zaf.get(api.zab()), this.zae)) {
            return this.zad.zad(api);
        }
        if (!zaC()) {
            ConnectionResult connectionResultZad = this.zae.zad(api);
            int i19 = asBinder + 29;
            asInterface = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 26 / 0;
            }
            return connectionResultZad;
        }
        int i21 = ((int[]) objArr18[0])[0];
        int i22 = ((((i21 * i21) - (~(-(898451144 * i21)))) - 1) - (~(-(i21 * 738541834)))) - 1;
        int i23 = ((i22 | 367381009) << 1) - (367381009 ^ i22);
        int i24 = (((i23 >> 27) - 63) / 32) + 1;
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        int i26 = i23 >> 18;
        int i27 = -(i25 ^ (((((i26 | (-32767)) << 1) - (i26 ^ (-32767))) / 16384) + 1));
        int i28 = (i27 & 2) + (i27 | 2);
        int i29 = i28 >> 29;
        int i30 = ((i29 ^ (-15)) + ((i29 & (-15)) << 1)) / 8;
        int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
        return new ConnectionResult(4776 / (((-((i31 ^ 1) + ((i31 & 1) << 1))) & i28) * 597), zaz());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (zaC() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r5.setFailedResult(new com.google.android.gms.common.api.Status(4, (java.lang.String) null, zaz()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r4.zae.zae(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        zaC();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r4.zad.zae(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (zaD(r5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((!zaD(r5)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r1 = com.google.android.gms.common.api.internal.zaaa.asBinder + 111;
        com.google.android.gms.common.api.internal.zaaa.asInterface = r1 % 128;
     */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zae(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.common.api.internal.zaaa.asBinder
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.google.android.gms.common.api.internal.zaaa.asInterface = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = r4.zaD(r5)
            r2 = 44
            int r2 = r2 / 0
            if (r1 == 0) goto L4b
            goto L21
        L19:
            boolean r1 = r4.zaD(r5)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L4b
        L21:
            int r1 = com.google.android.gms.common.api.internal.zaaa.asBinder
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.google.android.gms.common.api.internal.zaaa.asInterface = r2
            int r1 = r1 % r0
            r0 = 0
            if (r1 != 0) goto L47
            boolean r1 = r4.zaC()
            if (r1 == 0) goto L41
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r2 = 4
            android.app.PendingIntent r3 = r4.zaz()
            r1.<init>(r2, r0, r3)
            r5.setFailedResult(r1)
            return r5
        L41:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zae
            r0.zae(r5)
            return r5
        L47:
            r4.zaC()
            throw r0
        L4b:
            com.google.android.gms.common.api.internal.zabi r0 = r4.zad
            r0.zae(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.zae(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl):com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007d  */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266, ExpandableListView.getPackedPositionGroup(0L) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 11;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i8 = $11 + 29;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 69;
                        $10 = i10 % 128;
                        if (i10 % i5 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i11 = 3358 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, i11, i12, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i9 >>= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int gidForName = 3357 - Process.getGidForName("");
                                int size = 18 - View.MeasureSpec.getSize(0);
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, gidForName, size, -1054011043, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i13 = $10 + 29;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), 2267 - (ViewConfiguration.getWindowTouchSlop() >> 8), 33 - (KeyEvent.getMaxKeyCode() >> 16), 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)) + i4;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - KeyEvent.getDeadChar(0, 0)), 2855 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1529949196, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    int i15 = $10 + 25;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    for (int i17 = 0; i17 < length4; i17++) {
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (!(!z)) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentbindingInflater1;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
        int i4 = asBinder + 87;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            this.zad.zat();
            this.zae.zat();
            int i3 = 81 / 0;
        } else {
            this.zad.zat();
            this.zae.zat();
        }
        int i4 = asInterface + 51;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        zaB();
        int i4 = asBinder + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        boolean z;
        int i = 2 % 2;
        this.zam.lock();
        try {
            if (this.zan == 2) {
                int i2 = asBinder + 43;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                int i4 = asInterface + 101;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return z;
        } finally {
            this.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.zae.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.zad.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        int i4 = asBinder + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x02a8  */
    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(BaseImplementation.ApiMethodImpl apiMethodImpl) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 37566);
            int i2 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
            int i3 = 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, i3, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((-1318128179) - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) KeyEvent.keyCodeFromString(""), (-91935363) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((-1318128175) - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 5, (short) TextUtils.indexOf("", ""), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 91935344, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 37568);
            int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int packedPositionGroup = 14 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr5 = new Object[1];
            a((byte) 52, (short) ($$b - 3), $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iIndexOf, packedPositionGroup, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay = (char) (37567 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int i4 = 626 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int offsetBefore = 14 - TextUtils.getOffsetBefore("", 0);
                Object[] objArr6 = new Object[1];
                a((byte) 52, (short) 89, $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, i4, offsetBefore, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ((1646510036 + (((~((-17105171) | iIdentityHashCode)) | (~(1806632950 | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | 1099891030)) | ((~((-723847091) | iIdentityHashCode)) | 706741920)) * (-69))) - 1529864720;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
            int i10 = asInterface + 63;
            asBinder = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 4 % 2;
            }
        } else {
            Object[] objArr8 = new Object[1];
            c(TextUtils.getOffsetBefore("", 0) - 1318128179, 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) KeyEvent.getDeadChar(0, 0), (-91935299) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((-1318128177) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-4) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (Color.rgb(0, 0, 0) + 16777216), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), View.MeasureSpec.getSize(0) - 91935274, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = asInterface + 87;
                    asBinder = i12 % 128;
                    if (i12 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
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
            c(MotionEvent.axisFromString("") - 1318128169, (-5) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) Gravity.getAbsoluteGravity(0, 0), (byte) KeyEvent.keyCodeFromString(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 91935329, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((-1318128172) - MotionEvent.axisFromString(""), (-5) - Color.alpha(0), (short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ViewConfiguration.getTapTimeout() >> 16), (-91935315) - TextUtils.lastIndexOf("", '0', 0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c((-1318128227) - MotionEvent.axisFromString(""), 43 - ExpandableListView.getPackedPositionGroup(0L), (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) TextUtils.getCapsMode("", 0, 0), (-91935257) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1318128178, 43 - (Process.myPid() >> 22), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (byte) Gravity.getAbsoluteGravity(0, 0), (-91935194) - (ViewConfiguration.getScrollBarSize() >> 8), objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i13 = asInterface + 81;
            asBinder = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1067322268};
                byte[] bArr2 = $$d;
                Object[] objArr15 = new Object[1];
                d((byte) (bArr2[29] - 1), bArr2[18], bArr2[90], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                d(bArr2[18], bArr2[29], bArr2[71], objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i15 = ((int[]) objArr[0])[0];
                int i16 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i17 = asInterface + 55;
                    asBinder = i17 % 128;
                    int i18 = i17 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char fadingEdgeLength = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 625;
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 14;
                        Object[] objArr17 = new Object[1];
                        a((byte) 52, (short) 89, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, windowTouchSlop, pressedStateDuration, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c((-1318128179) - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getMode(0) + 1, (short) (Process.getGidForName("") + 1), (byte) ExpandableListView.getPackedPositionType(0L), (-91935364) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c((-1318128175) - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) - 6, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (-91935344) - MotionEvent.axisFromString(""), objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37568);
                            int doubleTapTimeout = 625 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i19 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                            Object[] objArr20 = new Object[1];
                            a((byte) 52, (short) ($$b - 3), $$a[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(modifierMetaStateMask, doubleTapTimeout, i19, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mode = (char) (View.MeasureSpec.getMode(0) + 37567);
                            int i20 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 624;
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 15;
                            byte[] bArr3 = $$a;
                            byte b3 = bArr3[7];
                            Object[] objArr21 = new Object[1];
                            a(b3, b3, bArr3[5], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, i20, iIndexOf2, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            throw null;
        }
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[2])[0];
        int i23 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i22};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i24 = ~iIdentityHashCode2;
        int i25 = i21 + (-981601736) + ((830584764 | i24) * (-757)) + ((~((-171065409) | iIdentityHashCode2)) * 1514) + (((~(iIdentityHashCode2 | 1001650172)) | (~(i24 | (-993153357))) | 822087948) * 757);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr[1])[0] = i27 ^ (i27 << 5);
        Object[] objArr22 = {new int[]{i23}, new int[1], iArr2, strArr4};
        if (!zaD(apiMethodImpl)) {
            return this.zad.zaf(apiMethodImpl);
        }
        if (!zaC()) {
            return this.zae.zaf(apiMethodImpl);
        }
        int i28 = ((int[]) objArr22[1])[0];
        int i29 = ((i28 * i28) - (~(-(1655004426 * i28)))) - 1;
        int i30 = -(i28 * 463724426);
        int i31 = (((i29 | i30) << 1) - (i30 ^ i29)) - (-1387228516);
        int i32 = i31 >> 21;
        int i33 = ((i32 & (-4095)) + (i32 | (-4095))) / 2048;
        int i34 = (i33 & 1) + (i33 | 1);
        int i35 = (i31 ^ i34) + ((i34 & i31) << 1);
        int i36 = i31 >> 24;
        int i37 = -(i35 ^ ((((i36 ^ (-511)) + ((i36 & (-511)) << 1)) / 256) + 1));
        int i38 = (i37 & 2) + (i37 | 2);
        int i39 = i38 >> 29;
        int i40 = (((i39 | (-15)) << 1) - (i39 ^ (-15))) / 8;
        apiMethodImpl.setFailedResult(new Status(8664 / (((-(((i40 & 1) + (i40 | 1)) + 1)) & i38) * 1083), (String) null, zaz()));
        return apiMethodImpl;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        boolean z;
        int i = 2 % 2;
        this.zam.lock();
        try {
            if (this.zad.zaw()) {
                int i2 = asBinder + 113;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    this.zae.zaw();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                z = true;
                if (!this.zae.zaw() && !zaC()) {
                    int i3 = asInterface + 119;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    if (this.zan != 1) {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            this.zam.unlock();
            return z;
        } catch (Throwable th) {
            this.zam.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0008, B:8:0x001b, B:11:0x0022, B:12:0x0028, B:13:0x0029, B:16:0x0033, B:18:0x003c, B:19:0x003e), top: B:25:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0008, B:8:0x001b, B:11:0x0022, B:12:0x0028, B:13:0x0029, B:16:0x0033, B:18:0x003c, B:19:0x003e), top: B:25:0x0008 }] */
    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        int i = 2 % 2;
        this.zam.lock();
        try {
            boolean z = true;
            Object obj = null;
            if (!zax()) {
                int i2 = asBinder + 1;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    zaw();
                    obj.hashCode();
                    throw null;
                }
                if (!zaw()) {
                    z = false;
                } else if (this.zae.zaw()) {
                    z = false;
                } else {
                    this.zag.add(signInConnectionListener);
                    if (this.zan == 0) {
                        this.zan = 1;
                    }
                    this.zak = null;
                    this.zae.zaq();
                }
            } else if (this.zae.zaw()) {
                z = false;
            } else {
                this.zag.add(signInConnectionListener);
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zaq();
            }
            this.zam.unlock();
            int i3 = asInterface + 31;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Throwable th) {
            this.zam.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        int i = 2 % 2;
        this.zam.lock();
        try {
            boolean zZax = zax();
            this.zae.zar();
            this.zak = new ConnectionResult(4);
            if (zZax) {
                new com.google.android.gms.internal.base.zau(this.zac).post(new zav(this));
            } else {
                zaB();
                int i2 = asBinder + 17;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
            }
        } finally {
            this.zam.unlock();
        }
    }

    static /* synthetic */ ConnectionResult zaa(zaaa zaaaVar) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConnectionResult connectionResult = zaaaVar.zak;
        if (i3 == 0) {
            return connectionResult;
        }
        throw null;
    }

    static /* synthetic */ zabi zah(zaaa zaaaVar) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zabi zabiVar = zaaaVar.zad;
        int i5 = i2 + 51;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return zabiVar;
    }

    static /* synthetic */ zabi zai(zaaa zaaaVar) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zabi zabiVar = zaaaVar.zae;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return zabiVar;
    }

    static /* synthetic */ Lock zaj(zaaa zaaaVar) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 91;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Lock lock = zaaaVar.zam;
        int i5 = i2 + 19;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return lock;
        }
        throw null;
    }

    static /* synthetic */ void zak(zaaa zaaaVar, ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        zaaaVar.zaj = connectionResult;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 125;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void zal(zaaa zaaaVar, ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zaaaVar.zak = connectionResult;
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
    }

    static /* synthetic */ void zam(zaaa zaaaVar, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        zaaaVar.zal = z;
        int i5 = i3 + 13;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ boolean zav(zaaa zaaaVar) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = zaaaVar.zal;
        if (i4 != 0) {
            int i5 = 89 / 0;
        }
        int i6 = i2 + 93;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
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
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = com.google.android.gms.common.api.internal.zaaa.$$c
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r7 = r7 + 117
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaa.$$g(int, byte, byte):java.lang.String");
    }
}
