package defpackage;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class processInputPacket {
    processInputPacket() {
    }

    public static void b(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* JADX INFO: renamed from: processInputPacket$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }
}
