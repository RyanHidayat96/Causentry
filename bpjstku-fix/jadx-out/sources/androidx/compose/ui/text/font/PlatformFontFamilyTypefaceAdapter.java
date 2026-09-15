package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.AndroidTypeface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "<init>", "()V", "Landroidx/compose/ui/text/font/TypefaceRequest;", "p0", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "p2", "", "p3", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "(Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "platformTypefaceResolver", "Landroidx/compose/ui/text/font/PlatformTypefaces;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public final TypefaceResult resolve(TypefaceRequest p0, PlatformFontLoader p1, Function1<? super TypefaceResult.Immutable, Unit> p2, Function1<? super TypefaceRequest, ? extends Object> p3) {
        android.graphics.Typeface typefaceMo6538createDefaultFO1MlWM;
        FontFamily fontFamily = p0.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof DefaultFontFamily)) {
            typefaceMo6538createDefaultFO1MlWM = this.platformTypefaceResolver.mo6538createDefaultFO1MlWM(p0.getFontWeight(), p0.m6556getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            typefaceMo6538createDefaultFO1MlWM = this.platformTypefaceResolver.mo6539createNamedRetOiIg((GenericFontFamily) p0.getFontFamily(), p0.getFontWeight(), p0.m6556getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            Typeface typeface = ((LoadedFontFamily) p0.getFontFamily()).getTypeface();
            Intrinsics.checkNotNull(typeface, "");
            typefaceMo6538createDefaultFO1MlWM = ((AndroidTypeface) typeface).mo6653getNativeTypefacePYhJU0U(p0.getFontWeight(), p0.m6556getFontStyle_LCdwA(), p0.m6557getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(typefaceMo6538createDefaultFO1MlWM, false, 2, null);
    }
}
