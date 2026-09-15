package defpackage;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0017\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0014\u0010#\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u001a\u0010(\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b\u0017\u0010'"}, d2 = {"LisThumbUp;", "LnewStarRating;", "Landroid/graphics/drawable/Drawable;", "p0", "LnewUnratedRating;", "p1", "Lcoil/decode/DataSource;", "p2", "Lcoil/memory/MemoryCache$Key;", "p3", "", "p4", "", "p5", "p6", "<init>", "(Landroid/graphics/drawable/Drawable;LnewUnratedRating;Lcoil/decode/DataSource;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;ZZ)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroid/graphics/drawable/Drawable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Landroid/graphics/drawable/Drawable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder", "LnewUnratedRating;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LnewUnratedRating;", "TuitionPaymentFragmentbindingInflater1", "Lcoil/decode/DataSource;", "()Lcoil/decode/DataSource;", "asInterface", "Lcoil/memory/MemoryCache$Key;", "Ljava/lang/String;", "Z", "()Z", "a"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isThumbUp extends newStarRating {
    private final DataSource TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final boolean a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final boolean asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final newUnratedRating b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final MemoryCache.Key TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ isThumbUp(Drawable drawable, newUnratedRating newunratedrating, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, newunratedrating, dataSource, (i & 8) != 0 ? null : key, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    @Override // defpackage.newStarRating
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final Drawable getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.newStarRating
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from getter */
    public final newUnratedRating getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final DataSource getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    public isThumbUp(Drawable drawable, newUnratedRating newunratedrating, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2) {
        super(null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = drawable;
        this.b = newunratedrating;
        this.TuitionPaymentFragmentbindingInflater1 = dataSource;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = key;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.asInterface = z;
        this.a = z2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof isThumbUp)) {
            return false;
        }
        isThumbUp isthumbup = (isThumbUp) p0;
        return Intrinsics.areEqual(getTuitionPaymentFragmentspecialinlinedviewModeldefault2(), isthumbup.getTuitionPaymentFragmentspecialinlinedviewModeldefault2()) && Intrinsics.areEqual(getB(), isthumbup.getB()) && this.TuitionPaymentFragmentbindingInflater1 == isthumbup.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, isthumbup.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, isthumbup.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.asInterface == isthumbup.asInterface && this.a == isthumbup.a;
    }

    public final int hashCode() {
        int iHashCode = getTuitionPaymentFragmentspecialinlinedviewModeldefault2().hashCode();
        int iHashCode2 = getB().hashCode();
        int iHashCode3 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        MemoryCache.Key key = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode4 = key != null ? key.hashCode() : 0;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.asInterface)) * 31) + Boolean.hashCode(this.a);
    }
}
