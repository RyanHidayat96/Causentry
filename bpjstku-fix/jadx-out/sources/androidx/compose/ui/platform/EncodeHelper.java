package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.AndroidColor_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0012¢\u0006\u0004\b\u000b\u0010\u0013J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001c¢\u0006\u0004\b\u000b\u0010\u001dJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u001e¢\u0006\u0004\b\u000b\u0010\u001fJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020 ¢\u0006\u0004\b\u000b\u0010!J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\"¢\u0006\u0004\b\u000b\u0010#J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020$¢\u0006\u0004\b\u000b\u0010\u0016J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020%¢\u0006\u0004\b\u000b\u0010\u001bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020&¢\u0006\u0004\b'\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "<init>", "()V", "", "reset", "", "encodedString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/SpanStyle;", "p0", "encode", "(Landroidx/compose/ui/text/SpanStyle;)V", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "(Landroidx/compose/ui/text/font/FontWeight;)V", "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "Landroidx/compose/ui/text/style/TextDecoration;", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "(Landroidx/compose/ui/graphics/Shadow;)V", "", "(B)V", "", "", "Lkotlin/ULong;", "encode-VKZWuLQ", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final String encodedString() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void encode(SpanStyle p0) {
        if (!Color.m4219equalsimpl0(p0.m6338getColor0d7_KjU(), Color.INSTANCE.m4254getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m6078encode8_81llA(p0.m6338getColor0d7_KjU());
        }
        if (!TextUnit.m7126equalsimpl0(p0.getFontSize(), TextUnit.INSTANCE.m7140getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m6075encodeR2X_6o(p0.getFontSize());
        }
        FontWeight fontWeight = p0.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyle = p0.getFontStyle();
        if (fontStyle != null) {
            int iM6513unboximpl = fontStyle.m6513unboximpl();
            encode((byte) 4);
            m6080encodenzbMABs(iM6513unboximpl);
        }
        FontSynthesis fontSynthesis = p0.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m6077encode6p3vJLY(value);
        }
        String fontFeatureSettings = p0.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m7126equalsimpl0(p0.getLetterSpacing(), TextUnit.INSTANCE.m7140getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m6075encodeR2X_6o(p0.getLetterSpacing());
        }
        BaselineShift baselineShift = p0.getBaselineShift();
        if (baselineShift != null) {
            float fM6697unboximpl = baselineShift.m6697unboximpl();
            encode((byte) 8);
            m6076encode4Dl_Bck(fM6697unboximpl);
        }
        TextGeometricTransform textGeometricTransform = p0.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m4219equalsimpl0(p0.getBackground(), Color.INSTANCE.m4254getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m6078encode8_81llA(p0.getBackground());
        }
        TextDecoration textDecoration = p0.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = p0.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m6078encode8_81llA(long p0) {
        m6079encodeVKZWuLQ(ULong.m8203constructorimpl(AndroidColor_androidKt.m4082toColorLong8_81llA(p0)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m6075encodeR2X_6o(long p0) {
        byte b;
        long jM7128getTypeUIouoOA = TextUnit.m7128getTypeUIouoOA(p0);
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7163getUnspecifiedUIouoOA())) {
            b = 0;
        } else if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
            b = 1;
        } else if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
            b = 2;
        } else {
            b = 0;
        }
        encode(b);
        if (TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(p0), TextUnitType.INSTANCE.m7163getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m7129getValueimpl(p0));
    }

    public final void encode(FontWeight p0) {
        encode(p0.getWeight());
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m6080encodenzbMABs(int p0) {
        encode((FontStyle.m6510equalsimpl0(p0, FontStyle.INSTANCE.m6517getNormal_LCdwA()) || !FontStyle.m6510equalsimpl0(p0, FontStyle.INSTANCE.m6516getItalic_LCdwA())) ? (byte) 0 : (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m6077encode6p3vJLY(int p0) {
        byte b;
        if (FontSynthesis.m6521equalsimpl0(p0, FontSynthesis.INSTANCE.m6528getNoneGVVA2EU())) {
            b = 0;
        } else if (FontSynthesis.m6521equalsimpl0(p0, FontSynthesis.INSTANCE.m6527getAllGVVA2EU())) {
            b = 1;
        } else if (FontSynthesis.m6521equalsimpl0(p0, FontSynthesis.INSTANCE.m6530getWeightGVVA2EU())) {
            b = 2;
        } else if (FontSynthesis.m6521equalsimpl0(p0, FontSynthesis.INSTANCE.m6529getStyleGVVA2EU())) {
            b = 3;
        } else {
            b = 0;
        }
        encode(b);
    }

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m6076encode4Dl_Bck(float p0) {
        encode(p0);
    }

    public final void encode(TextGeometricTransform p0) {
        encode(p0.getScaleX());
        encode(p0.getSkewX());
    }

    public final void encode(TextDecoration p0) {
        encode(p0.getMask());
    }

    public final void encode(Shadow p0) {
        m6078encode8_81llA(p0.getColor());
        encode(Float.intBitsToFloat((int) (p0.getOffset() >> 32)));
        encode(Float.intBitsToFloat((int) (p0.getOffset() & 4294967295L)));
        encode(p0.getBlurRadius());
    }

    public final void encode(byte p0) {
        this.parcel.writeByte(p0);
    }

    public final void encode(int p0) {
        this.parcel.writeInt(p0);
    }

    public final void encode(float p0) {
        this.parcel.writeFloat(p0);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m6079encodeVKZWuLQ(long p0) {
        this.parcel.writeLong(p0);
    }

    public final void encode(String p0) {
        this.parcel.writeString(p0);
    }
}
