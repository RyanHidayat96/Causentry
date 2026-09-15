package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LcreatePersistentInputSurface;", "LaddSignalEosTimeoutIfNeeded;", "", "<init>", "()V", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class createPersistentInputSurface implements addSignalEosTimeoutIfNeeded<Object> {
    public static final createPersistentInputSurface INSTANCE = new createPersistentInputSurface();

    private createPersistentInputSurface() {
    }

    @Override // defpackage.addSignalEosTimeoutIfNeeded
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
