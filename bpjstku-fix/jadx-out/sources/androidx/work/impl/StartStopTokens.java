package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\b\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u000f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/StartStopTokens;", "", "Landroidx/work/impl/model/WorkGenerationalId;", "p0", "", "contains", "(Landroidx/work/impl/model/WorkGenerationalId;)Z", "Landroidx/work/impl/StartStopToken;", "remove", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;", "Landroidx/work/impl/model/WorkSpec;", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/StartStopToken;", "", "", "(Ljava/lang/String;)Ljava/util/List;", "tokenFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StartStopTokens {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    boolean contains(WorkGenerationalId p0);

    StartStopToken remove(WorkGenerationalId p0);

    List<StartStopToken> remove(String p0);

    StartStopToken tokenFor(WorkGenerationalId p0);

    default StartStopToken tokenFor(WorkSpec p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return tokenFor(WorkSpecKt.generationalId(p0));
    }

    default StartStopToken remove(WorkSpec p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return remove(WorkSpecKt.generationalId(p0));
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/impl/StartStopTokens$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/work/impl/StartStopTokens;", "create", "(Z)Landroidx/work/impl/StartStopTokens;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StartStopTokens create$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return companion.create(z);
        }

        @JvmStatic
        public final StartStopTokens create(boolean p0) {
            StartStopTokensImpl startStopTokensImpl = new StartStopTokensImpl();
            if (p0) {
                return new SynchronizedStartStopTokensImpl(startStopTokensImpl);
            }
            return startStopTokensImpl;
        }

        @JvmStatic
        public final StartStopTokens create() {
            return create$default(this, false, 1, null);
        }
    }

    @JvmStatic
    static StartStopTokens create() {
        return INSTANCE.create();
    }

    @JvmStatic
    static StartStopTokens create(boolean z) {
        return INSTANCE.create(z);
    }
}
