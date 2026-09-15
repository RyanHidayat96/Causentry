package defpackage;

import android.graphics.Bitmap;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes4.dex */
public final class getSortedQualities {
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRecorder getrecorder, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID;
        }
        if ((i4 & 2) != 0) {
            i2 = 816;
        }
        if ((i4 & 4) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i4 & 8) != 0) {
            i3 = 80;
        }
        getrecorder.TuitionPaymentFragmentbindingInflater1.add(new QualityRatioToResolutionsTable(i, i2, compressFormat, i3));
    }
}
