package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\u0005*\u00020\b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001f\u0010\f\u001a\u00020\u0005*\u00020\u00018Ã\u0002X\u0082\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00018Ã\u0002X\u0082\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "analyzeComponents-58bKbWc", "([F)I", "analyzeComponents", "", "toInt", "(Z)I", "Landroidx/compose/ui/unit/IntOffset;", "isSet--gyyYBs", "(J)Z", "isSet", "isIdentity", "(I)Z", "isIdentity$annotations", "(I)V", "getHasNonTranslationComponents", "getHasNonTranslationComponents$annotations", "hasNonTranslationComponents"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RectManagerKt {
    private static final boolean getHasNonTranslationComponents(int i) {
        return (i & 2) == 0;
    }

    private static /* synthetic */ void getHasNonTranslationComponents$annotations(int i) {
    }

    private static final boolean isIdentity(int i) {
        return i == 3;
    }

    private static /* synthetic */ void isIdentity$annotations(int i) {
    }

    public static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isSet--gyyYBs, reason: not valid java name */
    public static final boolean m6171isSetgyyYBs(long j) {
        return !IntOffset.m7062equalsimpl0(j, IntOffset.INSTANCE.m7073getMaxnOccac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    public static final int m6170analyzeComponents58bKbWc(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }
}
