package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzam extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzam zzc;
    final Collection zzd;
    final /* synthetic */ zzap zze;

    zzam(zzap zzapVar, Object obj, Collection collection, zzam zzamVar) {
        this.zze = zzapVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzamVar;
        this.zzd = zzamVar == null ? null : zzamVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (!zAdd) {
            return zAdd;
        }
        zzap.zzd(this.zze);
        if (!zIsEmpty) {
            return zAdd;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        zzap.zzf(this.zze, this.zzb.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzap.zzg(this.zze, size);
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46399 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 37836), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, Drawable.resolveOpacity(0, 0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (ViewConfiguration.getScrollBarSize() >> 8)), (-16777157) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 765;
        long j3 = -1;
        long j4 = j3 ^ 1451649154880468516L;
        long j5 = j3 ^ 4067604342279317723L;
        long j6 = j4 | j5;
        long jIdentityHashCode = System.identityHashCode(this);
        long j7 = jIdentityHashCode ^ j3;
        long j8 = (((long) (-1529)) * 1451649154880468516L) + (((long) (-764)) * 4067604342279317723L) + ((((j6 | j7) ^ j3) | (((j4 | 4067604342279317723L) | jIdentityHashCode) ^ j3) | (((j5 | 1451649154880468516L) | jIdentityHashCode) ^ j3)) * j2) + (((long) 1530) * ((j6 ^ j3) | ((j4 | j7) ^ j3))) + (j2 * ((j3 ^ ((j5 | j7) | 1451649154880468516L)) | ((j4 | jIdentityHashCode) ^ j3)));
        long j9 = j;
        int i3 = 0;
        while (true) {
            for (int i4 = 0; i4 != 8; i4++) {
                i2 = (((((int) (j9 >> i4)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
            }
            if (i3 != 0) {
                break;
            }
            i3++;
            j9 = j8;
        }
        if (i2 == i) {
            if (obj == this) {
                return true;
            }
            zzb();
            return this.zzb.equals(obj);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 46400), 39 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
        }
        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzal(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            zzap.zze(this.zze);
            zzc();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            zzap.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    final void zza() {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            zzamVar.zza();
        } else {
            this.zze.zza.put(this.zza, this.zzb);
        }
    }

    final void zzb() {
        Collection collection;
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            zzamVar.zzb();
            if (this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.zzb.isEmpty() || (collection = (Collection) this.zze.zza.get(this.zza)) == null) {
                return;
            }
            this.zzb = collection;
        }
    }

    final void zzc() {
        zzam zzamVar = this.zzc;
        if (zzamVar != null) {
            zzamVar.zzc();
        } else if (this.zzb.isEmpty()) {
            this.zze.zza.remove(this.zza);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            zzap.zzf(this.zze, this.zzb.size() - size);
            zzc();
        }
        return zRetainAll;
    }
}
