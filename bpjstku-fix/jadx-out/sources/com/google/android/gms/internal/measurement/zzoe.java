package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
class zzoe extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile zzod zze;
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private zzoe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final Object zzg(int i) {
        zzh();
        Object value = ((zzob) this.zza[i]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzo().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new zzob(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0035 A[SYNTHETIC] */
    private final int zzm(Comparable comparable) {
        int i;
        int iCompareTo;
        int i2 = this.zzb;
        int i3 = i2 - 1;
        if (i3 < 0) {
            i2 = 0;
            while (i2 <= i3) {
                i = (i2 + i3) / 2;
                iCompareTo = comparable.compareTo(((zzob) this.zza[i]).zza());
                if (iCompareTo < 0) {
                    i3 = i - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i;
                    }
                    i2 = i + 1;
                }
            }
        } else {
            int iCompareTo2 = comparable.compareTo(((zzob) this.zza[i3]).zza());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i3;
                }
                i2 = 0;
                while (i2 <= i3) {
                    i = (i2 + i3) / 2;
                    iCompareTo = comparable.compareTo(((zzob) this.zza[i]).zza());
                    if (iCompareTo < 0) {
                        i3 = i - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i;
                        }
                        i2 = i + 1;
                    }
                }
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap zzo() {
        zzh();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzh();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzm(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzod(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoe)) {
            return super.equals(obj);
        }
        zzoe zzoeVar = (zzoe) obj;
        int size = size();
        if (size != zzoeVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i != zzoeVar.zzb) {
            return entrySet().equals(zzoeVar.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!zzd(i2).equals(zzoeVar.zzd(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.zzc.equals(zzoeVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZzm = zzm(comparable);
        return iZzm >= 0 ? ((zzob) this.zza[iZzm]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.zzb;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.zza[i2].hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzh();
        Comparable comparable = (Comparable) obj;
        int iZzm = zzm(comparable);
        if (iZzm >= 0) {
            return zzg(iZzm);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final Map.Entry zzd(int i) {
        if (i < this.zzb) {
            return (zzob) this.zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Iterable zze() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) throws IllegalAccessException {
        int i;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - Color.red(0)), 40 - KeyEvent.getDeadChar(0, 0), 18 - TextUtils.lastIndexOf("", '0'), 1513912262, false, "b", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - TextUtils.indexOf("", "", 0)), 59 - (ViewConfiguration.getTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37835 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getOffsetAfter("", 0) + 59, 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 3412822593740871682L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = j;
        long j5 = (((long) 236) * 3412822593740871682L) + (((long) 471) * 2106430903418914557L) + (((long) (-235)) * (((j3 | (jIdentityHashCode ^ j2)) ^ j2) | 2106430903418914557L)) + (((long) (-470)) * (((j3 | jIdentityHashCode) ^ j2) | 2106430903418914557L)) + (((long) 235) * ((((j2 ^ 2106430903418914557L) | 3412822593740871682L) ^ j2) | (j2 ^ ((j3 | 2106430903418914557L) | jIdentityHashCode))));
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i4 = (((((int) (j4 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j4 = j5;
        }
        if (i4 != i2) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - Drawable.resolveOpacity(0, 0)), 39 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 19 - KeyEvent.keyCodeFromString(""), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
        }
        zzh();
        int iZzm = zzm(comparable);
        if (iZzm >= 0) {
            return ((zzob) this.zza[iZzm]).setValue(obj);
        }
        zzh();
        if (this.zza == null) {
            i = 16;
            this.zza = new Object[16];
        } else {
            i = 16;
        }
        int i7 = -(iZzm + 1);
        if (i7 >= i) {
            return zzo().put(comparable, obj);
        }
        if (this.zzb == i) {
            zzob zzobVar = (zzob) this.zza[15];
            this.zzb = 15;
            zzo().put(zzobVar.zza(), zzobVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i7, objArr, i7 + 1, 15 - i7);
        this.zza[i7] = new zzob(this, comparable, obj);
        this.zzb++;
        return null;
    }

    /* synthetic */ zzoe(byte[] bArr) {
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    final /* synthetic */ Object[] zzi() {
        return this.zza;
    }

    final /* synthetic */ int zzj() {
        return this.zzb;
    }

    final /* synthetic */ Map zzk() {
        return this.zzc;
    }
}
