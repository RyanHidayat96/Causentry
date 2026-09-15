package defpackage;

import android.graphics.Bitmap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013"}, d2 = {"LQualityRatioToResolutionsTable;", "LcontainsQuality;", "", "p0", "p1", "Landroid/graphics/Bitmap$CompressFormat;", "p2", "p3", "<init>", "(IILandroid/graphics/Bitmap$CompressFormat;I)V", "Ljava/io/File;", "", "b", "()Z", "TuitionPaymentFragmentbindingInflater1", "(Ljava/io/File;)Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/graphics/Bitmap$CompressFormat;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 3, 0})
public final class QualityRatioToResolutionsTable implements containsQuality {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Bitmap.CompressFormat b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public QualityRatioToResolutionsTable(int i, int i2, Bitmap.CompressFormat compressFormat, int i3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.TuitionPaymentFragmentbindingInflater1 = i2;
        this.b = compressFormat;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
    }

    public /* synthetic */ QualityRatioToResolutionsTable(int i, int i2, Bitmap.CompressFormat compressFormat, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID : i, (i4 & 2) != 0 ? 816 : i2, (i4 & 4) != 0 ? Bitmap.CompressFormat.JPEG : compressFormat, (i4 & 8) != 0 ? 80 : i3);
    }

    @Override // defpackage.containsQuality
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.containsQuality
    public final File TuitionPaymentFragmentbindingInflater1(File p0) throws Throwable {
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Quality.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, Quality.TuitionPaymentFragmentbindingInflater1(p0, Quality.b(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1)), this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        return fileTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public QualityRatioToResolutionsTable() {
        this(0, 0, null, 0, 15, null);
    }
}
