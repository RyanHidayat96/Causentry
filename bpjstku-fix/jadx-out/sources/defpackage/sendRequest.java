package defpackage;

import android.os.Trace;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class sendRequest {
    private static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentbindingInflater1();

    public static final MediaBrowserCompatServiceBinderWrapper b(Object obj, writeToParcel writetoparcel, Function1<? super MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ? extends MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3> function1, Function1<? super MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Unit> function2, ContentScale contentScale, int i, getCallbacks getcallbacks, Composer composer) {
        composer.startReplaceableGroup(1645646697);
        MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(new MediaBrowserCompatSubscription(obj, getcallbacks, writetoparcel), function1, function2, contentScale, i, composer);
        composer.endReplaceableGroup();
        return mediaBrowserCompatServiceBinderWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(newUnratedRating newunratedrating) {
        Object onTransact = newunratedrating.getOnTransact();
        if (onTransact instanceof newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            b("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (!(onTransact instanceof ImageBitmap)) {
            if (!(onTransact instanceof ImageVector)) {
                if (!(onTransact instanceof Painter)) {
                    if (newunratedrating.getSubscribe() != null) {
                        throw new IllegalArgumentException("request.target must be null.".toString());
                    }
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("If you wish to display this ");
                    sb.append("Painter");
                    sb.append(", use androidx.compose.foundation.Image.");
                    b("Painter", sb.toString());
                    throw new KotlinNothingValueException();
                }
            }
            StringBuilder sb2 = new StringBuilder("If you wish to display this ");
            sb2.append("ImageVector");
            sb2.append(", use androidx.compose.foundation.Image.");
            b("ImageVector", sb2.toString());
            throw new KotlinNothingValueException();
        }
        StringBuilder sb3 = new StringBuilder("If you wish to display this ");
        sb3.append("ImageBitmap");
        sb3.append(", use androidx.compose.foundation.Image.");
        b("ImageBitmap", sb3.toString());
        throw new KotlinNothingValueException();
    }

    private static final Void b(String str, String str2) {
        StringBuilder sb = new StringBuilder("Unsupported type: ");
        sb.append(str);
        sb.append(". ");
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements addQueueItem {
        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    private static final MediaBrowserCompatServiceBinderWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaBrowserCompatSubscription mediaBrowserCompatSubscription, Function1<? super MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ? extends MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3> function1, Function1<? super MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Unit> function2, ContentScale contentScale, int i, Composer composer) {
        composer.startReplaceableGroup(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            newUnratedRating newunratedratingTuitionPaymentFragmentbindingInflater1 = setSubscription.TuitionPaymentFragmentbindingInflater1(mediaBrowserCompatSubscription.b(), composer);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(newunratedratingTuitionPaymentFragmentbindingInflater1);
            composer.startReplaceableGroup(1094691773);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MediaBrowserCompatServiceBinderWrapper(newunratedratingTuitionPaymentFragmentbindingInflater1, mediaBrowserCompatSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                composer.updateRememberedValue(objRememberedValue);
            }
            MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) objRememberedValue;
            composer.endReplaceableGroup();
            mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1);
            mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(function2);
            mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contentScale);
            mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{mediaBrowserCompatServiceBinderWrapper, Boolean.valueOf(((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue())}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1862256908, -1862256908);
            mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(newunratedratingTuitionPaymentFragmentbindingInflater1);
            MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{mediaBrowserCompatServiceBinderWrapper}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -912799434, 912799439);
            composer.endReplaceableGroup();
            return mediaBrowserCompatServiceBinderWrapper;
        } finally {
            Trace.endSection();
        }
    }

    public static final /* synthetic */ onQueueTitleChanged b(long j) {
        if (j == Size.INSTANCE.m4051getUnspecifiedNHjbRc()) {
            return onQueueTitleChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if (!setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j)) {
            return null;
        }
        float fM4043getWidthimpl = Size.m4043getWidthimpl(j);
        onEvent oneventTuitionPaymentFragmentspecialinlinedviewModeldefault2 = (Float.isInfinite(fM4043getWidthimpl) || Float.isNaN(fM4043getWidthimpl)) ? onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE : onMetadataChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MathKt.roundToInt(Size.m4043getWidthimpl(j)));
        float fM4040getHeightimpl = Size.m4040getHeightimpl(j);
        return new onQueueTitleChanged(oneventTuitionPaymentFragmentspecialinlinedviewModeldefault2, (Float.isInfinite(fM4040getHeightimpl) || Float.isNaN(fM4040getHeightimpl)) ? onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE : onMetadataChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MathKt.roundToInt(Size.m4040getHeightimpl(j))));
    }
}
