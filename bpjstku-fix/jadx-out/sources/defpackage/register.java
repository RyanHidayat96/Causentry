package defpackage;

import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class register {
    public static final SubscribedProgram TuitionPaymentFragmentspecialinlinedviewModeldefault1(User user) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(user, "");
        Iterator<T> it = user.INotificationSideChannel.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
            }
            return (SubscribedProgram) obj;
        } while (!StringsKt.equals$default(((SubscribedProgram) next).TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PU", false, 2, null));
        obj = next;
        return (SubscribedProgram) obj;
    }
}
