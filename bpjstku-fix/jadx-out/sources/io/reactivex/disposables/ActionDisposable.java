package io.reactivex.disposables;

import defpackage.formatInterval;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class ActionDisposable extends ReferenceDisposable<formatInterval> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected final /* synthetic */ void b(formatInterval formatinterval) {
        try {
            formatinterval.run();
        } catch (Throwable th) {
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
    }

    public ActionDisposable(formatInterval formatinterval) {
        super(formatinterval);
    }
}
