package defpackage;

import android.os.Looper;
import android.view.View;
import io.reactivex.disposables.RunnableDisposable;
import io.reactivex.internal.functions.Functions;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageUtil extends VideoRecordEventStart<Unit> {
    private final View TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ImageUtil(View view) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = view;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends validateOrAdapt implements View.OnClickListener {
        private final View TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final deriveMediaType<? super Unit> b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view, deriveMediaType<? super Unit> derivemediatype) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = view;
            this.b = derivemediatype;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                if (!isDisposed()) {
                    this.b.onNext(Unit.INSTANCE);
                }
            } finally {
                ViewPortBuilder.b();
            }
        }

        @Override // defpackage.validateOrAdapt
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setOnClickListener(null);
        }
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Unit> derivemediatype) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, derivemediatype);
            derivemediatype.onSubscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setOnClickListener(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return;
        }
        Runnable runnable = Functions.b;
        share.b(runnable, "run is null");
        derivemediatype.onSubscribe(new RunnableDisposable(runnable));
        StringBuilder sb = new StringBuilder("Expected to be called on the main thread but was ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(threadCurrentThread, "");
        sb.append(threadCurrentThread.getName());
        derivemediatype.onError(new IllegalStateException(sb.toString()));
    }
}
