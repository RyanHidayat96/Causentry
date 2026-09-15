package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\n¢\u0006\u0004\b\f\u0010\u0006\u001a\u001c\u0010\r\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\n¢\u0006\u0004\b\f\u0010\u000f\u001a\u001c\u0010\r\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0004H\u0087\n¢\u0006\u0004\b\f\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010 \u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\"\"\u001f\u0010*\u001a\u00020&*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0017\u001a\u0004\b'\u0010(\"\u001f\u0010-\u001a\u00020&*\u00020\u00048Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0017\u001a\u0004\b+\u0010(\"\u001e\u00102\u001a\u00020\u0004*\u00020\u00008GX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/\"\u001e\u00105\u001a\u00020\u0004*\u00020\u00008GX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010/\"\u001e\u00102\u001a\u00020\u0004*\u00020\u000e8GX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u00107\u001a\u0004\b.\u00106\"\u001e\u00105\u001a\u00020\u0004*\u00020\u000e8GX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00107\u001a\u0004\b3\u00106\"\u001e\u00102\u001a\u00020\u0004*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u00109\u001a\u0004\b.\u00108\"\u001e\u00105\u001a\u00020\u0004*\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00109\u001a\u0004\b3\u00108"}, d2 = {"", "p0", "Landroidx/compose/ui/unit/TextUnitType;", "p1", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "times-mpE4wyQ", "times", "", "(DJ)J", "", "(IJ)J", "", "pack", "(JF)J", "", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "checkArithmetic-NB67dxo", "(JJ)V", "p2", "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp-C3pnCVY", "(JJF)J", "lerp", "UNIT_MASK", "J", "UNIT_TYPE_UNSPECIFIED", "UNIT_TYPE_SP", "UNIT_TYPE_EM", "", "isSpecified--R2X_6o", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", "isUnspecified--R2X_6o", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "getEm", "getEm$annotations", "em", "(D)J", "(D)V", "(I)J", "(I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static /* synthetic */ void getSp$annotations(double d) {
    }

    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static /* synthetic */ void getSp$annotations(int i) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m7146isSpecifiedR2X_6o$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m7148isUnspecifiedR2X_6o$annotations(long j) {
    }

    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m7141TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m7147isUnspecifiedR2X_6o(long j) {
        return TextUnit.m7127getRawTypeimpl(j) == 0;
    }

    public static final long getSp(float f) {
        return pack(UNIT_TYPE_SP, f);
    }

    public static final long getEm(float f) {
        return pack(UNIT_TYPE_EM, f);
    }

    public static final long getSp(double d) {
        return pack(UNIT_TYPE_SP, (float) d);
    }

    public static final long getEm(double d) {
        return pack(UNIT_TYPE_EM, (float) d);
    }

    public static final long getSp(int i) {
        return pack(UNIT_TYPE_SP, i);
    }

    public static final long getEm(int i) {
        return pack(UNIT_TYPE_EM, i);
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7152timesmpE4wyQ(float f, long j) {
        m7142checkArithmeticR2X_6o(j);
        return pack(TextUnit.m7127getRawTypeimpl(j), f * TextUnit.m7129getValueimpl(j));
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7151timesmpE4wyQ(double d, long j) {
        m7142checkArithmeticR2X_6o(j);
        return pack(TextUnit.m7127getRawTypeimpl(j), ((float) d) * TextUnit.m7129getValueimpl(j));
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7153timesmpE4wyQ(int i, long j) {
        m7142checkArithmeticR2X_6o(j);
        return pack(TextUnit.m7127getRawTypeimpl(j), i * TextUnit.m7129getValueimpl(j));
    }

    public static final long pack(long j, float f) {
        return TextUnit.m7121constructorimpl(j | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m7149lerpC3pnCVY(long j, long j2, float f) {
        m7143checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m7127getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m7129getValueimpl(j), TextUnit.m7129getValueimpl(j2), f));
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m7145isSpecifiedR2X_6o(long j) {
        return !(TextUnit.m7127getRawTypeimpl(j) == 0);
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m7150takeOrElseeAf_CNQ(long j, Function0<TextUnit> function0) {
        return TextUnit.m7127getRawTypeimpl(j) == 0 ? function0.invoke().getPackedValue() : j;
    }

    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m7142checkArithmeticR2X_6o(long j) {
        if (TextUnit.m7127getRawTypeimpl(j) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m7143checkArithmeticNB67dxo(long j, long j2) {
        if (TextUnit.m7127getRawTypeimpl(j) == 0 || TextUnit.m7127getRawTypeimpl(j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(j), TextUnit.m7128getTypeUIouoOA(j2))) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot perform operation for ");
        sb.append((Object) TextUnitType.m7159toStringimpl(TextUnit.m7128getTypeUIouoOA(j)));
        sb.append(" and ");
        sb.append((Object) TextUnitType.m7159toStringimpl(TextUnit.m7128getTypeUIouoOA(j2)));
        InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m7144checkArithmeticvU0ePk(long j, long j2, long j3) {
        if (TextUnit.m7127getRawTypeimpl(j) == 0 || TextUnit.m7127getRawTypeimpl(j2) == 0 || TextUnit.m7127getRawTypeimpl(j3) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(j), TextUnit.m7128getTypeUIouoOA(j2)) && TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(j2), TextUnit.m7128getTypeUIouoOA(j3))) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot perform operation for ");
        sb.append((Object) TextUnitType.m7159toStringimpl(TextUnit.m7128getTypeUIouoOA(j)));
        sb.append(" and ");
        sb.append((Object) TextUnitType.m7159toStringimpl(TextUnit.m7128getTypeUIouoOA(j2)));
        InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
    }
}
