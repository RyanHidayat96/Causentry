package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes4.dex */
public final class FileOutputOptionsBuilder {
    private HandlerThread INotificationSideChannel;
    long TuitionPaymentFragmentbindingInflater1;
    long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f143a;
    public final Handler asBinder;
    int asInterface;
    final isQualitySupported b;
    int cancel;
    long cancelAll;
    int d;
    long g;
    long notify;

    public FileOutputOptionsBuilder(isQualitySupported isqualitysupported) {
        this.b = isqualitysupported;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.INotificationSideChannel = handlerThread;
        handlerThread.start();
        outputFormatToMuxerFormat.b(handlerThread.getLooper());
        this.asBinder = new TuitionPaymentFragmentbindingInflater1(handlerThread.getLooper(), this);
    }

    static class TuitionPaymentFragmentbindingInflater1 extends Handler {
        private final FileOutputOptionsBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(Looper looper, FileOutputOptionsBuilder fileOutputOptionsBuilder) {
            super(looper);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fileOutputOptionsBuilder;
        }

        @Override // android.os.Handler
        public final void handleMessage(final Message message) {
            int i = message.what;
            if (i == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                return;
            }
            if (i == 1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f143a++;
                return;
            }
            if (i == 2) {
                FileOutputOptionsBuilder fileOutputOptionsBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = message.arg1;
                int i2 = fileOutputOptionsBuilder.asInterface + 1;
                fileOutputOptionsBuilder.asInterface = i2;
                long j2 = fileOutputOptionsBuilder.notify + j;
                fileOutputOptionsBuilder.notify = j2;
                fileOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1 = j2 / ((long) i2);
                return;
            }
            if (i == 3) {
                FileOutputOptionsBuilder fileOutputOptionsBuilder2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j3 = message.arg1;
                fileOutputOptionsBuilder2.cancel++;
                long j4 = fileOutputOptionsBuilder2.cancelAll + j3;
                fileOutputOptionsBuilder2.cancelAll = j4;
                fileOutputOptionsBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j4 / ((long) fileOutputOptionsBuilder2.asInterface);
                return;
            }
            if (i == 4) {
                FileOutputOptionsBuilder fileOutputOptionsBuilder3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Long l = (Long) message.obj;
                fileOutputOptionsBuilder3.d++;
                long jLongValue = fileOutputOptionsBuilder3.g + l.longValue();
                fileOutputOptionsBuilder3.g = jLongValue;
                fileOutputOptionsBuilder3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jLongValue / ((long) fileOutputOptionsBuilder3.d);
                return;
            }
            Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: FileOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1.5
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb = new StringBuilder("Unhandled stats message.");
                    sb.append(message.what);
                    throw new AssertionError(sb.toString());
                }
            });
        }
    }
}
