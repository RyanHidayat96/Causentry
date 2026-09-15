package com.google.android.gms.maps.model;

import android.graphics.Color;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzao;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Polygon {
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long b;
    private final zzao zza;
    private static final byte[] $$c = {49, -45, -112, 57};
    private static final int $$d = 75;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {92, 126, -38, -95};
    private static final int $$b = 10;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    public Polygon(zzao zzaoVar) {
        this.zza = (zzao) Preconditions.checkNotNull(zzaoVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = com.google.android.gms.maps.model.Polygon.$$a
            int r8 = 103 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Polygon.c(int, short, int, java.lang.Object[]):void");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            boolean z = obj instanceof Polygon;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof Polygon) {
            try {
                return this.zza.zzB(((Polygon) obj).zza);
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
        int i4 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final int getFillColor() {
        int iZzf;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                iZzf = this.zza.zzf();
                int i3 = 74 / 0;
            } else {
                iZzf = this.zza.zzf();
            }
            return iZzf;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final List<List<LatLng>> getHoles() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            List<List<LatLng>> listZzl = this.zza.zzl();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return listZzl;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strZzk = this.zza.zzk();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return strZzk;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final List<LatLng> getPoints() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return this.zza.zzm();
            }
            this.zza.zzm();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int getStrokeColor() {
        int iZzg;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                iZzg = this.zza.zzg();
                int i3 = 46 / 0;
            } else {
                iZzg = this.zza.zzg();
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return iZzg;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int getStrokeJointType() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzh();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iZzh = this.zza.zzh();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return iZzh;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final List<PatternItem> getStrokePattern() {
        List<PatternItem> listZza;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                listZza = PatternItem.zza(this.zza.zzn());
                int i3 = 73 / 0;
            } else {
                listZza = PatternItem.zza(this.zza.zzn());
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
            return listZza;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getStrokeWidth() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            float fZzd = this.zza.zzd();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return fZzd;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final Object getTag() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object objUnwrap = ObjectWrapper.unwrap(this.zza.zzj());
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 55 / 0;
            }
            return objUnwrap;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getZIndex() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            float fZze = this.zza.zze();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return fZze;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int hashCode() {
        int iZzi;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                iZzi = this.zza.zzi();
                int i3 = 38 / 0;
            } else {
                iZzi = this.zza.zzi();
            }
            return iZzi;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean isClickable() {
        boolean zZzC;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                zZzC = this.zza.zzC();
                int i3 = 40 / 0;
            } else {
                zZzC = this.zza.zzC();
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return zZzC;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean isGeodesic() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean zZzD = this.zza.zzD();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return zZzD;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean isVisible() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean zZzE = this.zza.zzE();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return zZzE;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void remove() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzo();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setClickable(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.zza.zzp(z);
                int i3 = 32 / 0;
            } else {
                this.zza.zzp(z);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setFillColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        try {
            this.zza.zzq(i);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setGeodesic(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzr(z);
                return;
            }
            this.zza.zzr(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setHoles(List<? extends List<LatLng>> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.zza.zzs(list);
                throw null;
            }
            this.zza.zzs(list);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setStrokeColor(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        try {
            this.zza.zzu(i);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setStrokeJointType(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.zza.zzv(i);
                return;
            }
            this.zza.zzv(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setStrokePattern(List<PatternItem> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzw(list);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.zza.zzw(list);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setStrokeWidth(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.zza.zzx(f);
                int i3 = 17 / 0;
            } else {
                this.zza.zzx(f);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setTag(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzy(ObjectWrapper.wrap(obj));
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setVisible(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.zza.zzz(z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.zza.zzz(z);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setZIndex(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.zza.zzA(f);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setPoints(List<LatLng> list) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Preconditions.checkNotNull(list, "points must not be null.");
                this.zza.zzt(list);
                int i3 = 14 / 0;
            } else {
                Preconditions.checkNotNull(list, "points must not be null.");
                this.zza.zzt(list);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:37:0x01bc  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2187 - ExpandableListView.getPackedPositionGroup(0L), View.getDefaultSize(0, 0) + 40, 841711447, false, $$e(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 33017), (ViewConfiguration.getScrollBarSize() >> 8) + 3011, View.resolveSize(0, 0) + 26, 321985076, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.alpha(0) + 36505), 3376 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - TextUtils.getTrimmedLength(""), -968507904, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $10 + 31;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 2;
        }
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 89;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(j) + 36506), KeyEvent.keyCodeFromString("") + 3376, 16 - ((byte) KeyEvent.getModifierMetaStateMask()), -968507904, false, $$e(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instruction units count: 14117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Polygon.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static {
        char[] cArr = new char[2154];
        ByteBuffer.wrap("±³\u0007PÜ©\u0092\u0012k\u0013 ³ö\u0003Oh\u0004¸Ú\u0012\u0093eh×>\u0014÷KLÍ\u0002 Ûx\u0090Æf)?\u0097ôÏJ\u000b\u0003\u009fØô®=g\u0097<é±³\u0007PÜ©\u0092\u0012k\u0013 ³ö\u0003Oh\u0004¸Ú\u0012\u0093eh×>\u0014÷KLÜ\u0002-Ûl\u0090Ñf\u0013?\u0080ôÌJ&\u0003\u008fØð®8±³\u0007PÜ©\u0092\u0012k\u0013 ³ö\u0003Oh\u0004¸Ú\u0012\u0093eh×>\u0014÷KLß\u0002=Ûr\u0090×±³\u0007GÜµ\u0092\u0017k\u0013 ¹ö\u0003O`\u0004©Ú\u0018\u0093ih\u008b>\u001b÷{LÀ\u0002 Ûz\u0090Ýf??\u008côãJ6\u0003\u008dØð®(g\u0091<þò]±³\u0007QÜ¸\u0092\u0007k\u0013 °ö\u000bO*\u0004¬Ú\u0006\u0093chÔ±³\u0007QÜ¸\u0092\u0007k\u0013 §ö\u0005Oi\u0004òÚ\u0004\u0093~hË>\f±³\u0007GÜ¨\u0092\u0007k] ¦ö\bO+\u0004\u008eÚ2\u0093AhË>\n÷qLè\u0002%Ûh\u0090Õ±³\u0007PÜ\u00ad\u0092\u0010k] ûöBOg\u0004¬Ú\u0001\u0093ehÊ>\u001a÷{±î\u0007[Üâ\u0092\u0006kS »ö\u0018O*\u0004®Ú\u0011\u0093hhÖ>\u0013÷}LÈ\u0002\u001bÛr\u0090Ñf8?»ôØJ:\u0003\u009fØµ\u0017ô¡Azø4\u001cÍI\u0086¡P\u0002é0¢´|\u000b5rÎÌ\u0098\tQgêÒ¤\u0001}h6ËÀ\"\u0099¡RÂì ¥\u0085~¬\u009aº,N÷¼¹\u001e@A\u000b¸Ý\bd\"/¹ñ\u0014¸gC\u0082\u0015\u0019ÜtgÇ)#ðw»\u0093M6\u0014\u0082\u0084ô2Wé¡§\u0000^Y\u0015¦±³\u0007GÜµ\u0092\u0017kH ±ö\u0001O+\u0004¾Ú\u001d\u0093bh\u008b>\u0012÷qLÁ\u00021ÛJ\u0090ùfa?\u008aôÙJ9\u0003\u0099Ø©®?g\u009b<âòPK\u008e\u0000ûÖ@±³\u0007GÜµ\u0092\u0017kH ±ö\u0001O+\u0004¾Ú\u001d\u0093bh\u008b>\u0012÷qLÁ\u00021ÛJ\u0090ùfa?\u0094ôÎJ;\u0003\u009c±³\u0007GÜµ\u0092\u0017kH ±ö\u0001O+\u0004°Ú\u001d\u0093nh\u008b>\u0010÷}LÎ\u0002*Ûy\u0090Ùf9?²ôñJ$\u0003\u009eØë®,gÚ<ÿòKb\u009aÔy\u000f\u0080A;¸:ó\u0093% \u009c@×\u0080\t:@P»èí&$I\u0004>²\u008bi2'ÖÞ\u0099\u0095mCÐú°±\"oÌ&³Ý\u0007\u008bØRdäÇ?;q\u0081\u0088ÏÃl\u0015\u0094¬÷ç>tQÂ¦\u0019\\Wé®½å\u00193è\u008a\u008fÁR\u001fóV\u009d\u00ad?ûí2\u0082\u0089+ÇË\u001e\u008d±ò\u0007QÜ¡\u0092\u0011kO ²±î\u0007[Üâ\u0092\u0014kN »ö\bOq\u0004¿Ú\u0000\u0093\"hÉ>\u001d÷zLÙ\u0002\"Û}\u0090×f8?\u0091ôÎJ1\u0003\u009e±û\u0007QÜ¢\u0092\u001d±ì\u0007QÜ¾\u0092\u0017kU §ö\u0018O*\u0004¯Ú\r\u0093\u007fh\u008a>\u001e÷pL\u0082\u0002 Ûy\u0090Öf9?\u0083ô\u0092J3\u0003\u009cØñ®rg\u0092<íòOK\u0099\u0000ËÖK¯´dé:kó¾I\u0001\u001eR×°\u00ad\tbv;¹ñ\u0006\u0019\u007f¯Ât-:\u0084ÃÆ\u00884^\u008bç¹¬<r\u009e;ìÀ\u0019\u0096\u008d_ãä\u0011ª³sê8EÎª\u0097\u0010\\\u0001â «\u000fpb\u0006áÏ\u0001\u0094~ZÜã\n¨X~Ø\u0007'Ìz\u0092ø[)á\u0092¶Á\u007f#\u0005\u0090ÊåScåÞ>1p\u0098\u0089ÚÂ(\u0014\u0097\u00ad¥æ 8\u0082qð\u008a\u0005Ü\u0091\u0015ÿ®\rà¯9örY\u0084¶Ý\f\u0016\u001d¨©á\f:%L°\u0085\nÞj\"ú\u0094GO¨\u0001\u0001øC³±e\u000eÜ<\u0097¹I\u001b\u0000iû\u009c\u00ad\bdfß\u0094\u00916Ho\u0003Àõ/¬\u0095g\u0084Ù0\u0090\u0095K¼=&ô\u0083¯ù±ì\u0007QÜ¾\u0092\u0017kU §ö\u0018O*\u0004¯Ú\r\u0093\u007fh\u008a>\u001e÷pL\u0082\u0002 Ûy\u0090Öf9?\u0083ô\u0092J&\u0003\u0083Øª®1g\u0097<ï±ì\u0007QÜ¾\u0092\u0017kU §ö\u0018O*\u0004¯Ú\r\u0093\u007fh\u008a>\u001e÷pL\u0082\u0002 Ûy\u0090Öf9?\u0083ô\u0092J&\u0003\u0083Øª®1g\u009a<ï±ê\u0007VÜ£\u0092\u001ckO ²±³\u0007DÜ¾\u0092\u000bk_ ûö\u0001Ok\u0004¸Ú\u0001\u0093`hÁ>\u000f±ê\u0007VÜ£\u0092\u001ck[ ¡ö\tOw\u0004¨±³\u0007GÜµ\u0092\u0017kH ±ö\u0001O+\u0004ºÚ\u0006\u0093mhÉ>\u0019÷cLÃ\u00026Ûw\u0090\u009bf;?\u008dôÒJ0\u0003\u0083Øó®/gÙ<ÿò]K\u008f\u0000àÖI¯©dÃ:Gó©I\u0016\u001eJ×±\u00ad\u001eb*;¶ñ\u0015F~±³\u0007BÜ©\u0092\nkX »ö\u001eO+\u0004°Ú\u001d\u0093nh\u0092>H÷;LÄ\u00023Û3\u0090Õf9?\u0080ôÕJ;\u0003ÂØô®.g\u009d<áòEK\u008e\u0000íÖ\u0002¯³dõ:Zó¨I\u000b\u001eK×§\u00adBbw;³%#\u0093ÒH9\u0006\u009aÿÈ´+b\u008eÛ»\u0090 N\u008d\u0007þü\u0002ªØc«ØT\u0096£O£\u0004Lò««\u0017`CÞ©\u0097\fL{:¿ó\u0001¨nf\u009aß\u001b\u0094mBÒ;0ðc®Óg/ÝÚ\u008aßC+ÅØs,¨Þæ|\u001f#TÚ\u0082j;@pÛ®vç\u0005\u001cùJ#\u0083P8¤vC¯\u0018äª\u0012CKÐ\u0080¶>Vwã¬\u0083Úh\u0013öH\u0089\u0086;?òt\u008d¢!ÛÎ\u0010\u0094N:\u0087\u008a=lj'£ÏÙ)\u0016\u001cOØu\u0091Ãs\u0018\u009aV%¯1ä\u009f2 \u008bOÀ\u008a\u001eyWG¬èú73B\u0088 Æ\u0005\u001fRTù¢\u001bû¢0í\u008e\u0013Ç¼\u001cÐj\u0017£µøË6(\u008f¬ÄÕ±Û\u0007QÜ¢\u0092\u001dkQ »ö\u0018Om\u0004³Ú\u001a±é\u0007ZÜ§\u0092\nkS £ö\u0002±ÿ\u0007\\Ü¾\u0092\u000bkQ ½ö\u0019Oi±î\u0007[Üâ\u0092\u0014kN »ö\bOq\u0004¿Ú\u0000\u0093\"hÀ>\u0019÷bLÅ\u0002'Ûy×Þabº\u0097ô(\r0FÖ\u0090(±û\u0007QÜ¢\u0092\u0001kN ½ö\u000f-`\u009bÊ@9\u000e\u009a÷Õ¼&j\u0094ÓÀ\u0098?F×\u000f¡±û\u0007QÜ¢\u0092\u0001kN ½ö\u000fO[\u0004¤ÚL\u0093:hû>J÷ úØLm\u0097ÔÙ\" xk\u008d½>\u0004GO\u0089\u00916Ø\u0014#ÿu%¼F\u0007ÿI\u001eßãi\\²«D\u008fò/)Ïg~\u009e+ÕÖ\u0003uº\u0000Òýdd¿\u009cñd\bNC\u0081\u0095\",Pg\u0095¹9ðI\u000b¤]:\u0094[/þaD¸\u007fóü\u0005\u001e\\«\u0097ñ)\u00115\u009a\u0083\u001dXï\u0016Qï\u0014¤úrOËc\u0080È^w\u0017\u0000ìÃºYs&È\u0082\u0086o_/\u0014Óâm»Ìp\u0089Î3\u0087Ó\\û*-èî^i\u0085\u009bË%2`y\u008e¯;\u0016\u0017]¼\u0083\u0003Êt1·g-®R\u0015ö[\u001b\u0082[É§?\u0019f¸\u00adý\u0013GZ§\u0081\u008f÷Y>\u0098e\u0089«#w²Á\u0007\u001a¾TP\u00ad\u0001æú0T\u0089/Âá\u001cZU5$!\u0092\u0081Iz\u0007Úþ\u0080µgcÅÚ¶%þ\u0093BH·\u0006\bÿ\u0010´ö¡ \u0017\u009bÌl\u0082É{\u009a0oä\u0011R¤\u0089\u001dÇë>±uD£÷\u001a\u008eQ@\u008fÿÆÝ=9kñ¢\u008a\u0019=WßyøÏM\u0014ôZ\u0019£Oè°>\u0014\u0087wÌ¦\u0012L[k ×ö\u0007?w^\r\u0003\u008bµ>n\u0087 rÙ<\u0092ÒD|ý\u0013¶Ü±¬±î\u0007[Üâ\u0092\u0006kI ½ö\u0000O`\u0004òÚ\u0004\u0093~hË>\u0018÷aLÏ\u00020±ú\u0007AÜ \u0092\bkc ¬öTO2û\u008bM>\u0096\u0087Øc!,jØ¼e\u0005\u0005N\u0097\u0090wÙ\u0000\"¯t~½\u0014\u0006»HQ\u0091\u000bÚ¸,Guõ±û\u0007QÜ¢\u0092\u0001kN ½ö\u000fO+\u0004¯Ú\u0010\u0093gh\u008b>\u001b÷qLÂ\u0002!Ûn\u0090Ýf/\u0089\u0098?2äÁªbS-\u0018ÞÎlw8<Çâ/«YPè\u0006lÏ\u0013t¤:xã\u0007¨ï^\u0019\u0007¨Ì¸rR;áà\u0082\u0096M_þ\u0004\u008cÊ\u0018sç8ÏîyZ®ì\u00047÷yT\u0080\u001bËè\u001dZ¤~ïî1Nx6\u0083\u0096ÕE\u001c$§¦éb0-{\u008a\u008d6ÔÖ\u001f\u008c¡oèÜ3£E`\u008cÂ±û\u0007QÜ¢\u0092\u0001kN ½ö\u000fO+\u0004ªÚ\u0016\u0093chÜ>D÷\"LÜ\u0002kÛj\u0090Öf#?\u009cô\u0084Jb\u0003\u009c±û\u0007[Ü£\u0092\u0003kP ±öCOw\u0004¸Ú\u001f\u0093ShÃ>\f÷|LÃ\u0002*Ûy\u0090ëf4?Üô\u008aJ{\u0003\u008bØá®2g\u0091<þòMK\u009f\u0000ËÖT¯üdª±î\u0007[Üâ\u0092\u0006kS »ö\u0018Oh\u0004³Ú\u0015\u0093hhÁ>\u000e\u00004¶\u0081m8#ÜÚ\u0089\u0091aGÂþ·µkkÏ\"±Ù\u001b\u008f\u0088F¬ý\u0003³÷jª!\n×¸\u008eXE\u000fûà²Qi;\u001fôÖ^\u008d$C\u0097úH±:p\u009dÆ\u001a\u001dèSVª\u0013áý7H\u008eiÅä\u001b\fRz±î\u0007[Üâ\u0092\u0006kI ½ö\u0000O`\u0004òÚ\u0010\u0093eh×>\f÷xLÍ\u0002=Û2\u0090Ýf(rÐÄi\u001f\u0087Q(¨)±õ\u0007ZÜ¥\u0092\u0010k\u0012 §ö\u001aOg\u0004òÚ\u0005\u0093ihÉ>\t÷9LÜ\u00026Ûs\u0090Äf?±í\u0007QÜ¡\u0092\u0011k\u0012 ¼ö\u001bO*\u0004±Ú\u0015\u0093ehÊ>\u0017÷qLÕ\u00027±í\u0007QÜ¡\u0092\u0011k\u0012 §ö\nO*\u0004ºÚ\u0015\u0093ghÁ>#÷wLÍ\u0002)Ûy\u0090Æf-Ý\u0090k,°Üþl\u0007oLÚ\u009aw#WhÍ¶jÿ\u0015\u0004\u0086Re\u009b\f ¿nJ·\bü½\nH±î\u0007[Üâ\u0092\u000fkY ¦ö\u0002Oa\u0004°ÚZ\u0093mhÊ>\u0018÷fLÃ\u0002-Ûx\u0090\u009af=?\u0081ôÑJ!\u0003\u0088á`WÕ\u008clÂ\u0088;Ýp5¦\u0096\u001f¤T#\u008a\u009fÃï8_nÜ§û\u001cTR®\u008bÍÀT6£o\u0007¤W±î\u0007[Üâ\u0092\u000bkX ¹öBOf\u0004©Ú\u001d\u0093`hÀ>R÷rLÅ\u0002*Û{\u0090Ñf>?\u0094ôÎJ=\u0003\u0082Øð±î\u0007[Üâ\u0092\u0014kN »ö\bOq\u0004¿Ú\u0000\u0093\"hÆ>\t÷}LÀ\u0002 Û2\u0090Òf%?\u008aôÛJ1\u0003\u009eØô®.g\u009d<âòP±î\u0007[Üâ\u0092\u0017kE §ö\u0018Oa\u0004±ÚZ\u0093nhÑ>\u0015÷xLÈ\u0002jÛz\u0090Ýf\"?\u0083ôÙJ&\u0003\u009cØö®5g\u009a<ø±î\u0007[Üâ\u0092\u0017kE §ö\u0018Oa\u0004±Ú+\u0093ihÜ>\b÷:LÎ\u00021Ûu\u0090Øf(?ÊôÚJ=\u0003\u0082Øã®9g\u0086<üòVK\u0095\u0000úÖX±î\u0007[Üâ\u0092\u0012kY ºö\bOk\u0004®ÚZ\u0093nhÑ>\u0015÷xLÈ\u0002jÛz\u0090Ýf\"?\u0083ôÙJ&\u0003\u009cØö®5g\u009a<ø±î\u0007[Üâ\u0092\u0012kY ºö\bOk\u0004®Ú+\u0093hhÈ>\u0017÷yL\u0082\u0002&Ûi\u0090Ýf ?\u0080ô\u0092J2\u0003\u0085Øê®;g\u0091<þòTK\u008e\u0000ýÖB¯°jÖ±°\u0007\u0014±¦\u00ad¼±³\u0007PÜ©\u0092\u0012k\u0013 ¥ö\tOi\u0004©Ú+\u0093|hÍ>\f÷q\u0014\u001f¢üy\u00057¾Î¿\u0085\u000bS¯êË¡\u001b\u007f½6ÔÍ'\u009b²RÙés§\u008d~Ò5yÃ\u008e\u009a,QOï\u009f¦%}F\u000b\u0089Â<\u0000w¶\u0094mm#ÖÚ×\u0091cGÇþ£µskÕ\"¼ÙO\u008fßFµý\u0006³ùj¼±³\u0007PÜ©\u0092\u0012k\u0013 §ö\u0003Og\u0004·Ú\u0011\u0093xh\u008b>\r÷qLÁ\u00021Ûx±³\u0007GÜµ\u0092\u0017k\u0013 ¥ö\tOi\u0004©Ú+\u0093xhÖ>\u001d÷wLÉ±³\u0007GÜµ\u0092\u0017kH ±ö\u0001O+\u0004°Ú\u001d\u0093nh\u008b>\u0010÷}LÎ\u0002'ÛC\u0090Ùf-?\u0088ôÐJ;\u0003\u008fØÛ®8g\u0091<îòQK\u009b\u0000ËÖ]¯¡dñ:AóâI\u0017\u001eS±³\u0007PÜ©\u0092\u0012k\u0013 ¶ö\u001fOp\u0004\u0083Ú\u0013\u0093|h×\u0097¶!Uú¬´\u0017M\u0016\u0006³Ð\u001aiu\"\u0086ü\u0005µ`NÌ\u0018\u001c±³\u0007PÜ©\u0092\u0012k\u0013 §ö\u0003Og\u0004·Ú\u0011\u0093xh\u008b>\u001e÷gLØ\u0002\"Ûs\u0090Øf(?\u0081ôÎJ0'\u009c\u0091hJ\u009a\u00048ýg¶\u009e`.Ù\u0004\u0092\u009fL2\u0005Aþ¤¨?aRÚá\u0094\tM@\u0006ïð\u0005©¤bÿÜ\u001f\u0095¦NÙ8,ñ±ªÍdbÝý\u0096È@lç\u000fQì\u008a\u0015Ä®=¯v\n £\u0019ÌR\u0001\u008c«ÅÓ>}ÚSl°·Iùò\u0000óKV\u009dÿ$\u0090o[±íø\u009e\u0003+Ö\u0002`á»\u0018õ£\f¢G\u0007\u0091®(Ác\u0000½ ôÚ\u000f{±³\u0007PÜ©\u0092\u0012k\u0013 ¶ö\u001fOp\u0004³Ú\u0006\u0093ehÁ\u0012:¤Ù\u007f 1\u009bÈ\u009a\u0083?U\u0096ìù§#y\u00900öËJ±³\u0007PÜ©\u0092\u0012k\u0013 ¶ö\u001fOp\u0004¬Ú\u0013\u0093mhÍ>\f÷w±s\u0007\u0090Üi\u0092ÒkÓ vößO°\u0004CÚÝ\u0093¡h\u00014\"\u0082ÁY<\u0017\u0081îÌ¥js\u0099Êú\u0081:_\u008b\u0016ñíZ»\u008cráÉN\u0087ú^£\u0015]ã¿ºZqOÏ¶\u0086\t]~`\u001fÖõ\r\u000eC¼º¿ñ\u000f'©\u009eÆÕ\u0014\u000b·B×¹{ïÿ&ú\u009dsÓ\u009c\nãAp·\u0081î:%u\u009b\u009cÒ\u0006\tG\u007f\u009c¶<íE#ú\u008254Âï8¡\u008dXÙ\u0013}Å\u0083|í7*é\u009d ø[V\r\u0089ÐÉf7½Ïó!\nc±³\u0007DÜ¾\u0092\u000bk_ ûö\u001fOa\u0004°Ú\u0012\u0093#hÉ>\u001d÷dLßÚOlò·\u0019ù¼\u0000äK\u000f\u009d»$\u009eo\u000f±¯øÔ\u0003tU®\u009cÉ'ki\u0098°\u0086ûs\r\u0097¦G\u0010êË\u0019\u0085\u0094|Ç7&á\u0088Xì\u0013\tÍ°\u0084Ï\u007f=)¸àÌ\u0015\u008c£nx\u008768Ï,\u0084\u0086R6ë_ \u008a~*7lÌø\u009a,SOèö¦\u0018\u007fP4¥Â\u000b\u009b¶Pï.(\u0098\u008eCo\r×ô\u0099¿viÛÐ±\u009baEÑ±³\u0007QÜ¸\u0092\u0007k\u0013 ¹ö\u0003Oq\u0004²Ú\u0000\u0093\u007fÒäd\u0007¿úñG\b\nC¬\u0095_,<gü¹Mð7\u000b\u009c]J\u0094'/\u0088a<¸eó\u0087\u0005k\\\u009c\u0097\u008a)s`Ë» Í%\u0004Û_¶\u0091\u001f±³\u0007DÜ¾\u0092\u000bk_ ûö\u000fOt\u0004©Ú\u001d\u0093bhÂ>\u0013±Û\u0007[Ü \u0092\u0000kZ ½ö\u001fOlbÇÔ$\u000fÙAd¸)ó\u008f%u\u009c\u0019×Û\tc@W» íz$\u000f\u009f¾ÑY\b\u0004C¥µKì¿'«\u0099UÐê\u000bß}\u0018´¯ï\u009b!?\u0098åÓÎ\u00055|Ù·\u008bé2 ×\u009afÍ!\u0004Ò~l±^èÅ\"e\u0095\u0015Ì¥\u0006ay\r°½".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr;
        b = -1909910669376026828L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, int r8, int r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r9 = r9 * 3
            int r9 = 115 - r9
            byte[] r0 = com.google.android.gms.maps.model.Polygon.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r9 = r9 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Polygon.$$e(byte, int, int):java.lang.String");
    }
}
