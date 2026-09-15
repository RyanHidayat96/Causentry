package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0002J\u001c\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\u000b"}, d2 = {"Lorg/koin/android/logger/AndroidLogger;", "Lorg/koin/core/logger/Logger;", FirebaseAnalytics.Param.LEVEL, "Lorg/koin/core/logger/Level;", "(Lorg/koin/core/logger/Level;)V", "LogOnLevel", "", NotificationCompat.CATEGORY_MESSAGE, "", "Lorg/koin/core/logger/MESSAGE;", "log", "koin-android_release"}, k = 1, mv = {1, 1, 15})
public final class ZoomGestureDetectorCompanion extends isSamsungFold2OrFold3 {
    public ZoomGestureDetectorCompanion(Level level) {
        super(level);
    }

    public /* synthetic */ ZoomGestureDetectorCompanion(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }

    @Override // defpackage.isSamsungFold2OrFold3
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level level, String str) {
        if (this.TuitionPaymentFragmentbindingInflater1.compareTo(level) <= 0) {
            int i = isStylusZoomEnabled$WhenMappings.$EnumSwitchMapping$0[this.TuitionPaymentFragmentbindingInflater1.ordinal()];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomGestureDetectorCompanion() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
