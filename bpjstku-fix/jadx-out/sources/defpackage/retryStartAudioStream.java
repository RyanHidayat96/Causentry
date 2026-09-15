package defpackage;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class retryStartAudioStream<T> implements Iterable<T> {
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public retryStartAudioStream(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, T t) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends isNokia1<T> {
        volatile Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = NotificationLite.TuitionPaymentFragmentbindingInflater1(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = NotificationLite.b();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = NotificationLite.TuitionPaymentFragmentbindingInflater1(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = NotificationLite.TuitionPaymentFragmentbindingInflater1(t);
        }

        final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Iterator<T> {
            private Object TuitionPaymentFragmentbindingInflater1;

            TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                Object obj = TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                this.TuitionPaymentFragmentbindingInflater1 = obj;
                return !NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj);
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                        this.TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1)) {
                        throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationLite.b(this.TuitionPaymentFragmentbindingInflater1));
                    }
                    T t = (T) NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
                    this.TuitionPaymentFragmentbindingInflater1 = null;
                    return t;
                } catch (Throwable th) {
                    this.TuitionPaymentFragmentbindingInflater1 = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }
    }
}
