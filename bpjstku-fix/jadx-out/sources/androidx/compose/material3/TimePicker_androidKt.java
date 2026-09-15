package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/TimePickerLayoutType;", "getDefaultTimePickerLayoutType", "(Landroidx/compose/runtime/Composer;I)I", "getDefaultTimePickerLayoutType$annotations", "()V", "defaultTimePickerLayoutType"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TimePicker_androidKt {
    public static /* synthetic */ void getDefaultTimePickerLayoutType$annotations() {
    }

    public static final int getDefaultTimePickerLayoutType(Composer composer, int i) {
        int iM2700getVerticalQJTpgSE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1979410629, i, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.android.kt:25)");
        }
        Configuration configuration = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        if (configuration.screenHeightDp < configuration.screenWidthDp) {
            iM2700getVerticalQJTpgSE = TimePickerLayoutType.INSTANCE.m2699getHorizontalQJTpgSE();
        } else {
            iM2700getVerticalQJTpgSE = TimePickerLayoutType.INSTANCE.m2700getVerticalQJTpgSE();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iM2700getVerticalQJTpgSE;
    }
}
