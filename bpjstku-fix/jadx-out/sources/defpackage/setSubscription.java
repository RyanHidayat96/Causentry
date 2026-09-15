package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import coil.size.Scale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class setSubscription {
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Constraints.INSTANCE.m6898fixedJhjzzOo(0, 0);
    private static final onSessionReady b = new onRepeatModeChanged(onQueueTitleChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3);

    public static final newUnratedRating TuitionPaymentFragmentbindingInflater1(Object obj, Composer composer) throws Throwable {
        composer.startReplaceableGroup(1087186730);
        if (obj instanceof newUnratedRating) {
            newUnratedRating newunratedrating = (newUnratedRating) obj;
            composer.endReplaceableGroup();
            return newunratedrating;
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-1245195153);
        boolean zChanged = composer.changed(context);
        boolean zChanged2 = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if ((zChanged | zChanged2) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context).TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            composer.updateRememberedValue(objRememberedValue);
        }
        newUnratedRating newunratedrating2 = (newUnratedRating) objRememberedValue;
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return newunratedrating2;
    }

    public static final newUnratedRating TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, ContentScale contentScale, Composer composer) throws Throwable {
        getCallback getcallback;
        composer.startReplaceableGroup(1677680258);
        boolean z = obj instanceof newUnratedRating;
        if (z) {
            newUnratedRating newunratedrating = (newUnratedRating) obj;
            if (newunratedrating.getRemoteActionCompatParcelizer().getTuitionPaymentFragmentspecialinlinedviewModeldefault3() != null) {
                composer.endReplaceableGroup();
                return newunratedrating;
            }
        }
        composer.startReplaceableGroup(408306591);
        if (Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getNone())) {
            getcallback = b;
        } else {
            composer.startReplaceableGroup(408309406);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new getCallback();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            getcallback = (getCallback) objRememberedValue;
        }
        composer.endReplaceableGroup();
        if (z) {
            composer.startReplaceableGroup(-227230258);
            newUnratedRating newunratedrating2 = (newUnratedRating) obj;
            composer.startReplaceableGroup(408312509);
            boolean zChanged = composer.changed(newunratedrating2);
            boolean zChanged2 = composer.changed(getcallback);
            Object objRememberedValue2 = composer.rememberedValue();
            if ((zChanged | zChanged2) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1B = newunratedrating2.b(newunratedrating2.INotificationSideChannel);
                tuitionPaymentFragmentspecialinlinedviewModeldefault1B.handleMessage = getcallback;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1B.TuitionPaymentFragmentbindingInflater1();
                objRememberedValue2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                composer.updateRememberedValue(objRememberedValue2);
            }
            newUnratedRating newunratedrating3 = (newUnratedRating) objRememberedValue2;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            return newunratedrating3;
        }
        composer.startReplaceableGroup(-227066702);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(408319118);
        boolean zChanged3 = composer.changed(context);
        boolean zChanged4 = composer.changed(obj);
        boolean zChanged5 = composer.changed(getcallback);
        Object objRememberedValue3 = composer.rememberedValue();
        if ((zChanged3 | zChanged4 | zChanged5) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context).TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2.handleMessage = getcallback;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
            objRememberedValue3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            composer.updateRememberedValue(objRememberedValue3);
        }
        newUnratedRating newunratedrating4 = (newUnratedRating) objRememberedValue3;
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return newunratedrating4;
    }

    public static final Modifier TuitionPaymentFragmentspecialinlinedviewModeldefault1(Modifier modifier, final String str) {
        return str != null ? SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: applyOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSubscription.TuitionPaymentFragmentbindingInflater1(str, (SemanticsPropertyReceiver) obj);
            }
        }, 1, null) : modifier;
    }

    public static final Scale b(ContentScale contentScale) {
        if (Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getFit()) || Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getInside())) {
            return Scale.FIT;
        }
        return Scale.FILL;
    }

    public static final onQueueTitleChanged TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) {
        if (Constraints.m6892isZeroimpl(j)) {
            return null;
        }
        return new onQueueTitleChanged(Constraints.m6884getHasBoundedWidthimpl(j) ? onMetadataChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Constraints.m6888getMaxWidthimpl(j)) : onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE, Constraints.m6883getHasBoundedHeightimpl(j) ? onMetadataChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Constraints.m6887getMaxHeightimpl(j)) : onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE);
    }

    public static final float TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, float f) {
        return RangesKt.coerceIn(f, Constraints.m6890getMinWidthimpl(j), Constraints.m6888getMaxWidthimpl(j));
    }

    public static final float TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, float f) {
        return RangesKt.coerceIn(f, Constraints.m6889getMinHeightimpl(j), Constraints.m6887getMaxHeightimpl(j));
    }

    public static final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
        return IntSizeKt.IntSize(MathKt.roundToInt(Size.m4043getWidthimpl(j)), MathKt.roundToInt(Size.m4040getHeightimpl(j)));
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        return ((double) Size.m4043getWidthimpl(j)) >= 0.5d && ((double) Size.m4040getHeightimpl(j)) >= 0.5d;
    }

    public static final long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6148getImageo7Vup1c());
        return Unit.INSTANCE;
    }
}
