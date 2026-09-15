package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzazy;
import com.google.android.libraries.places.internal.zzbae;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbae<MessageType extends zzbae<MessageType, BuilderType>, BuilderType extends zzazy<MessageType, BuilderType>> extends zzaym<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzbcn zzc = zzbcn.zza();

    static zzbae zzbm(Class cls) {
        Map map = zze;
        zzbae zzbaeVar = (zzbae) map.get(cls);
        if (zzbaeVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzbaeVar = (zzbae) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzbaeVar != null) {
            return zzbaeVar;
        }
        zzbae zzbaeVar2 = (zzbae) ((zzbae) zzbct.zzc(cls)).zzb(6, null, null);
        if (zzbaeVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzbaeVar2);
        return zzbaeVar2;
    }

    protected static void zzbn(Class cls, zzbae zzbaeVar) {
        zzbaeVar.zzbe();
        zze.put(cls, zzbaeVar);
    }

    protected static Object zzbo(zzbbl zzbblVar, String str, Object[] objArr) {
        return new zzbbx(zzbblVar, str, objArr);
    }

    public static zzbad zzbp(zzbbl zzbblVar, Object obj, zzbbl zzbblVar2, zzbaj zzbajVar, int i, zzbcx zzbcxVar, Class cls) {
        return new zzbad(zzbblVar, obj, zzbblVar2, new zzbac(null, 525004180, zzbcxVar, false, false), cls);
    }

    static Object zzbq(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static zzbam zzbr() {
        return zzbaf.zzd();
    }

    protected static zzbam zzbs(zzbam zzbamVar) {
        int size = zzbamVar.size();
        return zzbamVar.zzg(size + size);
    }

    protected static zzban zzbt() {
        return zzbba.zzd();
    }

    protected static zzbao zzbu() {
        return zzbbw.zzd();
    }

    protected static zzbao zzbv(zzbao zzbaoVar) {
        int size = zzbaoVar.size();
        return zzbaoVar.zzg(size + size);
    }

    private final int zzc(zzbbz zzbbzVar) {
        return zzbbv.zza().zzb(getClass()).zze(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zze(zzbae zzbaeVar, boolean z) {
        byte bByteValue = ((Byte) zzbaeVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzi = zzbbv.zza().zzb(zzbaeVar.getClass()).zzi(zzbaeVar);
        if (z) {
            zzbaeVar.zzb(2, true != zZzi ? null : zzbaeVar, null);
        }
        return zZzi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzbbv.zza().zzb(getClass()).zzb(this, (zzbae) obj);
    }

    public final int hashCode() {
        if (zzbd()) {
            return zzbh();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzbh = zzbh();
        this.zza = iZzbh;
        return iZzbh;
    }

    public final String toString() {
        return zzbbn.zza(this, super.toString());
    }

    protected abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.libraries.places.internal.zzbbm
    public final boolean zzbA() {
        return zze(this, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbbm
    public final /* synthetic */ zzbbl zzbB() {
        return (zzbae) zzb(6, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzaym
    final int zzbb(zzbbz zzbbzVar) {
        if (zzbd()) {
            int iZze = zzbbzVar.zze(this);
            if (iZze >= 0) {
                return iZze;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iZze).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iZze);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZze2 = zzbbzVar.zze(this);
        if (iZze2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
            return iZze2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZze2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iZze2);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final zzbbt zzbf() {
        return (zzbbt) zzb(7, null, null);
    }

    final zzbae zzbg() {
        return (zzbae) zzb(4, null, null);
    }

    final int zzbh() {
        return zzbbv.zza().zzb(getClass()).zzc(this);
    }

    protected final void zzbi() {
        zzbbv.zza().zzb(getClass()).zzh(this);
        zzbe();
    }

    protected final zzazy zzbj() {
        return (zzazy) zzb(5, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final /* synthetic */ zzbbk zzbx() {
        zzazy zzazyVar = (zzazy) zzb(5, null, null);
        zzazyVar.zzE(this);
        return zzazyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final /* synthetic */ zzbbk zzby() {
        return (zzazy) zzb(5, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final void zzbz(zzazi zzaziVar) throws IOException {
        zzbbv.zza().zzb(getClass()).zzf(this, zzazj.zza(zzaziVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final int zzbl() {
        if (zzbd()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iZzc);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iZzc2);
        throw new IllegalStateException(sb2.toString());
    }

    final boolean zzbd() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void zzbe() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final void zzbk(int i) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }
}
