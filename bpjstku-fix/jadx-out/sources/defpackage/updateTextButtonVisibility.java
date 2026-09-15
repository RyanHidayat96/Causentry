package defpackage;

import android.graphics.Bitmap;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010!\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 "}, d2 = {"LupdateTextButtonVisibility;", "", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDataEligible;", "p0", "Landroid/graphics/Bitmap;", "p1", "", "", "", "p2", "p3", "p4", "p5", "<init>", "(Ljava/util/List;Landroid/graphics/Bitmap;Ljava/util/Map;ZZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "Landroid/graphics/Bitmap;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Z", "asInterface"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class updateTextButtonVisibility {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final Map<String, Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final boolean asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List<ScholarshipDataEligible> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Bitmap b;

    private updateTextButtonVisibility(List<ScholarshipDataEligible> list, Bitmap bitmap, Map<String, Boolean> map, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        this.b = bitmap;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
        this.TuitionPaymentFragmentbindingInflater1 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z2;
        this.asInterface = z3;
    }

    public /* synthetic */ updateTextButtonVisibility(List list, Bitmap bitmap, Map map, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    public static /* synthetic */ updateTextButtonVisibility TuitionPaymentFragmentspecialinlinedviewModeldefault2(updateTextButtonVisibility updatetextbuttonvisibility, List list, Bitmap bitmap, Map map, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            list = updatetextbuttonvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            bitmap = updatetextbuttonvisibility.b;
        }
        Bitmap bitmap2 = bitmap;
        if ((i & 4) != 0) {
            map = updatetextbuttonvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            z = updatetextbuttonvisibility.TuitionPaymentFragmentbindingInflater1;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = updatetextbuttonvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = updatetextbuttonvisibility.asInterface;
        }
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map2, "");
        return new updateTextButtonVisibility(list2, bitmap2, map2, z4, z5, z3);
    }

    public updateTextButtonVisibility() {
        this(null, null, null, false, false, false, 63, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof updateTextButtonVisibility)) {
            return false;
        }
        updateTextButtonVisibility updatetextbuttonvisibility = (updateTextButtonVisibility) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, updatetextbuttonvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, updatetextbuttonvisibility.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, updatetextbuttonvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.TuitionPaymentFragmentbindingInflater1 == updatetextbuttonvisibility.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == updatetextbuttonvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.asInterface == updatetextbuttonvisibility.asInterface;
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        Bitmap bitmap = this.b;
        return (((((((((iHashCode * 31) + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 31) + Boolean.hashCode(this.asInterface);
    }

    public final String toString() {
        List<ScholarshipDataEligible> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Bitmap bitmap = this.b;
        Map<String, Boolean> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean z = this.TuitionPaymentFragmentbindingInflater1;
        boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean z3 = this.asInterface;
        StringBuilder sb = new StringBuilder("updateTextButtonVisibility(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(list);
        sb.append(", b=");
        sb.append(bitmap);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(map);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(z);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(z2);
        sb.append(", asInterface=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
