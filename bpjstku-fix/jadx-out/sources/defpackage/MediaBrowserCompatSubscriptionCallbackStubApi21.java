package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatSubscriptionCallbackStubApi21 {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, String str, Modifier modifier, ContentScale contentScale, Composer composer, int i) throws Throwable {
        composer.startReplaceableGroup(1451072229);
        MediaBrowserCompatServiceBinderWrapper.Companion companion = MediaBrowserCompatServiceBinderWrapper.INSTANCE;
        Function1<MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3, MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3> function1TuitionPaymentFragmentbindingInflater1 = MediaBrowserCompatServiceBinderWrapper.Companion.TuitionPaymentFragmentbindingInflater1();
        Alignment center = Alignment.INSTANCE.getCenter();
        int iM4801getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m4801getDefaultFilterQualityfv9h1I();
        getCallbacks getcallbacksTuitionPaymentFragmentbindingInflater1 = MediaBrowserCompatSubscriptionCallback.TuitionPaymentFragmentbindingInflater1();
        writeToParcel writetoparcelTuitionPaymentFragmentspecialinlinedviewModeldefault2 = putCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onChildrenLoaded.b(), composer);
        int i2 = i << 3;
        int i3 = (i2 & 1879048192) | (i & 112) | 520 | (i2 & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016) | (i2 & 29360128) | (i2 & 234881024);
        composer.startReplaceableGroup(2032051394);
        MediaBrowserCompatSubscription mediaBrowserCompatSubscription = new MediaBrowserCompatSubscription(obj, getcallbacksTuitionPaymentFragmentbindingInflater1, writetoparcelTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i4 = i3 >> 3;
        createFromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatSubscription, str, modifier, function1TuitionPaymentFragmentbindingInflater1, null, center, contentScale, 1.0f, null, iM4801getDefaultFilterQualityfv9h1I, true, composer, (i4 & 234881024) | (i3 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
