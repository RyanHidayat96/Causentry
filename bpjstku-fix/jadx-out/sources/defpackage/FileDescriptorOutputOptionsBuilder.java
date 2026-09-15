package defpackage;

import com.squareup.picasso.Picasso;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class FileDescriptorOutputOptionsBuilder extends ThreadPoolExecutor {
    public FileDescriptorOutputOptionsBuilder() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new outputFormatToMuxerFormat.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2((ExperimentalAudioApi) runnable);
        execute(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends FutureTask<ExperimentalAudioApi> implements Comparable<TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
        private final ExperimentalAudioApi TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Picasso.Priority priority = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel;
            Picasso.Priority priority2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel;
            return priority == priority2 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact - tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact : priority2.ordinal() - priority.ordinal();
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExperimentalAudioApi experimentalAudioApi) {
            super(experimentalAudioApi, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = experimentalAudioApi;
        }
    }
}
