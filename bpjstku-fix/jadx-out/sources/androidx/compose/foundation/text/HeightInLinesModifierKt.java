package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a(\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"DefaultMinLines", "", "validateMinMaxLines", "", "minLines", "maxLines", "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i, i2);
    }

    public static final void validateMinMaxLines(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            StringBuilder sb = new StringBuilder("both minLines ");
            sb.append(i);
            sb.append(" and maxLines ");
            sb.append(i2);
            sb.append(" must be greater than zero");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i <= i2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("minLines ");
        sb2.append(i);
        sb2.append(" must be less than or equal to maxLines ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static final Modifier heightInLines(Modifier modifier, final TextStyle textStyle, final int i, final int i2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", Integer.valueOf(i));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i2));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2
            @Override // kotlin.jvm.functions.Function3
            public final /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i3) {
                composer.startReplaceGroup(408240218);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408240218, i3, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
                }
                HeightInLinesModifierKt.validateMinMaxLines(i, i2);
                if (i == 1 && i2 == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return companion;
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                boolean zChanged = composer.changed(textStyle);
                boolean zChanged2 = composer.changed(layoutDirection);
                TextStyle textStyle2 = textStyle;
                Object objRememberedValue = composer.rememberedValue();
                if ((zChanged | zChanged2) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                TextStyle textStyle3 = (TextStyle) objRememberedValue;
                boolean zChanged3 = composer.changed(resolver);
                boolean zChanged4 = composer.changed(textStyle3);
                Object objRememberedValue2 = composer.rememberedValue();
                if ((zChanged3 | zChanged4) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = textStyle3.getFontFamily();
                    FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM6429getFontStyle4Lr2A7w = textStyle3.m6429getFontStyle4Lr2A7w();
                    int iM6513unboximpl = fontStyleM6429getFontStyle4Lr2A7w != null ? fontStyleM6429getFontStyle4Lr2A7w.m6513unboximpl() : FontStyle.INSTANCE.m6517getNormal_LCdwA();
                    FontSynthesis fontSynthesisM6430getFontSynthesisZQGJjVo = textStyle3.m6430getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo6482resolveDPcqOEQ(fontFamily, fontWeight, iM6513unboximpl, fontSynthesisM6430getFontSynthesisZQGJjVo != null ? fontSynthesisM6430getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m6527getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                State state = (State) objRememberedValue2;
                Object value = state.getValue();
                boolean zChanged5 = composer.changed(density);
                boolean zChanged6 = composer.changed(resolver);
                boolean zChanged7 = composer.changed(textStyle);
                boolean zChanged8 = composer.changed(layoutDirection);
                boolean zChanged9 = composer.changed(value);
                Object objRememberedValue3 = composer.rememberedValue();
                if ((zChanged9 | zChanged5 | zChanged6 | zChanged7 | zChanged8) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = Integer.valueOf(IntSize.m7105getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(objRememberedValue3);
                }
                int iIntValue = ((Number) objRememberedValue3).intValue();
                Object value2 = state.getValue();
                boolean zChanged10 = composer.changed(density);
                boolean zChanged11 = composer.changed(resolver);
                boolean zChanged12 = composer.changed(textStyle);
                boolean zChanged13 = composer.changed(layoutDirection);
                boolean zChanged14 = composer.changed(value2);
                Object objRememberedValue4 = composer.rememberedValue();
                if ((zChanged13 | zChanged10 | zChanged11 | zChanged12 | zChanged14) || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(TextFieldDelegateKt.getEmptyTextReplacement());
                    sb.append('\n');
                    sb.append(TextFieldDelegateKt.getEmptyTextReplacement());
                    objRememberedValue4 = Integer.valueOf(IntSize.m7105getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, sb.toString(), 2)));
                    composer.updateRememberedValue(objRememberedValue4);
                }
                int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
                int i4 = i;
                Integer numValueOf = i4 == 1 ? null : Integer.valueOf(((i4 - 1) * iIntValue2) + iIntValue);
                int i5 = i2;
                Integer numValueOf2 = i5 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i5 - 1))) : null;
                Modifier modifierM1034heightInVpY3zN4 = SizeKt.m1034heightInVpY3zN4(Modifier.INSTANCE, numValueOf != null ? density.mo691toDpu2uoSUM(numValueOf.intValue()) : Dp.INSTANCE.m6955getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo691toDpu2uoSUM(numValueOf2.intValue()) : Dp.INSTANCE.m6955getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM1034heightInVpY3zN4;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        });
    }
}
