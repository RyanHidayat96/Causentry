package androidx.compose.ui.unit;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8'X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/FontScalingLinear;", "", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toSp-0xMU5do", "(F)J", "toSp", "toDp-GaN1DYA", "(J)F", "toDp", "", "getFontScale", "()F", "getFontScale$annotations", "()V", "fontScale"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FontScalingLinear {
    float getFontScale();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7053toSp0xMU5do(FontScalingLinear fontScalingLinear, float f) {
            return FontScalingLinear.super.m7051toSp0xMU5do(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7052toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j) {
            return FontScalingLinear.super.m7050toDpGaN1DYA(j);
        }
    }

    /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
    default long m7051toSp0xMU5do(float f) {
        return TextUnitKt.getSp(f / getFontScale());
    }

    /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
    default float m7050toDpGaN1DYA(long j) {
        if (!TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(j), TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m6935constructorimpl(TextUnit.m7129getValueimpl(j) * getFontScale());
    }
}
