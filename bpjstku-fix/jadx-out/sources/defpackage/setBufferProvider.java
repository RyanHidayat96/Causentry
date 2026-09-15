package defpackage;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class setBufferProvider<T> implements Iterable<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> b;

    public setBufferProvider(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        this.b = autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements Iterator<T> {
        private Throwable TuitionPaymentFragmentbindingInflater1;
        private final AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> asInterface;
        private boolean g;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        private boolean b = true;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_VideoValidatedEncoderProfilesProxy;
            this.asInterface = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th = this.TuitionPaymentFragmentbindingInflater1;
            if (th != null) {
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return !this.b || TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            return false;
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            Throwable th;
            Object obj;
            if (!this.g) {
                this.g = true;
                this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(1);
                new AudioUtils(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).subscribe(this.asInterface);
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.asInterface;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(1);
                VideoRecordEventStatus<T> videoRecordEventStatusTake = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.take();
                Object obj2 = videoRecordEventStatusTake.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Throwable th2 = (T) null;
                if (obj2 != null && !NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj2)) {
                    this.b = false;
                    Object obj3 = videoRecordEventStatusTake.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (obj3 != null && !NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj3)) {
                        obj = th2;
                        obj = th2;
                        obj = (T) videoRecordEventStatusTake.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                    obj = th2;
                    obj = th2;
                    obj = th2;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (T) obj;
                    return true;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                if (videoRecordEventStatusTake.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    return false;
                }
                Object obj4 = videoRecordEventStatusTake.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj4)) {
                    th = th2;
                    th = (T) NotificationLite.b(obj4);
                }
                th = th2;
                this.TuitionPaymentFragmentbindingInflater1 = th;
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            } catch (InterruptedException e2) {
                this.asInterface.dispose();
                this.TuitionPaymentFragmentbindingInflater1 = e2;
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            Throwable th = this.TuitionPaymentFragmentbindingInflater1;
            if (th != null) {
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }
            if (hasNext()) {
                this.b = true;
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            throw new NoSuchElementException("No more elements");
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> extends isProblematicMimeType<VideoRecordEventStatus<T>> {
        final BlockingQueue<VideoRecordEventStatus<T>> b = new ArrayBlockingQueue(1);
        final AtomicInteger TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicInteger();

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // defpackage.deriveMediaType
        public final /* synthetic */ void onNext(Object obj) {
            Object obj2;
            Object obj3;
            VideoRecordEventStatus<T> videoRecordEventStatus = (VideoRecordEventStatus) obj;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(0) == 1 || (obj3 = videoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null || NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj3)) {
                while (!this.b.offer(videoRecordEventStatus)) {
                    VideoRecordEventStatus<T> videoRecordEventStatusPoll = this.b.poll();
                    if (videoRecordEventStatusPoll != null && ((obj2 = videoRecordEventStatusPoll.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null || NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj2))) {
                        videoRecordEventStatus = videoRecordEventStatusPoll;
                    }
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }
}
