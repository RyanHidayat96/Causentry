package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "p0", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "p1", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "p2", "Lkotlin/Function1;", "", "p3", "Lkotlin/Pair;", "firstImmediatelyAvailable", "(Ljava/util/List;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object objInvoke;
        Object objM8024constructorimpl;
        int size = list.size();
        List listMutableListOf = null;
        for (int i = 0; i < size; i++) {
            Font font = list.get(i);
            int loadingStrategy = font.getLoadingStrategy();
            if (!FontLoadingStrategy.m6497equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m6502getBlockingPKNRLFQ())) {
                if (!FontLoadingStrategy.m6497equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m6503getOptionalLocalPKNRLFQ())) {
                    if (FontLoadingStrategy.m6497equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m6501getAsyncPKNRLFQ())) {
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM6463get1ASDuI8 = asyncTypefaceCache.m6463get1ASDuI8(font, platformFontLoader);
                        if (asyncTypefaceResultM6463get1ASDuI8 != null) {
                            if (!AsyncTypefaceCache.AsyncTypefaceResult.m6469isPermanentFailureimpl(asyncTypefaceResultM6463get1ASDuI8.m6471unboximpl()) && asyncTypefaceResultM6463get1ASDuI8.m6471unboximpl() != null) {
                                return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m6531synthesizeTypefaceFxwP2eA(typefaceRequest.m6557getFontSynthesisGVVA2EU(), asyncTypefaceResultM6463get1ASDuI8.m6471unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m6556getFontStyle_LCdwA()));
                            }
                        } else if (listMutableListOf == null) {
                            listMutableListOf = CollectionsKt.mutableListOf(font);
                        } else {
                            listMutableListOf.add(font);
                        }
                    } else {
                        throw new IllegalStateException("Unknown font type ".concat(String.valueOf(font)));
                    }
                } else {
                    synchronized (asyncTypefaceCache.cacheLock) {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            objM8024constructorimpl = asyncTypefaceResult.m6471unboximpl();
                        } else {
                            Unit unit = Unit.INSTANCE;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM8024constructorimpl = Result.m8024constructorimpl(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m8030isFailureimpl(objM8024constructorimpl)) {
                                objM8024constructorimpl = null;
                            }
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objM8024constructorimpl, false, 8, null);
                        }
                    }
                    if (objM8024constructorimpl != null) {
                        return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m6531synthesizeTypefaceFxwP2eA(typefaceRequest.m6557getFontSynthesisGVVA2EU(), objM8024constructorimpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m6556getFontStyle_LCdwA()));
                    }
                }
            } else {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        objInvoke = asyncTypefaceResult2.m6471unboximpl();
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                        try {
                            objInvoke = platformFontLoader.loadBlocking(font);
                        } catch (Exception unused) {
                            objInvoke = function1.invoke(typefaceRequest);
                        }
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objInvoke, false, 8, null);
                    }
                }
                if (objInvoke == null) {
                    objInvoke = function1.invoke(typefaceRequest);
                }
                return TuplesKt.to(listMutableListOf, FontSynthesis_androidKt.m6531synthesizeTypefaceFxwP2eA(typefaceRequest.m6557getFontSynthesisGVVA2EU(), objInvoke, font, typefaceRequest.getFontWeight(), typefaceRequest.m6556getFontStyle_LCdwA()));
            }
        }
        return TuplesKt.to(listMutableListOf, function1.invoke(typefaceRequest));
    }
}
