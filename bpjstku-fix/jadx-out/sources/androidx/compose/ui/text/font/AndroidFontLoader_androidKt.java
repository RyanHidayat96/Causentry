package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroid/content/Context;", "p0", "Landroid/graphics/Typeface;", "load", "(Landroidx/compose/ui/text/font/ResourceFont;Landroid/content/Context;)Landroid/graphics/Typeface;", "loadAsync", "(Landroidx/compose/ui/text/font/ResourceFont;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        Intrinsics.checkNotNull(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, Continuation<? super android.graphics.Typeface> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* JADX INFO: renamed from: onFontRetrieved */
            public final void m7206x46c88379(android.graphics.Typeface p0) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<android.graphics.Typeface> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(p0));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* JADX INFO: renamed from: onFontRetrievalFailed */
            public final void m7205xb24343b7(int p0) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<android.graphics.Typeface> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                StringBuilder sb = new StringBuilder("Unable to load font ");
                sb.append(resourceFont);
                sb.append(" (reason=");
                sb.append(p0);
                sb.append(')');
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.TuitionPaymentFragmentbindingInflater1(new IllegalStateException(sb.toString()));
            }
        }, null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
