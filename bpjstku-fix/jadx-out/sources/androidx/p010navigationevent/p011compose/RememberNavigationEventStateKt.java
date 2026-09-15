package androidx.p010navigationevent.p011compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p010navigationevent.NavigationEventInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001aE\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"rememberNavigationEventState", "Landroidx/navigationevent/compose/NavigationEventState;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigationevent/NavigationEventInfo;", "currentInfo", "backInfo", "", "forwardInfo", "(Landroidx/navigationevent/NavigationEventInfo;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)Landroidx/navigationevent/compose/NavigationEventState;", "navigationevent-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberNavigationEventStateKt {
    public static final <T extends NavigationEventInfo> NavigationEventState<T> rememberNavigationEventState(final T t, final List<? extends T> list, final List<? extends T> list2, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i2 & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(116613162, i, -1, "androidx.navigationevent.compose.rememberNavigationEventState (RememberNavigationEventState.kt:44)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new NavigationEventState(t, list, list2);
            composer.updateRememberedValue(objRememberedValue);
        }
        final NavigationEventState<T> navigationEventState = (NavigationEventState) objRememberedValue;
        boolean z = (((i & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i & 6) == 4;
        boolean zChangedInstance = composer.changedInstance(list);
        boolean zChangedInstance2 = composer.changedInstance(list2);
        Object objRememberedValue2 = composer.rememberedValue();
        if ((z | zChangedInstance | zChangedInstance2) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: androidx.navigationevent.compose.RememberNavigationEventStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RememberNavigationEventStateKt.rememberNavigationEventState$lambda$2$lambda$1(navigationEventState, t, list, list2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationEventState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberNavigationEventState$lambda$2$lambda$1(NavigationEventState navigationEventState, NavigationEventInfo navigationEventInfo, List list, List list2) {
        navigationEventState.setCurrentInfo$navigationevent_compose(navigationEventInfo);
        navigationEventState.setBackInfo$navigationevent_compose(list);
        navigationEventState.setForwardInfo$navigationevent_compose(list2);
        return Unit.INSTANCE;
    }
}
