package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.geometry.Offset;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010\u0015J\u000f\u0010.\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010\u000bJ\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u0010\u001cJ\u0011\u00101\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020*H\u0002¢\u0006\u0004\b3\u0010\u0015R\u0014\u00105\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106"}, d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "Landroidx/compose/ui/text/style/BaselineShift;", "decodeBaselineShift-y9eOQZs", "()F", "decodeBaselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "decodeTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/style/TextDecoration;", "decodeTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "decodeShadow", "()Landroidx/compose/ui/graphics/Shadow;", "", "decodeByte", "()B", "", "decodeInt", "Lkotlin/ULong;", "decodeULong-s-VKNKU", "decodeULong", "", "decodeFloat", "decodeString", "()Ljava/lang/String;", "dataAvailable", "Landroid/os/Parcel;", "parcel", "Landroid/os/Parcel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    public DecodeHelper(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle2 = mutableSpanStyle;
        MutableSpanStyle mutableSpanStyle3 = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                mutableSpanStyle = mutableSpanStyle2;
                if (bDecodeByte == 2) {
                    if (dataAvailable() >= 5) {
                        mutableSpanStyle.m6103setFontSizeR2X_6o(m6062decodeTextUnitXSAIIZE());
                        mutableSpanStyle2 = mutableSpanStyle;
                    } else {
                        return mutableSpanStyle.toSpanStyle();
                    }
                } else if (bDecodeByte == 3) {
                    if (dataAvailable() >= 4) {
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                        mutableSpanStyle2 = mutableSpanStyle;
                    } else {
                        return mutableSpanStyle.toSpanStyle();
                    }
                } else if (bDecodeByte == 4) {
                    if (dataAvailable() > 0) {
                        mutableSpanStyle.m6104setFontStylemLjRB2g(FontStyle.m6507boximpl(m6060decodeFontStyle_LCdwA()));
                        mutableSpanStyle2 = mutableSpanStyle;
                    } else {
                        return mutableSpanStyle.toSpanStyle();
                    }
                } else if (bDecodeByte != 5) {
                    if (bDecodeByte == 6) {
                        mutableSpanStyle.setFontFeatureSettings(decodeString());
                    } else if (bDecodeByte == 7) {
                        if (dataAvailable() >= 5) {
                            mutableSpanStyle.m6106setLetterSpacingR2X_6o(m6062decodeTextUnitXSAIIZE());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 8) {
                        if (dataAvailable() >= 4) {
                            mutableSpanStyle.m6101setBaselineShift_isdbwI(BaselineShift.m6691boximpl(m6057decodeBaselineShifty9eOQZs()));
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 9) {
                        if (dataAvailable() >= 8) {
                            mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 10) {
                        if (dataAvailable() >= 8) {
                            mutableSpanStyle.m6100setBackground8_81llA(m6059decodeColor0d7_KjU());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 11) {
                        if (dataAvailable() >= 4) {
                            mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    } else if (bDecodeByte == 12) {
                        if (dataAvailable() >= 20) {
                            mutableSpanStyle.setShadow(decodeShadow());
                        } else {
                            return mutableSpanStyle.toSpanStyle();
                        }
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (dataAvailable() > 0) {
                    mutableSpanStyle.m6105setFontSynthesistDdu0R4(FontSynthesis.m6518boximpl(m6061decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else {
                    return mutableSpanStyle.toSpanStyle();
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle2.m6102setColor8_81llA(m6059decodeColor0d7_KjU());
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return mutableSpanStyle.toSpanStyle();
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m6059decodeColor0d7_KjU() {
        return AndroidColor_androidKt.fromColorLong(Color.INSTANCE, this.parcel.readLong());
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m6062decodeTextUnitXSAIIZE() {
        long jM7163getUnspecifiedUIouoOA;
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 1) {
            jM7163getUnspecifiedUIouoOA = TextUnitType.INSTANCE.m7162getSpUIouoOA();
        } else if (bDecodeByte == 2) {
            jM7163getUnspecifiedUIouoOA = TextUnitType.INSTANCE.m7161getEmUIouoOA();
        } else {
            jM7163getUnspecifiedUIouoOA = TextUnitType.INSTANCE.m7163getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m7157equalsimpl0(jM7163getUnspecifiedUIouoOA, TextUnitType.INSTANCE.m7163getUnspecifiedUIouoOA())) {
            return TextUnit.INSTANCE.m7140getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m7141TextUnitanM5pPY(decodeFloat(), jM7163getUnspecifiedUIouoOA);
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m6060decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return FontStyle.INSTANCE.m6517getNormal_LCdwA();
        }
        if (bDecodeByte == 1) {
            return FontStyle.INSTANCE.m6516getItalic_LCdwA();
        }
        return FontStyle.INSTANCE.m6517getNormal_LCdwA();
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m6061decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return FontSynthesis.INSTANCE.m6528getNoneGVVA2EU();
        }
        if (bDecodeByte == 1) {
            return FontSynthesis.INSTANCE.m6527getAllGVVA2EU();
        }
        if (bDecodeByte == 3) {
            return FontSynthesis.INSTANCE.m6529getStyleGVVA2EU();
        }
        if (bDecodeByte == 2) {
            return FontSynthesis.INSTANCE.m6530getWeightGVVA2EU();
        }
        return FontSynthesis.INSTANCE.m6528getNoneGVVA2EU();
    }

    /* JADX INFO: renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m6057decodeBaselineShifty9eOQZs() {
        return BaselineShift.m6692constructorimpl(decodeFloat());
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    private final TextDecoration decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        boolean z = (TextDecoration.INSTANCE.getLineThrough().getMask() & iDecodeInt) != 0;
        boolean z2 = (iDecodeInt & TextDecoration.INSTANCE.getUnderline().getMask()) != 0;
        if (z && z2) {
            return TextDecoration.INSTANCE.combine(CollectionsKt.listOf((Object[]) new TextDecoration[]{TextDecoration.INSTANCE.getLineThrough(), TextDecoration.INSTANCE.getUnderline()}));
        }
        if (z) {
            return TextDecoration.INSTANCE.getLineThrough();
        }
        if (z2) {
            return TextDecoration.INSTANCE.getUnderline();
        }
        return TextDecoration.INSTANCE.getNone();
    }

    private final Shadow decodeShadow() {
        long jM6059decodeColor0d7_KjU = m6059decodeColor0d7_KjU();
        float fDecodeFloat = decodeFloat();
        float fDecodeFloat2 = decodeFloat();
        return new Shadow(jM6059decodeColor0d7_KjU, Offset.m3966constructorimpl((Float.floatToRawIntBits(fDecodeFloat) << 32) | (((long) Float.floatToRawIntBits(fDecodeFloat2)) & 4294967295L)), decodeFloat(), null);
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    /* JADX INFO: renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m6058decodeULongsVKNKU() {
        return ULong.m8203constructorimpl(this.parcel.readLong());
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }
}
